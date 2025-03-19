var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let raio = Number(lines.shift());
let pi = 3.14159;

let volume = (4.0/3) * pi * raio**3;

console.log("VOLUME = " + volume.toFixed(3));