const btn = document.getElementById("btn")
const paragrafo = document.querySelector("p")

function aumentar() {
    
    paragrafo.style.fontSize = "69px"
}

btn.addEventListener("click", aumentar);