var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let dias = parseInt(lines.shift());

let anos = parseInt(dias / 365);
dias = dias % 365;
console.log(`${anos} ano(s)`);

let meses = parseInt(dias / 30);
dias = dias % 30;
console.log(`${meses} mes(es)`);

console.log(`${dias} dia(s)`);
