N, M = list(map(int, input().split()))

ok = [True]*(N+1)
for i in range(M):
    a = int(input())
    ok[a] = False

MOD = 10**9+7

c = [0]*(N+1)
c[0] = 1

for i in range(1, N+1):
    if ok[i]:
        if i == 1:
            c[i] = c[i-1]
        else:
            c[i] = (c[i-1]+c[i-2])%MOD

print(c[N])