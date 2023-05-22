public class Musica extends Midia{

    private String artista;
    private int duracao;

        public Musica(String titulo, int ano, String artista, int duracao) {
        super(titulo, ano);
            this.artista = artista;
            this.duracao = duracao;
        }

// Métodos getters e setters
        public String getArtista() {
            return artista;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }

        public int getDuracao() {
            return duracao;
        }
        public void setDuracao(int duracao) {
            this.duracao = duracao;
 }
}