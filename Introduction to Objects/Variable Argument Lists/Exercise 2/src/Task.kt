// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(parm1: String, vararg parm2: Int) {
    println("$parm1${parm2.asList()}")
}

fun main() {
  printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */
