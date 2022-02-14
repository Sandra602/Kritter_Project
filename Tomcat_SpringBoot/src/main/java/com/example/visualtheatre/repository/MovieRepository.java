package com.example.visualtheatre.repository;


import com.example.visualtheatre.domain.booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.
public interface MovieRepository extends JpaRepository<booking,Long> {

}
