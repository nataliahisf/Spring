package br.org.generation.minhalojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.minhalojadegames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> 
{
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}