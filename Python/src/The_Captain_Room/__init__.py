k = input()
mydic = {}
list = raw_input().split()
for x in list:
    if mydic.has_key(x):
        mydic[x] = mydic[x] + 1
    else :
        mydic[x] = 1
for x in mydic.iterkeys():
    if mydic[x] < k:
        print(x) 