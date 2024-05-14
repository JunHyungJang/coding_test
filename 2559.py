

N,K = map(int,input().split())

lst = list(map(int,input().split()))


result = sum(lst[:K])
answer= result
start = K
# print(result)
for i in range(N-K):
    # print("start",start,start-K)
    result += lst[start + i]
    result -= lst[start-K + i]
    # print(result)
    answer= max(answer,result)

print(answer)