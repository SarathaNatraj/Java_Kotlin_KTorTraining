package com.example.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.auth.*

fun Application.configureRouting() {
    routing {
      get("/") {
            call.respondText("Protected Content ")
        }
        authenticate("myAuth") {
            get("/pagebasic") {
         //  call.respondText("Protected content! Name: ${call.principal<UserIdPrincipal>()?.name}")
                call.respondRedirect("/page")
            }
        }
        authenticate("myFormAuth") {
            post("/page") {
                call.respondText("Protected content! Name: ${call.principal<UserIdPrincipal>()?.name}")
            }
        }
        get("/pagebasic") {
            call.respondRedirect("/page")
        }
        get("/pageForm") {
            call.respondRedirect("/auth")
        }
        get("/auth") {
            val formHtml = """
            <form action="/page" method="post">
                <input type="text" name="username">
                <input type="password" name="password">
                <input type="submit" value="Auth">
            </form>
        """.trimIndent()
            call.respondText(formHtml, ContentType.Text.Html)
        }

        get("/page") {
            val formHtml = """
            <p>
               Demo page
            </p>
        """.trimIndent()
            call.respondText(formHtml, ContentType.Text.Html)

        }

    }
}
