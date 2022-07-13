package com.shelton.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shelton.dsmeta.entities.Sale;
import com.shelton.dsmeta.repositories.SaleRepository;

// componente responsavel por fazer operacoes com vendas
@Service
public class SaleService {

	@Autowired
	private SaleRepository repository; // é como se fosse um DAO para a classe Sale
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
