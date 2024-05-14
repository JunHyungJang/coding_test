import heapq

Q = int(input())

lst = list(map(int,input().split()))

N,M,P = 0,0,0

dist = []
pids = []
points = []
    

for i in range(Q):
    lst = list(map(int,input().split()))

    if lst[0] == 100:
        N,M,P = lst[1],lst[2],lst[3]
        points = [0]* P
        for i in range(4,len(lst)-1,-2):
            pid,d = lst[i],lst[i+1]
            pids.append(pid)
            dist.append(d)
        
    elif lst[0] == 200:
        # print(200)
        K,S = lst[1],lst[2]
        for i in range(K):
            print(i)
    elif lst[0] == 300:
        pid,L = lst[1],lst[2]
        for i in range(pids):
            if pids[i] == pid:
                dist[i] = dist[i] * L
        # print(300)
    elif lst[0] == 400:
        print(max(points))
        # print(400) 
        break
    