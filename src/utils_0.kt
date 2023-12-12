/*Prompts the user for a number, checks if it's not null and is valid*/
fun readValidNumber(prompt : String) : Int {
    while (true) {
        println(prompt)
        val input : String = readln()
        val number = input.toIntOrNull()
        if (number != null)
            return (number)
        else
            println("Not a valid number, please enter a valid number")
    }
}

fun readValidNumberOrEmpty(prompt : String) : String {
    while (true) {
        println(prompt)
        val input : String = readln()
        val number = input.toIntOrNull()
        if (number != null || input.isEmpty())
            return (input)
        else
            println("Not a valid number, please enter a valid number")
    }
}

fun readValidOptionRPS(prompt : String, options: Array<String>) : String {
    var userInput : String
    var isValid : Boolean
    do {
        println(prompt)
        userInput = readln()
        isValid = options.any { it.equals(userInput, ignoreCase = true)}
        if (!isValid)
            println("Invalid choice, please enter one of the valid choices.")
    } while (!isValid)
    return (userInput)
}

fun readValidString(prompt : String) : String {
    while (true) {
        println(prompt)
        val input : String? = readLine()
        if (input != null)
            return (input)
        else
            println("Not a valid string input.")
    }
}

/*Linkedlists practice
class Node(var data : Int, var next: Node? = null)
class LinkedList {
    var head : Node? = null

    fun addElementToTop(value : Int) {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
    }
    fun addElementToBottom(value : Int) {
        val newNode = Node(value)
        var curr : Node?
        if (head == null)
            head = newNode
        else {
            curr = head
            while (curr?.next != null) {
                curr = curr.next
            }
            curr?.next = newNode
            newNode.next = null
        }
    }
    fun printList(head : Node)
    {
        var curr : Node?
        curr = head
        while (curr != null) {
            println("${curr!!.data}")
            curr = curr!!.next
        }
        println()
    }
}*/