package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.ktor.http.*
import io.ktor.server.auth.ldap.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import java.util.*

const val secret = "secret"
const val issuer = "http://0.0.0.0:8080/"
const val audience = "http://0.0.0.0:8080/page"
const val myRealm = "Access to 'page'"


fun Application.configureSecurity() {
    /*install(Authentication) {
        jwt("myAuth") {
            realm = myRealm
            verifier(
                JWT
                    .require(Algorithm.HMAC256(secret))
                    .withAudience(audience)
                    .withIssuer(issuer)
                    .build())
            validate { credential ->
                if (credential.payload.getClaim("username").asString() != "") {
                    JWTPrincipal(credential.payload)
                } else {
                    null
                }
            }
            challenge { defaultScheme, realm ->
                call.respond(HttpStatusCode.Unauthorized, "Token is not valid or has expired")
            }
        }

    }
*/
    install(Authentication) {
        //step - 1 basic authentication
        basic("auth-basic") {
            realm = "Access to the '/' path"
            validate { credentials ->
                if ( credentials.password == "password") {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
        }

        basic("auth-ldap") {
            validate { credentials ->
                ldapAuthenticate(credentials, "ldap://ldap.forumsys.com:389", "cn=read-only-admin,dc=example,dc=com") {
                    if (it.name =="Admin" && it.password == "password") {
                        UserIdPrincipal(it.name)
                    } else {
                        null
                    }
                }
            }
        }
    }


}
