from typing import List


def count_digits(nums: int) -> int:
    count = 0
    while nums > 0:
        count += 1
        nums = nums // 10  # remove the last digit
    return count


def findNumbers(nums: List[int]) -> int:
    even_digit = 0
    for i in nums:
        check_even = count_digits(i)
        if check_even % 2 == 0:
            even_digit += 1

    return even_digit


if __name__ == "__main__":
    print("Find Numbers with Even Number of Digits")

    ans = findNumbers([12,345,2,6,7896])
    print(ans)
