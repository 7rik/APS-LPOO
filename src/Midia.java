abstract class Midia {

    private String titulo;
    private int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
