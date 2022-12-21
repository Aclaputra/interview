package main

import (
  "fmt"
)

func solve(N int, M int, id int) {
  /**
  * 1. put all scores in a double array [i][j]
  * 2. get all john scores by john id
  * 3. find max scores each day
  * 4. get the diff number for john to compete
  **/
  var scoreBoard = make([][]int, N)
  var maxScores = make([]int, M)
  var john = make([]int, N)
  var ans int

  for i := 1; i <= N; i++ {
    var score = make([]int, N)
    for j := 1; j <= M; j++ {
      var S int
      fmt.Scan(&S)
      score[j - 1] = S
      scoreBoard[i][j] = score[j]
    }
  }

  for i := 0; i < M; i++ {
    john[i] = scoreBoard[id][i]
  }

  for k := 0; k < M; k++ {
    var max int
    for i := 0; i < len(scoreBoard); i++ {
      if scoreBoard[i][k] > max {
        max = scoreBoard[i][k]
      }
    }
    maxScores[k] = max
  }

  for i := 0; i < M; i++ {
    var diff int
    if john[i] < maxScores[i] {
      diff = maxScores[i] - john[i];
    }
    if diff > 0 {
      ans += diff
    }
    // fmt.Println("diff : "+diff)
  }

  fmt.Println(ans)
}

func main() {
  var T int
  fmt.Scan(&T)
  for t := 1; t <= T; t++ {
    var ( N int; M int; id int )
    fmt.Scanf("%d %d %d", &N, &M, &id)
    fmt.Printf("Case #%d: ", t)
    solve(N, M, id)
  }
}
