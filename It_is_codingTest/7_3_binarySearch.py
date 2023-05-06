def binary_search(array, start, end, target):
    while start <= end:
        middle = (start+end)//2
        if array[middle] == target:
            return middle
        elif array[middle] > target:
            end = middle-1
        else:
            start = middle+1
    return None


target = 7
arr = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
print(binary_search(arr, 0, 9, target))
