let valorA = parseInt(document.getElementById("inputValorA").value);
let valorB = parseInt(document.getElementById("inputValorB").value);

const botao = document.getElementById("btnCalcular");

function soma() {
  return valorA + valorB;
}

function subtracao() {
  return valorA - valorB;
}

function divisao() {
  return valorA / valorB;
}

function multiplicacao() {
  return valorA * valorB;
}

// Função

function compararOperador() {
  // Selecionar o elemento

  const operador = document.getElementById("tipoOperation").value;

  switch (operador) {
    case "+":
      soma();
      break;

    case "-":
      subtracao();
      break;

    case "/":
      divisao();
      break;

    case "*":
      multiplicacao();
      break;
  }
}

btnCor.addEventListener("click", compararOperador);

const textoH2 = document.getElementById("textoResultado");

textoH2.innerText = btnCor.addEventListener("click", compararOperador);

const textoH2 = document.getElementById("textoResultado");
