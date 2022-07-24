package br.com.alura.apilinguagens.controllers;

import br.com.alura.apilinguagens.entities.Linguagem;
import br.com.alura.apilinguagens.repositories.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/")
public class LinguagemController {
    
    @Autowired
    private LinguagemRepository repository;
    
    /**
     * Retorna lista de objetos Linguagem no formato JSON
     * @return List
     */
    @GetMapping("linguagens")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }
    
    @PostMapping("linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repository.save(linguagem);
        return linguagemSalva;
    }
    
    @GetMapping("linguagens/")
    public Optional<Linguagem> buscaPorId(@RequestParam String id){
        return repository.findById(id);
    }
    
    @PutMapping("linguagens")
    public void alterarRegistro(@RequestParam String id, @RequestBody Linguagem linguagem){
        buscaPorId(id).map(Linguagem -> {
            linguagem.setId(id);
           return repository.save(linguagem);
        });
    }
    
    @DeleteMapping("linguagens")
    public void excluirRegistro(@RequestParam String id){
         if(repository.existsById(id)){
             repository.deleteById(id);
             System.out.println("Registro excluído.");
         } else {
             System.out.println("Nenhum registro com esse ID.");
         }
        
    }
}
