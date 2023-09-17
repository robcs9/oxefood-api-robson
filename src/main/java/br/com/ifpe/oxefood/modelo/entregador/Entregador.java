package br.com.ifpe.oxefood.modelo.entregador;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Entregador")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel  {

   @Column
   private String nome;
   
   @Column
   private LocalDate dataNascimento;

   @Column
   private String cpf;

   @Column
   private String foneCelular;

   @Column
   private String foneFixo;

   @Column
   private String rg;
   
   @Column
   private Integer qtdEntregas;
   
   @Column
   private Double valorFrete;
   
   @Column
   private String rua;
   
   @Column
   private Integer numero;
   
   @Column
   private String bairro;
   
   @Column
   private String cidade;
   
   @Column
   private String cep;
   
   @Column
   private String estado;
   
   @Column
   private String complemento;

   @Column
   private Boolean ativo;

}
