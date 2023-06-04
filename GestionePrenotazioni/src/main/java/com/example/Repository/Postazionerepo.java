package com.example.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Edificio;
import com.example.model.Postazione;
import com.example.model.citta;


public interface Postazionerepo extends PagingAndSortingRepository<Postazione, Long> {
	public Page <Postazione> FindbyEdificio (citta paese);
}
