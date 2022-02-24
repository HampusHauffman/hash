package core

data class Data(
    val yes: String,
    val colors: List<String>,
    val projects: List<Project>
)

data class Project(
    val name: String,
    val daysToComplete: Int,
    val lastDate: Int,
    val startDate: Int,
    val amountOfRoles: Int,
    val score: Int,
    val persons: List<Person>,
    )

data class Skill(
    val name: String,
    val level: Int,
)

data class Person(
    val name: String,
    val skills: List<Skill>,
)
