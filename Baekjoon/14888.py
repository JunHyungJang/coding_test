N = int(input())

lst = list(map(int,input().split()))

poss = list(map(int,input().split()))

# print(lst,poss)

temp = lst[0]
lst = lst[1:]
# print(lst)
result = []
def find(cnt):
    global temp
    if cnt == N-1:
        result.append(temp)

        return

    for i in range(len(poss)):
        if poss[i]!=0:
            oldTemp = temp
            
            if i == 0:
                temp = temp + lst[cnt]
            elif i == 1:
                temp = temp - lst[cnt]
            elif i == 2:
                temp = temp * lst[cnt]
            elif i == 3:
                if temp <0 :
                    temp = -(-temp // lst[cnt])
                else:
                    temp = temp // lst[cnt]
                
            
            poss[i]-=1
            find(cnt+1)
            poss[i]+=1
            temp = oldTemp


find(0)
result.sort()
print(result[-1])
print(result[0])

# print(3//2)

