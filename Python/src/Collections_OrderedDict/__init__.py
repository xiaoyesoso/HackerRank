from collections import OrderedDict
d = OrderedDict()
for i in range(input()):
    name,space,price = raw_input().rpartition(" ")
    d[name] = d.get(name,0) + int(price)
for name,price in d.items():
    print(name+' '+str(price))