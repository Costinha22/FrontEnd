const botao1 = document.getElementById("botao");

function alerta() {
    
    const nome = prompt("Qual seu nome?")
    alert("Olá " + nome)

}

botao1.addEventListener("click", alerta);

