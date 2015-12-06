package service

import com.twitter.util.Future
import shared._
import tutorial._

/**
  * Created by dylan on 12/6/15.
  */
class ThriftDAO extends Calculator[com.twitter.util.Future] {
  def ping() = ???

  def add(num1: Int, num2: Int): Future[Int] = ???

  def calculate(logid: Int, w: tutorial.Work): Future[Int] = ???
  /**
    * This method has a oneway modifier. That means the client only makes
    * a request and does not listen for any response at all. Oneway methods
    * must be void.
    */
  def zip(): Future[Unit] = ???
}
