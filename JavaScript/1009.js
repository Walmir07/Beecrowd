var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let vendedor = lines.shift();
let salarioFixo = parseFloat(lines.shift());
let vendasEfetuadas = parseFloat(lines.shift());

let salarioBunus = salarioFixo + ((vendasEfetuadas * 15) / 100);

console.log("TOTAL = R$ " + salarioBunus.toFixed(2));