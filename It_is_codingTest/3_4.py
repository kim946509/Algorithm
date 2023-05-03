n, k = map(int, input().split())


def case_1(n):
    n = n-1
    return n


def case_2(n):
    n = n/k
    return n


count = 0
while(n != 1):
    count = count+1
    if n % k == 0:
        n = case_2(n)
    else:
        n = case_1(n)

print(count)
