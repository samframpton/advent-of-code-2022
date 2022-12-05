import java.io.File

fun main() {
    fun part1(): String {
        val stacks = getStacks()
        val instructions = getInstructions()
        for (instruction in instructions) {
            for (i in 0 until instruction.first) {
                val crate = stacks[instruction.second - 1].removeLast()
                stacks[instruction.third - 1].addLast(crate)
            }
        }
        return String(stacks.map { it.last() }.toCharArray())
    }

    fun part2(): String {
        val stacks = getStacks()
        val instructions = getInstructions()
        for (instruction in instructions) {
            val tempStack: ArrayDeque<Char> = ArrayDeque()
            for (i in 0 until instruction.first) {
                tempStack.addLast(stacks[instruction.second - 1].removeLast())
            }
            for (i in 0 until instruction.first) {
                stacks[instruction.third - 1].addLast(tempStack.removeLast())
            }
        }
        return String(stacks.map { it.last() }.toCharArray())
    }

    println(part1())
    println(part2())
}

private fun getStacks(): List<ArrayDeque<Char>> {
    val input = File("src", "Day05.txt").readText().split("\n\n").first().lines().reversed()
    val stacks: MutableList<ArrayDeque<Char>> = mutableListOf()
    for ((index, character) in input.first().withIndex()) {
        if (character.isDigit()) {
            val stack: ArrayDeque<Char> = ArrayDeque()
            for (i in 1 until input.size) {
                if (input[i][index].isLetter()) {
                    stack.add(input[i][index])
                }
            }
            stacks.add(stack)
        }
    }
    return stacks
}

private fun getInstructions(): List<Triple<Int, Int, Int>> {
    val input = File("src", "Day05.txt").readText().split("\n\n").last().lines()
    return input.map {
        val nums = it.replace("move ", "")
            .replace("from ", "")
            .replace("to ", "")
            .split(" ")
        Triple(nums[0].toInt(), nums[1].toInt(), nums[2].toInt())
    }
}
