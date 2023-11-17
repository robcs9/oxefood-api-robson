package br.com.ifpe.oxefood.api.fornecedor;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.fornecedor.Fornecedor;
import br.com.ifpe.oxefood.modelo.fornecedor.FornecedorService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/fornecedor")
@CrossOrigin
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @ApiOperation(value = "Serviço responsável por salvar um fornecedor no sistema.")
    @PostMapping
    public ResponseEntity<Fornecedor> save(@RequestBody FornecedorRequest request) {

        Fornecedor fornecedor = fornecedorService.save(request.build());
        return new ResponseEntity<Fornecedor>(fornecedor, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Serviço responsável por listar todos os fornecedores do sistema.")
    @GetMapping
    public List<Fornecedor> findAll() {
        return fornecedorService.findAll();
    }

    @GetMapping("/{id}")
    public Fornecedor findById(@PathVariable("id") Long id) {
        return fornecedorService.findById(id);
    }

    /*
     * @PutMapping("/{id}")
     * public ResponseEntity<Cliente> update(@PathVariable("id") Long
     * id, @RequestBody FornecedorRequest request) {
     * 
     * fornecedorService.update(id, request.build());
     * return ResponseEntity.ok().build();
     * }
     */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        fornecedorService.delete(id);
        return ResponseEntity.ok().build();
    }

}
