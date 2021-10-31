import sys
sys.setrecursionlimit(1000000)

N = int(input())
c = [[] for i in range(N)]
for i in range(1, N):
    c[int(input())-1].append(i)

def dfs(i):
    if len(c[i]) == 0:
        return 1
    else:
        v = [dfs(j) for j in c[i]]
        return max(v)+min(v)+1

print(dfs(0))