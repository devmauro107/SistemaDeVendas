# 📌 Sistema de Vendas (CRUD Relacional em Java)

## 📖 Descrição
Este projeto foi desenvolvido em **Java** com o objetivo de praticar **lógica de programação** e conceitos básicos de **orientação a objetos**.  
Ele simula um sistema de vendas com **CRUD completo** para gerenciar **Clientes, Produtos, Pedidos e Itens de Pedido**, utilizando `ArrayList` como uma forma simples de representar um banco de dados relacional.

---

## 🎯 Objetivos de Aprendizado
- Reforçar os fundamentos da lógica de programação.
- Exercitar conceitos de **POO**: atributos, métodos, construtores, encapsulamento e relacionamentos entre classes.
- Implementar operações de **CRUD** (Create, Read, Update, Delete).
- Criar um **menu interativo** no console para manipulação dos dados.
- Simular relacionamentos entre entidades como em um banco relacional.

---

## 🏗️ Estrutura do Projeto

### 🔹 Entidades
- **Cliente** → id, nome, email  
- **Produto** → id, nome, preço  
- **Pedido** → id, cliente, data, itens  
- **ItemPedido** → id, produto, quantidade  

### 🔹 DAO (Data Access Object)
- `ClienteDAO` → CRUD de clientes  
- `ProdutoDAO` → CRUD de produtos  
- `PedidoDAO` → CRUD de pedidos  
- `ItemPedidoDAO` → CRUD de itens de pedidos  

### 🔹 Classe Principal
- `Main` → menu interativo com submenus para cada entidade

---

## 🗄️ Modelo Relacional Simulado
- Cliente (1) → Pedido (N)  
- Pedido (1) → ItemPedido (N)  
- Produto (N) → ItemPedido (N)  

---

## ⚙️ Tecnologias Utilizadas
- **Java SE 8+**
- **ArrayList** (simulação de banco de dados)
- **Scanner** (entrada de dados via console)

---

## 🚀 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/sistema-vendas-java.git
