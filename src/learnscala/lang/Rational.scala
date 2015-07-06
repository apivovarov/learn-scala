package learnscala.lang

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val nu = n / g
  val dn = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = nu + "/" + dn

  def +(that: Rational): Rational = new Rational(
    nu * that.dn + that.nu * dn, dn * that.dn)

  def +(i: Int): Rational = new Rational(
    dn * i + nu, dn)

  def <(that: Rational) =
    this.nu * that.dn < that.nu * this.dn

  def max(that: Rational) =
    if (this < that) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def equals(o: Any) = o match {
    case that: Rational => that.nu == nu && that.dn == dn
    case _              => false
  }
}

object Rational extends App {
  val a = new Rational(2, 5) + 2
  println(a)
  assert(a == new Rational(12, 5))
}