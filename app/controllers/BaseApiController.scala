//package controllers
//
//import play.api.mvc.{ResponseHeader, Result, Controller}
//
///**
//  * Created by dylan on 12/6/15.
//  */
//class BaseApiController extends Controller {
//
//  protected def JsonResponse(data: Object) = {
//    val jsonValue: String = toJsonString(data)
//    new Result(header = ResponseHeader(200),
//               body = play.api.libs.iteratee.Enumerator(jsonValue.getBytes)).as("application/json")
//              .withHeaders(
//                ("Access-Control-Allow-Origin", "*"),
//                ("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT"))
//
//
//  }
//
//  protected def JsonResponse(data: Object, code: Int) = {
//    val jsonValue: String = toJsonString(data)
//    new Result(header = ResponseHeader(code), body = play.api.libs.iteratee.Enumerator(jsonValue.getBytes())).as("application/json")
//      .withHeaders(
//        ("Access-Control-Allow-Origin", "*"),
//        ("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT"),
//        ("Access-Control-Allow-Headers", "Content-Type, api_key, Authorization"))
//  }
//
//  def toJsonString(data: Any): String = {
//    if (data.getClass.equals(classOf[String])) {
//      data.asInstanceOf[String]
//    }
//
////    else {
////      ScalaJsonUtil.mapper.writeValueAsString(data)
////    }
//  }
//
//}
