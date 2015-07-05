package learnscala.lang

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  println(g)

  val nu = n / g
  val dn = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = nu + "/" + dn

  def add(that: Rational): Rational = new Rational(
    nu * that.dn + that.nu * dn, dn * that.dn)

  def lessThan(that: Rational) =
    this.nu * that.dn < that.nu * this.dn

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}