public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Musica musica = new Musica("Bohemian Rhapsody", 1975, "Queen", 355);
        Filme filme = new Filme("Pulp Fiction", 1994, "Quentin Tarantino", 154);
        Serie serie = new Serie("Stranger Things", 2016, "The Duffer Brothers", 4);

        // Atribuindo valores através dos métodos getters e setters
        System.out.println("Informações da música:");
        System.out.println("Título: " + musica.getTitulo());
        System.out.println("Ano: " + musica.getAno());
        System.out.println("Artista: " + musica.getArtista());
        System.out.println("Duração: " + musica.getDuracao() + " segundos");

        System.out.println();

        System.out.println("Informações do filme:");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Ano: " + filme.getAno());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");

        System.out.println();

        System.out.println("Informações da série:");
        System.out.println("Título: " + serie.getTitulo());
        System.out.println("Ano: " + serie.getAno());
        System.out.println("Criador: " + serie.getCriador());
        System.out.println("Temporadas: " + serie.getTemporadas());
    }
}
