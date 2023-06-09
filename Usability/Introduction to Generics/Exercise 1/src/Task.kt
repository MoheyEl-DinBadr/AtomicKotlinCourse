// IntroGenerics/Task1.kt
package introductionToGenericsExercise1
import atomictest.eq

fun <T> List<T>.secondOrNull(): T? = when {
  this.size < 2 -> null
  else -> this[1]
}

fun <T> List<T>.penultimateOrNull(): T? = when {
  this.size < 3 -> null
  else -> this[this.size - 2]
}

fun main() {
  val ints = listOf(1, 2, 3)
  ints.secondOrNull() eq 2
  ints.penultimateOrNull() eq 2

  val strings = listOf("a", "b", "c", "d")
  strings.secondOrNull() eq "b"
  strings.penultimateOrNull() eq "c"
}
