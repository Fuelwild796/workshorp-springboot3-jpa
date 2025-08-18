📦 Projeto Spring Boot – Sistema de Pedidos

🚀 Primeiro projeto desenvolvido com Spring Boot, aplicando conceitos de Java, JPA/Hibernate, API RESTful e arquitetura em camadas.
O objetivo foi criar uma aplicação backend para gerenciamento de usuários, pedidos, produtos e categorias.

📑 Funcionalidades

Cadastro e listagem de Usuários

Gerenciamento de Pedidos (Orders)

Relacionamento entre Pedidos, Produtos e Categorias

Registro de Pagamentos vinculados a pedidos

Tratamento de exceções com respostas padronizadas em JSON

Dados iniciais pré-carregados para testes

🛠️ Tecnologias Utilizadas

Java 17+

Spring Boot

JPA / Hibernate

H2 Database (ambiente de testes)

Maven

Postman (para testes da API)

⚙️ Como Executar o Projeto

Clonar o repositório

git clone https://github.com/SEU-USUARIO/seu-repositorio.git
cd seu-repositorio


Rodar o projeto com Maven ou sua IDE (IntelliJ/Eclipse):

./mvnw spring-boot:run


Acessar o H2 Database (console de testes):

http://localhost:8080/h2-console


Testar a API (exemplos):

Listar usuários: GET http://localhost:8080/users

Buscar pedido por ID: GET http://localhost:8080/orders/1

📂 Estrutura do Projeto
src/main/java/com/educandoweb/demo
│
├── entities        # Classes de entidades (User, Order, Product, etc.)
├── repositories    # Interfaces de acesso ao banco de dados
├── services        # Camada de serviços (regras de negócio)
├── resources       # Controladores REST (endpoints da API)
└── config          # Configuração inicial (seed de dados)

🚀 Aprendizados

Este projeto me permitiu praticar e consolidar:

Programação Orientada a Objetos (POO)

Arquitetura em camadas (Controller → Service → Repository)

Modelagem de relacionamentos complexos entre entidades

Uso do Spring Boot e JPA/Hibernate para integração com banco de dados

Tratamento de exceções e boas práticas em APIs RESTful

📌 Próximos Passos

Integrar com banco de dados relacional MySQL

Implementar autenticação e autorização (Spring Security)

Criar testes unitários e de integração

✍️ Desenvolvido por Seu Nome
