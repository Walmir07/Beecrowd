var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let numeroFunc = Number(lines.shift());
let horasTrabalhadas = Number(lines.shift());
let valorHora = parseFloat(lines.shift());

let salario = horasTrabalhadas * valorHora;

console.log("NUMBER = " + numeroFunc);
console.log("SALARY = U$ " + salario.toFixed(2));