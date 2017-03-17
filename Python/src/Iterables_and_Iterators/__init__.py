from itertools import combinations
input()
l = raw_input().split()
cnt1 = 0
cnt2 = 0
for ss in combinations(l, input()):
    if "a" in  ss:
        cnt1 += 1
    cnt2 += 1
print("%.3f" % (float(cnt1)/float(cnt2)) )    
