package br.com.victor.jpa;

import br.com.victor.tarefas.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

public class AdicionaTarefa {


        public static void main(String[] args) {

            Tarefa tarefa = new Tarefa();
            tarefa.setDescricao("teste");
            tarefa.setFinalizado(true);
            tarefa.setDataFinalizacao(Calendar.getInstance());

            EntityManagerFactory factory = Persistence.
                    createEntityManagerFactory("tarefas");
            EntityManager manager = factory.createEntityManager();

            manager.getTransaction().begin();
            manager.persist(tarefa);
            manager.getTransaction().commit();

            System.out.println("ID da tarefa: " + tarefa.getId());

            manager.close();
        }
}
