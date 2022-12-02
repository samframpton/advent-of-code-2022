fun main() {
    fun part1(input: List<String>) =
        input.map {
            when (it) {
                "A X" -> 4
                "A Y" -> 8
                "A Z" -> 3
                "B X" -> 1
                "B Y" -> 5
                "B Z" -> 9
                "C X" -> 7
                "C Y" -> 2
                "C Z" -> 6
                else -> 0
            }
        }.sum()

    fun part2(input: List<String>) =
        input.map {
            when (it) {
                "A X" -> 3
                "A Y" -> 4
                "A Z" -> 8
                "B X" -> 1
                "B Y" -> 5
                "B Z" -> 9
                "C X" -> 2
                "C Y" -> 6
                "C Z" -> 7
                else -> 0
            }
        }.sum()

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
