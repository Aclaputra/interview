package main

import (
  "fmt"
)

func solve(N int, M int) {
  /**
  * 1. put all of the candy bags into an array
  * 2. sum all of it
  * 3.divide total candies to M kids
  */
  //var a [10]int
  var a = make([]int, N)
  for i := 0; i < N; i++ {
    fmt.Scan(&a[i])
  }

  var total int
  for i := 0; i < N; i++ {
    total += a[i];
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
