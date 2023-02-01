T = int(input())
for case in range(1,T+1):
    ans = 0
    (n,m) = tuple(map(int, input().split()))
    c = list(map(int, input().split()))
    sum = 0
    for ci in c:
        sum += ci
    ans = sum % m
    print("Case #%d: %d" % (case, ans))