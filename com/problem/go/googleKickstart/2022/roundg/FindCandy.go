package main

import (
  "fmt"
)

func solve(N int,M int) {
  /**
  * 1. sum all of the candies
  * 2. divide total candies to M kids
  */
  var total int
  for i := 0; i < N; i++ {
    var S int
    fmt.Scanf("%d", &S)
    total += S;
  }
  
  fmt.Println(total % M)
}

func main() {
  var T int
  fmt.Scanf("%d", &T)
  for t := 1; t <= T; t++ {
    var N int
    var M int
    fmt.Scanf("%d %d", &N, &M)
    fmt.Printf("Case #%d: ", t)
    solve(N, M)
  }
}
