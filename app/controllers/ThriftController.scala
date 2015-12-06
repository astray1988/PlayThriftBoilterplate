package controllers

import org.apache.thrift.protocol.TBinaryProtocol
import org.apache.thrift.protocol.TBinaryProtocol.Factory
import play.api.mvc.{Action, Controller}
import service.ThriftDAO
import tutorial.Calculator$FinagleClient
import util.TwitterFutureConverter._

/**
  * Created by dylan on 12/6/15.
  */
object ThriftController extends Controller{
  val thriftDao = new ThriftDAO
  val serviceImpl = new Calculator$FinagleClient(thriftDao)

  def thriftService = Action.async(parse.anyContent) { request =>

    val inData: Option[Array[Byte]] = request.body.asRaw.flatMap(_.asBytes())

    val outData: Option[com.twitter.util.Future[Array[Byte]]] = inData.map(serviceImpl.apply)

    outData match {
      case None => {
        throw new Exception("")
      }
      case Some(outFuture: com.twitter.util.Future[Array[Byte]]) => {
        val returnFuture = outFuture
        for {
          x <- returnFuture
        } yield {
          Ok(x).as("application/thrift")
        }

      }
    }


  }

}
