package learnscala.l1

object Loop {

  def main(args: Array[String]) = printArray(Array("A", "B", "C"))

  def printArray(arr: Array[String]) {
    println("foreach")
    arr.foreach(println(_))

    println("for")
    for (a <- arr) {
      println(a)
    }

    println("imperative")
    var i = 0
    while (i < arr.length) {
      println(arr(i))
      i += 1
    }
  }
}