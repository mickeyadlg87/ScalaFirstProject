import scala.annotation.tailrec

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

fact(5)
fibbonaci(6)
