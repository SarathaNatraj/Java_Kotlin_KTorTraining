package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*


fun Application.configureSecurity() {
    install(Authentication) {
        basic("myAuth") {
            realm = "Access to the '/pagebasic' path"
            validate { credentials ->
                if (credentials.name == "Admin" && credentials.password == "2425") {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
        }
        form("myFormAuth") {
            userParamName = "username"
            passwordParamName = "password"
            validate { credentials ->
                if (credentials.name == "Admin" && credentials.password == "2425") {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
            challenge {
                call.respondRedirect("/auth")
            }
        }

    }


}
