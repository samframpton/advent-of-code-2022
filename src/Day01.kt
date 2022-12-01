fun main() {
    fun part1(input: List<String>): Int {
        return getElves(input).maxOf { it }
    }

    fun part2(input: List<String>): Int {
        return getElves(input).sortedDescending().subList(0, 3).sum()
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

private fun getElves(input: List<String>): List<Int> {
    val elves: MutableList<Int> = mutableListOf()
    var current = 0
    for (calories in input) {
        if (calories.isEmpty()) {
            elves.add(current)
            current = 0
        } else {
            current += calories.toInt()
        }
    }
    elves.add(current)
    return elves
}
