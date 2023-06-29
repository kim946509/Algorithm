c = [0]*30000
c[0] = -1
x = int(input())

for i in range(1, x+1):
    k = [1000000]*4
    if i % 5 == 0:
        k[0] = c[i//5]+1
    if i % 3 == 0:
        k[1] = c[i//3]+1
    if i % 2 == 0:
        k[2] = c[i//2]+1
    k[3] = c[i-1]+1
    c[i] = min(k)

print(c[x])
