from itertools import groupby
for key, items in groupby(raw_input()):
    print((len(list(items)),int(key))),
