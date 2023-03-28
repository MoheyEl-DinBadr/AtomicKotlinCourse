// InKeyword/Task2.kt
package theInKeywordExercise2

fun sumOfEven(n: Int): Int {
  val range = 0..n step 2
  var sum:Int = 0
  for(i in range) {
    sum+=i
  }

  return sum
}

fun main() {
  println(sumOfEven(10))  // 30
}
