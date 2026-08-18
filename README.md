# 🔐 Login System

Sistema de autenticação desenvolvido com Java e Spring Boot, criado para praticar conceitos de cadastro, login, segurança, persistência de dados e organização em camadas.

## 🚀 Funcionalidades

- Cadastro de usuários
- Validação de nome, e-mail e senha
- Verificação de e-mail já cadastrado
- Senhas protegidas com BCrypt
- Login utilizando e-mail e senha
- Autenticação com Spring Security
- Área protegida para usuários autenticados
- Controle de sessão
- Logout
- Integração com PostgreSQL
- Mensagens de erro nos formulários

## 🛠 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- Thymeleaf
- Maven
- HTML
- Git
- GitHub

## 🏗 Estrutura do projeto

O projeto foi organizado em camadas:

- `model` — representa as entidades do sistema
- `repository` — responsável pelo acesso ao banco de dados
- `service` — contém as regras de negócio
- `controller` — recebe e trata as requisições HTTP
- `security` — contém a integração dos usuários com o Spring Security
- `config` — contém as configurações de segurança

## 🔄 Fluxo de cadastro

```text
Formulário
    ↓
Controller
    ↓
Validação
    ↓
Service
    ↓
BCrypt
    ↓
Repository
    ↓
PostgreSQL

```
## 🔑 Fluxo de login

```text
E-mail + senha
       ↓
Spring Security
       ↓
CustomUserDetailsService
       ↓
PostgreSQL
       ↓   
BCrypt verifica a senha
       ↓
Usuário autenticado
       ↓
Área protegida
```
## 👨‍💻 Autor

Desenvolvido por ** Daniel Oliveira **

Projeto desenvolvido para estudo e prática de Java, Spring Boot, Spring Security e PostgreSQL.