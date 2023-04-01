// Constructors/Task1.kt
package constructorsExercise1

class Floating(d: Double) {
  val d = d
  override fun toString(): String {
    return d.toString()
  }
}

fun main() {
  val floating: Floating = Floating(10.0)
  println(floating.d)
}
