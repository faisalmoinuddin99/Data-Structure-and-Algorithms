/*
Documentation Pseudo Code:
Bubble sort is a simple sorting algorithm that repeatedly steps through the list,
compares adjacent elements, and swaps them if they are in the wrong order.
The pass through the list is repeated until the list is sorted. Here is a step-by-step algorithm for bubble sort:

    1. Start with the first element in the array.

    2. Compare the current element with the next element in the array.

    3. If the current element is greater than the next element, swap them. If you are sorting in ascending order,
    or do the opposite if sorting in descending order.

    4. Move to the next element and repeat step 2 until you reach the end of the array.
    This completes one full pass through the array, and the largest element will have bubbled up
    to the end of the array.

    5. Repeat the process for each element in the array, decreasing the number of elements to compare by one each time,
     as the end of the array becomes sorted.

    6. Continue looping through the array until no swaps are needed, which means the array is sorted.

    7. Stop when the array is sorted.

Here is a brief pseudocode for the Bubble Sort algorithm for sorting an array in ascending order:

procedure bubbleSort( A : list of sortable items )
    n = length(A)
    repeat
        swapped = false
        for i = 1 to n-1 inclusive do
            if A[i-1] > A[i] then
                swap(A[i-1], A[i])
                swapped = true
            end if
        end for
        n = n - 1
    until not swapped
end procedure

 */

fun bubbleSort(A: Array<Int>):Array<Int> {

    var n = A.size
    do {
        var swapper = false

        for( i in 1 until n) {
            if (A[i-1] > A[i]) {
                var (a,b) = swapWithXOR(A[i-1], A[i])
                A[i-1] = a
                A[i] = b
                swapper = true
            }
        }
        n -= 1
    } while (swapper)

    return A
}

fun swapWithoutTemp(a: Int, b : Int): Pair<Int, Int>{
    var x = a
    var y = b

    x = x + y
    y = x - y
    x = x - y

    return Pair(x,y)
}

fun swapWithXOR(a: Int, b:Int) : Pair<Int, Int>{
    var x = a
    var y = b

    x = x xor y
    y = x xor y
    x = x xor y

    return Pair(x,y)
}

fun sortColors(nums: IntArray): Unit {
    var n = nums.size

    do {
        var swapper = false
        for(i in 1 until n) {
            if (nums[i-1] > nums[i]) {
                var (x,y) = swapWithoutTemp(nums[i-1],nums[i])
                nums[i-1] = x
                nums[i] = y

                swapper = true
            }
        }
        n -= 1
    }while (swapper)
}
fun main(){
    val array = arrayOf(2,0,2,1,1,0 )
    println("Original array: ${array.joinToString()}")
    bubbleSort(array)
    val x = intArrayOf(10,20,43)
    sortColors(x)
    println("Sorted array: ${array.joinToString()}")

}

/*
Original array: 5, 3, 8, 4, 2
Sorted array: 2, 3, 4, 5, 8
 */