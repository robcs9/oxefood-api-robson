package br.com.ifpe.oxefood.api.cliente;

<<<<<<< HEAD
=======
import javax.validation.Valid;

>>>>>>> 665f385b391b3040a398ee2cd2bd709272403263
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import br.com.ifpe.oxefood.modelo.cliente.ClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin
public class ClienteController {
<<<<<<< HEAD

   @Autowired
=======
    @Autowired
>>>>>>> 665f385b391b3040a398ee2cd2bd709272403263
   private ClienteService clienteService;

   @PostMapping
   public ResponseEntity<Cliente> save(@RequestBody ClienteRequest request) {

       Cliente cliente = clienteService.save(request.build());
       return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
   }
<<<<<<< HEAD
=======

>>>>>>> 665f385b391b3040a398ee2cd2bd709272403263
}
