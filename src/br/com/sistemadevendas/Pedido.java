package br.com.sistemadevendas;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int id;
    private Cliente cliente;
    private Data date;
    private ArrayList<ItemPedido> itens;

        public Pedido(int id, Cliente cliente, Date date) {
            this.id = id;
            this.cliente = cliente;
            this.date = (Data) date;
            this.itens = new ArrayList<>();
        }

    public int getId() {
        return id;
    }
    public Data getDate() {
        return date;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

        public void adidcionarItem(ItemPedido item) {
            itens.add(item);
        }

        public void removerItem(ItemPedido item) {
            itens.remove(item);
        }

    @Override
        public String toString() {
            return "Pedido [ID = "
                    + id
                    + ", Clente = "
                    + cliente.getNome()
                    + ", Data = "
                    + date
                    + "]";
    }
}
