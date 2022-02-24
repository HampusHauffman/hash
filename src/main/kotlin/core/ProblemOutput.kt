package core

data class ProblemOutput(val data: Data) {
    override fun toString(): String {
        return data.toString()
    }
}
