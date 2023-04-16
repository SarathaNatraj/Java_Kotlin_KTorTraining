

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import io.ktor.server.plugins.statuspages.*

//Can be converted to be database
val employees = mutableListOf<Employee>()

fun Application.registerEmployeeRoute() {

    routing {
        route("/employee") {
            defaultRoute()
            addEmployeeRoute()
            getEmployeeRoute()
            getEmployeesRoute()
            deleteEmployeeRoute()

        }
    }


}

fun Route.defaultRoute() {
    get("/") {
        call.respondText("Hello World!")
    }
}



fun Route.addEmployeeRoute() {
    post {
        val emp = call.receive<Employee>()
        employees.add(emp)
        call.respond(HttpStatusCode.Created, "Employee saved")
    }
}

fun Route.getEmployeeRoute() {
    get("{id}") {
            val id = call.parameters["id"]?.toInt()

            val emp = employees.find { it.id == id }
            emp?.let {
                call.respond(HttpStatusCode.Found, it)
            } ?: call.respond(HttpStatusCode.NotFound, "No employee found with id $id")
        }

}

fun Route.getEmployeesRoute() {
    get {
        if (employees.isNotEmpty())
            call.respond(HttpStatusCode.OK, employees)
        else
            call.respond(HttpStatusCode.NotFound, "No employees found")
    }
}

fun Route.deleteEmployeeRoute() {
    delete("{id}") {

            val id = call.parameters["id"]?.toInt() ?: return@delete call.respond(
                HttpStatusCode.BadRequest,
                "Employee id required"
            )
            if (employees.removeIf { it.id == id })
                call.respond(HttpStatusCode.Accepted, "Employee removed successfully")
            else
                call.respond(HttpStatusCode.NotFound, "No Employee found with id $id")
        }

}

@Serializable
data class Employee(val id:Int, val name: String, val email: String ,val department:String)
class AuthorizationException(override val message: String?) : Throwable()