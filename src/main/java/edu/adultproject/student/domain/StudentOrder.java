package edu.adultproject.student.domain;

import javax.persistence.*;

@Entity
@Table(name="jc_student_order_tmp")
public class StudentOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="student_order_id")
    private Long studentOrderId;

    @AttributeOverrides({
            @AttributeOverride(name="surName",column=@Column(name="h_sur_name")),
            @AttributeOverride(name="givenName",column = @Column(name="h_given_name")),
            @AttributeOverride(name="patronymic",column=@Column(name="h_patronymic")),
            @AttributeOverride(name="dateOfBirth",column = @Column(name="h_date_of_birth")),
            @AttributeOverride(name="address.postIndex",column = @Column(name="h_post_index")),
            @AttributeOverride(name="address.building",column = @Column(name="h_bulding")),
            @AttributeOverride(name="address.extension",column = @Column(name="h_extension")),
            @AttributeOverride(name="address.apartment",column = @Column(name="h_apartament"))


    })
    private Person husband;
    @AttributeOverrides({
            @AttributeOverride(name="surName",column=@Column(name="w_sur_name")),
            @AttributeOverride(name="givenName",column = @Column(name="w_given_name")),
            @AttributeOverride(name="patronymic",column=@Column(name="w_patronymic")),
            @AttributeOverride(name="dateOfBirth",column = @Column(name="w_date_of_birth")),
            @AttributeOverride(name="address.postIndex",column = @Column(name="w_post_index")),
            @AttributeOverride(name="address.building",column = @Column(name="w_bulding")),
            @AttributeOverride(name="address.extension",column = @Column(name="w_extension")),
            @AttributeOverride(name="address.apartment",column = @Column(name="w_apartament"))
    })
    private Person wife;

    public Long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(Long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Person getHusband() {
        return husband;
    }

    public void setHusband(Person husband) {
        this.husband = husband;
    }

    public Person getWife() {
        return wife;
    }

    public void setWife(Person wife) {
        this.wife = wife;
    }
}
