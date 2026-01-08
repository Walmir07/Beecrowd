var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let peca1 = lines.shift().split(' ');
let peca2 = lines.shift().split(' ');

let codPeca1 = Number(peca1.shift());
let numeroPeca1 = Number(peca1.shift());
let valorPeca1 = Number(peca1.shift());

let codPeca2 = Number(peca2.shift());
let numeroPeca2 = Number(peca2.shift());
let valorPeca2 = Number(peca2.shift());

let valorTotal = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

console.log("VALOR A PAGAR: R$ " + valorTotal.toFixed(2));