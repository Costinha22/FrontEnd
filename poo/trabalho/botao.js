// Adiciona eventos ao botão ao clicar
document.getElementById("botaoTempo").addEventListener("click", function () {
  // Atualiza o relógio com a data e hora atual
  document.getElementById("botaoTempo").innerHTML = new Date();

  // Função para os confettis
  function randomInRange(min, max) {
    return Math.random() * (max - min) + min;
  }
  // confettis
  confetti({
    angle: randomInRange(55, 125),
    spread: randomInRange(50, 70),
    particleCount: randomInRange(50, 100),
    origin: { y: 0.6 },
  });
});
