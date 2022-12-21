t = int(input().strip())
for i in range(1, t + 1):
    n = int(input().strip())
    arr = list(map(int, input().split(" ")))
    n = len(arr)
    local_max = 0
    ans = 0
    for j in range(n):
        if j == 0:
            if arr[1] < arr[0]:
                local_max = arr[0]
                ans += 1
            continue
        if j == n - 1:
            if arr[j] > arr[j - 1] and arr[j] > local_max:
                ans += 1
            break
        if arr[j] > arr[j - 1] and arr[j] > arr[j + 1] and arr[j] > local_max:
            ans += 1
            local_max = arr[j]
            continue
    
    print("Case #{}: {}".format(i, ans))

