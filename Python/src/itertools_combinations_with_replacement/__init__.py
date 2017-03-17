from itertools import combinations_with_replacement
s,n = raw_input().split()
sorteds = sorted(s)
#for i in range(int(n)):
for ss in  combinations_with_replacement(sorteds,int(n)):
    print ''.join(ss)