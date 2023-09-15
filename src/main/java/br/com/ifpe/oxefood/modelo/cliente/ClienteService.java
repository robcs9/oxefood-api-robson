package br.com.ifpe.oxefood.modelo.cliente;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
<<<<<<< HEAD

   @Autowired
   private ClienteRepository repository;

   @Transactional
   public Cliente save(Cliente cliente) {

       cliente.setHabilitado(Boolean.TRUE);
       cliente.setVersao(1L);
       cliente.setDataCriacao(LocalDate.now());
       return repository.save(cliente);
   }
=======
    @Autowired
    private ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente) {

        cliente.setHabilitado(Boolean.TRUE);
        cliente.setVersao(1L);
        cliente.setDataCriacao(LocalDate.now());
        return repository.save(cliente);
    }
>>>>>>> 665f385b391b3040a398ee2cd2bd709272403263

}
