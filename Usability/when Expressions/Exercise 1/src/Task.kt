// WhenExpressions/Task1.kt
package whenExpressionsExercise1
import atomictest.capture
import atomictest.eq
import creatinggenerics.c

fun cloudiness(cloudPercent: Int): String =
  when {
    cloudPercent in 81..100 -> "Cloudy"
    cloudPercent in 61..80 -> "Mostly Cloudy"
    cloudPercent in 41..60 -> "Partly Sunny"
    cloudPercent in 21..40 -> "Mostly Sunny"
    cloudPercent in 0..20 -> "Sunny"
    else -> {throw IllegalArgumentException("Cloudiness value should be between 0 and 100")}
  }

fun main() {
  cloudiness(100) eq "Cloudy"
  cloudiness(70) eq "Mostly Cloudy"
  cloudiness(50) eq "Partly Sunny"
  cloudiness(30) eq "Mostly Sunny"
  cloudiness(0) eq "Sunny"
  capture {
    cloudiness(1000)
  } eq "IllegalArgumentException: Cloudiness value should be between 0 and 100"
}
