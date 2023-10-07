package br.com.newtonpaiva.domain.q01;

import br.com.newtonpaiva.domain.q01.ListaLigada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class TestaQuestao01 {
    public static void main(String[] args) throws FileNotFoundException {
        ListaLigada lista = new ListaLigada();

        Scanner scanner;
        scanner = new Scanner(new File("C:\\Users\\12111752\\Downloads\\Lista_URL.txt"));

        while (scanner.hasNext()) {
            lista.adiciona(scanner.nextLine());

        }
        Iterator iterator = lista.lista.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }
        lista.remover("https://www.facebook.com");

        System.out.println("----------------------------");

        lista.lista.forEach(link->{
            System.out.println(link);
        });

        lista.consulta("https://www.google.com");
    }
}
