package com.projetowendreo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowendreo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
