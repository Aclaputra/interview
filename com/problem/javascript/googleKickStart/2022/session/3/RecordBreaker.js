// Importing a module
const readline = require("readline-sync");

// Enter the number
let a = Number(readline.question());
let number = [];
for (let i = 0; i < a; ++i)
{
  number.push(Number(readline.question()));
}
console.log(number);
