package com.devdynamos.repository;


import com.devdynamos.entity.Twit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitRepository extends JpaRepository<Twit, Long> {
}
