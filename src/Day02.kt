fun main() {
    fun part1(input: List<String>): Int {
        var totalScore = 0
        input.map { it[0] to it[2] }.forEach {
            val (opponent, you) = it
            when (you) {
                'X' -> {
                    totalScore += 1
                    when (opponent) {
                        'A' -> totalScore += 3
                        'B' -> totalScore += 0
                        'C' -> totalScore += 6
                    }
                }

                'Y' -> {
                    totalScore += 2
                    when (opponent) {
                        'A' -> totalScore += 6
                        'B' -> totalScore += 3
                        'C' -> totalScore += 0
                    }
                }

                'Z' -> {
                    totalScore += 3
                    when (opponent) {
                        'A' -> totalScore += 0
                        'B' -> totalScore += 6
                        'C' -> totalScore += 3
                    }
                }
            }
        }
        return totalScore
    }

    fun part2(input: List<String>): Int {
        var totalScore = 0
        input.map { it[0] to it[2] }.forEach {
            val (opponent, you) = it
            when (you) {
                'X' -> {
                    totalScore += 0
                    when (opponent) {
                        'A' -> totalScore += 3
                        'B' -> totalScore += 1
                        'C' -> totalScore += 2
                    }
                }

                'Y' -> {
                    totalScore += 3
                    when (opponent) {
                        'A' -> totalScore += 1
                        'B' -> totalScore += 2
                        'C' -> totalScore += 3
                    }
                }

                'Z' -> {
                    totalScore += 6
                    when (opponent) {
                        'A' -> totalScore += 2
                        'B' -> totalScore += 3
                        'C' -> totalScore += 1
                    }
                }
            }
        }
        return totalScore
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
