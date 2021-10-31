import bisect

N, K = list(map(int, input().split()))
A = list(map(int, input().split()))

ok = bisect.bisect_left(A, K)
print([ok, -1][ok == N])