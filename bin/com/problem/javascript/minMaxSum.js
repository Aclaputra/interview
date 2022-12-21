function miniMaxSum(arr) {
    // Write your code here
    arr.sort((a,b) => a - b);
    let min = arr.slice(0, arr.length - 1).reduce((a,b) => a+b);
    let max = arr.slice(1).reduce((a,b) => a+b);
    console.log(min, max);
}
miniMaxSum([1,2,3,4,5]);
miniMaxSum([6,1,9,4,5]);