package com.projetowendreo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowendreo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
