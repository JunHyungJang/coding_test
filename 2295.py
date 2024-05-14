N = int(input())

lst = []

for i in range(N):
    lst.append(int(input()))

lst.sort()
# print(lst)

summ = []
for i in range(N):
    for j in range(N):
        summ.append(lst[i] + lst[j])

# print(summ)
summ.sort()

result = 0
for i in range(N):
    for j in range(i,N):
        num = lst[j] - lst[i]

        left = 0
        right = len(summ)-1

        while left<=right:
            mid = (left+right)//2

            if summ[mid] > num:
                right = mid-1
            elif summ[mid] < num:
                left= mid+1
            else:
                result = max(result,lst[j])
                break

print(result)