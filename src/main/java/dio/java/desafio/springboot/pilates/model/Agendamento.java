package dio.java.desafio.springboot.pilates.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instrutor instrutor;
    private Cliente cliente;
    private Date dataHora;
}
