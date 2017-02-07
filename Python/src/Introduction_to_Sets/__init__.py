from __future__ import division

def average(array):
    myset = set(array)
    return sum(myset) / len(myset)

if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    result = average(arr)
    print result
