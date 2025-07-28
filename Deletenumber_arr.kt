import kotlin.random.Random

fun main() {
    val array = MutableList(50) {
        Random.nextInt(1, 1001)
    }

    println("Original Array:")
    println(array)
    print("\nEnter number of values to delete: ")
    val numberToDelete = readln().toInt()


    for (i in 1..numberToDelete) {
        print("Enter value to delete: ")
        val valueToDelete = readln().toInt()
        array.removeAll { it == valueToDelete }
    }

    println("\nFinal Array after deletion:")
    println(array)
    println("Size: ${array.size}")
}



