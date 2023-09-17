package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SeatGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "seat_grade")
    private String seat_grade;

    @Column(name = "grade_price")
    private String grade_price;



}
