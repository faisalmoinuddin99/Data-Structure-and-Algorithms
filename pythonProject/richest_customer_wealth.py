if __name__ == '__main__':
    # My Approach
    accounts = [[7, 1, 3], [2, 8, 7], [1, 9, 5]]
    max_balance = 0
    for i in accounts:
        t_sum = 0
        for j in i:
            t_sum += j
        if max_balance < t_sum:
            max_balance = t_sum

    print(max_balance)

    # Leet code comment section approach
    sums = []
    for i in accounts:
        sums.append(sum(i))
    print(max(sums))
