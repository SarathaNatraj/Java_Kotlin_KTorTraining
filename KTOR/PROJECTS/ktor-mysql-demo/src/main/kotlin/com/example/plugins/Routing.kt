package com.example.plugins

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import org.jetbrains.exposed.sql.Database
import kotlinx.html.*
import kotlinx.css.*

suspend inline fun ApplicationCall.respondCss(builder: CssBuilder.() -> Unit) {
    this.respondText(CssBuilder().apply(builder).toString(), ContentType.Text.CSS)
}

fun Application.configureRouting() {

    fun initDB() {
        val config = HikariConfig("/hikari.properties")
        config.schema = "public"
        val ds = HikariDataSource(config)
        Database.connect(ds)
    }
    initDB()
    routing {
        get("/styles.css") {
            call.respondCss {
                body {
                    backgroundColor = Color.darkBlue
                    margin(0.px)
                }
                rule("h1.page-title") {
                    color = Color.white
                }
            }
        }

        get("/") {
          //  call.respondText("Hello World!")
            val name = "Ktor"

            call.respondHtml(HttpStatusCode.OK) {
                head {
                    title {
                        +name
                    }

                        link(rel = "stylesheet", href = "/styles.css", type = "text/css")


                }
                body {
                    h1 {
                        +"Hello from $name!"
                    }
                    p{
                        +" Completing the code in Ktor Programmining - APi development"
                    }
                    label { text("UserName") }
                    input(InputType.text) { value = "UserName"
                    }
                    label { text("Password") }
                    input(InputType.text) { value = "Password"
                    }
                    button { value="Login" }

                    div{
                        label { text("Enter Name") }
                        input(InputType.text) { value = "Name"
                        }
                        label { text("Enter Email") }
                        input(InputType.text) { value = "Email"
                        }
                        label { text("Enter city") }
                        input(InputType.text) { value = "City"
                        }
                        button (type=ButtonType.submit, name = "Submit") { value="Submit"  }
                        postButton(type=ButtonType.submit, name = "Submit") { value="Submit"  }
                    }
                }
            }
        }

    }

    }

