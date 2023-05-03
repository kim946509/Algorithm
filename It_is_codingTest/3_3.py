n, m = map(int, input().split())
card_list = []
for i in range(n):
    num = list(map(int, input().split()))
    card_list.append(num)

max_index = 0
for i in range(n):
    if min(card_list[i]) > min(card_list[max_index]):
        max_index = i

print(min(card_list[max_index]))
