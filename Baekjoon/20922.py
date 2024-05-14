N,K = map(int,input().split())


lst = list(map(int,input().split()))


right = 0
left = 0
answer = 0

counter = [0]*(max(lst)+1)

while N>right:
    if K>counter[lst[right]]:
        counter[lst[right]]+=1
        right+=1
    else:
        counter[lst[left]]-=1
        left+=1
    
    answer= max(answer,right-left)

print(answer)