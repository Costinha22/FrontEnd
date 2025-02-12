// Validação do formulário de contato
document.getElementById("formulario-contato").addEventListener('submit', function (event) {
    event.preventDefault();

    let nome = document.getElementById('nome').value;
    let email = document.getElementById('email').value;
    
    if (nome == '' || email == '') {
        alert('Por favor, preencha todos os campos obrigatórios.');
    } else {
        
        alert("Formulário enviado com sucesso!");
    }
});

// Animação dos cards dos cursos 
const cards = document.querySelectorAll('#cursos .card');


cards.forEach(card => {
    card.addEventListener('mouseover', () => {
        card.style.transform = 'scale(1.1)';
    })
    card.addEventListener('mouseout', () => {
        card.style.transform = 'scale(1.0)';
    })
});
    
//ajuste da configuraçao das imagens para ficarem todas iguais 

const imagens = document.querySelectorAll("#cursos .card-img-top"); // Seleciona todas as imagens dentro do card

imagens.forEach((imagem) => {
    imagem.style.height = '170px'
      
});

//Adicionar texto na lista nao ordenada UL na parte do sobre nós do site e  sem mexer no html
const listagemCursos = document.querySelector("#sobre ul");
const adicionarCursos = ["EthicalHacker", "Gestor de tráfego"];

adicionarCursos.forEach((textoAlterar) => {
  const novoCurso = document.createElement("li");
  novoCurso.innerText = textoAlterar;
  listagemCursos.appendChild(novoCurso);
});

const botao = Object.assign(
  document.body.appendChild(document.createElement("button")),
  {
    textContent: "Voltar ao Topo",
    onclick: () => window.scrollTo({ top: 0, behavior: "smooth" }),
   
      style: ` position: fixed; bottom: 20px; right: 20px; display: none;
               padding: 10px 15px; background:rgb(0, 123, 255); color: white;
               border: none; border-radius: 5px; `
   });

window.addEventListener(
  "scroll",
  () => (botao.style.display = scrollY > 300 ? "block" : "none")
);
