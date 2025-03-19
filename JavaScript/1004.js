var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let val1 = Number(lines.shift());
let val2 = Number(lines.shift());

let prod = val1 * val2;

console.log("PROD = " + prod);