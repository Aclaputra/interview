let arr = [12, 2, 4, 8];
console.log(arr);
arr.sort((a, b) => a - b);
console.log(arr);
console.log(arr.slice(0, arr.length - 1));
console.log(arr.slice(0, arr.length - 1).reduce((a,b) => a+b));
