package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ResvCancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cancel_money")
    private Integer cancel_money;

    @OneToOne(mappedBy = "ResvHistory")
    private ResvHistory resv_num;

    @OneToOne(mappedBy = "Pay")
    private ResvHistory pay_num;







}
