import br.com.dio.projeto.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria() {
        };
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRosenir = new Dev();
        devRosenir.setNome("Rosenir");
        devRosenir.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rosenir" + devRosenir.getConteudosInscritos());
        devRosenir.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rosenir" + devRosenir.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rosenir" + devRosenir.getConteudosConcluidos());
        System.out.println("XP: " + devRosenir.calcularTotalXp());

        System.out.println("------");

        Dev devIago = new Dev();
        devIago.setNome("Iago");
        devIago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Iago" + devIago.getConteudosInscritos());
        devIago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Iago" + devIago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Iago" + devIago.getConteudosConcluidos());
        System.out.println("XP: " + devIago.calcularTotalXp());

    }
}

