let contador = 0;
const display = document.createElement("div");
document.body.appendChild(display);

function incrementar() {
  contador++;
  display.textContent = `Número atual: ${contador}`;
  console.log(`Contador: ${contador}`);
}

function resetar() {
  contador = 0;
  display.textContent = `Número atual: ${contador}`;
  console.log(`Contador resetado: ${contador}`);
}
