n = input()
s = set(map(int, raw_input().split())) 
m = input()
for i in range(m):
    arr = raw_input().split()
    if arr[0] == "pop":
        s.pop()
    elif arr[0] == "remove":
       s.remove(int(arr[1]))
    elif arr[0] == "discard":
        s.discard(int(arr[1]))
print(sum(s))   