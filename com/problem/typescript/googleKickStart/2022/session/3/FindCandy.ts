declare var require: any;
declare var process: any;

const readline = require('readline');
let rl = readline.createInterface(process.stdin, process.stdout);

interface Data {
  t: number;
  numKids: number;
  candyBags: number[];
}

function parseInput(input: string[]) {
  let line: number = 0;
  const T = Number(input[line++]);

  const data: Data[] = [];

  for (let t = 1; t <= T; ++t) {
    const numKids = Number(input[line++].split(' ')[1]);
    const candyBags = input[line++].split(' ').map((str) => Number(str));

    data.push({t, numKids, candyBags});
  }

  return data;
}

function solve(data: Data) {
  const sum = data.candyBags.reduce((sum, candies) => sum + candies, 0);
  const remainder = sum % data.numKids;
  
  console.log(`Case #${data.t}: ${remainder}`);
}

function runAllTests(input: string[]) {
  const T = parseInput(input);
  T.forEach(solve);
}

const lines: string[] = [];
rl.on('line', line => lines.push(line)).on('close', () => runAllTests(lines));
