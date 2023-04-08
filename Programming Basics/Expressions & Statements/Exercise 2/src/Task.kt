// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(first:Int, second:Int): Int = first + second

fun g(first:String, second:String) = first+second

fun h() = println("h()")

fun main() {
  val f = f(1,2)
  val g = g("first","second")
  val h = h()

  println("Int")
  println("String")
  println("Unit")
  }
