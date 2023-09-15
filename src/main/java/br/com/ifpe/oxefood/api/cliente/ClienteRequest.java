package br.com.ifpe.oxefood.api.cliente;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
<<<<<<< HEAD

   private String nome;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;

   private String cpf;

   private String foneCelular;

   private String foneFixo;

   public Cliente build() {
       return Cliente.builder()
               .nome(nome)
               .dataNascimento(dataNascimento)
               .cpf(cpf)
               .foneCelular(foneCelular)
               .foneFixo(foneFixo)
               .build();
   }
=======
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    private String cpf;

    private String foneCelular;

    private String foneFixo;

    public Cliente build() {

        return Cliente.builder()
                .nome(nome)
                .dataNascimento(dataNascimento)
                .cpf(cpf)
                .foneCelular(foneCelular)
                .foneFixo(foneFixo)
                .build();
    }

>>>>>>> 665f385b391b3040a398ee2cd2bd709272403263
}
