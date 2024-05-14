import heapq

N,M = map(int,input().split())


heap = []
answer = 0
for i in range(N):
    lst = list(map(int,input()))
    cnt = 0
    for j in lst:
        if j == 0:
            cnt+=1
    if cnt >0:
        heapq.heappush(heap,-cnt)
    else:
        answer+=1

K = int(input())


for i in range(K):
    print(heap)
    if len(heap) !=0:
        k = heapq.heappop(heap)
        k+=1
        if k == 0:
            answer+=1
        else:
            heapq.heappush(heap,k)
    
    else:
        if (K-i) % 2 ==0:
            print(answer)
        else:
            print(answer-1)
