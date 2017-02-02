if __name__ == '__main__':
    s = raw_input()
    l = list(s)
    a,b,c,d,e = False,False,False,False,False
    for cha in l:
        if (not b) and cha.isalpha():
            a = True
            b = True
        elif (not c) and cha.isdigit():
            a = True
            c = True
        if (not d) and cha.islower():
            d = True
        elif (not e) and cha.isupper():
            e = True
        if(a and b and c and d and e): 
            break
    print a
    print b
    print c
    print d
    print e