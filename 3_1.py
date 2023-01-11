
n = int(input('거슬러 주어야 할 돈 : '))
money = n
count = 0

count += money//500
money = money-500*(money//500)

count += money//100
money -= 100*(money//100)

count += money//50
money -= 50*(money//50)

count += money//10
money -= 10*(money//10)

print('count = ', count)
