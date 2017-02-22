from collections import Counter
input()
cnts = Counter(map(int, raw_input().split()))
n = input()
s = 0
for i in range(n):
    v = map(int, raw_input().split())
    if cnts.has_key(v[0]) and cnts[v[0]] > 0:
        s += v[1]
        cnts[v[0]] = cnts[v[0]] -1
print(s)
