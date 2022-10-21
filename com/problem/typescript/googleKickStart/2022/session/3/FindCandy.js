var readline = require('readline');
var rl = readline.createInterface(process.stdin, process.stdout);
function parseInput(input) {
    var line = 0;
    var T = Number(input[line++]);
    var data = [];
    for (var t = 1; t <= T; ++t) {
        var numKids = Number(input[line++].split(' ')[1]);
        var candyBags = input[line++].split(' ').map(function (str) { return Number(str); });
        data.push({ t: t, numKids: numKids, candyBags: candyBags });
    }
    return data;
}
function solve(data) {
    var sum = data.candyBags.reduce(function (sum, candies) { return sum + candies; }, 0);
    var remainder = sum % data.numKids;
    console.log("Case #" + data.t + ": " + remainder);
}
function runAllTests(input) {
    var T = parseInput(input);
    T.forEach(solve);
}
var lines = [];
rl.on('line', function (line) { return lines.push(line); }).on('close', function () { return runAllTests(lines); });
