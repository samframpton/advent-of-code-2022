fun main() {
    fun part1(input: List<String>) = getSectionAssignments(input).count {
        (it.first.first <= it.second.first && it.first.last >= it.second.last)
                || (it.second.first <= it.first.first && it.second.last >= it.first.last)
    }

    fun part2(input: List<String>) = getSectionAssignments(input).count { it.first.any(it.second::contains) }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}

private fun getSectionAssignments(input: List<String>) =
    input.map {
        val assignments = it.split(",")
        val assignment1 = assignments[0].split("-").map(String::toInt)
        val assignment2 = assignments[1].split("-").map(String::toInt)
        assignment1[0]..assignment1[1] to assignment2[0]..assignment2[1]
    }
