// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var str: String = ""
  for(s in 'a'..'z') {
    str += s
  }
  return str
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
