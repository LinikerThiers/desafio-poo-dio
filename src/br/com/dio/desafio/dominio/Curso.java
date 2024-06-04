package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        adicionarRecompensa();
    }

    private void adicionarRecompensa() {
        String nomeRecompensa = "Recompensa do " + getTitulo();
        String descricaoRecompensa = "Recebe uma recompensa por concluir o curso " + getTitulo();
        double xpNecessario = calcularXp();
        Recompensa recompensa = new Recompensa(nomeRecompensa, descricaoRecompensa, xpNecessario);
        Recompensa.adicionarRecompensa(recompensa);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
