def swap_case(s):     
    return "".join(map(lambda ch:ch.lower() if ch.isupper() else ch.upper(),s))

if __name__ == '__main__':
    s = raw_input()
    result = swap_case(s)
    print result