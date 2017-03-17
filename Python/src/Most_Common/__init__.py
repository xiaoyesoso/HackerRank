from collections import Counter
for i in sorted(Counter(raw_input()).most_common(3), key=lambda em:(-em[1], em[0])):
              print(i[0] + ' ' + str(i[1]))