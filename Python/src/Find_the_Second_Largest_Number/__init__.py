if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    First = arr[0]
    Second = -999
    for i in range(1, len(arr)):
        v = arr[i]
        if v > First :
            Second = First
            First = v
        elif v > Second and v < First:
            Second = v
    print(Second)   
    
