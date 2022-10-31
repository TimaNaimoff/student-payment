package edu.adultproject.student.dao;

import edu.adultproject.student.domain.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<Street,Long> {

}
