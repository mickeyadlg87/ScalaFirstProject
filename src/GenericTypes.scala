import scala.annotation.tailrec

/**
  * Created by aleal on 12/01/17.
  */
object GenericTypes {

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def equalsString(valor: String): Boolean = {
    valor.equalsIgnoreCase("M")
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (letra_a: A) => ((letra_b: B) => f(letra_a, letra_b))
  }

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }


  def main(args: Array[String]): Unit = {
    println(findFirst(Array("A", "B", "C", "C"), (letter: String) => letter.equalsIgnoreCase("c")) + " : POSICION EN Q ESTA EN EL ARREGLO")
    println(findFirst(Array("A", "B", "C", "C"), equalsString) + " : POSICION EN Q ESTA EN EL ARREGLO")

  }

}
