// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
    val side1: Double = 1.0, val side2: Double = 2.0,
    val color: String = "yellow"
) {
  override fun toString() = "${this.color} rectangle ${this.side1} x ${this.side2}"

}


fun main() {
    println(Rectangle())
}
