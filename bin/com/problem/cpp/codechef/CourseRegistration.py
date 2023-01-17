T = int(input())
def solve(n,m,k):
    courseLeft = m - k
    if n > courseLeft: print("No")
     if n <= courseLeft: print("Yes"); 

for _ in range(T):
    n,m,k = map(int, input().split())
    solve(n,m,k)
    