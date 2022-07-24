package br.com.alura.apilinguagens.repositories;

import br.com.alura.apilinguagens.entities.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
}
