fun selectionSort(A: Array<Int>): Array<Int> {
    val n = A.size
    for (i in 0 until n - 1) {
        var min = i
        for (j in i+1 until n) {
            if (A[j] < A[min]) {
                min = j
            }
        }
        if (min != i) {
            val (a,b) = swappingWithoutTemp(A[min], A[i])
            A[min] = a
            A[i] = b
        }
    }
    return A
}

fun swappingWithoutTemp(a: Int, b: Int): Pair<Int, Int> {

    var x = a
    var y = b

    x += y
    y = x - y
    x -= y

    return Pair(x, y)
}


fun main() {
    val array = arrayOf(5,2,3,1)
    println("Original array ${array.joinToString()}")
    selectionSort(array)
    println("Sorted array ${array.joinToString()}")
}
/*
Original array 5, 2, 3, 1
Sorted array 1, 2, 3, 5

 */