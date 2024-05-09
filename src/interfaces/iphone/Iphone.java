package interfaces.iphone;

import interfaces.navegador.Navegador;
import interfaces.reprodutor.Reprodutor;
import interfaces.telefone.Telefone;

import java.util.Scanner;

public class Iphone implements Reprodutor, Telefone, Navegador {
  Scanner sc = new Scanner(System.in);
  private String musica;
  char escolha;

  // DONE reprodutor
  @Override
  public void selecionarMusica() {

    System.out.print("selecione a música: ");

    musica = sc.nextLine();
    System.out.println("selecionada: " + musica);

    System.out.println();

    System.out.print("tocar " + musica + "? (S/N) ");
    escolha = sc.nextLine().charAt(0);

    if (escolha == 'S' || escolha == 's') {
      tocar();
    } else {
      System.out.println("escolha uma música!");
      selecionarMusica();
    }

  }

  @Override
  public void tocar() {
    System.out.println("tocando: " + musica + "!");
  };

  @Override
  public void pausar() {
    System.out.println("musica pausada!");

  }

  // DONE: telefone

  @Override
  public void ligar() {
    // DONE: ligar
    System.out.println("ligando!");
  }

  @Override
  public void atender() {
    // DONE atender
    System.out.println("estão te ligando!");
    System.out.print(".");
    System.out.print("..");
    System.out.print("...");
    System.out.println("atendendo!");
  }

  @Override
  public void iniciarCorreio() {
    // DONE correio
    System.out.println("iniciando correio de voz!");
  }

  // NAVEGADOR

  @Override
  public void exibirPagina() {
    System.out.println("exibindo página...");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("adicionando uma nova página!");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("atualizando página!");
  }

}
