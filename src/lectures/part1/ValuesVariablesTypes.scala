package lectures.part1

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // x = 2 - error, bc VALS are immutable

  val stringVal: String = "Hello"


  var anotherStr: String = "Try to change me"
  anotherStr = "Var is not immutable"

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else 3
  }
  println(aCodeBlock)

  val someVal = {
    if (2 < 3) "239" else "987"
    42
  }
  println(someVal)
}
