function pideDevuelve() {
  let primerNumero = prompt("Introduce un número");
  primerNumero = parseInt(primerNumero);
  return primerNumero;
}

function tipoTrato(primerNumero) {
  let trato = confirm("¿Quieres un trato especial?");
  if (trato) {
    return primerNumero + 10;
  } else {
    return primerNumero - 5;
  }
}

function main() {
  let primerNumero = pideDevuelve();
  let resultado = tipoTrato(primerNumero);
  alert("El resultado es: " + resultado);
}
