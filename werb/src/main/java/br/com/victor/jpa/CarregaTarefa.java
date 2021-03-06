package br.com.victor.jpa;

import br.com.victor.tarefas.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarregaTarefa {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.
               createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        Tarefa encontrada = manager.find(Tarefa.class, 1L);
        System.out.println(encontrada.getDescricao());

        manager.close();
    }
}
