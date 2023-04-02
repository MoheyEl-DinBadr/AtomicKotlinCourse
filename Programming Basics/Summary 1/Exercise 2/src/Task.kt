// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result:String = ""
  for (i in 0..s.length-1 step 2) {
    result += s[i]
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/

