package lectures.part1

object Functions extends App {
  def aFunc(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunc("massa", 123))

  def aParameterlessFunc(): Int = 42

  println(aParameterlessFunc())

  def calledByName(x: => Long): Unit = {
    println("By name " + x)
    println("By name " + x)
    println("By name " + x)
  }

  calledByName(System.nanoTime())

  val name = "David"
  val age = 12
  val greetings = s"Hello, $name and $age and I am going to ${age + 1}"
  val speed = 1.1f
  val myth = f"$name%s can eat $speed%44.3f burgers per minute"
  // f - interpolated formatted string, %s - string, %2.2f float number format with 2 characters total minimum and 2 decimals precision
  println(myth)
}
