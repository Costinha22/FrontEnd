const btn = document.getElementById("btn")

function sms() {
    
    const num = Number(prompt("Insira um numero"))
    
    if (num % 2 === 0) {
        
        alert("é par")
}else { alert ("é impar")
    
}

}
btn.addEventListener("click",sms)