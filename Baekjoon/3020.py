import sys

input = sys.stdin.readline
N,H = map(int,input().split())


up = dict()
down = dict()
for i in range(N):
    t = int(input())
    # print(t%2)
    if i % 2 == 0:
        if t in up:
            up[t]+=1
        else:
            up[t] = 1
    else:
        if t in down:
            down[t]+=1
        else:
            down[t]=1

cnt = N//2
answer = [0]*H

for i in range(H):
    answer[i] += cnt

    if i in up:
        cnt-=up[i]


# print(answer)

cnt = 0
for i in range(H):
    num = H -i
    answer[i]+=cnt

    if num in down:
        cnt+=down[num]


minA = min(answer)

result = 0
for i in answer:
    if i == minA:
        result+=1

print(minA,result)
    




