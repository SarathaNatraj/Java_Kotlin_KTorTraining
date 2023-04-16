package sample.com.bluecontech.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import kotlinx.serialization.Serializable
import java.beans.Customizer

val customers = mutableListOf<Customer>()


fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/hello-ktor"){
            call.respondText("Hello Ktor!")
        }
        addCustomerRoute()
        fetchAllCustomersRoute()
        deleteCustomerRoute()
        fetchCustomerRoute()
    }
}

fun Route.fetchCustomerRoute() {
   get("{id}"){
       val id = call.parameters["id"]?.toInt()

       val customer = customers.find { it.id == id }
       customer?.let {
           call.respond(HttpStatusCode.Found, it)
       } ?: call.respond(HttpStatusCode.NotFound, "No customer found with id $id")
   }
}

fun Route.deleteCustomerRoute() {
    delete("{id}") {

        val id = call.parameters["id"]?.toInt() ?: return@delete call.respond(
            HttpStatusCode.BadRequest,
            "Customer id required"
        )
        if (customers.removeIf { it.id == id })
            call.respond(HttpStatusCode.Accepted, "Customer removed successfully")
        else
            call.respond(HttpStatusCode.NotFound, "No Customer found with id $id")
    }

}



fun Route.fetchAllCustomersRoute() {
    get("/all"){
        if (customers.isNotEmpty())
            call.respond(HttpStatusCode.OK, customers)
        else
            call.respond(HttpStatusCode.NotFound, "No customers found")

    }
}

fun Route.addCustomerRoute() {
    post{
        val cust = call.receive<Customer>()
        customers.add(cust)
        call.respond(HttpStatusCode.Created, "Customer saved")
    }
}
@Serializable
data class Customer(val id:Int, val name:String, val email:String)

