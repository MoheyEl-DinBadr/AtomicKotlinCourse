// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

class Boring2(val a:Double, val b:String, val c:Int) {

  fun a() = a
  fun b() = b
  fun c() = c

}

fun main() {
  val boring2 = Boring2(18.0, "test", 13)

  boring2.a() eq 18.0
  boring2.b() eq "test"
  boring2.c() eq 13
}
