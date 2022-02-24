package core

data class Data(
    val projects: List<Project>,
    val persons: List<Person>,
)

data class Project(
    val name: String,
    val daysToComplete: Int,
    val lastDate: Int,
    val startDate: Int,
    val amountOfRoles: Int,
    val score: Int,
    val persons: List<Person>,
    val skills: List<Skill>
    )

data class Skill(
    val name: String,
    val level: Int,
)

data class Person(
    val name: String,
    val skills: List<Skill>,
)