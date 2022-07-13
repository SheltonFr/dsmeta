package com.shelton.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shelton.dsmeta.entities.Sale;

// Componete do sistema, responsavel por acessar  banco de dados (+/- como o DAO)

public interface SaleRepository extends JpaRepository<Sale, Long> { //<Tipo do objecto(classe), Tipo da chave Primaria>
	
	// estendendo a interface JpaRepository, temos acesso a todos os metodos necessarios para interagir com o banco (pesquisa, isercao......etc...)
		
}
