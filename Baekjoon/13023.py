N,M = map(int,input().split())

dic = dict()

for i in range(M):
    a,b = map(int,input().split())
    if a in dic:
        dic[a].append(b)
    else:
        dic[a] = [b]
    
    if b in dic:
        dic[b].append(a)
    else:
        dic[b] = [a]
temp = []

# print(dic)

def find(me):
    # print(temp)
    if len(temp) == 5:
        return True

    if me not in dic:
        return False
    
    for i in (dic[me]):
        if i not in temp:
            temp.append(i)
            check = find(i)
            if check:
                return True
            temp.pop()

flag = False
for i in range(N):
    # print("------",i,'--------')
    temp.append(i)
    check = find(i)
    if check:
        print(1)
        flag = True
        break
    temp.pop()

if flag == False:
    print(0)
