// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(str: String) = str.chars().peek { c -> println((Char(c))) }.count()

fun main() {
//  displayContent("abc")
}
/* Expected output:
a
b
c
*/
