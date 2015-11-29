import Extractors.URLExtractor

/**
  * Created by Vignesh on 11/29/2015.
  */
object Driver {
  def main(args: Array[String]) {
    println("Hello, Scala World!")

    val urlExtractor = new URLExtractor("ftp://www.amazon.com/gp/bestsellers")
    urlExtractor match {
      case URLExtractor(protocol, domain, path) => println(s"Opening $domain$path using $protocol protocol!")
      case _ => println("uh oh!")
    }
  }
}
