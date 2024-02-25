/*
Here is the step-by-step description of the Selection Sort algorithm:

   1. Start with the first element of the array as the initial "sorted" sub-list (even though it contains only one element and is trivially sorted).
   2. Find the smallest (or largest, for descending order) element in the unsorted sub-list (i.e., the part of the array to the right of the sorted sub-list).
   3. Swap this smallest element with the first element of the unsorted sub-list.
   4. Move the boundary of the sorted sub-list one element to the right, effectively growing the sorted sub-list by one and shrinking the unsorted sub-list by one.
   5. Repeat steps 2-4 until the unsorted sub-list becomes empty and the entire list is sorted.

The time complexity of Selection Sort is O(n2)O(n2), where nn is the number of elements in the array.
This is because it uses two nested loops: the outer loop moves the boundary of the sorted and unsorted sub-lists,
and the inner loop finds the minimum (or maximum) element in the unsorted sub-list.
Despite its simplicity, Selection Sort is not efficient on large lists compared to more advanced algorithms
like quicksort, mergesort, or heapsort. However, it has the advantage of being easy to understand and implement,
and it performs well on small lists.
 */

/*
procedure selectionSort(A : array of items)
    n := length(A)
    for i := 0 to n - 1 do
        // Set current element as minimum
        minIndex := i

        // Check the rest of the array to find the smallest element
        for j := i + 1 to n - 1 do
            if A[j] < A[minIndex] then
                minIndex := j
            end if
        end for

        // Swap the found minimum element with the current element
        if minIndex != i then
            swap A[i] and A[minIndex]
        end if
    end for
end procedure

 */
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