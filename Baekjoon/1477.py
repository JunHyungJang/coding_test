import heapq

N,M,L = map(int,input().split())

lst = list(map(int,input().split()))

lst.sort()

start = 0
h = []

dic = dict()


for i in range(len(lst)):
    interval = lst[i] - start
    # print(interval)
    heapq.heappush(h,[-interval,1])

    start = lst[i]

    if i == len(lst)-1:
        new = L - lst[i]
        # print(new)
        heapq.heappush(h,[-new,1])
    

# print(h)
for i in range(M):
    k = heapq.heappop(h)
    interval = -k[0]
    cnt = k[1]

    origin = interval * cnt
    heapq.heappush(h,[-origin/(cnt+1),cnt+1])
    # print(h)

answer = heapq.heappop(h)

result = -answer[0]
# print(result)

if result == int(result):
    print(int(result))
else:
    print(int(result)+1)