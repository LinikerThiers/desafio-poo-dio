import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        mentoria.setCargaHoraria(2);


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLiniker = new Dev("Liniker");
        devLiniker.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Liniker " + devLiniker.getConteudosInscritos());
        devLiniker.progredir();
        devLiniker.progredir();
        System.out.println("Conteudos Inscritos Liniker " + devLiniker.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Liniker " + devLiniker.getConteudosConcluidos());
        System.out.println("Recompensas de " + devLiniker.getNome() + ": " + devLiniker.getRecompensas());
        System.out.println("XP: " + devLiniker.calcularTotalXp());

        System.out.println(" ");
        Dev devMaria = new Dev("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteudos Inscritos Maria " + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Maria " + devMaria.getConteudosConcluidos());
        System.out.println("Recompensas de " + devMaria.getNome() + ": " + devMaria.getRecompensas());
        System.out.println("XP: " + devMaria.calcularTotalXp());

    }
}
