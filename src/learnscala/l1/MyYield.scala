package learnscala.l1

class MyYield {
  def grep(arr: List[String], query: String) =
    for (a <- arr if a.contains(query)) yield a
}

object MyYield extends App {
  val m = new MyYield
  val arr = List("a", "b", "ab", "ba")
  println(m.grep(arr, "b"));
}