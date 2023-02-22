//...........................
//version 0.0.1
//author: @Nesterov Vladyslav
//...........................

import java.util.Scanner


fun main(){
    println("Hello! Let's get acquainted. My name is KotBot," + "\n" +
            " I am simple version of normal ChatBot. So, what is your name?")
    val name = readLine()

    println("Nice to meet you - " + name)

    println("\n" + "Let me guess your age?" + "\n" +
            "Please divide your age first by 3, by 5, then by 7, " + "\n" +
            "and write write the remainder of the division")

    val input = Scanner(System.`in`)
    val remainder3 = input.nextInt()
    val remainder5 = input.nextInt()
    val remainder7 = input.nextInt()

    val age: Int = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15)%105)

    println("\n" + "Wait a minute" + "\n"
            + "I'll use a secret formula :)")

    println("\n" +"Your age is: " + age)
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
    for(i in 0..num){
            print("$i\t\n")
        }

    println()









}

