/*Checks for leap years in the BC range (45BC to 9BC)*/
fun BCleapyears(year: Int, month: Int) {
    if (year % 3 == 0) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            printMsgFutureOrPast(year, month, 31)
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            printMsgFutureOrPast(year, month, 30)
        else
            println("${yearNumberToName(year)} was a leap year; therefore, ${monthNumberToName(month)} had 29 days.")
    }
    else {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            printMsgFutureOrPast(year, month, 31)
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            printMsgFutureOrPast(year, month, 30)
        else
            printMsgFutureOrPast(year, month, 28)
    }
}

/*Checks if the year is after 2023 or not to use the correct grammar, using future tense and past tense.*/
fun printMsgFutureOrPast(year: Int, month: Int, days : Int) {
    if (year > 2023)
        println("${monthNumberToName(month)}, ${yearNumberToName(year)} will have ${days} days.")
    else
        println("${monthNumberToName(month)}, ${yearNumberToName(year)} had ${days}  days.")
}

/*Prompts the user for a month as an Int between 1 and 12*/
fun inputMonth(prompt: String) : Int {
    var month : Int
    while (true)
    {
        month = readValidNumber(prompt)
        if (month in 1..13)
            return (month)
        else
            println("Not a valid month, it should be between 1 and 12.")
    }
}

/*Prompts the user for a year as an Int between -45 to ...
* This is because The notion of a leap year as we know it today was introduced in 45 BC*/
fun inputYear(prompt: String) : Int {
    var year : Int
    while (true)
    {
        year = readValidNumber(prompt)
        if (year >= -45)
            return (year)
        else
            println("Not a valid year, The notion of a leap year as we know it today was introduced in 45 " +
                    "BCE. so the number has to bigger than -45")
    }
}

/*Receives a month number as an Int and returns the name of the month as a String*/
fun monthNumberToName(month : Int) : String {
    if (month == 1)
        return ("January")
    else if (month == 2)
        return ("February")
    else if (month == 3)
        return ("March")
    else if (month == 4)
        return ("April")
    else if (month == 5)
        return ("May")
    else if (month == 6)
        return ("June")
    else if (month == 7)
        return ("July")
    else if (month == 8)
        return ("August")
    else if (month == 9)
        return ("September")
    else if (month == 10)
        return ("October")
    else if (month == 11)
        return ("November")
    else
        return ("December")
}

/*Receives a year number as an Int and returns number and sometimes a historical fact as a String
* Special years: 1997, 1990, 1986, 1979, 1974, 1957, 1939, 1932,
* 1913, 1912, 1876, 1859, 1858, 1789, 1755, 1518, 1325*/
fun yearNumberToName(year: Int) : String {
    if (year < 0)
        return("${year * -1} BC")
    else if (year == 1997)
        return("1997, my birth year,")
    else if (year == 1912)
        return("1912, the tragic year that Titanic sank,")
    else if (year == 1990)
        return("1990, the year World Wide Web was invented,")
    else if (year == 1986)
        return("1986, the year the Chernobyl disaster occurred in Ukrainian SSR,")
    else if (year == 1979)
        return("1979, the year U.S. President Jimmy Carter was attacked by a giant swimming rabbit,")
    else if (year == 1974)
        return("1974, the year of the Carnation Revolution ended the dictatorial Estado Novo regime")
    else if (year == 1957)
        return("1957, the launch year of Sputnik 1, marking the beginning of space age,")
    else if (year == 1939)
        return("1939, the year WWII began as Germany invaded Poland")
    else if (year == 1932)
        return("1932, the year Australia lost a war to some flightless birds")
    else if (year == 1929)
        return("1929, the beginning year of the Great Depression,")
    else if (year == 1913)
        return("1913, the year of the Shortest presidency in the history that only lasted 42 minutes.")
    else if (year == 1876)
        return("1876, the year that the first telephone call was made,")
    else if (year == 1859)
        return("1859, the year 'On the Origin of Species' by Charles Darwin published,")
    else if (year == 1858)
        return("1858, the year of The Great Stink in London,")
    else if (year == 1789)
        return("1789, the beginning year of the French Revolution,")
    else if (year == 1755)
        return("1755, the year the Great Lisbon earthquake, destroyed 85% of the bulidings in the city")
    else if (year == 1518)
        return("1518, the year of the Dancing plague, when up to 400 people died because they could'nt " +
                "stop dancing")
    else if (year == 1325 )
        return("1325 , the year the War of the Bucket between the city-states of Bologna and Modena,")
    else
        return("$year")
}