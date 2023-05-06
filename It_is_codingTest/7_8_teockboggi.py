
# def binary_search(arr,start,end,height):
#     # if start>end:
    
#     middle=(start+end)//2
#     if middle

n,m=map(int,input().split())

arr = list(map(int,input().split()))
arr.sort()
machine_height=(arr[n-1]+arr[0])//2 #기계 길이
biggest_machine_heihgt=0 #최대 기계 길이를 저장할 변수
end=arr[n-1]
start=arr[0]



def find_height(arr,machine_height,start,end): #List Comprehension을 이용한 리스트 필터링
    
    if start==end:
        return biggest_machine_height

    newArr=[x-machine_height for x in iterable if x>machine_height] #기계보다 높은 떡만 남긴 후 자른다(x-machine_height)
    if(sum(newArr)>m):
        biggest_machine_heihgt=machine_height
        start=machine_height

    elif(sum(newArr)<m):
        end=machine_hieght

    machine_height=(start+end)//2

    find_height(arr,machine_height,start,end)

print(find_height(arr,machine_height,start,end))