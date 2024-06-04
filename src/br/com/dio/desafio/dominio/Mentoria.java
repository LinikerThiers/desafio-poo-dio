package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public Mentoria() {
    }

    private void adicionarRecompensa() {
        String nomeRecompensa = "Recompensa da Mentoria " + getTitulo();
        String descricaoRecompensa = "Recebe uma recompensa por concluir a mentoria " + getTitulo();
        double xpNecessario = calcularXp();
        Recompensa recompensa = new Recompensa(nomeRecompensa, descricaoRecompensa, xpNecessario);
        Recompensa.adicionarRecompensa(recompensa);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        adicionarRecompensa();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
