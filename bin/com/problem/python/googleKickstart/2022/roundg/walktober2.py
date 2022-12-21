T = int(input())

for case in range(1, T+1):
    n, m, p = map(int, input().split())
    scoreBoard = {}
    maxScores = []
    john = []
    ans = 0

    for i in range(n):
        s = list(map(int, input().split(" ")))
        scoreBoard[i] = s

    for k in range(m):
        max = 0
        diff = 0

        for i in scoreBoard:
            if scoreBoard[i][k] > max:
                max = scoreBoard[i][k]
        maxScores.append(max)

        john.append(scoreBoard[p - 1][k])
        if john[k] < maxScores[k]:
            diff = maxScores[k] - john[k]
        if diff > 0:
            ans += diff

    print('Case #{}: {}'.format(case, ans))

    
