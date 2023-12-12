/*Prints a banner for the day count calculator*/
fun printBannerDC(){
    val purpleColor = "\u001B[35m"
    val defaultColor = "\u001B[37m"
    val cyanColor = "\u001B[36m"
    val greenColor = "\u001B[32m"

    println("\t${purpleColor}╔════════════════════════════════════════╗${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║  Welcome to the day count calculator!  ║${defaultColor}")
    println("\t${purpleColor}║               ${greenColor}by Pouya-L${purpleColor}" +
            "               ║${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║       ${cyanColor}Now with fun history facts!      ${purpleColor}║" +
            "${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}╚════════════════════════════════════════╝${defaultColor}")
}

fun printBannerFizzBuzz(){
    val purpleColor = "\u001B[35m"
    val defaultColor = "\u001B[37m"
//    val cyanColor = "\u001B[36m"
    val greenColor = "\u001B[32m"
    val redColor = "\u001B[31m"

    println("\t${purpleColor}╔════════════════════════════════════════╗${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║  Welcome to the Fizz Buzz calculator!  ║${defaultColor}")
    println("\t${purpleColor}║               ${greenColor}by Pouya-L${purpleColor}               ║")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║         ${redColor}No numbers were harmed         ${purpleColor}║")
    println("\t${purpleColor}║   ${redColor}during the production on this code${purpleColor}   ║")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}╚════════════════════════════════════════╝${defaultColor}")
}