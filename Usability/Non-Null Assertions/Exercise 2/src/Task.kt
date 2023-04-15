// NonNullAssertions/Task2.kt
package nonNullAssertionsExercise2
import atomictest.*

fun List<Int>.headPlusTail():Triple<Int?, Int?, Int?> {
    return when {
        isEmpty() -> Triple(null, null, null)
        (size == 1) -> Triple(first(), null, null)
        else -> Triple(first(), last(), first() + last())
    }

}

fun main() {
  val list = mutableListOf<Int>()
    trace(list.headPlusTail())
    for (i in -2..10 step 2) {
        list.add(i)
        trace(list.headPlusTail())
        trace(list.headPlusTail()!!.third)
    }
    trace eq """
    (null, null, null)
    (-2, null, -2)
    -2
    (-2, 0, -2)
    -2
    (-2, 2, 0)
    0
    (-2, 4, 2)
    2
    (-2, 6, 4)
    4
    (-2, 8, 6)
    6
    (-2, 10, 8)
    8
  """


}
