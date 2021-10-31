import sys
sys.setrecursionlimit(100000)

N, M = list(map(int, input().split()))

edges = [[] for _ in range(N)]
indeg = [0]*N

for i in range(M):
    x, y = list(map(int, input().split()))
    edges[x-1].append(y-1)
    indeg[y-1] += 1

l = [0]*N
done = [False]*N

def rec(i):
    if done[i]:
        return l[i]
    for j in edges[i]:
        l[i] = max(l[i], rec(j)+1)
    done[i] = True
    return l[i]

for i in range(N):
    if indeg[i] == 0:
        rec(i)

print(max(l))