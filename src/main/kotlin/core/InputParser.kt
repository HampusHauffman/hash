package core

import java.io.BufferedReader
import java.io.FileReader

fun inputA() = readInput("a.txt", "a")
fun inputB() = readInput("b.txt", "b")
fun inputC() = readInput("c.txt", "c")
fun inputD() = readInput("d.txt", "d")
fun inputE() = readInput("e.txt", "e")
fun inputF() = readInput("f.txt", "f")

/*
PARSE THE FILES
 */
private fun readInput(fileName: String, problemName: String): ProblemInput {
    val reader = BufferedReader(FileReader("src/main/resources/$fileName"))

    val firstLine = reader.readInts();
    val contributors = firstLine[0]
    val projects = firstLine[1]


    return ProblemInput(
        problemName, data = Data(
            listOf(
                Project(
                    daysToComplete = 1, lastDate = 1, startDate = 1, amountOfRoles = 1, score = 1,
                    persons = listOf(
                        Person("hampus", listOf(Skill("kotlin", 1)))
                    ),
                    skills = listOf(Skill("kotlin", 1))
                )
            ),
            persons = listOf(Person("Hampus", listOf(Skill("kotlin", 1))))
        )
    )
}

data class ProblemInput(
    val problemName: String, val data: Data
) {

}

private fun BufferedReader.readLn() = readLine()!! // string line
private fun BufferedReader.readInt() = readLn().toInt() // single int
private fun BufferedReader.readLong() = readLn().toLong() // single long
private fun BufferedReader.readFloat() = readLn().toFloat() // single float

// Read line split by space
private fun BufferedReader.readStrings() = readLn().split(" ") // list of strings

private fun BufferedReader.readInts() = readStrings().map { it.toInt() } // list of ints
private fun BufferedReader.readLongs() = readStrings().map { it.toLong() } // list of longs
private fun BufferedReader.readFloats() = readStrings().map { it.toFloat() } // list of floats
