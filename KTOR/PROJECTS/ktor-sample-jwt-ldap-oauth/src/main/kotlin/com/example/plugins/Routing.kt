package com.example.plugins

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.request.*
import kotlinx.serialization.encodeToString
import java.util.*

import kotlinx.serialization.json.Json

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World! ")
        }
        post("/login") {
            val parameters = call.receiveParameters()
            val username = parameters["username"].toString()
            val password = parameters["password"].toString()

            if (username == "Admin" && password == "2425") {
                val token = JWT.create()
                    .withAudience(audience)
                    .withIssuer(issuer)
                    .withClaim("username", username)
                    .withExpiresAt(Date(System.currentTimeMillis() + 24*60*60000))
                    .sign(Algorithm.HMAC256(secret))
                call.respondText(
                    Json.encodeToString(hashMapOf("token" to token)),
                    ContentType.Application.Json
                )
            } else {
                call.response.status(HttpStatusCode.Unauthorized)
                call.respondText(
                    Json.encodeToString(hashMapOf("error" to "Wrong login or password")),
                    ContentType.Application.Json
                )
            }
        }
        /*authenticate("myAuth") {
            get("/page") {
                val principal = call.principal<JWTPrincipal>()
                val username = principal!!.payload.getClaim("username").asString()
                val expiresAt = principal.expiresAt?.time?.minus(System.currentTimeMillis())
                call.respondText("Hi, $username! Token is expired at $expiresAt ms.")
            }
        }*/
        authenticate("auth-ldap") {
            get("/page") {
                call.respondText("Hello, ${call.principal<UserIdPrincipal>()?.name}! - ldap verified")
            }
        }

    }


}
