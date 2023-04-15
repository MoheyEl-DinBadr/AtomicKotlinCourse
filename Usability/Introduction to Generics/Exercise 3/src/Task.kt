// IntroGenerics/Task3.kt
package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<T> {
    private val map = mutableMapOf<T, Int>()

    fun add(element:T) {
        if (map[element] == null)
            map[element] = 1
        else
            map[element] = map[element]!! + 1
    }

    fun count(element:T) = map[element]?: 0
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
}
