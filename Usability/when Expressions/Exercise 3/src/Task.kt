// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq
import java.util.Stack

fun balanced(input: String): Boolean {
  var input = input.replace(" ", "")
   var stack:Stack<Char> = Stack<Char>()
  for (ch in input) {
    if (ch === '(') {
      stack.push(ch)
    }else if (ch === ')') {
      if (stack.empty()) return false
      else stack.pop()
    }else {
      throw IllegalArgumentException()
    }
  }

  return stack.isEmpty()
  }

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}
