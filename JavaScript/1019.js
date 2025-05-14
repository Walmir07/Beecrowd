var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let tempo = parseInt(lines.shift());

let horas = parseInt(tempo / 3600);
tempo = tempo % 3600;

let minutos = parseInt(tempo / 60);
tempo = tempo % 60;

let segundos = tempo;

console.log(`${horas}:${minutos}:${segundos}`);