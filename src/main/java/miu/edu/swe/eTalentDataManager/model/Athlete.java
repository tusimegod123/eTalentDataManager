package miu.edu.swe.eTalentDataManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long athleteId;
    @Column(unique = true, nullable = false)
    @NotBlank(message = "The ssn is a required field")
    private  String ssn;
    @NotBlank(message = "Full Name is a required field")
    private String fullName;
    private  String phoneNumber;
    @NotNull(message = "Date of birth is  a required field")
    private LocalDate dateOfBirth;
    @NotNull(message = "Date of registration is  a required field")
    private LocalDate dateOfRegistration;
    @NotNull(message = "Total number of medals won is  a required field")
    private  Integer totalNumberOfMedalsWon;
    @NotNull(message = "monthly Salary is  a required field")
    private  Double monthlySalary;
    private  String emailAddress;

    public Athlete() {
    }

    public Athlete(Long athleteId, String ssn, String fullName, String phoneNumber, LocalDate dateOfBirth, LocalDate dateOfRegistration, Integer totalNumberOfMedalsWon, Double monthlySalary, String emailAddress) {
        this.athleteId = athleteId;
        this.ssn = ssn;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.dateOfRegistration = dateOfRegistration;
        this.totalNumberOfMedalsWon = totalNumberOfMedalsWon;
        this.monthlySalary = monthlySalary;
        this.emailAddress = emailAddress;
    }



    //    athleteId: long, (Primary Key field)
//    ssn, (required field; unique) (This is social Security Number e.g. 123-45-67,
//            123-45-68, etc.)
//
//    fullName, (required field) (e.g. Usain Bolt, Anna-Marie Rodriquez etc.)
//    phoneNumber, (optional field)
//    dateOfBirth, (required field) (e.g. 1996-12-3, 2000-5-21, etc.)
//    dateOfRegistration, (required field) (This date is the date that the athlete was
//    registered with APM. e.g. 2014-1-4, 2018-6-27, etc.)
//    totalNumberOfMedalsWon, (required field) (This data field represents the total
//    number of medals the athlete has won, in the various top-rated athletics competitions
//    which they have participated in).
//    monthlySalary, (required field)
//    emailAddress, (optional field)


}
