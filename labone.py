def merge_sort(s,  sort_order="asc"):
    if len(s) == 1 :
        return s
    middle = len(s)//2
    left = merge_sort(s[:middle], sort_order)
    right = merge_sort(s[middle:], sort_order)
    print(swap_count, comparison_count)
    return merge_two_list(left, right, sort_order)
    


swap_count = 0 
comparison_count = 0

def merge_two_list(a, b, sort_order ):
    c = []
    i = j = 0
    while i < len(a) and j <len(b):
        if sort_order == 'asc':
            global swap_count
            swap_count += 1
            if a[i]<b[j]:
                c.append(a[i])
                i += 1
            else:
                c.append(b[j])
                j += 1
            
        elif sort_order == 'desc':
            swap_count += 1
            if a[i]>b[j]:
                c.append(a[i])
                i += 1
            else:
                c.append(b[j])
                j += 1
    global comparison_count
    comparison_count += 1
    if i < len(a):
        c += a[i:]
    if j < len(b):
        c += b[j:]
    
    return c
    

