N = int(input())

X = [[] for _ in range(N)]
for i in range(N):
    a, b = list(map(int, input().split()))
    X[a-1].append(b)

c = [0]*101
a = 0

for d in range(N):
    for b in X[d]:
        c[b] += 1
    for b in range(100, 0, -1):
        if c[b] > 0:
            a += b
            c[b] -= 1
            break
    print(a)