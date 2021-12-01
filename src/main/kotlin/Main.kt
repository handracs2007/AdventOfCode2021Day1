import java.io.File

fun solvePart1(depths: List<Int>) {
    var prevDepth = -1
    var incCount = 0

    for (depth in depths) {
        if (prevDepth != -1 && depth > prevDepth)
            incCount++

        prevDepth = depth
    }

    println("PART 1 ANSWER")
    println(incCount)
}

fun solvePart2(depths: List<Int>) {
    val windowedDepths = depths.windowed(size = 3, step = 1, partialWindows = false) { it.sum() }

    var prevDepth = -1
    var incCount = 0

    for (depth in windowedDepths) {
        if (prevDepth != -1 && depth > prevDepth)
            incCount++

        prevDepth = depth
    }

    println("PART 2 ANSWER")
    println(incCount)
}

fun main() {
    val depths = File("input.txt").readLines().map { it.toInt() }

    solvePart1(depths)
    solvePart2(depths)
}