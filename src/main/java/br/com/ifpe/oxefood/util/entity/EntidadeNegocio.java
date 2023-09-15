package br.com.ifpe.oxefood.util.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@MappedSuperclass
<<<<<<< HEAD
public abstract class EntidadeNegocio implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;

   @JsonIgnore
   @Column
   private Boolean habilitado;
  
=======

public abstract class EntidadeNegocio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JsonIgnore
    @Column
    private Boolean habilitado;

>>>>>>> 665f385b391b3040a398ee2cd2bd709272403263
}
