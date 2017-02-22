import scala.annotation.tailrec

/**
  * Created by aleal on 11/01/17.
  */
object TestInScala {

  def valorAbsoluto(i: Int): Int =
    if (i < 0) {
      -i
    } else {
      i
    }

  private def darFormatoAbs(x: Int) = {
    val mensaje = "Valor absoluto de %d es %d"
    mensaje.format(x, valorAbsoluto(x))

  }

  private def darFormatoFibb(x: Int) = {
    val mensaje = "Fibbonaci de %d es %d"
    mensaje.format(x, fibbonaci(x))

  }


  def fact(n: Int): Int = {
    @tailrec
    def loop(n: Int, cont: Int): Int = {
      if (n < 1) cont
      else loop(n - 1, n * cont)
    }

    loop(n, 1)
  }

  def fibbonaci(n: Int): Int = {
    def loop(n: Int): Int = {
      if (n == 0) {
        0
      } else if (n == 1) {
        1
      } else {
        loop(n - 1) + loop(n - 2)
      }
    }
    loop(n)
  }

  /**
    * HOF (High order function)
    * @param name
    * @param n
    * @param f funcion que recibe un entero y retorna un entero
    * @return
    */
  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "El %s de %d es %d."
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("factorial", 5, fact))
    println(formatResult("fibbonaccci", 6, fibbonaci))
  }


}
