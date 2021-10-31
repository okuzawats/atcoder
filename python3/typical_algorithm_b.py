BA = []
for i in range(int(input())):
    a, b = list(map(int, input().split()))
    BA.append([b, a])
BA.sort()

ans = 0
last = 0

for b, a in BA:
    if last < a:
        ans += 1
        last = b
print(ans)