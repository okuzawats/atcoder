N =int(input())
S = []
for _ in range(0, N):
    S.append(list(input()))

for i in range(N-2, -1, -1):
    for j in range(1, 2*N-1):
        if S[i][j] == '#' and (S[i+1][j-1] == 'X' or S[i+1][j] == 'X' or S[i+1][j+1] == 'X'):
            S[i][j] = 'X'

for i in range(0, N):
    print(''.join(S[i]))