from collections import defaultdict
n,m = map(int,raw_input().split())
d = defaultdict(list)
for i in range(n):
    d[raw_input()].append(i+1)
for i in range(m):
    print(' '.join(map(str,d[raw_input()])) or -1)
    
                     
    