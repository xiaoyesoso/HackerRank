from itertools import permutations
s1, s2 = raw_input().split()
for words in sorted(permutations(list(s1), int(s2))):
    print("".join(words))