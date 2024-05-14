import math

N,M,P,C,D = map(int,input().split())

rudol = list(map(int,input().split()))
rudol[0]-=1
rudol[1]-=1

santas = [[] for  i in range(P+1)]
out = [False] * (P+1)

stun = [0] * (P+1)
point = [0] * (P+1)
mapp = [[0]*N for i in range(N)]


mapp[rudol[0]][rudol[1]] = -1

for i in range(P):
    # santas.append()
    num,x,y = map(int,input().split())
    santas[num] = [x-1,y-1]
    mapp[x-1][y-1] = num




dx = [-1,-1,0,1,1,1,0,-1]
dy = [0,1,1,1,0,-1,-1,-1]

dxs = [-1,0,1,0]
dys = [0,1,0,-1]


def isFinish():
    for i in range(1,P+1):
        if out[i] == False:
            return False
    return True
def isBound(x,y):
    return 0<=x<N and 0<=y<N

def stunChange():
    for i in range(1,P+1):
        if stun[i] >0 :
            stun[i]-=1  
def pointPlus():
    for i in range(1,P+1):
        if out[i] == False:
            point[i]+=1
def chain(distDir,x,y):

    santaNum = mapp[x][y]

    nextX = x + dx[distDir]
    nextY = y + dy[distDir]

    if not isBound(nextX,nextY):
        out[santaNum] = True
    else:
        if mapp[nextX][nextY] != 0:
            chain(distDir,nextX,nextY)
        mapp[x][y] = 0
        mapp[nextX][nextY] = santaNum
        santas[santaNum] = [nextX,nextY]

def chain2(x,y,dirX,dirY):
    santaNum = mapp[x][y]

    nextX = x + dirX
    nextY = y + dirY
    if not isBound(nextX,nextY):
        out[santaNum] = True
    else:

        if mapp[nextX][nextY] > 0:
            chain2(nextX,nextY,dirX,dirY)
        mapp[nextX][nextY] = santaNum
        santas[santaNum] = [nextX,nextY]
    mapp[x][y] = 0
    

def crash2(santaNum,nowX,noxY,next1X,next1Y,dirX,dirY):

    next2X = next1X + dirX*D
    next2Y = next1Y + dirY*D
    point[santaNum] += D
    
    # print("crash2",nowX,noxY,next1X,next1Y,next2X,next2Y)
    stun[santaNum] = 2
    if not isBound(next2X,next2Y):
        # print("crash2 outttttt")
        out[santaNum] = True
        mapp[nowX][noxY] = 0

        
    else:
        if mapp[next2X][next2Y] != 0 and mapp[next2X][next2Y] != santaNum:
            chain2(next2X,next2Y,dirX,dirY)
        mapp[nowX][noxY] = 0
        mapp[next2X][next2Y] = santaNum
        santas[santaNum] = [next2X,next2Y]
        

        




def crash1(distDir,x,y):
    santaNum = mapp[x][y]

    point[santaNum] += C

    nextX = santas[santaNum][0] + dx[distDir]*C
    nextY = santas[santaNum][1] + dy[distDir]*C

    stun[santaNum] = 2
    if not isBound(nextX,nextY):
        out[santaNum] = True
        mapp[x][y] = 0
        # print("crash1 outttttt")
        
    else:
        if mapp[nextX][nextY] !=0:
            chain(distDir,nextX,nextY)
        mapp[x][y] = 0
        mapp[nextX][nextY] = santaNum
        santas[santaNum] = [nextX,nextY]
   
    


    

def movePosition(x1,y1,x2,y2,num):
    mapp[x1][y1] = 0
    mapp[x2][y2] = num

    if num == -1:
        rudol[0] = x2
        rudol[1] = y2
    else:
        santas[num][0] = x2
        santas[num][1] = y2
def printMap():
    print("---------------")
    for i in range(len(mapp)):
        print(mapp[i])
    print("out",out)
    print("point",point)
    print("stun",stun)
    print("rodol",rudol)
    print("santa",santas)

def calDist(x1,y1,x2,y2):
    return math.sqrt(abs(x1-x2)**2 +abs(y1-y2)**2)

def rulMove():
    global rudol
    possSanta = []

    for i in range(1,P+1):
        if out[i] != True:
            santaX = santas[i][0]
            santaY = santas[i][1]
            dist = calDist(santaX,santaY,rudol[0],rudol[1])
            possSanta.append([dist,santaX,santaY,i])
    
    possSanta.sort(key = lambda x : (x[0],-x[1],-x[2]))

    santaNum = possSanta[0][3]
    minDist = 50*50
    distDir = 0



    for i in range(8):
        nx = rudol[0] + dx[i]
        ny = rudol[1] + dy[i]

        if not isBound(nx,ny):
            continue
        dist = calDist(nx,ny,santas[santaNum][0],santas[santaNum][1])
        # print("test",i,nx,ny,dist)

        if minDist > dist:
            minDist = dist
            distDir = i
    
    # print("chosen",distDir)
    nextX = rudol[0] + dx[distDir]
    nextY = rudol[1] + dy[distDir]
    # santa exits
    if mapp[nextX][nextY] != 0:
        crash1(distDir,nextX,nextY)
    mapp[rudol[0]][rudol[1]] = 0
    mapp[nextX][nextY] = -1
    rudol = [nextX,nextY]

def santaMove():
    global rudol


    for i in range(1,P+1):
        if out[i]:
            continue

        if stun[i] > 0:
            continue
        x = santas[i][0]
        y = santas[i][1]

        temp = []
        dist1 = calDist(x,y,rudol[0],rudol[1])
        for j in range(4):
            nx = x + dxs[j]
            ny = y + dys[j]
        
          
            if not isBound(nx,ny):
                continue

            if mapp[nx][ny] > 0 :
                continue
          
            dist2 = calDist(nx,ny,rudol[0],rudol[1])
            if dist2 >= dist1:
                continue
            
            temp.append([dist2,j])
        if len(temp) == 0:
            continue
        # if i == 1:
        #     print(temp)
        temp.sort(key = lambda x : (x[0],x[1]))

        _ , distDir = temp[0]

        nextX = x + dxs[distDir]
        nextY = y + dys[distDir]
        # print("nextmove",i,x,y,nextX,nextY)
        oppX = -dxs[distDir]
        oppY =-dys[distDir]
        if mapp[nextX][nextY] == -1:
            crash2(i,x,y,nextX,nextY,oppX,oppY)
        else:
            mapp[x][y] = 0
            mapp[nextX][nextY] = i
            santas[i] = [nextX,nextY]






    

# printMap()

for i in range(M):
    # print("========i=============",i)

    if isFinish():
        break
    rulMove()
    # printMap()
    santaMove()
    stunChange()
    pointPlus()
    # printMap()

for i in range(1,P+1):
    print(point[i],end =" ")