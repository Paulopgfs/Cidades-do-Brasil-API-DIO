package com.github.paulopgfs.citesapi.countries.resources;

import java.util.Optional;

import com.github.paulopgfs.citesapi.countries.entities.Country;
import com.github.paulopgfs.citesapi.countries.repositories.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }



    @GetMapping("/countries")
    public Page<Country> country(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }


    }
}
