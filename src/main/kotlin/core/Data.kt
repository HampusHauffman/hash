package core

data class Data(
    val yes: String,
    val colors: List<String>,
    val projects: List<Project>
)

data class Project(
    val days: Int,
    val lastDate: Int,
    val amountOfRoles: Int,
    val score: Int,

)