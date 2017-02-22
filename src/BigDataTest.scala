import scala.math.Ordering

/**
  * Created by aleal on 13/02/17.
  */
object BigDataTest {

  def esCliente(someValue: Any): Boolean = {
    someValue match {
      case cl: Cliente => true
      case _ => false
    }

  }

  def expresionParaFor(primerNombre: Option[String], segundoNombre: Option[String]): Option[String] = {

    for {
      first <- primerNombre
      second <- segundoNombre
    } yield (first + " es amigo de " + second)

  }

  case class Cliente(primerNombre: String = "", SegundoNombre: String = "")

  def main(args: Array[String]): Unit = {
    val c = Cliente("Andres", "Leal")
    println(c)
    println(c.primerNombre)
    println(esCliente(Cliente("andresLeal")))
    println(esCliente("andresLeal"))

    val opcionalgo = expresionParaFor(Option("Andres"), Option.empty)
    println(opcionalgo.get)
  }

}
