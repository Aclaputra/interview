function plusMinus(arr) {
    // Write your code here
    let p=0,n=0,z=0;
    for(let i=0; i<=arr.length; i++)
        if(arr[i] < 0) n++ 
        else if(arr[i] > 0) p++
        else if(arr[i] == 0) z++
    console.log(p/arr.length);
    console.log(n/arr.length);
    console.log(z/arr.length);
}

plusMinus([-4, 3, -9, 0, 4, 1]);