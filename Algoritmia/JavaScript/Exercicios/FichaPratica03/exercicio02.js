
function ehPrimo(numero) {
    if (numero <= 1) {
        return console.log ("não é primo"); // Números <= 1 não são primos
    }

    for (let i = 2; i <= numero / 2; i++) { // Verifica até metade do número
        if (numero % i === 0) {
            return console.log ("não é primo"); // Se encontrar um divisor, não é primo
        }
    }

    return console.log ("é primo"); // Se nenhum divisor for encontrado, é primo
}
ehPrimo(2);  // true