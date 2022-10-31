package edu.adultproject.student.business;
import edu.adultproject.student.dao.StreetRepository;
import edu.adultproject.student.dao.StudentRepository;

import edu.adultproject.student.domain.*;
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
    @Autowired
    StreetRepository streetRepo;

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
    private Adult buildPerson(boolean wife){
        Adult person=new Adult();
        person.setDateOfBirth(LocalDate.now());
        if(wife){
            person.setSurName("Пирожкова");
            person.setGivenName("Анастасия");
            person.setPatronymic("Булкинс");
            person.setPassportSeria("WIFE_S");
            person.setPassportNumber("WIFE_N");
            person.setIssueDate(LocalDate.now());
        }else{
            person.setSurName("Бакланов");
            person.setGivenName("Кирилл");
            person.setPatronymic("Булкинс");
            person.setPassportSeria("HUSBAND_S");
            person.setPassportNumber("HUSBAND_N");
            person.setIssueDate(LocalDate.now());
        }
        Street street=streetRepo.getOne(1L);
        Address a=new Address();
        a.setStreet(street);
        a.setPostIndex("190000");
        a.setBuilding("25");
        a.setExtension("666");
        a.setApartment("A");
        person.setAddress(a);
        return person;
    }
}
