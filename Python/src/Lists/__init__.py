if __name__ == '__main__':
    n = input()
    l = []
    for i in range(n):
        s = raw_input().split()
        cmd = s[0]
        args = s[1:]
        if cmd !="print":
            cmd += "("+ ",".join(args) +")"
            eval("l."+cmd)
        else:
            print l