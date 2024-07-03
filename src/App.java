import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class App {

  public static void main(String[] args) throws Exception {
    Curso curso1 = new Curso();

    curso1.setTitulo("Curso java");
    curso1.setDescricao("descrição do curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

    curso2.setTitulo("Curso javascript");
    curso2.setDescricao("descrição do curso javascript");
    curso2.setCargaHoraria(12);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("mentoria  descricao java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp em java");
    bootcamp.setDescricao("Descricao bootcamp java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devLuiza = new Dev();
    devLuiza.setNome("Luiza");
    devLuiza.inscreverBooticamp(bootcamp);
    System.out.println(
      "Conteudo inscritos de luiza: " + devLuiza.getConteudosInscritos()
    );
    devLuiza.progredir();
    System.out.println(
      "Conteudo concluidos de luiza: " + devLuiza.getConteudosConcluidos()
    );
    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscreverBooticamp(bootcamp);
    devJoao.progredir();
    System.out.println(
      "Conteudo concluidos de joao: " + devJoao.getConteudosConcluidos()
    );
  }
}
