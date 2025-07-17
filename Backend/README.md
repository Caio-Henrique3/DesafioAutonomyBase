# 🧠 Autonomy Base

## 📋 Descrição do Projeto
Sistema de gerenciamento de **dispositivos monitorados** com arquitetura limpa,
desenvolvido em Java com Spring Boot, PostgreSQL, MongoDB e Docker.

---

## 🛠️ Tecnologias Utilizadas

- [Java 21](https://www.oracle.com/java/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb)
- [PostgreSQL](https://www.postgresql.org/)
- [MongoDB](https://www.mongodb.com/)
- [Docker & Docker Compose](https://www.docker.com/)
- [Lombok](https://projectlombok.org/)
- [JUnit 5](https://junit.org/junit5/)
- [Testcontainers](https://www.testcontainers.org/)

---

## 📦 Estrutura do Projeto

Autonomy-base/

│

├── src/

│ ├── domain/ # Modelos e interfaces de domínio

│ ├── application/ # Casos de uso (serviços da aplicação)

│ ├── infrastructure/ # Implementações concretas (JPA, Mongo, config, etc)

│ ├── web/ # Controllers e DTOs da camada REST

│

├── docker-compose.yml # Subida dos bancos (PostgreSQL e MongoDB)

├── README.md

└── pom.xml

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos

- Docker e Docker Compose instalados
- Java 21+
- Maven 3.8+

### 1. Clone o repositório

```bash
git clone https://github.com/Caio-Henrique3/DesafioAutonomyBase.git
cd autonomy-base
```

### 2. Instale e rode o Docker.

### 3. Suba os containers com Docker
```bash
docker-compose up -d
```
Isso vai iniciar: PostgreSQL na porta 5434 e MongoDB na porta 27017 (futuramente usado)

### 4. Configure o banco (usuário, senha e porta) no application.yml.

### 5. Rode a aplicação Spring Boot pela IDE ou:
   ```bash
    mvn spring-boot:run
   ```
O FlyWay aplicará as migrations automaticamente no banco.

---

### 🏛 Arquitetura e Design
    Arquitetura em camadas (Controller, Service, Repository, DTO).

    Separação entre domínios de negócio e infraestrutura.

    Injeção de dependência via configuração manual (@Configuration) ao invés de anotações diretas em classes centrais.

    Uso de UUID para identificação única dos dispositivos.

    Migrations controladas com Flyway, garantindo versionamento seguro do banco.

    Princípios SOLID aplicados nas regras de negócio.

    Projeto preparado para escalar com múltiplas bases.

    Containerização com Docker para facilitar execução e ambiente consistente.

---

### ✨ Funcionalidades Implementadas

    Registro de dispositivos com nome, modelo e status.

    Listagem de dispositivos com filtro por status.

    Atualização de informações de um dispositivo por ID.

    Remoção de dispositivos.

    Integração simultânea com bancos PostgreSQL e MongoDB para persistência híbrida.

    Validações de dados nos DTOs com tratamento de erros amigável.

    Cobertura básica de testes com JUnit e Testcontainers para banco real.

---

### 🚧 Pontos Diferenciais

    Uso de UUID para maior segurança e escalabilidade.

    Flyway para controle automatizado das versões do schema.

    Docker Compose para orquestração local.

    Boas práticas de Clean Architecture e organização de código.

    Código todo em inglês, preparado para manutenção internacional.

    Configuração pronta para testes unitários com JUnit 5.

---

### 🚀 Próximos Passos e Melhorias

    ⏳ Integração com MongoDB para leitura de dados analíticos.

    ⏳ Documentação da API com Swagger/OpenAPI.

    ⏳ Implementar autenticação JWT.

    ⏳ Adicionar testes de integração com Testcontainers.

    ⏳ Criar front-end com Angular ou React.

    ⏳ Pipeline de CI/CD com GitHub Actions.

---

### 📞 Contato
[![LinkedIn](https://img.shields.io/badge/LinkedIn--blue?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/caio-henrique-56b713200)
[![Email](https://img.shields.io/badge/Email--red?style=for-the-badge&logo=gmail&logoColor=white)](mailto:m.henrique.caio@gmail.com)

---

## Obrigado por avaliar meu projeto! Qualquer dúvida, fico à disposição para conversar.