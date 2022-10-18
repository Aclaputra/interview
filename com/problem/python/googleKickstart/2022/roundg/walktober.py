T = int(input())

for case in range(1, T+1):
    n, m, p = map(int, input().split());
    scoreBoard = {}
    maxScores = []
    john = []
    ans = 0

    for i in range(n):
        s = input().split()
        scoreBoard[i] = s

    for k in range(m):
        max = 0
        diff = 0
        #print("john : " + scoreBoard[p -1][k])
        for i in scoreBoard:
            #print(scoreBoard[i][k])
            if int(scoreBoard[i][k]) > int(max):
                max = scoreBoard[i][k]
        maxScores.append(max)

        john.append(scoreBoard[p - 1][k])
        #print("max score : " + maxScores[k])
        #print("john score : " + john[k])

        if int(maxScores[k]) > int(john[k]):
            diff = int(maxScores[k]) - int(john[k])

        #print("diff : " + str(diff))
        if diff > 0: 
            ans += diff

    #print(ans)
    print('Case #{}: {}'.format(case, ans))



    #for i in maxScores:
    #  print("max scores : " + i)


    #for i in john:
    #    print("john : " + i)
        
