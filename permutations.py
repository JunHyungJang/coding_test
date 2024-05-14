a = [10,9,8,7,6,5,4,3,2,1]


def merge_sort(arr):
    if len(arr)<=1:
        return arr


    mid = len(arr)//2

    left = arr[:mid]
    right = arr[mid:]

    left_merge = merge_sort(left)
    right_merge = merge_sort(right)

    return merge(left_merge,right_merge)


def merge(left,right):
    i = 0
    j = 0
    sorted_list = []

    while i <len(left) and j <len(right):
        if left[i] < right[j]:
            sorted_list.append(left[i])
            i+=1

        else:
            sorted_list.append(right[j])
            j+=1
    
    while i < len(left):
        sorted_list.append(left[i])
        i+=1
    
    while j < len(right):
        sorted_list.append(right[j])
        j+=1
    
    return sorted_list


lst = merge_sort(a)
print(lst)