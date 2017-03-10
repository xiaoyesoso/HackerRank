from collections import deque
d =  deque()
for i in range(input()):
    args = raw_input().split()
    getattr(d, args[0])(*args[1:])
print(' '.join(d))