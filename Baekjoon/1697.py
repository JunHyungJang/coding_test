from collections import deque

N,K = map(int,input().split())

dp = [0] * (100001)

cnt = 1
for i in range(N+1,100001):
    dp[i] = cnt
    cnt+=1
cnt = 1
for i in range(N-1,-1,-1):
    dp[i] = cnt
    cnt+=1

# print(dp[:20])

def is_bound(x):
    return 0<=x<=100000

q = deque()
q.append([N,1])
while q:
    # print(q)
    now, count = q.popleft()
    # if count > 10:
    #     break

    f = now+1
    b = now-1
    t = 2*now
    # print(q)
    if is_bound(f):
        if dp[f] >=count:
            dp[f] = count
            # print("f in")
            q.append([f,count+1])
    
    if is_bound(b):
        if dp[b] >= count:
            dp[b] = count
            # print("b in")
            q.append([b,count+1])
    
    if is_bound(t):
        if dp[t] >= count:
            dp[t] = count
            # print("t in")
            q.append([t,count+1])

# print(dp[:20])
print(dp[K])
# while q:
