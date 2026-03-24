# Login API - Spring Boot

API de autenticação desenvolvida com Spring Boot, permitindo cadastro e login de usuários com segurança.

---

## 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Spring Security (BCrypt)
* Maven

---

## 📌 Funcionalidades

* ✅ Cadastro de usuários
* ✅ Login com validação de credenciais
* ✅ Criptografia de senha com BCrypt
* ✅ Listagem de usuários
* ❌ Senha não exposta nas respostas (segurança)

---

## 🔗 Endpoints

### 📍 Cadastro

POST /auth/register

```json
{
  "email": "teste@email.com",
  "senha": "123456"
}
```

---

### 📍 Login

POST /auth/login

```json
{
  "email": "teste@email.com",
  "senha": "123456"
}
```

---

### 📍 Listar usuários

GET /auth/usuarios

---

## ⚙️ Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/heveeedesouza/login-api-springboot.git
```

2. Crie o banco no MySQL:

```sql
CREATE DATABASE login_db;
```

3. Configure o arquivo `application.properties`

4. Execute o projeto

---

##  Testes

Utilizado Postman para testar os endpoints.

---

## Sobre o projeto

Projeto desenvolvido com foco em aprendizado de desenvolvimento backend com Java e Spring Boot, aplicando conceitos de API REST, arquitetura em camadas e segurança básica.

---

## 👩‍💻 Autora

Hevellyn Alves
