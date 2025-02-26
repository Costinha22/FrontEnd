//MISSÃO Nº3
document
  .getElementById("formulario-contato") // Obtém o elemento do formulário com id "formulario-contato"
  .addEventListener("submit", function (event) {
    // Adiciona um ouvinte de evento para o evento de envio do formulário
    event.preventDefault(); // Previne o envio do formulário, permitindo que o JavaScript faça as validações antes de enviar os dados

    // Obtém os valores dos campos do formulário
    let nome = document.getElementById("nome").value;
    let email = document.getElementById("email").value;
    let contato = document.getElementById("contatoFormulario").value;
    let regiao = document.getElementById("regiao").value;
    let mensagem = document.getElementById("mensagem").value;

    let erros = []; // Inicializa um array para armazenar os erros encontrados nas validações

    // Validação de nome
    if (nome === "") {
      // Se o campo nome estiver vazio
      erros.push("Nome é obrigatório."); // Adiciona uma mensagem de erro ao array
      document.getElementById("nome").classList.add("is-invalid"); // Adiciona a classe de erro ao campo
    } else {
      document.getElementById("nome").classList.remove("is-invalid"); // Remove a classe de erro se o campo contiver dados
    }

    // Validação de email
    if (email === "") {
      // Se o campo email estiver vazio
      erros.push("Email é obrigatório."); // Adiciona uma mensagem de erro ao array
      document.getElementById("email").classList.add("is-invalid"); // Adiciona uma classe de erro ao campo
    } else if (!validarEmail(email)) {
      // Se o e-mail não for válido (não passar pela expressão regular)
      erros.push("Email inválido."); // Adiciona uma mensagem de erro ao array
      document.getElementById("email").classList.add("is-invalid"); // Adiciona a classe de erro ao campo
    } else {
      document.getElementById("email").classList.remove("is-invalid"); // Remove a classe de erro se o email for válido
    }

    // Validação de contato
    if (contato === "") {
      // Se o campo de contato estiver vazio
      erros.push("Contato é obrigatório."); // Adiciona uma mensagem de erro ao array
      document.getElementById("contatoFormulario").classList.add("is-invalid"); // Adiciona uma classe de erro ao campo
    } else if (!validarContato(contato)) {
      // Se o contato não for válido (não tiver exatamente 9 dígitos)
      erros.push("Contato inválido (Insira 9 dígitos)."); // Adiciona uma mensagem de erro ao array
      document.getElementById("contatoFormulario").classList.add("is-invalid"); // Adiciona uma classe de erro ao campo
    } else {
      document
        .getElementById("contatoFormulario")
        .classList.remove("is-invalid"); // Remove a classe de erro se o contato for válido
    }

    // Validação de região (escola)
    if (regiao === "") {
      // Se o campo de região estiver vazio
      erros.push("Escola é obrigatória."); // Adiciona uma mensagem de erro ao array
      document.getElementById("regiao").classList.add("is-invalid"); // Adiciona a classe de erro ao campo
    } else {
      document.getElementById("regiao").classList.remove("is-invalid"); // Remove a classe de erro se o campo contiver dados
    }

    // Validação de mensagem
    if (mensagem === "") {
      // Se o campo de mensagem estiver vazio
      erros.push("Mensagem é obrigatória."); // Adiciona uma mensagem de erro ao array
      document.getElementById("mensagem").classList.add("is-invalid"); // Adiciona a classe de erro ao campo
    } else {
      document.getElementById("mensagem").classList.remove("is-invalid"); // Remove a classe de erro se o campo contiver dados
    }

    // Verifica se há erros
    if (erros.length > 0) {
      // Se houver algum erro no array 'erros'
      alert(erros.join("\n")); // Exibe os erros como uma lista de mensagens no formato de texto num prompt único para todos os erros existentes
    } else {
      // Se não houver erros, o envio é considerado bem-sucedido
      alert("Formulário enviado com sucesso!"); // Exibe uma mensagem de sucesso
      document.getElementById("formulario-contato").reset(); // Reseta o formulário, limpando todos os campos
      // Remove todas as classes de erro após o envio bem-sucedido
      let invalidFields = document.querySelectorAll(".is-invalid"); // Seleciona todos os campos com a classe 'is-invalid'
      invalidFields.forEach((field) => field.classList.remove("is-invalid")); // Remove a classe 'is-invalid' de cada campo
    }
  });

// Função de validação de email
function validarEmail(email) {
  return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email); // Verifica se o e-mail segue o formato padrão de um endereço de e-mail
}

// Função de validação de contato (exige exatamente 9 dígitos)
function validarContato(contato) {
  return /^\d{9}$/.test(contato); // Verifica se o contato possui exatamente 9 dígitos numéricos
}

//SUBMISSÃO DA MISSÃO 1: Correçao de Bugs urgente!
//Adicionar texto na lista nao ordenada UL na parte do sobre nós do site e sem mexer no html
const listagemCursos = document.querySelector("#sobre ul"); //1 PROFISSÃO
const adicionarCursos = ["EthicalHacker", "Gestor de tráfego"]; //2 PROFISSÃO

adicionarCursos.forEach((textoAlterar) => {
  const novoCurso = document.createElement("li");
  novoCurso.innerText = textoAlterar;
  listagemCursos.appendChild(novoCurso);
});

//MISSÃO 2: DE VOLTA AO TOPO!
//Estilo do botão voltar ao topo e estilização direta no js sem mexer em css
const botao = Object.assign(
  document.body.appendChild(document.createElement("button")),
  {
    textContent: "Voltar ao Topo",
    onclick: () => window.scrollTo({ top: 0, behavior: "smooth" }),

    style: ` position: fixed; bottom: 20px; right: 20px; display: none;
               padding: 10px 15px; background:rgb(0, 123, 255); color: white;
               border: none; border-radius: 5px; `,
  }
);

window.addEventListener(
  "scroll",
  () => (botao.style.display = scrollY > 300 ? "block" : "none")
);

// MISSÃO 1: Correçao de Bugs urgente!
//ajuste da configuraçao das imagens para ficarem todas iguais
const imagens = document.querySelectorAll("#cursos .card-img-top"); // Seleciona todas as imagens dentro do card

imagens.forEach((imagem) => {
  imagem.style.height = "170px";
});



