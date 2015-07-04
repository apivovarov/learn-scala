package learnscala.l1

trait A { def hi = println("A") }
trait B { def hi = println("B") }

class C extends A with B {
  override def hi = super[B].hi
  def hia = super[A].hi
}

object LearnTrait extends App {
  val c = new C
  c.hi
  c.hia
}