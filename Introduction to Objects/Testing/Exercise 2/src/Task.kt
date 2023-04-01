// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(1, 2, 3) eq 6
  sum(1, 2, 3) neq 1

  sum(-1,1,3) eq 3
  sum(-1,1,3) neq 2
}
