package Extractors

import java.net.{MalformedURLException, URL}

/**
  * Created by Vignesh on 11/29/2015.
  */
class URLExtractor(val uri: String) {

}

object URLExtractor {

  def getProtocol(uri: URL) = {
    uri.getProtocol
  }

  def getDomain(uri: URL) = {
    uri.getHost
  }

  def getPath(uri: URL) = {
    uri.getPath
  }

  def unapply(urlExtractor: URLExtractor): Option[(String, String, String)] = {
    val uri = urlExtractor.uri
    try {
      val canonicalUri = new URL(uri)
      Some(getProtocol(canonicalUri), getDomain(canonicalUri), getPath(canonicalUri))
    }
    catch {
      case mue: MalformedURLException => {
        println(s"Invalid URL format: $uri")
        None
      }
    }
  }
}