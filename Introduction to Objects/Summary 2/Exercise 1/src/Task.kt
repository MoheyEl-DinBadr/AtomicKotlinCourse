// Summary2/Task1.kt
package summaryIIExercise1
import atomictest.eq

class Boring {
    fun a() = 1.618

    fun b() = "ratio"

    fun c() = 11
}

fun main() {
  var boring = Boring()
    boring.a() eq 1.618
    boring.b() eq "ration"
    boring.c() eq 11
}
