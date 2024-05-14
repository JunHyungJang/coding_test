N = int(input())

lst = list(map(int,input().split()))

left = 0
right = 0
answer = 0
flag = True
counter = [0] * (max(lst) + 1)
while N>right and N>left:
    if counter[lst[right]] ==0:
        counter[lst[right]]+=1
        right+=1
        answer+=right-left
    else:
        counter[lst[left]]-=1
        left+=1

print(answer)
        

    # while N>right and N>left:
    #     # print(left,right)
    #     if counter[lst[right]] == 0:
    #         counter[lst[right]]+=1
    #         right+=1
    #         flag = True
    #     else:
    #         if flag == True:
    #             # print("plus",right,left,right-left)
    #             answer+=(right-left)
    #             counter[lst[left]]-=1
    #             left+=1
    #             flag = False
    #         else:
    #             left+=1
    #             counter[lst[left]]-=1
    #             flag = False

    # plus = 0
    # for i in range(1,right-left+1):
    #     plus+=i

    # answer += (plus)
    # print(answer)

