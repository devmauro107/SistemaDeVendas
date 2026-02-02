package br.com.sistemadevendas;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class pedidoDAO {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

        public void create(Pedido p) {
            pedidos.add(p);
                System.out.println("Pedido Cadastrado!");
        }

        public void read() {
            for (Pedido p : pedidos) {
                System.out.println(p);
                    for (ItemPedido item : p.getItens()) {
                        System.out.println(" " + item);
                }
            }
        }

        public void update (int id, Cliente novoCliente, Date novaData) {
            for (Pedido p : pedidos) {
                if (p.getId() == id) {
                    p = new Pedido(id, novoCliente, novaData);
                    System.out.println("Pedido Atualizado!");
                    return;
                }
            }
            System.out.println("Pedido não encontrado.");
        }

        public void delete(int id) {
            for (Pedido p : pedidos) {
                if (p.getId() == id) {
                    pedidos.remove(p);
                    System.out.println("Pedido Removido!");
                    return;
                }
            }
            System.out.println("Pedido não encontrado.");
    }
}
