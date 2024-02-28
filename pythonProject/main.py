# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


def swapping_without_emp(a, b):
    x, y = b, a

    return x, y


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    # Running sum of 1D Array
    nums = [3, 1, 2, 10, 1]
    # expected output [3, 4, 6, 16, 17]
    op = []
    for i in range(1, len(nums)):
        nums[i] = nums[i-1] + nums[i]
    print(nums) # [3, 4, 6, 16, 17]


# See PyCharm help at https://www.jetbrains.com/help/pycharm/
