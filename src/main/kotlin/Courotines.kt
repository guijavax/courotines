import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Start")

    val global = GlobalScope
    global.launch {
        delay(1000)
        println("Hello")
    }

    Thread.sleep(1500)
    println("Stop")

    val nuns = mutableListOf<Int>()
    global.async {
        (1 .. 1000).forEach { i ->
            nuns.add(i)
        }
    }
    val nuns2 = mutableListOf<Int>()

    (1 .. 1000).forEach {i ->
        nuns2.add(i)
    }
    println(" num 1 before -> $nuns")
    println(nuns2)
    Thread.sleep(2000)
    println(" num 1 after-> $nuns")


    val classe = TesteExecuta::class
    println(classe)
}