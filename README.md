# Desafio de Projeto: Bootcamp DIO

Este projeto é uma implementação de um sistema de gerenciamento de Bootcamps, Cursos, Mentorias, Desenvolvedores, desenvolvido como parte de um desafio do Bootcamp da DIO. Com a inclusão de recompensas que serão adquiridas após a conclusão de uma etapa do Bootcamp.

## Estrutura do Projeto

O projeto está dividido nas seguintes classes principais:

### Classes Principais

- **Curso**: Representa um curso com título, descrição e carga horária.
- **Mentoria**: Representa uma mentoria com título, descrição e data.
- **Recompensa**: Representa uma recompensa com nome, descrição e experiência necessária para obtê-la.
- **Conteudo**: Classe abstrata que define os métodos comuns entre Curso e Mentoria.
- **Bootcamp**: Representa um Bootcamp com nome, descrição, data inicial, data final, conjunto de desenvolvedores inscritos e conjunto de conteúdos.
- **Dev**: Representa um desenvolvedor com nome, conjunto de conteúdos inscritos, conjunto de conteúdos concluídos e conjunto de recompensas obtidas. Possui métodos para inscrever-se em Bootcamps, progredir e calcular XP total.

### Estrutura de Pacotes

- `br.com.dio.desafio.dominio`: Contém todas as classes do domínio do desafio.

## Tecnologia Utilizada
- Java 21
<div>
   <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="45px" heigth="45px" />
</div>

## Requisitos
- Java 21 ou superior
- IntelliJ IDEA ou outra IDE Java

## Como Executar
- Clone o repositório
- Abra o projeto em sua IDE.
- Execute a classe Main para ver o exemplo em ação.
          
## Funcionalidades

### Curso

- `Curso` é uma subclasse de `Conteudo` que inclui um atributo de carga horária.
- Método `calcularXp` calcula a experiência baseada na carga horária.

### Mentoria

- `Mentoria` é uma subclasse de `Conteudo` que inclui um atributo de data.
- Método `calcularXp` retorna um valor fixo de experiência.

### Recompensa

- `Recompensa` representa uma recompensa com nome, descrição e experiência necessária para obtê-la.
- Métodos estáticos para adicionar recompensas e obter todas as recompensas disponíveis.

### Bootcamp

- Inclui um nome, descrição, data inicial, data final, conjunto de desenvolvedores inscritos e conjunto de conteúdos.
- Data final é calculada automaticamente como 45 dias após a data inicial.

### Dev

- Possui métodos para inscrever-se em Bootcamps, progredir no conteúdo, calcular a XP total e obter recompensas.
- Métodos para exibir conteúdos inscritos e concluídos.
  
## Exemplo de Uso

```java
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
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLiniker = new Dev();
        devLiniker.setNome("Liniker");
        devLiniker.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Liniker: " + devLiniker.getConteudosInscritos());
        devLiniker.progredir();
        devLiniker.progredir();
        System.out.println("Conteúdos Inscritos Liniker: " + devLiniker.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Liniker: " + devLiniker.getConteudosConcluidos());
        System.out.println("Recompensas de Liniker: " + devLiniker.getRecompensas());
        System.out.println("XP: " + devLiniker.calcularTotalXp());

        System.out.println(" ");
        
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("Recompensas de Maria: " + devMaria.getRecompensas());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
