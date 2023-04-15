// SafeCallsAndElvis/Task1.kt
package safeCallsAndTheElvisOperatorExercise1
import atomictest.eq

fun downcase(str:String?): String {
    var str:String? = str?.lowercase()
    return str ?: ""
}

fun main() {
  downcase(null) eq ""
  downcase("ABC") eq "abc"
}
