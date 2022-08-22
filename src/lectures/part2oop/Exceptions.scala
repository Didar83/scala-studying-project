package lectures.part2oop

object Exceptions extends App{

  val x: String = null
//  println(x.length)

  val aWeirdValue: String = throw new NullPointerException

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42

    try {
      getInt(true)
    } catch {
      case e: RuntimeException => println("caught a Runtime exception")
    } finally {
      println("finally")
    }




}
