hour = 0
minute = 0
second = 0

n = int(input())

count = 0
while hour <= n:
    second += 1
    if second == 60:
        second = 0
        minute += 1
    if minute == 60:
        minute = 0
        hour += 1
    if '3' in str(second) or '3' in str(minute) or '3' in str(hour):
        count += 1

print(count)
