package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Pay {

    @Id //결제
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pay_num;

    @Column(name = "pay_price")
    private Integer pay_price;

    @Column(name = "pay_method")
    private String pay_method;

    @Column(name = "pay_date")
    private Date pay_date;

    @Column(name = "pay_state")
    private String pay_state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private ResvHistory id;




}
