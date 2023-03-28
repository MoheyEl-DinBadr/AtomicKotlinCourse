// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var init = 0
  var result = 0
  while(init <= number) {
    result+=init
    init++
  }

  return result
}

fun main() {
  println(sum(10))  // 55
}
