var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

let a = parseInt(lines.shift());
let b = parseInt(lines.shift());
let c = parseInt(lines.shift());
let d = parseInt(lines.shift());

if(b > c && d > a && c + d > a + b && (c && d > 0) && a % 2 === 0){
  console.log("Valores aceitos");
} else {
  console.log("Valores nao aceitos");
}