package main

import "fmt"

func main() {
  var testCase int
  fmt.Scan(&testCase)

  for t := 0; t < testCase; t++ {
    var n int
    var m int
    var totalCandies int

    fmt.Scan(&n)
    fmt.Scan(&m)

    for i := 0; i < n; i++ {
      var candie int
      fmt.Scan(&candie)
      totalCandies += candie
    }

    res := fmt.Sprintf("Case #%d: %d", t+1, totalCandies%m)
    fmt.Println(res)
  }
}

