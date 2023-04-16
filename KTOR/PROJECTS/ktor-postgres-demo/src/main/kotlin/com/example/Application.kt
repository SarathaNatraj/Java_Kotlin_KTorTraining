package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import io.ktor.http.*
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.http.ContentType.Application.Json
import io.ktor.jackson.*
import io.ktor.serialization.kotlinx.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import org.jetbrains.exposed.sql.Database
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json


import java.util.UUID
var users = mutableListOf<User>()
fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    val userController = UserController()
    fun initDB() {
        val config = HikariConfig("/hikari.properties")
        config.schema = "public"
        val ds = HikariDataSource(config)
        Database.connect(ds)
    }
    install(ContentNegotiation){
        json(Json { prettyPrint = true
            isLenient = true
            encodeDefaults = true
            allowStructuredMapKeys = true
        })

    }

    initDB()
    routing {
        get("/") {
            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
        }

        get("/json/jackson") {
            call.respond(mapOf("hello" to "world"))
        }

        get("/users") {
            users = UserController().getAll()
            if (users.isNotEmpty())
                call.respond(HttpStatusCode.OK, users)
            else
                call.respond(HttpStatusCode.NotFound, "No employees found")
        }

        post("/users") {
            val user = call.receive<UserDTO>()
            userController.insert(user)
            call.respond(HttpStatusCode.Created,"User Created")
        }

        put("/users/{id}") {
            val id: Int = (call.parameters["id"])!!.toInt()
            val user = call.receive<UserDTO>()
            userController.update(user, id)
            call.respond(HttpStatusCode.OK, "User Updated")
        }

        delete("/users/{id}") {
            val id: Int = (call.parameters["id"])!!.toInt()
            userController.delete(id)
            call.respond(HttpStatusCode.OK,"User Deleted")
        }
    }
}


