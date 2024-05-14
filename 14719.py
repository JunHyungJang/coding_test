H,W = map(int,input().split())


mapp = [[0]* W for i in range(H)]
# print(mapp)
# for i in range(W):

lst = list(map(int,input().split()))
# print(lst)
# 
for i in range(len(lst)):
    num = lst[i]
    for j in range(num):
        mapp[H-j-1][i] = 1
    

for i in range(H):
    for j in range(W):
        if mapp[i][j] == 0:
            mapp[i][j] = 2
        else:
            break
    for j in range(W-1,-1,-1):
        if mapp[i][j] == 0:
            mapp[i][j] =2
        else:
            break

# for i in mapp:
#     print(i)

cnt = 0

for i in range(H):
    for j in range(W):
        if mapp[i][j] == 0:
            cnt +=1
print(cnt)