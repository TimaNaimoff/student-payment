package edu.adultproject.student.dao;

import edu.adultproject.student.domain.StudentOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentOrder,Long> {

}
