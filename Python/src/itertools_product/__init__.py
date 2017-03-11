from itertools import product
l1 = map(int, raw_input().split())
l2 = map(int, raw_input().split())
for i in product(l1,l2):
    print i,
#print(i for i in product(l1, l2))
