/**
  * Created by Vignesh on 12/8/15.
  */
object Chapter2 {

  // Exercise 2.1
  def fibonacci(n: Int): Int = {
    def go(n: Int, first: Int, second: Int): Int = {
      // when it is the first element (or less, exception case)
      if (n <= 1) first
      else {
        print(first + ",")
        go(n - 1, second, first + second)
      }
    }

    go(n, 0, 1)
  }
}
