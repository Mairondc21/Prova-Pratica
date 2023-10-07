package br.com.newtonpaiva.domain.q01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ListaLigada {
    public void adiciona(String link){
        lista.add(link);
    }
    List<String> lista = new LinkedList<>();
    public void remover(String link){
        if(link == link){
            lista.remove(link);
            System.out.println("removido com sucesso");
        }else {
            throw new IllegalArgumentException("link nao existe");
        }
    }
   public void consulta(String link){
        if (lista.contains(link)){
            System.out.println("link encontrado");
        }else {
            System.out.println("Link não encontrado");
        }
   }
}
