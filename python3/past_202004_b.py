S = input()
a = S.count("a")
b = S.count("b")
c = S.count("c")
max = max(a, b, c)
if a == max:
    print("a")
elif b == max:
    print("b")
elif c == max:
    print("c")