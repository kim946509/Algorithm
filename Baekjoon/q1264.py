while True:
    c = 0
    s = input()
    if s == "#":
        break
    for i in s:
        if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
            c += 1
