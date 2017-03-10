from collections import OrderedDict
d = OrderedDict()
for i in range(input()):
    v = raw_input()
    d[v] = d.get(v, 0) + 1
print(len(d))
print(' '.join(str(s) for s in d.values())) 