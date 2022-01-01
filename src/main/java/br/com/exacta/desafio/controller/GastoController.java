 package br.com.exacta.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exacta.desafio.exception.GastoNaoEncontradoException;
import br.com.exacta.desafio.model.Gasto;
import br.com.exacta.desafio.repository.GastoRepository;

@RestController
@RequestMapping("/api/v1/")
/** Consideracoes da classe
 * - Criar um gasto.
 * - Listar todos os gastos. 
 * - Listar um gasto por id.
 */
public class GastoController {
	
	@Autowired
	 private GastoRepository repository;
	
	@PostMapping("gasto")
	// - Criar um gasto.
	public Gasto criarGasto(@RequestBody Gasto gasto) {
		return this.repository.save(gasto);
	}
	
	@GetMapping("gastos")
	// - Listar todos os gastos. 
	public List<Gasto> listarTodosGastos(){
		return this.repository.findAll();
	}
	
	@GetMapping("gastos/{id}")
	// - Listar um gasto por id.
	public ResponseEntity<Gasto> buscarGastoId(@PathVariable(value = "id") Long idGasto) 
			throws GastoNaoEncontradoException{
		Gasto gasto = this.repository.findById(idGasto).orElseThrow(() -> new GastoNaoEncontradoException("Nao encontramos o gasto "+idGasto));
		return ResponseEntity.ok(gasto);
	}
	
}
