var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

let a = Number(lines.shift());
let b = Number(lines.shift());
let c = Number(lines.shift());

let maiorAB = (a + b + Math.abs(a - b)) / 2;

let maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

console.log(`${maiorABC} eh o maior`);