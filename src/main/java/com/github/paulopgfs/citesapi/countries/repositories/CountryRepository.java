package com.github.paulopgfs.citesapi.countries.repositories;

import com.github.paulopgfs.citesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}