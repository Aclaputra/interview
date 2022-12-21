package main

import "fmt"

func main() {
  var T int
  fmt.Scan(&T)

  for t := 0; t < T; t++ {
    var n, m, p, ans int
    fmt.Scan(&n, &m, &p)

    fmt.Println(n, m, p, ans)

    scoreBoard := make(map[int][]map[int]int)

    for i := 1; i <= n; i++ {
      var score [3]int
      for j := 1; j <= m; j++ {
        var s int
        fmt.Scan(&s)
        fmt.Println(s)
        score[j - 1] = s

      }
      fmt.Println(score)
    }

    fmt.Println(scoreBoard)


  }
}
