/** given an array of integer nums, write a function that moves all even numbers to the end 
 * of the aray while maintaining the relative order of the odd elements and even elements
 **/  
function solution(inputData){
    let res = [];
    let odd = [];
    let even = [];
    for(let i = inputData.length - 1; i >= 0; i--) {
        if (inputData[i] % 2 == 0) {
            even.push(inputData[i]);
        } else {
            odd.push(inputData[i]);
        }
    }
    res = odd.concat(even);
    console.log(...res);
    // console.log(...even);
    // console.log(...odd);
}
solution('0000001111');
solution('13657');