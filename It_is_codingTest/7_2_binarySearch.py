def binary_search(array,start,end,target):
    if start>end:
        return None
    
    middle = (start+end)//2 #소수점 나올경우 소수점이하 버림
    
    if array[middle] ==target:
        return middle
    elif array[middle]>target:
        end=middle-1
        return binary_search(array,start,end,target) 
    else:  # array[middle]<target일 경우
        start=middle+1
        return binary_search(array,start,end,target)

target=7
arr=[1,3,5,7,9,11,13,15,17,19]
print(binary_search(arr,0,9,target))