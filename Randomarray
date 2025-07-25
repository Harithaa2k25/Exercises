import kotlin.random.Random

fun main() {
    val array = IntArray(50)
    for (i in 0 until 50) {
        array[i] = Random.nextInt(1, 1001)
    }
    println("Original Array:")
    for (value in array) {
        print("$value ")
    }
    val deleteIndices = mutableSetOf<Int>()
    while (deleteIndices.size < 25) {
        deleteIndices.add(Random.nextInt(0, 50))
    }
    val result = mutableListOf<Int>()
    var index = 0
    for (value in array) {
        if (index !in deleteIndices) {
            result.add(value)
        }
        index++
    }
    println("\nFinal Array:")
    for (value in result) {
        print("$value ")
    }
    println("\nSize: ${result.size}")
}
