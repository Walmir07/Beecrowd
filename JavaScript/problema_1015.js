var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let p1 = lines.shift().split(" ");
let p2 = lines.shift().split(" ");

let x1 = Number(p1.shift());
let y1 = Number(p1.shift());

let x2 = Number(p2.shift());
let y2 = Number(p2.shift());

let distancia = Math.sqrt((x2 - x1)**2 + (y2 - y1)**2);

console.log(distancia.toFixed(4));