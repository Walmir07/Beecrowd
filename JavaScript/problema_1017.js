var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let tempoGasto = parseInt(lines.shift());
let velocidade = parseInt(lines.shift());

let distanciaPercorrida = velocidade * tempoGasto;

let litrosNecessarios = distanciaPercorrida / 12;

console.log(litrosNecessarios.toFixed(3));