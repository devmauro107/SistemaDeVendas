# 📌 Sistema de Vendas (CRUD Relacional em Java)

## 📖 Descrição
Projeto em Java que implementa um CRUD completo para gerenciar **Clientes, Produtos, Pedidos e Itens de Pedido**, simulando um banco de dados relacional com `ArrayList`.

---

## 🎯 Objetivo
- Praticar CRUD em Java.
- Exercitar orientação a objetos (atributos, métodos, construtores, getters/setters, encapsulamento).
- Implementar relacionamentos entre classes.
- Criar menu interativo para manipulação dos dados via console.

---

## 🏗️ Estrutura

### Entidades
- **Cliente** → id, nome, email
- **Produto** → id, nome, preço
- **Pedido** → id, cliente, data, itens
- **ItemPedido** → id, produto, quantidade

### DAO
- `ClienteDAO` → CRUD de clientes
- `ProdutoDAO` → CRUD de produtos
- `PedidoDAO` → CRUD de pedidos
- `ItemPedidoDAO` → CRUD de itens de pedidos

### Principal
- `Main` → menu interativo com submenus para cada entidade

---

## 🗄️ Modelo Relacional
- Cliente (1) → Pedido (N)
- Pedido (1) → ItemPedido (N)
- Produto (N) → ItemPedido (N)

---

## ⚙️ Tecnologias
- Java SE 8+
- ArrayList (simulação de banco de dados)
- Scanner (entrada de dados via console)

---
