A, B, X = list(map(int, input().split()))

ok, ng = 0, 10**9+1

while abs(ok-ng) > 1:
    mid = (ok+ng)//2
    d = len(str(mid))
    price = A*mid+B*d
    if price <= X:
        ok = mid
    else:
        ng = mid

print(ok)