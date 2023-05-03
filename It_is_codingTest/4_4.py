map_size = list(map(int, (input().split())))
chr_status = list(map(int, (input().split())))
map_status = []
for i in range(map_size[0]):
    map_status.append(list(map(int, input().split())))

chr_pos = [chr_status[0], chr_status[1]]
chr_direct = chr_status[2]

nx_pos = chr_pos[:]
map_status[chr_pos[0]][chr_pos[1]] = 2
count = 0  # 도는 횟수
while True:
    chr_direct = chr_direct+1
    count += 1

    if count == 4:
        if chr_direct == 0:
            nx_pos[0] += 1
        elif chr_direct == 1:
            nx_pos[1] += 1
        elif chr_direct == 2:
            nx_pos[0] -= 1
        elif chr_direct == 3:
            nx_pos[1] -= 1
        if map_status[nx_pos[0]][nx_pos[1]] == 1:
            break
        else:
            ch_pos = nx_pos
            count = 0
            continue

    if chr_direct == 4:
        chr_direct = 0

   # 방향에 따른 시행
    if chr_direct == 0:  # 북쪽 방향
        nx_pos[0] -= 1  # 위로 한칸 이동
        if nx_pos[0] < 0 or map_status[nx_pos[0]][nx_pos[1]] == 1 or map_status[nx_pos[0]][nx_pos[1]] == 2:  # 넘어가거나 바다이거나 이미 갔던곳이면
            nx_pos[0] += 1
            continue

    elif chr_direct == 1:  # 서쪽 방향
        nx_pos[1] -= 1
        if nx_pos[1] < 0 or map_status[nx_pos[0]][nx_pos[1]] == 1 or map_status[nx_pos[0]][nx_pos[1]] == 2:
            nx_pos[1] += 1
            continue

    elif chr_direct == 2:  # 남쪽 방향
        nx_pos[0] += 1
        if nx_pos[0] > map_size[0] or map_status[nx_pos[0]][nx_pos[1]] == 1 or map_status[nx_pos[0]][nx_pos[1]] == 2:
            nx_pos[0] -= 1
            continue

    elif chr_direct == 3:  # 동쪽 방향
        nx_pos[1] += 1
        if nx_pos[1] > map_size[1] or map_status[nx_pos[0]][nx_pos[1]] == 1 or map_status[nx_pos[0]][nx_pos[1]] == 2:
            nx_pos[1] -= 1
            continue

    chr_pos = nx_pos
    map_status[nx_pos[0]][nx_pos[1]] = 2
    count = 0

result = 0
for i in range(map_size[0]):
    for j in range(map_size[1]):
        if map_status[i][j] == 2:
            result += 1

print(result)
