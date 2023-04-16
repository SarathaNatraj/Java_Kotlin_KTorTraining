
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

sealed class CounterMsg {
    object IncCounter : CounterMsg() // one-way message to increment counter
    class GetCounter(val response: SendChannel<Int>) : CounterMsg() // a request with channel for reply.
}

// This function launches a new counter actor
fun counterActor() = GlobalScope.actor<CounterMsg> {
    var counter = 0 // actor state, not shared
    for (msg in channel) { // handle incoming messages
        when (msg) {
            is CounterMsg.IncCounter -> counter++
            is CounterMsg.GetCounter -> msg.response.send(counter)
        }
    }
}

suspend fun getCurrentCount(counter: SendChannel<CounterMsg>): Int {
    val response = Channel<Int>()
    counter.send(CounterMsg.GetCounter(response))
    val receive = response.receive()
    println("Counter = $receive")
    return receive
}

fun main(args: Array<String>) = runBlocking<Unit> {
    val counter = counterActor()

    GlobalScope.launch {
        while (getCurrentCount(counter) < 100) {
            delay(100)
            println("sending IncCounter message")
            counter.send(CounterMsg.IncCounter)
        }
    }

    GlobalScope.launch {
        while (getCurrentCount(counter) < 100) {
            delay(200)
        }
    }.join()
    counter.close() // shutdown the actor
}
