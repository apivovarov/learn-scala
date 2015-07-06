package learnscala.func

object FuncAsType extends App {
  type m = (String) => Boolean

  def filter(v: m, s: String) = v(s)

  var r = filter(_.contains("a"), "aaaa")
  println(r)

  r = filter(_.contains("a"), "bbbbb")
  println(r)
}