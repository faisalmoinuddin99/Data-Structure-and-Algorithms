import math


def number_of_steps(num: int) -> int:
    # 1. check num is even or odd
    steps = 0
    while num != 0:
        if num % 2 == 0:
            num /= 2
            steps += 1
        else:
            num -= 1
            steps += 1

    return steps


if __name__ == "__main__":
    result = number_of_steps(123)
    print(result)
    a = [1, 2, 3, 4, 5, 6]
    print(a[math.floor(len(a) / 2)])
