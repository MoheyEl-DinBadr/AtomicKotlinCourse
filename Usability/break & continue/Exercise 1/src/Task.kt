// BreakAndContinue/Task1.kt
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var sum:Int = 0
  for (c in n) {
    if (c == "0") break
    capture {
      val num:Int? = c.toIntOrNull()

      if (num != null)
        sum += num
      else
        trace("Not a number: $c")
    }

  }

  trace("Sum: $sum")
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19")
  trace eq """
    Not a number: a
    Sum: 14
  """
}
