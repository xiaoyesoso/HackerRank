from itertools import product
n, m = map(int, raw_input().split())
mylist = list()
for i in range(n):
    mylist.append([int(x) ** 2 for x in raw_input().split()][1:])
print(max([sum(ss) % m for ss in product(*mylist)]))
