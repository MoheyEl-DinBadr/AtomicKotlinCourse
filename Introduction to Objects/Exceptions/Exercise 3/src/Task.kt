// Exceptions/Task3.kt
package exceptionsExercise3
import atomictest.capture
import atomictest.eq

fun repeatChar(ch: Char, n: Int): String {
  if (n < 0) throw IllegalArgumentException("Count 'n' must be non-negative, but was $n.")
  var result = ""
  for (i in 1..n) {
    result += ch
  }
  return result
}

fun main() {
  repeatChar('a', 4) eq "aaaa"
  capture {
    repeatChar('c', -2)
  } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}
