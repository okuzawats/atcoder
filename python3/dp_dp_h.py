H, W = list(map(int, input().split()))

A = [input() for _ in range(H)]
c = [[0]*W for _ in range(H)]

c[0][0] = 1
MOD = 10**9+7

for i in range(H):
    for j in range(W):
        if A[i][j] == '#':
            continue
        if i > 0:
            c[i][j] += c[i-1][j]
        if j > 0:
            c[i][j] += c[i][j-1]
        c[i][j] %= MOD

print(c[H-1][W-1])
