package br.com.ifpe.oxefood.api.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.categoriaproduto.CategoriaProduto;
import br.com.ifpe.oxefood.modelo.categoriaproduto.CategoriaProdutoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/categoriaproduto")
@CrossOrigin
public class CategoriaProdutoController {
    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    @ApiOperation(value = "Serviço responsável por salvar um entregador no sistema.")
    @PostMapping
    public ResponseEntity<CategoriaProduto> save(@RequestBody CategoriaProdutoRequest request) {

        CategoriaProduto categoria = categoriaProdutoService.save(request.build());
        return new ResponseEntity<CategoriaProduto>(categoria, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Serviço responsável por listar todos os entregadores do sistema.")
    @GetMapping
    public List<CategoriaProduto> findAll() {

        return categoriaProdutoService.findAll();
    }

    @ApiOperation(value = "Serviço responsável por obter um entregador referente ao ID passado na URL.")
    @GetMapping("/{id}")
    public CategoriaProduto findById(@PathVariable Long id) {

        return categoriaProdutoService.findById(id);
    }

    @ApiOperation(value = "Serviço responsável por atualizar um entregador referente ao ID passado na url.")

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaProduto> update(@PathVariable("id") Long id,
            @RequestBody CategoriaProdutoRequest request) {
        categoriaProdutoService.update(id, request.build());
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Serviço responsável por deletar um entregador referente ao ID passado na url.")

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoriaProduto> delete(@PathVariable Long id) {

        categoriaProdutoService.delete(id);
        return ResponseEntity.ok().build();

    }
}
