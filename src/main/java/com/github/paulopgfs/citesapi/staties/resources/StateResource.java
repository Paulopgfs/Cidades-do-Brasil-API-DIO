package com.github.paulopgfs.citesapi.staties.resources;

import java.util.List;

import com.github.paulopgfs.citesapi.staties.entities.State;
import com.github.paulopgfs.citesapi.staties.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}
