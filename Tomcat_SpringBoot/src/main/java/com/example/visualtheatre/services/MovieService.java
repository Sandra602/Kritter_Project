package com.example.visualtheatre.services;

import com.example.visualtheatre.domain.booking;
import com.example.visualtheatre.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repo;
    public List<booking> listAll() {
        return repo.findAll();
    }

    public void save(booking std) {
        repo.save(std);
    }

    public booking get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}

