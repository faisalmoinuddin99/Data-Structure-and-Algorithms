from typing import List


def findMaxConsecutiveOnes(nums: List[int]) -> int:
    final_count = 0
    temp = 0
    for i in range(len(nums)):
        if nums[i] == 1:
            temp += 1
            final_count = max(final_count, temp)
        else:
            temp = 0

    return final_count


if __name__ == "__main__":
    # myArr = [0, 0, 0, 0, 0, 0]
    myArr = [1, 0, 1, 1, 0, 1]
    # myArr = [1, 1, 0, 1, 1, 1]
    result = findMaxConsecutiveOnes(nums=myArr)
    print(result)
