/*prints the user input in box, thew point of it is to practice how to use println*/
fun exercise_3() {
    var input : String
    while (true) {
        input = readValidString("Please enter a 3 letter word")
        if (input.length == 3)
            break
        else
            println("You enetered somethig that didn't have only 3 letters.")
    }
    println("*************")
    println("* $input       *")
    println("*  $input      *")
    println("*   $input     *")
    println("*************")
}

/*prints the user input in box, thew point of it is to practice how to use println
* !with 6 printlns!*/
fun exercise_3_1() {
    var input : String
    while (true) {
        println("Please enter a 3 letter word")
        input = readln()
        if (input.length == 3)
            break
        else
            continue
    }
    println("*************")
    println("* $input       *")
    println("*  $input      *")
    println("*   $input     *")
    println("*************")
}

/*prints the user input in box, thew point of it is to practice how to use println
* Also we lkearn how to use """ """ to enter complex strings
* without having to use escpare chars like /n for new line and so on
* !with only two printlns*/
fun exercise_3_2() {
    var input : String
    while (true) {
        println("Please enter a 3 letter word")
        input = readln()
        if (input.length == 3)
            break
        else
            continue
    }
    val output = """
        |*************
        |* ${input}       *
        |*  ${input}      *
        |*   ${input}     *
        |*************""".trimMargin()
    println(output)
}

/*prints the user input in box, thew point of it is to practice how to use println
* we learn how to use /n
* !with only two printlns*/
fun exercise_3_3() {
    var input : String
    while (true) {
        println("Please enter a 3 letter word")
        input = readln()
        if (input.length == 3)
            break
        else
            continue
    }
    println("*************\n* $input       *\n*  ${input}      *\n*   ${input}     *\n*************")
}

/*prompts the user to enter a number, checks if its a valid number, or if the user entered nothing
* if the user entered an empty string it prints a box
* finally it concatonates the two input strings*/
fun exercise_4() {
    var input1 = readValidNumberOrEmpty("Enter Number 1")
    var input2 = readValidNumberOrEmpty("Enter Number 2")
    if (input1.isEmpty())
        input1 = "\u25a1"
    if (input2.isEmpty())
        input2 = "\u25a1"
    val output = input1 + input2
    println("Result: $output")
}

/*prompts the user to enter a number, checks if its a valid number, or if the user entered nothing
* if the user entered an empty string it prints a box
* finally it concatonates the two input strings*/
fun exercise_4_1()  {
    while (true) {
        println("Please enter the first number")
        var input1S = readln()
        val input1 = input1S.toIntOrNull()
        println("Please enter the second number")
        var input2S = readln()
        val input2 = input2S.toIntOrNull()
        if ((input1 != null && input2 != null) || (input1 != null && input2S.isEmpty()) ||
            (input2 != null && input1S.isEmpty()) || (input2S.isEmpty() && input1S.isEmpty())) {
            input1S = input1S.takeUnless { input1S.isEmpty() && it.toIntOrNull() == null} ?: "\u25a1"
            input2S = input2S.takeUnless { input2S.isEmpty() && it.toIntOrNull() == null } ?: "\u25a1"
            println("$input1S$input2S")
            break
        }
        else
            println("Not a valid number, please enter a valid number")
    }
}

/*prompts the user to enter a number, checks if its a valid number, or if the user entered nothing
* if the user entered an empty string it prints a box
* finally it concatonates the two input strings
* this version is without Ifs but it has no protesctions agaisnts inpouts that are not valid ints*/
fun exercise_4_2() {
    println("Please enter a number")
    val input1 = readLine()?.toIntOrNull() ?: "\u25a1"
    val input2 = readLine()?.toIntOrNull() ?: "\u25a1"
    println("$input1$input2")
}