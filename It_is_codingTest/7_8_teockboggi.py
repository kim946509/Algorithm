
n,m=map(int,input().split())

arr = list(map(int,input().split()))
arr.sort()

biggest_machine_heihgt=0 #최대 기계 길이를 저장할 변수
end=arr[n-1]  #배열의 가장 큰 수
start=0  #배열의 가장 작은수
machine_height=(arr[n-1]+arr[0])//2 #기계 길이


def find_height(arr,machine_height,start,end): 
    
    while True:

        #List Comprehension을 이용한 리스트 필터링
        newArr=[x-machine_height for x in arr if x>machine_height] #기계보다 높은 떡만 남긴 후(if) 자른다(x-machine_height)
        if(sum(newArr)>=m): #m보다 클 경우
            biggest_machine_heihgt=machine_height  #만족하는 최대 기계 길이 저장
            start=machine_height+1   #start를 machine_height로 값 변경

        elif(sum(newArr)<m):
            end=machine_height-1  #end를 machine_height로 값 변경

        if start>end: #start와 end가 같은 경우까지 위에서 비교했으므로 더이상 비교 X
            return biggest_machine_heihgt       #최대 기계 길이 return
        
        machine_height=(start+end)//2  #start와 end의 중간 값으로 machine_height 설정
        
        

print(find_height(arr,machine_height,start,end))