package br.com.exacta.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exacta.desafio.model.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long>{
	
	

}
