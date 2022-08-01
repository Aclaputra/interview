//Javascript program to implement Slow sort
 
// Function that implements Slow Sort
function slowSort(A, i,j)
{
    // Base Case
    if (i >= j)
        return;
 
    // Middle value
    var m = parseInt((i + j) / 2);
 
    // Recursively call with left half
    slowSort(A, i, m);
 
    // Recursively call with right half
    slowSort(A, m + 1, j);
 
    // Swap if first element
    // is lower than second
    if (A[j] < A[m]) {
        //swapp(A[j], A[m]);
        var t = A[j];
        A[j]=A[m];
        A[m]=t;
    }
     
    // Recursively call with whole
    // array except maximum element
    slowSort(A, i, j - 1);
 
}
 
// Function to print the array
function printArray(arr, size)
{
    var i;
    for (i = 0; i < size; i++)
        console.log( arr[i] + " ");
    console.log("<br>");
}
 
var arr = [ 6, 8, 9, 4, 12, 1 ];
var N = arr.length;
 
// Function call
slowSort(arr, 0, N - 1);
 
// Display the sorted array
printArray(arr, N);