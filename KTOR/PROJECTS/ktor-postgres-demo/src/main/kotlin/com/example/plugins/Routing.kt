package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.http.*
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database


fun Application.configureRouting() {
     val database = Database.connect(
        url = "jdbc:postgresql://localhost:5438/postgres",
        driver = "org.postgresql.Driver",
        user = "admin",
        password = "admin"
    )

    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause" , status = HttpStatusCode.InternalServerError)
        }
    }
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
