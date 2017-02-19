set1 = set(map(int, raw_input().split()))
n = input()
b = True
for i in range(n):
    set2 = set(map(int, raw_input().split()))
    if not set2.issubset(set1) or len(set2) >= len(set1):
        b = False
        break
if b :
     print("True") 
else:
     print("False")
