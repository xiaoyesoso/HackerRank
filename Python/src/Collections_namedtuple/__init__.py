from collections import namedtuple
n, Grade = input(), namedtuple('Grade', raw_input())
print "%.2f" % (sum(float(Grade(*raw_input().split()).MARKS) for i in range(n))/n)
