// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = (h.toDouble() / 2.0) * (x + y).toDouble()

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  // add more tests
}
