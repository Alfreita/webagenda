package br.com.victor.jpa;

import br.com.victor.tarefas.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BuscaTarefas {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        Query query = manager
                .createQuery("select t from Tarefa as t "+
                        "where t.finalizado = :paramFinalizado");
        query.setParameter("paramFinalizado", true);

        List<Tarefa> lista = query.getResultList();

        for (Tarefa t : lista) {
            System.out.println(t.getDescricao());
        }

        manager.close();
    }
}
