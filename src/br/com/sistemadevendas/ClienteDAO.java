package br.com.sistemadevendas;

import java.util.ArrayList;

public class ClienteDAO {

    private ArrayList<Cliente> clientes = new ArrayList<>();

        public void create(Cliente c) {
            clientes.add(c);
                System.out.println(" Cliente cadastrado!");
        }

        public void read() {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }

        public void update(int id, String novoNome, String novoEmail) {
            for (Cliente c : clientes) {
                if (c.getId() == id) {
                    c.setNome(novoNome);
                    c.setEmail(novoEmail);
                        System.out.println("Cliente atualizado!");
                            return;
                }
            }
            System.out.println("Cliente não encontrado.");
        }

        public void delete(int id) {
            for (Cliente c : clientes) {
                if (c.getId() == id ) {
                    clientes.remove(c);
                        System.out.println("Cliente removido!");
                            return;
                }
            }
            System.out.println("Cliente não encontrado. ");

        }
 }
