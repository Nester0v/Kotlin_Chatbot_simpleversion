//...........................
//version 0.0.1
//author: @Nesterov Vladyslav
//...........................

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    println(
        "Hello! Let's get acquainted. My name is KotBot," + "\n" +
                " I am simple version of normal ChatBot. So, what is your name?"
    )
    val name = readLine()

    println("Nice to meet you - " + name)

    println(
        "\n" + "Let me guess your age?" + "\n" +
                "Please divide your age first by 3, by 5, then by 7, " + "\n" +
                "and write write the remainder of the division"
    )

    val input = Scanner(System.`in`)
    val remainder3 = input.nextInt()
    val remainder5 = input.nextInt()
    val remainder7 = input.nextInt()

    val age: Int = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105)

    println(
        "\n" + "Wait a minute" + "\n"
                + "I'll use a secret formula :)"
    )

    println("\n" + "Your age is: " + age)
    println("\n" + "I am right?)")

    val answer = readln()
    if (answer == "Yes")
        println("Cool!")
    if (answer == "yes")
        println("Cool!")
    if (answer == "No")
        println("Let's try again!")
    if (answer == "no")
        println("Let's try again!")
    else
        println("Ooops, something has gone wrong")


    println("\n" + "I can count. Let me show :D")
    println("\n" + "Write your number below")

    val num = input.nextInt()
    for (i in 0..num) {
        print("$i\t\n")
    }

    println("\n" + "I hope you liked it)")

    println("\n" + "Let's play ? I have a few games. But now only quizzes available")


    val gameAnswer = readln()
    if (gameAnswer == "Yes")
        println("\n" + "What means Class in programming ?")
    if (gameAnswer == "No")
        exitProcess(-1)

    val trueAnswerFirst = true
    val falseAnswerFirst = false

    println( "\n" + "a. Template definition of the methods " +
            "and variable s in a particular kind of object")
    println("\n" + "b. It's school programming class!")
    println( "\n" + "c. Pass question")

    val firstAnswer = readLine()

    if (firstAnswer == "a")

        println("\n" + trueAnswerFirst)

    else
        println("\n" + falseAnswerFirst)

    println("\n" + "Capital of Turkey?")

    println( "\n" + "a. Antalya " +
            "and variable s in a particular kind of object")
    println("\n" + "b. Ankara")
    println( "\n" + "c. Istanbul")

    val secondAnswer = readLine()

    if (secondAnswer == "b")
        println("\n" + trueAnswerFirst)
    if (secondAnswer == "Ankara")
        println("\n" + trueAnswerFirst)

    else
        println("\n" + falseAnswerFirst)

    println("\n" + "I had a good time, it's time to say goodbye")

}





