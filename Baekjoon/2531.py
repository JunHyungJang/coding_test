import sys

input = sys.stdin.readline

N,d,k,c = map(int,input().split())

lst = []

for i in range(N):
    n = int(input())
    lst.append(n)

result = []
answer = 0

if k >= N:
    answer = len(set(lst))
    if c not in lst:
        answer+=1
        print(answer)

else:
    temp = lst[:k]
    for i in range(N):
        head = i + k
        temp.pop(0)
        temp.append(lst[head%N])
        # print(temp)

        temp2 = []
        for j in temp:
            temp2.append(j)
        # result.append(temp2)
        result.append(list(set(temp2)))

    # print(result)

    for i in result:
        value = len(i)

        if c not in i:
            value+=1
        answer = max(value,answer)
    
    print(answer)


        
    




