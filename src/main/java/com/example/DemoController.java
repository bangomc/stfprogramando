package com.example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Lancamento;
import com.example.repository.LancamentoRepository;

@RestController
@CrossOrigin(origins="*")
public class DemoController {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@RequestMapping("/")
    public String greet() {
     return "Olha o STF-Programando com Spring boot no Heroku com Docker pq no GAE comecou a cobrar!";
    }
	
	@RequestMapping("/lancamento")
	public List<Lancamento> lancamentos() {
		return lancamentoRepository.findAll();
	}
	
	@PostMapping("/lancamento")
	public Lancamento inc(@RequestBody Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}
	
	
}
