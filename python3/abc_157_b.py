A = [
    list(map(int, input().split())),
    list(map(int, input().split())),
    list(map(int, input().split())),
]

M = [[False, False, False], [False, False, False], [False, False, False]]

N = int(input())
for _ in range(0, N):
    b = int(input())
    for i in range(0, 3):
        for j in range(0, 3):
            if A[i][j] == b:
                M[i][j] = True

for i in range(0, 3):
    if M[i][0] and M[i][1] and M[i][2]:
        print("Yes")
        exit()
for i in range(0, 3):
    if M[0][i] and M[1][i] and M[2][i]:
        print("Yes")
        exit()
if M[0][0] and M[1][1] and M[2][2]:
    print("Yes")
    exit()
if M[0][2] and M[1][1] and M[2][0]:
    print("Yes")
    exit()
print("No")