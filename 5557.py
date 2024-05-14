N = int(input())

lst = list(map(int,input().split()))


dp = [[0 for i in range(21)] for i in range(N)]



for i in range(1,N):
    for j in range(21):
        if dp[i-1][j]:

            if 0<= (j+lst[i]) <= 20:
                dp[i][j+lst[i]] += dp[i-1][j]
            if 0<= (j-lst[i]) <= 20:
                dp[i][j-lst[i]] += dp[i-1][j]
print(dp)
print(dp[N-2][lst[-1]])

