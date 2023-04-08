// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg s:Int) {
    println("va1:")
    s.forEach { println(it) }
}

fun va2(vararg s:Int) {
    println("va2:")
    va1(*s)
}

fun main() {
  va1(1, 2, 3)
  va2(4, 5, 6)
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */
