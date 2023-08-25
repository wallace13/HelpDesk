package com.example.demo.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}