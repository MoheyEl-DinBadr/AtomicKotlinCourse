// NumberTypes/Task3.kt
package numberTypesExercise3

fun convertFahrenheitToCelsius(f: Int): Double =
  (f.toDouble() - 32.0) * (5.0/9.0)

fun convertCelsiusToFahrenheit(c: Int): Double =
  (c.toDouble() / (5.0/9.0)) + 32

fun main() {
  println(convertFahrenheitToCelsius(68)) // 20.0
  println(convertCelsiusToFahrenheit(20)) // 68.0
}
