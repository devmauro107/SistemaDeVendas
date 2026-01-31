package br.com.sistemadevendas;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ProdutoDAO {

    private ArrayList<Produto> produtos = new ArrayList<>();

        public void create(Produto p) {
            produtos.add(p);
                System.out.println("Produto cadastrado!");
        }

        public void read() {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }

        public void update(int id, String novoNome, double novoPreco) {
            for (Produto p : produtos) {
                if (p.getId() == id) {
                    p.setNome(novoNome);
                    p.setPreco(novoPreco);
                        System.out.println("Produto atualizado!");
                            return;
                }
            }
            System.out.println("Produto não encontrado!");
        }

        public void delete(int id) {
            for (Produto p : produtos) {
                if (p.getId() == id) {
                    produtos.remove(p);
                        System.out.println("Poduto removido!");
                            return;
                }
            }
            System.out.println("Produto não encontrado.");
        }
}
