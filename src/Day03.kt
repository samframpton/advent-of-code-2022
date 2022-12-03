fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        for (contents in input) {
            val first = contents.subSequence(0, contents.length / 2)
            val second = contents.subSequence(contents.length / 2, contents.length)
            for (item in first) {
                if (second.contains(item)) {
                    sum += item.priority
                    break
                }
            }
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        val elfGroups = input.windowed(3, 3)
        for (elfGroup in elfGroups) {
            for (item in elfGroup[0]) {
                if (elfGroup[1].contains(item) && elfGroup[2].contains(item)) {
                    sum += item.priority
                    break
                }
            }
        }
        return sum
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}

private val Char.priority: Int
    get() = when (this) {
        in 'a'..'z' -> this - 'a' + 1
        in 'A'..'Z' -> this - 'A' + 27
        else -> 0
    }
