package com.example.demo.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}