var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x = Number(lines.shift());
let y = Number(lines.shift());

let consumoMedio = x / y;

console.log(consumoMedio.toFixed(3) + " km/l");