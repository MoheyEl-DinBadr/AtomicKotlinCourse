// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var numStr = number.toString()
  numStr = numStr.reversed()
  return numStr.toInt()
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}
