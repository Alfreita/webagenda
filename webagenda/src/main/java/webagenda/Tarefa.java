package webagenda;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa {
	
		@Id
		@GeneratedValue
		private Long id;
	    private String descricao;
	    private boolean finalizado;
	    
	    @Temporal(TemporalType.DATE)
	    private Calendar dataFinalizacao;

}
