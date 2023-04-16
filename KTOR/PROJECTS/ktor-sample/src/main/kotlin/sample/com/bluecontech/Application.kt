package sample.com.bluecontech

import io.ktor.server.application.*
import io.ktor.server.application.hooks.Metrics.install
import io.ktor.server.application.install
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.routing.*
import sample.com.bluecontech.plugins.*

fun main() {
    embeddedServer(Netty, port = 8090, host = "0.0.0.0", module = Application::module)
        .start(wait = true)

}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
