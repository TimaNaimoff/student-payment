package edu.adultproject.student.domain;

import javax.persistence.*;

@Entity
@Table(name="jc_student_order_tmp")
public class StudentOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="student_order_id")
    private Long studentOrderId;
    @AssociationOverrides({
               @AssociationOverride(name="address.street",joinColumns=@JoinColumn(name="h_street_code"))
    }
    )
    @AttributeOverrides({
            @AttributeOverride(name="surName",column=@Column(name="h_sur_name")),
            @AttributeOverride(name="givenName",column = @Column(name="h_given_name")),
            @AttributeOverride(name="patronymic",column=@Column(name="h_patronymic")),
            @AttributeOverride(name="dateOfBirth",column = @Column(name="h_date_of_birth")),
            @AttributeOverride(name="address.postIndex",column = @Column(name="h_post_index")),
            @AttributeOverride(name="address.building",column = @Column(name="h_bulding")),
            @AttributeOverride(name="address.extension",column = @Column(name="h_extension")),
            @AttributeOverride(name="address.apartment",column = @Column(name="h_apartament")),
            @AttributeOverride(name="passportSeria",column = @Column(name="h_passport_seria")),
            @AttributeOverride(name="passportNumber",column = @Column(name="h_passport_number")),
            @AttributeOverride(name="issueDate",column = @Column(name="h_passport_date")),

    })
    @Embedded
    private Adult husband;
    @AssociationOverrides({
            @AssociationOverride(name="address.street",joinColumns=@JoinColumn(name="w_street_code"))
    })
    @AttributeOverrides({
            @AttributeOverride(name="surName",column=@Column(name="w_sur_name")),
            @AttributeOverride(name="givenName",column = @Column(name="w_given_name")),
            @AttributeOverride(name="patronymic",column=@Column(name="w_patronymic")),
            @AttributeOverride(name="dateOfBirth",column = @Column(name="w_date_of_birth")),
            @AttributeOverride(name="address.postIndex",column = @Column(name="w_post_index")),
            @AttributeOverride(name="address.building",column = @Column(name="w_bulding")),
            @AttributeOverride(name="address.extension",column = @Column(name="w_extension")),
            @AttributeOverride(name="address.apartment",column = @Column(name="w_apartament")),
            @AttributeOverride(name="passportSeria",column = @Column(name="w_passport_seria")),
            @AttributeOverride(name="passportNumber",column = @Column(name="w_passport_number")),
            @AttributeOverride(name="issueDate",column = @Column(name="w_passport_date")),

    })
    @Embedded
    private Adult wife;

    public Long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(Long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }
}
