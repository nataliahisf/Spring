package br.org.generationalune.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generationalune.blogpessoal.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {   
    public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
    
    public Optional<Tema> findByDescricao(String string);

}