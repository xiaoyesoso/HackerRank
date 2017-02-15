input()
set1 = set(map(int, raw_input().split()))
for i in range(input()):
    op = raw_input().split()
    set2 = set(map(int, raw_input().split()))
    if op[0] == "intersection_update":
        set1.intersection_update(set2)
    elif op[0] == "update":
        set1.update(set2)
    elif op[0] == "symmetric_difference_update":
        set1.symmetric_difference_update(set2)
    elif op[0] == "difference_update":
        set1.difference_update(set2)
print(sum(set1))
    
