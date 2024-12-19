
/*//Exercicio 1
let frase = "Aprender Java é fixe!"
frase = frase.length
console.log(frase)

//Exercicio 2
let string = "javascript é demais!";

console.log(string[0]);
console.log(string[10]);

//Exercicio3
let texto = "a Lais é a melhor formadora do mundo"

let texto1 = texto.toUpperCase()
let texto2 = texto.toLowerCase()

console.log(texto1)
console.log(texto2)

//Exercicio4

let java = "Eu adoro programar em java!"
let index = java.replace("java, javascript")
console.log(index)

//Exercicio Novo

let diaSemana = prompt('Qual o dia da semana?')

switch( diaSemana){
    case 'Segunda':
    alert ('Ahhh, ainda é segunda')
    break;
    
    case 'Sexta':
    alert('Finalmente sextou')
    break;
}
console.log()

// Exercicio Novo2
let passUser = prompt('Digite a sua senha')
if (passUser.length >=6){
    alert ('senha válida')
}else{
    alert ('Senha inválida')
}

//Exercicio Novo3




//Exercicio de Arrays 1

let planetas = ['Mercúrio', 'Vénus','Terra','Mart','Júpiter','Saturno','Urano','Neptuno','Plutão']

planetas [3]= 'Marte' //Substituir

planetas.pop()

planetas.unshift('Cesae')

console.log(planetas)


//Exercicio4
const airplaneSeats = [
    ['Ruth', 'Anthony', 'Stevie'],
    ['Amelia', 'Pedro', 'Maya'],
    ['Xavier', 'Ananya', 'Luis'],
    ['Luke', null, 'Deniz'],
    ['Rin', 'Sakura', 'Francisco']
 ];
console.log (airplaneSeats)


let product = {
    nome: 'Verniz-Gel',
    inStock: true,
    price: 1.99,
    colors: ['vermelho', 'azul','verde']
}

console.log (product.price) 
console.log (product.colors[2])

//Novo valor
product.price = 2.55
*/

//Ciclos


for (let letra = 0; letra <= 26; letra++) {
    console.log("I know");
}

let numVezes = 1
while(numVezes <= 26){
    console.log("I know" + numVezes)
numVezes++
}