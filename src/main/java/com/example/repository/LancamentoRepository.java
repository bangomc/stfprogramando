package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
