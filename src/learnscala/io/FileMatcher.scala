package learnscala.io

object FileMatcher {

  private def files = (new java.io.File("./src/learnscala/l1")).listFiles

  def filter(m: (String) => Boolean) =
    for (f <- files if m(f.getName)) yield f

  def filesEnding(query: String) = filter(name => name.endsWith(query))

  def filesContains(query: String) = filter(_.toLowerCase.contains(query.toLowerCase))

  def filesRegex(query: String) = filter(_.matches(query))
}

object FileMatcherTest extends App {
  println("ends with scala")
  FileMatcher.filesEnding("scala").foreach(println)

  println("contains world")
  FileMatcher.filesContains("world").foreach(println)

  println("regex Yi*d")
  FileMatcher.filesRegex(".+Yi\\w+d\\.scala").foreach(println)
}