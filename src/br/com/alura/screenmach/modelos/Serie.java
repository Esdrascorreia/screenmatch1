package br.com.alura.screenmach.modelos;

public class Serie extends Titulo {
    private  int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int mintosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMintosPorEpisodio() {
        return mintosPorEpisodio;
    }

    public void setMintosPorEpisodio(int mintosPorEpisodio) {
        this.mintosPorEpisodio = mintosPorEpisodio;
    }

    @Override /*sobre escrita*/
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * mintosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}


