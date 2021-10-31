import math
N = int(input())
x = math.ceil(N / 9)
y = N % 9
print(str([y, 9][y == 0]) * x)