package br.com.japahatake.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity (name = "tb_Users")

public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id; 
    /* cara é importante a questao das linhas, os componentes certos devem estar proximo na medida certa kkk
    eu sei que é ridiculo, mas é importante*/
    @Column (unique = true) // nao repetir na tabela, e é dados unicos dentro da username
    private String username; // para deixar como usuario na tabela do banco, era usar o @Column e definir entre () o nome
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;

}
