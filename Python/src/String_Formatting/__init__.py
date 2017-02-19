def transform(number, base):
    result = ""
    while number > 0 :
        num = number % base
        numStr = ""
        if num >= 10:
            numStr = "" + chr(ord('A') + num - 10)
        else :
            numStr = str(num)
        result = numStr + result
        number //= base
    return result

def print_formatted(number):
    lastB = transform(number, 2)
    length = len(lastB)
    for i in range(number):
        d = str(i + 1)
        while len(d) < length:
             d = " " + d
        o = transform(i + 1, 8)
        while len(o) < length:
             o = " " + o
        h = transform(i + 1, 16)
        while len(h) < length:
             h = " " + h
        b = transform(i + 1, 2)
        while len(b) < length:
             b = " " + b
        print(d + ' ' + o + ' ' + h + ' ' + b)
    
if __name__ == '__main__':
    n = int(raw_input())
    print_formatted(n)
