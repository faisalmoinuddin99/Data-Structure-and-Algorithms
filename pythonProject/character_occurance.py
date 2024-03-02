def can_construct(ransomeNote: str, magazine: str) -> bool:
    magazine_hash_table = {}
    for i in magazine:
        if i in magazine_hash_table:
            magazine_hash_table[i] += 1
        else:
            magazine_hash_table[i] = 1
    # print(magazine_hash_table)
    for i in ransomeNote:
        if i in magazine_hash_table and magazine_hash_table[i] > 0:
            magazine_hash_table[i] -= 1
        else:
            return False
    return True


if __name__ == "__main__":
    r = can_construct("a", "aaaa")
    print(r)

'''
ransomenote = "a"
magazine = "b"

result = False
'''