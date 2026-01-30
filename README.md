                📌 Sistema de Vendas (CRUD Relacional em Java)


📖 Descrição
Projeto em Java que implementa um CRUD completo (Create, Read, Update, Delete) para gerenciar Clientes, Produtos, Pedidos e Itens de Pedido, simulando um banco de dados relacional com ArrayList.

    🎯 Objetivo
Praticar CRUD em Java.

Exercitar orientação a objetos (atributos, métodos, construtores, getters/setters, encapsulamento).

Implementar relacionamentos entre classes.

Criar um menu interativo para manipulação dos dados.

    🏗️ Estrutura do Projeto
Entidades
Cliente → id, nome, email.

Produto → id, nome, preço.

Pedido → id, cliente, data, itens.

ItemPedido → id, produto, quantidade.

DAO (Data Access Object)
ClienteDAO → CRUD de clientes.

ProdutoDAO → CRUD de produtos.

PedidoDAO → CRUD de pedidos.

ItemPedidoDAO → CRUD de itens de pedidos.

Principal
Main → menu interativo com submenus para cada entidade.

    🗄️ Modelo Relacional (Simulado)
Cliente (1) → Pedido (N).

Pedido (1) → ItemPedido (N).

Produto (N) → ItemPedido (N).

    ⚙️ Tecnologias
Java 21

ArrayList (simulação de banco de dados)

Scanner (entrada de dados via console)

    📌 Funcionalidades
Cliente → cadastrar, listar, atualizar, remover.

Produto → cadastrar, listar, atualizar, remover.

Pedido → criar pedidos vinculados a clientes.

ItemPedido → adicionar produtos a pedidos.

    🚀 Próximos Passos
Persistência real com JDBC/MySQL.

Relatórios de vendas.