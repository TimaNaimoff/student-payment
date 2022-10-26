package edu.adultproject.student.business;
import edu.adultproject.student.dao.StudentRepository;

import edu.adultproject.student.domain.Address;
import edu.adultproject.student.domain.Person;
import edu.adultproject.student.domain.StudentOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentOrderService {

    private static final Logger LOG= LoggerFactory.getLogger(StudentOrderService.class);

    @Autowired
    private StudentRepository repo;

    @Transactional
    public void testSave(){
        StudentOrder so=new StudentOrder();
        so.setHusband(buildPerson(false));
        so.setWife(buildPerson(true));
        repo.save(so);
    }

    @Transactional
    public void testGet(){
        List<StudentOrder> sos = repo.findAll();
        LOG.info(sos.get(0).getWife().getGivenName());

    }
    private Person buildPerson(boolean wife){
        Person person=new Person();
        person.setDateOfBirth(LocalDate.now());
        if(wife){
            person.setSurName("Пирожкова");
            person.setGivenName("Анастасия");
            person.setPatronymic("Булкинс");
            Address a=new Address();
            a.setPostIndex("190000");
            a.setBuilding("25");
            a.setExtension("666");
            a.setApartment("A");
            person.setAddress(a);
        }else{
            person.setSurName("Бакланов");
            person.setGivenName("Кирилл");
            person.setPatronymic("Булкинс");
        }
        return person;
    }
}
