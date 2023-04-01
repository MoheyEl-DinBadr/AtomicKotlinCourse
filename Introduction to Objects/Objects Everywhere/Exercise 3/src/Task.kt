// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  val normalRange = 'a'..'z'
  var capRange = 'A'..'Z'
  var newS = ""
  for(c in s) {
    if (c in normalRange || c in capRange){
      newS+=c
    }
  }
  return isPalIgnoreCase(newS)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}
