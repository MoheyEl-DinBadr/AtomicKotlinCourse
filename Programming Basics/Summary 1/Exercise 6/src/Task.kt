// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var count:Int  = 0
  for (i in s) {
    if (i != ' ') {
      count++;
      if (count % 5 == 0)
        println(i)
    }

  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/
