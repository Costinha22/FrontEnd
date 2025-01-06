
function gerarSenha(tamanho) {
  const caracteres =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;:,.<>?";
  let senha = "";

  for (let i = 0; i < tamanho; i++) {
    senha += caracteres[Math.floor(Math.random() * caracteres.length)];
  }

  return senha;
}


console.log(gerarSenha(10)); 
