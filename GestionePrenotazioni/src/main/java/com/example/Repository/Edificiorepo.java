package com.example.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Edificio;


public interface Edificiorepo extends PagingAndSortingRepository<Edificio, Long> {
	public Page<Edificio> findByNome(String nome, Pageable pageable);
	public Page<Edificio> findByCity(String nome, Pageable pageable);
}
