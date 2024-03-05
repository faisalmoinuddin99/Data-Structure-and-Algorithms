from typing import List


def square_of_array(nums: List[int]) -> List[int]:
    sorted_array = []
    for i in nums:
        sorted_array.append(i * i)
    sorted_array.sort()
    return sorted_array


if __name__ == "__main__":
    # arr = [-4, -1, 0, 3, 10]
    arr = [-7, -3, 2, 3, 11]
    r = square_of_array(arr)

    print(r) # [4, 9, 9, 49, 121]
