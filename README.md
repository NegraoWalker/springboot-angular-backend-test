# API CRUD de Funcionários

Esta API foi criada para realizar operações CRUD (Criar, Ler, Atualizar, Deletar) em dados de funcionários. Ela foi desenvolvida usando Java 17 e Spring Boot 3.3.3.

## Tecnologias

- **Java 17**: A versão mais recente do JDK que oferece melhorias de desempenho e novos recursos.
- **Spring Boot 3.3.3**: Framework que facilita a configuração e o desenvolvimento de aplicações Java baseadas em Spring.

## Funcionalidades

API permite as seguintes operações:

- **Criar**: Adiciona um novo funcionário.
- **Ler**: Recupera informações de um funcionário ou uma lista de funcionários.
- **Atualizar**: Modifica os dados de um funcionário existente.
- **Deletar**: Remove um funcionário do banco de dados.

## Endpoints

Aqui está um resumo dos principais endpoints da API:

- `POST http://localhost:8080/api/v1/employees` - Cria um novo funcionário.
- `GET http://localhost:8080/api/v1/employees` - Lista todos os funcionários.
- `GET http://localhost:8080/api/v1/employees/{id}` - Recupera um funcionário específico pelo ID.
- `PUT http://localhost:8080/api/v1/employees/{id}` - Atualiza um funcionário existente pelo ID.
- `DELETE http://localhost:8080/api/v1/employees/{id}` - Deleta um funcionário pelo ID.

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/NegraoWalker/springboot-angular-backend-test.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd springboot-angular-backend-test
    ```

3. Compile e execute a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```
