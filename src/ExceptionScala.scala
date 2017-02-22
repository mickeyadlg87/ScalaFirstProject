import scala.util.{Success, Try, Failure}

/**
  * Created by aleal on 13/02/17.
  */
object ExceptionScala {
  def wrappingCallTry(number: String): Try[Int] = {
    Try(number.toInt)
  }

  def patternMatchingOnTry(n: String): Int = {

    Try(n.toInt) match {
      case Success(i) => i
      case Failure(_) => 0
    }

  }

  def forExpresionWithTry(a: Success[_], b: Success[_]): Try[_] = {

    for {
      first <- a
      second <- b
    } yield s"$first $second"

  }

  def main(args: Array[String]): Unit = {

    println(wrappingCallTry("200"))
    println(wrappingCallTry("Pablo"))

    var entero = patternMatchingOnTry("12")
    println(entero)
    var letras = patternMatchingOnTry("none")
    println(letras)

    println(Success("Millos").map(_.reverse))

    println(forExpresionWithTry(Success(14), Success("Millos")))



  }


}
