n, m = raw_input().split()
arr = raw_input().split()
s1 = set(raw_input().split())
s2 = set(raw_input().split())
print(sum([1 if x in s1 else -1 if x in s2 else 0 for x  in arr]))
