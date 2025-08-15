# PostsGenerator_AI 📝🤖

**PostsGenerator_AI** é uma aplicação backend desenvolvida em **Java + Spring Boot** que gera textos e resumos inteligentes para posts, utilizando a API **Google Gemini**.

## 🚀 Funcionalidades

- ✍️ **Geração de textos** — Cria conteúdos de forma automática a partir de parâmetros fornecidos.
- 📄 **Resumos inteligentes** — Produz resumos otimizados para redes sociais e blogs.
- 🤖 **Integração com IA** — Utiliza o modelo de linguagem **Google Gemini** para criar textos criativos e coesos.
- 🌐 **API REST** — Pode ser consumida por front-ends, aplicativos móveis ou integrações.

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Maven**
- **Google Gemini API**

## 📂 Estrutura do Projeto
```
PostsGenerator_AI/
├── src/main/java/dev/siqueira/articlesummary_ai/ # Código fonte principal
│ ├── controller/ # Endpoints REST
│ ├── model/ # DTOs e modelos de dados
│ └── service/ # Regras de negócio e integração com a API Gemini
├── pom.xml # Dependências Maven
└── .env # Variáveis de ambiente
```


## ⚙️ Configuração e Execução

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/PedroHSiqueira/PostsGenerator_AI.git
cd PostsGenerator_AI
```

### 2️⃣ Configurar Variáveis de Ambiente
```
GOOGLE_API_KEY=sua_chave_da_google_gemini
```

## 📚 Endpoints Principais
| Método |  Endpoint  |                Descrição                |
|:------:|:----------:|:---------------------------------------:|
| POST   | /generate  | Gera um post usando a API Google Gemini |

## 📚 Estrutura da Requisição
```
{
  "type": "Tecnologia",
	"topic": "O fracasso do lançamento do ChatGPT 5"
}
```


## 📜 Licença

Este projeto está sob a licença MIT — sinta-se livre para usar e modificar.

