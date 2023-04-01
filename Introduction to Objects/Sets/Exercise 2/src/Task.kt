// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  var setResult = HashSet<Int>()
  var count = 0;
  while (setResult.size != 25) {
    var num =  Random.nextInt(25) + 1
    setResult.add(num)
    count++
  }
  return count
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}
