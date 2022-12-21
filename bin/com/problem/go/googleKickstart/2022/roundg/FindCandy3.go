package main

import (
  "fmt"
)

func solve(N int, M int) {
  /**
  * 1. sum all the shit
  * 2. divide and get the remaining
  */
  var total int
  for i := 0; i < N; i++ {
    var S int
    fmt.Scan(&S)
    total += S
  }

  fmt.Println(total % M)
}

func main() {
  var T int 
  fmt.Scan(&T)
  for t := 1; t <= T; t++ {
    var N int
    var M int
    fmt.Scanf("%d %d", &N, &M)
    fmt.Printf("Case #%d: ", t)
    solve(N, M)
  }
}

