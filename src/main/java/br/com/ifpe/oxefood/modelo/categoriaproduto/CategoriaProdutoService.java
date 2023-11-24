package br.com.ifpe.oxefood.modelo.categoriaproduto;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.modelo.produto.Produto;
import br.com.ifpe.oxefood.modelo.produto.ProdutoRepository;

@Service
public class CategoriaProdutoService {
    @Autowired
    private CategoriaProdutoRepository repository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional
    public CategoriaProduto save(CategoriaProduto categoria) {

        categoria.setHabilitado(Boolean.TRUE);
        categoria.setVersao(1L);
        categoria.setDataCriacao(LocalDate.now());
        return repository.save(categoria);
    }

    public List<CategoriaProduto> findAll() {
        
        return repository.findAll();
    }

    public CategoriaProduto findById(Long id) {

        return repository.findById(id).get();
    }

    public void update(Long id, CategoriaProduto categoriaAlterado) {

        CategoriaProduto categoria = repository.findById(id).get();
        categoria.setDescricao(categoriaAlterado.getDescricao());

        categoria.setVersao(categoria.getVersao() + 1);
        repository.save(categoria);
    }

    @Transactional
    public void delete(Long id) {

        CategoriaProduto categoria = repository.findById(id).get();
        
        /* List<Produto> produtos = produtoRepository.findAll();
        if (produtos.size() > 0) {
            throw new CategoriaProdutoException("Não é permitido deletar uma categoria que contenha produtos")
        } */

        categoria.setHabilitado(Boolean.FALSE);
        categoria.setVersao(categoria.getVersao() + 1);

        repository.save(categoria);
    }
}
