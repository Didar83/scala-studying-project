package lectures.part2oop

import playground.{PrinceCharming, Cinderella => Princess} // combine two imports together

import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {
  val writer = new Writer ("Daniel", "RockTheJVM", 2018)

//  val princess = new Cinderella // with import
  val princess = new Princess // with import
  val princess2 = new playground.Cinderella2 // without import

  // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  val prince = new PrinceCharming

  // 1. use FQ names
  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 4)
  // 2. use aliasing

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???
}
