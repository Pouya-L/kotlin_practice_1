import java.util.LinkedList

/*An accurate calculator that will ask the user for the month and the year,
and prints how many days that month has.
It will also provide a few extra hidden history facts if some specific dates are entered.
Special years: 1997, 1990, 1986, 1979, 1974, 1957, 1939, 1932,
1913, 1912, 1876, 1859, 1858, 1789, 1755, 1518, 1325
It mostly follows an algorithm to check the yer by seeing if it's divisible by 4.
However, for the BC years from 45BC to 9BC that followed a different pattern it checks individually*/
fun exercise_1() {
    printBannerDC()
    val month: Int = inputMonth("Which month would you like to know about? Please enter a number." +
            " (eg. 1 for January)")
    val year: Int = inputYear("Please enter the year you have in mind.")
    if (year < 8) {
        BCleapyears(year, month)
        return
    }
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        printMsgFutureOrPast(year, month, 31)
    else if (month == 4 || month == 6 || month == 9 || month == 11)
        printMsgFutureOrPast(year, month, 30)
    else {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0)
                printMsgFutureOrPast(year, month, 28)
            else {
                if (year > 2023)
                    println("${yearNumberToName(year)} will be a leap year;" +
                            " therefore, ${monthNumberToName(month)} will have 29 days.")
                else
                    println("${yearNumberToName(year)} was a leap year; therefore," +
                            " ${monthNumberToName(month)} had 29 days.")
            }
        } else
            printMsgFutureOrPast(year, month, 28)
    }
}

class Node(var data : Int, var next: Node? = null)

fun exercise_2() {
    val linkedListNumbers = LinkedList<Int>()
    val num1 = readValidNumber("Enter the first number")
    val num2 = readValidNumber("Enter the second number")
    val num3 = readValidNumber("Enter the third number")

    linkedListNumbers.add(num1)
    linkedListNumbers.add(num2)
    linkedListNumbers.add(num3)
    linkedListNumbers.sort()
    println("The largest number is ${linkedListNumbers[2]}")
}

fun exercise_2_1_v0() {
    var num1 = readValidNumber("Enter the first number")
    var num2 = readValidNumber("Enter the second number")
    if (num1 > num2) {
        num2 = readValidNumber("Enter the third number")
        if (num1 > num2)
            println("The largest numebr is $num1")
        else
            println("The largest numebr is $num2")
    }
    else {
        num1 = readValidNumber("Enter the third number")
        if (num1 > num2)
            println("The largest numebr is $num1")
        else
            println("The largest numebr is $num2")
    }
}

fun exercise_2_1_v1() {
    var num1 = readValidNumber("Enter the first number")
    var num2 = readValidNumber("Enter the second number")
    if (num1 < num2)
        num1 = num2
    num2 = readValidNumber("Enter the third number")
    if (num2 > num1)
        num1 = num2
    println("The largest numebr is $num1")
}