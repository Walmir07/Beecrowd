var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

let a = Number(lines.shift());
let b = Number(lines.shift());
let c = Number(lines.shift());

let triangulo = (a * c) / 2;
let circulo = 3.14159 * c**2;
let trapezio = ((a + b) * c) / 2;
let quadrado = b**2;
let retangulo = a * b;

console.log("TRIANGULO: " + triangulo.toFixed(3));
console.log("CIRCULO: " + circulo.toFixed(3));
console.log("TRAPEZIO: " + trapezio.toFixed(3));
console.log("QUADRADO: " + quadrado.toFixed(3));
console.log("RETANGULO: " + retangulo.toFixed(3));