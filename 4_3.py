pos = input()
row = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
line = ['1', '2', '3', '4', '5', '6', '7', '8']

x = row.index(pos[0])
y = line.index(pos[1])

count = 0
if y-2 >= 0:
    if x+1 <= 7:
        count += 1
    if x-1 >= 0:
        count += 1
if y+2 <= 7:
    if x+1 <= 7:
        count += 1
    if x-1 >= 0:
        count += 1
if x-2 >= 0:
    if y+1 <= 7:
        count += 1
    if y-1 >= 0:
        count += 1
if x+2 <= 7:
    if y+1 <= 7:
        count += 1
    if y-1 >= 0:
        count += 1

print(count)
