input()
s1 = set(map(int,raw_input().split()))
input()
s2 = set(map(int,raw_input().split()))
s3 = s1.symmetric_difference(s2)
for num in sorted(list(s3)):
    print(num) 
