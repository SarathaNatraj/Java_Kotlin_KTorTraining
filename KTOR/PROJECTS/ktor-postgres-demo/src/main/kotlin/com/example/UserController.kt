package com.example

import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.update
import java.util.UUID
import kotlin.collections.MutableList

class UserController {

    suspend fun getAll(): MutableList<User> {
        val users: MutableList<User> = mutableListOf<User>()
        transaction {
            Users.selectAll().map {
                users.add(
                    User(
                        id = it[Users.id],
                        firstName = it[Users.firstname],
                        lastName = it[Users.lastname],
                        age = it[Users.age]
                    )
                )
            }
        }
        return users
    }

    fun insert(user: UserDTO) {
        transaction {
            Users.insert {
                it[id] = user.id
                it[age] = user.age
                it[firstname] = user.firstName
                it[lastname] = user.lastName
            }
        }
    }

    fun update(user: UserDTO, id: Int) {
        transaction {
            Users.update({Users.id.eq(id)}) {
                it[age] = user.age
                it[firstname] = user.firstName
                it[lastname] = user.lastName
            }
        }
    }

    fun delete(id: Int) {
        transaction {
            Users.deleteWhere { Users.id.eq(id)  }
        }
    }
}