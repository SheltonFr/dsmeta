package com.shelton.dsmeta.repositories;


import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shelton.dsmeta.entities.Sale;

// Componete do sistema, responsavel por acessar  banco de dados (+/- como o DAO)

public interface SaleRepository extends JpaRepository<Sale, Long> { //<Tipo do objecto(classe), Tipo da chave Primaria>
	
	// estendendo a interface JpaRepository, temos acesso a todos os metodos necessarios para interagir com o banco (pesquisa, isercao......etc...)
	

	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
}
