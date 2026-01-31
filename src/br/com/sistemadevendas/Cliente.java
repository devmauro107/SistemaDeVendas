package br.com.sistemadevendas;

public class Cliente {

    private int id;
    private String nome;
    private String email;

        public Cliente(int id, String email, String nome) {
            this.id = id;
            this.email = email;
            this.nome = nome;
        }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
