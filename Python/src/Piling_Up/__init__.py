for i in range(input()):
    input()
    arr = map(int,raw_input().split())
    l = len(arr)
    if l == 1 or l == 2 :
        print("Yes")
    else:
        i = 1
        while i < l and arr[i-1] >= arr[i]:
            i += 1
        while i < l and arr[i-1] <= arr[i]:
            i += 1  
        if i == l :
            print("Yes")
        else:
            print("No")