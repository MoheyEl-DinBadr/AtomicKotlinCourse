// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*
import kotlin.collections.ArrayList

class FixedSizeHolder(private val maxSize:Int) {
    private val array = ArrayList<Any>()

    val full: Boolean
        get() = array.size == maxSize

    val size:Int
        get() = array.size

    fun add(obj: Any) {
        if (!full)
            array.add(obj)
        else
            throw IllegalStateException("The container is full")
    }



}

fun main() {
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
}
