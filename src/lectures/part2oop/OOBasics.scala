package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)

}

class Person(name: String, val age: Int) {
  val x = 2
  println(1 + 3 + " 123")
}
