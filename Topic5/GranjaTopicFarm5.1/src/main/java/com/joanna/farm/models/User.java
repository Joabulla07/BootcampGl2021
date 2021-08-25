package com.joanna.farm.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
public class User {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;

    @Column(unique=true)
    private String nickName;

    @Column(unique = true)
    private String mail;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyy")
    private LocalDate fechaAlta;

    private String ciudad;
    private String provincia;
    private String pais;


    @JsonIgnore
    public String getPassword() {

        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}