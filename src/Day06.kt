fun main() {
    fun part1(input: List<String>): Int {
        val dataStream = input.first()
        for (i in 0..dataStream.length - 4) {
            val marker: MutableSet<Char> = mutableSetOf()
            (0..3).forEach { marker.add(dataStream[i + it]) }
            if (marker.size == 4) {
                return i + 4
            }
        }
        return 0
    }

    fun part2(input: List<String>): Int {
        val dataStream = input.first()
        for (i in 0..dataStream.length - 14) {
            val marker: MutableSet<Char> = mutableSetOf()
            (0..13).forEach { marker.add(dataStream[i + it]) }
            if (marker.size == 14) {
                return i + 14
            }
        }
        return 0
    }

    val input = readInput("Day06")
    println(part1(input))
    println(part2(input))
}
