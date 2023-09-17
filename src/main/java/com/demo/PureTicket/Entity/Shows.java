package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = 'user')


public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer show_num; //공연번호

    @Column(name = "show_name")
    private String show_name;

    @Column(name = "show_ven")
    private String show_ven;

    @Column(name = "show_cast")
    private String show_cast;

    @Column(name = "show_period")
    private Date show_period;

    
    @Column(name = "show_running_time")
    private String show_running_time;

    @Column(name = "show_grade")
    private String show_grade;

    @Column(name = "schedule_time")
    private String schedule_time;

    @OneToOne(mappedBy = "SeatGrade")
    private SeatGrade seat_grade;

    @OneToOne(mappedBy = "SeatGrade")
    private SeatGrade seat_price;

    @Column(name = "show_date")
    private SeatGrade show_date;

    @OneToMany(mappedBy = "post_num")
    private List<Genre> genre = new ArrayList<>();




    //좌석등급
    //가격



}
