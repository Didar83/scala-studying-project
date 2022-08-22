package lectures.part2oop

abstract class MyList {
  def head: Int
  def tail: MyList
  def isEmpty(): Boolean
  def add(element: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object EmptyList extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty(): Boolean = true
  def add(element: Int): MyList = new ConsList(element, EmptyList)
  def printElements: String = ""
}

class ConsList (h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty(): Boolean = false
  def add(element: Int): MyList = new ConsList(element, this)
  def printElements: String =
    if(t.isEmpty()) "" + h
    else h + ", " + t.printElements

}

object ListTest extends App {
  val list = new ConsList(1, new ConsList(2, new ConsList(3, EmptyList)))
  println(list.head)
  println(list.add(4).head)
  println(list.toString)
}
