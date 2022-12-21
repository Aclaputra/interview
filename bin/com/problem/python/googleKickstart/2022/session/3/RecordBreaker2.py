t = int(input().strip())
for i in range(1, t+1):
    n = int(input().strip())
    arr = list(map(int, input().split(" ")))
    n = len(arr)
    ans = 0
    p = 0

    for j in range(n):
        gpd = j == 0 or arr[j] > p
        gnd = j == n - 1 or arr[j] > arr[j + 1]
        if (gpd and gnd): ans += 1
        p = max(p, arr[j])

    print("Case #{}: {}".format(i, ans))
