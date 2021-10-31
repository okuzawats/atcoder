N = int(input())
S = input()

min_t = 300000
sum_W = [0]
for i in range(0, N):
    sum_W.append(sum_W[i]+(S[i] == 'W'))

for i in range(0, N):
    w = sum_W[i]
    e = (N-1-i)-(sum_W[N]-sum_W[i+1])
    t = w+e
    min_t = min(t, min_t)

print(min_t)