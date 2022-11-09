package main

import (
  "fmt"
)

func main() {
  var T int
  a := [][]int{}
  fmt.Scan(&T)

  for t := 1; t <= T; t++ {
    var M, N, id int
    fmt.Scanln(&M, &N, &id)
    //id--
   
    fmt.Println(M, N, id)

    for i := 0; i < M; i++ {
      for j := 0; j < N; j++ {
        
      }
    }

    fmt.Println(a)

  }
}
