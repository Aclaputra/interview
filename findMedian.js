function findMedian(arr) {
    // Write your code here
    var concat = arr;
    concat = concat.sort(
        function (a, b) { return a - b });

    console.log(concat);
    var length = concat.length;

    if (length % 2 == 1) {

        // If length is odd
        console.log(concat[(length / 2) - .5])
        return concat[(length / 2) - .5]

    }
    else {
        console.log((concat[length / 2] 
            + concat[(length / 2) - 1]) / 2);
                
        return (concat[length / 2] 
            + concat[(length / 2) - 1]) / 2;
    }
}
findMedian([1, 4, 7, 9])

function median_of_arr(arr) {
    const middle = (arr.length + 1) / 2;
  
    // Avoid mutating when sorting
    const sorted = [...arr].sort((a, b) => a - b);
    const isEven = sorted.length % 2 === 0;

    return isEven ? (sorted[middle - 1.5]
        + sorted[middle - 0.5]) / 2 :
        sorted[middle - 1];
}
var arr = [1, 4, 7, 9];
console.log(median_of_arr(arr));

