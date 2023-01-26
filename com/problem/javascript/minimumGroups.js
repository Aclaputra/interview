// JavaScript program to find the minimum
// group flips in a binary array
 
function printGroups(arr, n) {
  // Traverse through all array elements
  // starting from the second element

  for (var i = 1; i < n; i++) {
    // If current element is not same
    // as previous

    if (arr[i] != arr[i - 1]) {
      // If it is same as first element
      // then it is starting of the interval
      // to be flipped.

      if (arr[i] != arr[0])
        console.log( "From " + i + " to ");
      // If it is not same as previous
      // and same as first element, then
      // previous element is end of interval

      else
        console.log(i - 1 + "<br>");
    }
  }
  // Explicitly handling the end of
  // last interval
  if (arr[n - 1] != arr[0])
    console.log(n - 1 + "<br>");
}
  
var arr = [0, 1, 1, 0, 0, 0, 1, 1];
var n = arr.length;
printGroups(arr, n);
