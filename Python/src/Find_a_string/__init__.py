def count_substring(string, sub_string):
    cnt = 0
    index = -1
    while(True):
        index = string.find(sub_string, index + 1)
        if index < 0: break
        cnt += 1
    return cnt

if __name__ == '__main__':
    string = raw_input().strip()
    sub_string = raw_input().strip()    
    count = count_substring(string, sub_string)
    print count
