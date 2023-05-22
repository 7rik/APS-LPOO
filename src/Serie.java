public class Serie extends Midia{

    private String criador;
    private int temporadas;

    public Serie(String titulo, int ano, String criador, int temporadas) {
        super(titulo, ano);
        this.criador = criador;
        this.temporadas = temporadas;
    }

    // Métodos getters e setters
    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
