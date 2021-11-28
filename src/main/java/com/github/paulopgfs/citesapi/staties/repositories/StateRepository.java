package com.github.paulopgfs.citesapi.staties.repositories;


import com.github.paulopgfs.citesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
