fun main() {

    // here the functions will be called only
    aboutProject()
    startProgram()
    util()
}

fun aboutProject() {
    println(
        """
    |                                *** PARKING LOT ***                                    
    |***************************************************************************************
    |                        Welcome to the Parking Lot Program.                         
    |""".trimMargin()
    )
}

fun startProgram() {
    println(
        """
        |Parking space is divided into 3 sections:
        |
        |1. Cars
        |2. Scooters
        |3. Bikes
        |
        |Below this you will the available commands that are for all sections but they can be used
        |for one section at a time. Ex: If you are working with the Cars section of parking then all
        |the available commands will work for Cars only. you need to exit car section to access other section.
        |
        |Please note enter text or choice after > this symbol
        |(You will also get option to see the commands with the section and exit options)
        |
    """.trimMargin()
    )
    commandsAvailable()

}

fun commandsAvailable() {
    println(
        """
        |The commands are:
        |1. create <no of spots that you want> -> This will create the number of spots.
        |2. park <the vehicle number plate> <vehicle color> -> This will help in parking the car.
        |3. leave <spot number> -> This will help in freeing up the spot for rest of all.
        |4. status -> This will show the parked vehicle details.
        |5. reg_by_color <color name> -> This will help in knowing all same colored vehicle number in a section.
        |6. spot_by_color <color name> -> This will help in knowing all same colored vehicle spot in a section.
        |7. spot_by_reg <the vehicle number plate> -> This will help in knowing that reg number vehicle's spot in a section.
    """.trimMargin()
    )
}

fun mainMenu() {
    println(
        """
        |
        |******************************
        |*     *** MAIN MENU ***      *
        |*  1. GO TO CAR SECTION      *
        |*  2. GO TO BIKE SECTION     *
        |*  3. GO TO SCOOTER SECTION  *
        |*  4. SHOW COMMANDS AGAIN    *
        |*  5. EXIT                   *
        |******************************
        |
    """.trimMargin()
    )
}