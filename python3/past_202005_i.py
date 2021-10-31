N = int(input())
Q = int(input())

row = list(range(0, N))
col = list(range(0, N))

trans = False

for q in range(Q):
    query = list(map(int, input().split()))
    t = query[0]
    if t != 3:
        A, B = query[1:3]
        A -= 1
        B -= 1
    if t == 1:
        row[A], row[B] = row[B], row[A]
    elif t == 2:
        col[A], col[B] = col[B], col[A]
    elif t == 3:
        row, col = col, row
        trans = not trans
    else:
        if trans:
            print(col[B]*N+row[A])
        else:
            print(row[A]*N+col[B])