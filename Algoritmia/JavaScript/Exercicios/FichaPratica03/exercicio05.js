function contarVogais(texto) {
  // Definindo as vogais
  const vogais = "AEIOUaeiou";

  // Contador de vogais
  let contador = 0;

  // Contando vogais na string
  for (let i = 0; i < texto.length; i++) {
    if (vogais.includes(texto[i])) {
      contador++;
    }
  }

  return contador;
}

// Testando a função
console.log(contarVogais("João"));
