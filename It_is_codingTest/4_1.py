n = int(input())
move = input().split()
pos = [1, 1]
L = (0, -1)
R = (1, 0)
U = (0, 1)
D = (0, -1)

for i in range(len(move)):
    if move[i] == 'L' and pos[0] != 1:
        pos[1] -= 1
    if move[i] == 'R' and pos[0] != n:
        pos[1] += 1
    if move[i] == 'U' and pos[0] != 1:
        pos[0] -= 1
    if move[i] == 'D' and pos[0] != n:
        pos[0] += 1

print(pos[0], pos[1])
