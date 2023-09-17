package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer post_num;


}

// ('뮤지컬/연극','콘서트','전시/행사','스포츠')