package CodingAssessment.Kotlin

import java.util.*

object CinemaRoomManager {
    var seats = Array(10) { arrayOfNulls<String>(10) }
    var sc = Scanner(System.`in`)
    var total = 0
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in seats.indices) {
            for (j in seats[i].indices) {
                if (i < 3) {
                    seats[i][j] = "Plat"
                } else if (i >= 3 && i <= 7) {
                    seats[i][j] = "Gold"
                } else {
                    seats[i][j] = "Silv"
                }
            }
        }
        var opt = -1
        while (opt != 4) {
            println("opt 1 : Buy tickets")
            println("opt 2 : See available seats")
            println("opt 3 : See sales")
            println("opt 4 : Exit")
            opt = sc.nextInt()
            when (opt) {
                1 -> buyTickets()
                2 -> seeAvailableTickets()
                3 -> seeSales()
                4 -> System.exit(0)
            }
        }
    }

    private fun seeSales() {
        println("Sales of the day : $total")
    }

    private fun buyTickets() {
        seeAvailableTickets()
        println("Do not select seats marked as Booked")
        println("Platinum = Rs. 300")
        println("Gold = Rs. 200")
        println("Silver = Rs. 100")
        println("Enter no. of tickets o buy : ")
        val noOfTickets = sc.nextInt()
        var i = 0
        while (i < noOfTickets) {
            println("Enter tickets rows and columns")
            val row = sc.nextInt()
            val col = sc.nextInt()
            if (!seats[row][col].equals("Book", ignoreCase = true)) {
                println("Booked")
                if (seats[row][col].equals("Plat", ignoreCase = true)) {
                    seats[row][col] = "Book"
                    println("Price 300")
                    total = total + 300
                } else if (seats[row][col].equals("Gold", ignoreCase = true)) {
                    seats[row][col] = "Book"
                    println("Price 200")
                    total = total + 200
                } else if (seats[row][col].equals("Silv", ignoreCase = true)) {
                    seats[row][col] = "Book"
                    println("Price 100")
                    total = total + 100
                }

            } else {
                println("Already Booked. Choose another seat")
                i--
            }
            i++
        }
    }

    private fun seeAvailableTickets() {
        for (i in seats.indices) {
            for (j in seats[i].indices) {
                if(seats[i][j].equals("Book", ignoreCase = true) )
                {
                    print("----"+ " ");
                }
                else
                {
                    print(seats[i][j]+" ")
                }
            }
            println()
        }
    }
}