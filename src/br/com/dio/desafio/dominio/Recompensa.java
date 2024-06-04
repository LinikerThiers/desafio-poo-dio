package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Recompensa {
    private String nome;
    private String descricao;
    private double xpNecessario;

    private static List<Recompensa> todasRecompensas = new ArrayList<>();

    public Recompensa(String nome, String descricao, double xpNecessario) {
        this.nome = nome;
        this.descricao = descricao;
        this.xpNecessario = xpNecessario;
    }

    public static void adicionarRecompensa(Recompensa recompensa) {
        todasRecompensas.add(recompensa);
    }

    public static List<Recompensa> getTodasRecompensas() {
        return todasRecompensas;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getXpNecessario() {
        return xpNecessario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recompensa that = (Recompensa) o;
        return Double.compare(that.xpNecessario, xpNecessario) == 0 && Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, xpNecessario);
    }

    @Override
    public String toString() {
        return "Recompensa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", xpNecessario=" + xpNecessario +
                '}';
    }
}
