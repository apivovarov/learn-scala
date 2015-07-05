package learnscala.lang

class Rational(n: Int, d: Int) {
  require(d != 0)

  val nu = n
  val dn = d
  override def toString = n + "/" + d

  def add(that: Rational): Rational = new Rational(
    nu * that.dn + that.nu * dn, dn * that.dn)

  def lessThan(that: Rational) =
    this.nu * that.dn < that.nu * this.dn

}