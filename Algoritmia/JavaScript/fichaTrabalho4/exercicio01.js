const btn = document.getElementById("btn");

function mudar(){

    if (btn.textContent === "Clique em mim") {
        
        btn.textContent = "Clicou";
    } else {
        btn.textContent = "Clique em mim";
    }
}

btn.addEventListener("click", mudar)