package main

import "fmt"

// constant time O(1)
func main() {
  s := ""
  var case3, case5 int

  for i:=1; i<= 100; i++ {
    case3++
    case5++

    if case3==3 && case5==5 {
      s+="fizzBuzz"
      case3=0
      case5=0
    }
    if case3==3 {
      s+="fizz"
      case3=0
    }  
    if case5==5 {
      s+="buzz"
      case5=0
    } 

    if len(s)==0 {
      fmt.Println(i)
    } else {
      fmt.Println(s)
    }
    s=""
  }
}
