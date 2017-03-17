from itertools import combinations
s,n = raw_input().split()
sorteds = sorted(s)
for i in range(int(n)):
    for ss in  combinations(sorteds,i+1):
        print ''.join(ss)