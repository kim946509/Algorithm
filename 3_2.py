n, m, k = map(int, input().split())

n_list = []

n_list = list(map(int, input().split()))

n_list.sort(reverse=True)

value = n_list[0]*k*(m//k)
value += n_list[1]*(m % k)

print(value)
