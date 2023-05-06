import sys


def binary_search(arr, start, end, target):
    if start > end:
        return "no"
    middle = (start+end)//2
    if arr[middle] == target:
        return "yes"
    elif arr[middle] > target:
        end = middle-1
        return binary_search(arr, start, end, target)
    else:
        start = middle+1
        return binary_search(arr, start, end, target)


n = int(input())
arr = list(map(int, input().split()))
arr.sort()
m = int(input())
find_m = list(map(int, input().split()))

for i in find_m:
    target = i
    print(binary_search(arr, 0, n-1, target), end=" ")
