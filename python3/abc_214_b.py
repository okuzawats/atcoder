S, T = list(map(int, input().split()))
a = 0
for i in range(101):
    for j in range(101):
        for k in range(101):
            if i+j+k <= S and i*j*k <= T:
                a += 1
print(a)