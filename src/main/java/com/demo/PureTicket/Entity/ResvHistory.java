package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

public class ResvHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String resv_num; //예매번호

    @Column(name = "resv_date")
    private Date resv_date;

    @Column(name = "resv_seat")
    private String resv_seat;

    @Column(name = "ticket_price")
    private Integer ticket_price;

    @Column(name = "ticket_count")
    private Integer ticket_count;

    @OneToOne(mappedBy = "pay_date")
    private Pay pay_date;

    @OneToOne(mappedBy = "pay_state")
    private Pay pay_state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User id;










}
