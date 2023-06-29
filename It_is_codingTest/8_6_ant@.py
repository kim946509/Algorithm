n = int(input())
arr = list(map(int, input().split()))
d = [0]*101
d[0] = arr[0]
d[1] = max(arr[0], arr[1])

print(arr)

for i in range(2, n):
    if i == 2:
        d[i] = arr[i]+d[i-2]
        continue
    d[i] = arr[i]+max(d[i-2], d[i-3])

print(max(d[n-1], d[n-2]))
