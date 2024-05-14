T = int(input())




def findArray(arr,K):
    dic = dict()

    for i in range(len(arr)):
        if arr[i] not in dic:
            dic[arr[i]] = [i]
        else:
            dic[arr[i]].append(i)
    
    minAnswer = 10001
    maxAnswer = 1
    check = False
    for values in dic.values():
        # print(values)
        if len(values) >= K:
            check = True
            # print(values)
            for i in range(len(values)-K+1):
                # print(values[i], values[i+K-1])
                minAnswer = min(minAnswer,values[i+K-1]-values[i] + 1)
                maxAnswer = max(maxAnswer,values[i+K-1]-values[i] + 1)
    
    
    if check:
        print(minAnswer,maxAnswer)
    else:
        print(-1)


        
        


for i in range(T):
    word = list(input())
    K = int(input())
    # print("hello",word)

    first = findArray(word,K)
    


        
