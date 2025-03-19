var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let a = parseFloat(lines.shift());
let b = parseFloat(lines.shift());

let pesoA = 3.5;
let pesoB = 7.5;

let media = ((a * pesoA) + (b * pesoB)) / (pesoA + pesoB);

console.log("MEDIA = " + media.toFixed(5));