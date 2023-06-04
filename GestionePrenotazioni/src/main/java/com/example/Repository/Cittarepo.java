package com.example.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.citta;

public interface Cittarepo extends PagingAndSortingRepository<citta, Long> {
public Page<citta> findByNome(String nome, Pageable pageable);
}
