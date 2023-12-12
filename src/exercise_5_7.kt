fun exercise_5_v0() {
    var numero1: Int? = 3
    var numero2: Int? = 4
    val sum = numero1!! + numero2!!
    println("$sum")
}

fun exercise_5_v1() {
    var numero1: Int? = 3
    var numero2: Int? = 4
    println("${numero1!! + numero2!!}")
}



fun exercise_6() {
    val options = arrayOf("rock", "paper", "scissors")
    val usr1 = readValidOptionRPS("Player 1, enter rock, paper, scissors:", options)
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
    val usr2 = readValidOptionRPS("Player 2, enter rock, paper, scissors:", options)
    if (usr1.equals(usr2, ignoreCase = true))
        println("It's a tie")
    else if (
        (usr1.equals("rock",  ignoreCase = true) && usr2.equals("scissors",  ignoreCase = true))
        || (usr1.equals("scissors",  ignoreCase = true) && usr2.equals("paper",  ignoreCase = true))
        || (usr1.equals("paper",  ignoreCase = true) && usr2.equals("rock",  ignoreCase = true))
    )
        println("Player 1 wins!")
    else
        println("player 2 wins")
}

fun exercise_7() {
    printBannerFizzBuzz()
    val input = readValidNumber("Enter a number")
    if (input % 15 == 0)
        println("fizzbuzz")
    else if (input % 3 == 0)
        println("fizz")
    else if (input % 5 == 0)
        println("buzz")

}