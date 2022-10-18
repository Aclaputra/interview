package main

import "fmt"
import "math"

func main() {
  var T int
  var a [][]int = make([][]int, 3, 3)
  fmt.Scan(&T)

  for t := 1; t <= T; t++ {
    var M, N, P, ans int
    fmt.Scan(&N, &M, &P)
    P--

    for i := 0; i < M; i++ {
      for j := 0; j < N; j++ {
        fmt.Scan(&a[i][j])
      }
    }

    for i := 0; i < N; i++ {
      var maxi float64
      for j := 0; j < M; j++ {
        maxi = math.Max(maxi,float64(a[i][j]))
      }
      ans += int(maxi) - a[P][i]
      fmt.Println(int(ans))
    }
    fmt.Println(a)
    
    fmt.Println(fmt.Sprintf("ans: %d",ans))
  }
}
