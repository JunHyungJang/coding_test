N = int(input())


lst = []
for i in range(N):
    a,b = map(int,input().split())
    lst.append([a,b])


def multiply(arr1,arr2):
    return arr1[0] * arr1[1] * arr2[1]

dp = [0]* (N+1)

dp[1] = 1
dp[2] = multiply(lst[0],lst[1]) 

for i in range(3,N+1):
    # print(dp[i-1], lst[0][0] * lst[i-1][0] * lst[i-1][1])
    # print(multiply(lst[i-2],lst[i-1]) + dp[i-2] * lst[0][0] * lst[i-2][0]*lst[i-1][1])
    dp[i] = min(dp[i-1] + lst[0][0] * lst[i-1][0] * lst[i-1][1], multiply(lst[i-2],lst[i-1]) + dp[i-2] * lst[0][0] * lst[i-2][0]*lst[i-1][1])

print((dp[N]))
