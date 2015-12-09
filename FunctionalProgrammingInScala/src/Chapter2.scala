/**
  * Created by Vignesh on 12/8/15.
  */
object Chapter2 {

  // Exercise 2.1
  def fibonacci(n: Int): Int = {
    def go(n: Int, first: Int, second: Int): Int = {
      if (n <= 0) first
      else go(n - 1, second, first + second)
    }

    go(n - 1, 0, 1)
  }
}
