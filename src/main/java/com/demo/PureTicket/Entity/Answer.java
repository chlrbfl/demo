package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

public class Answer {

    //
    @Id //답변번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answer_num;


    @Column(name = "answer_title")
    private String answer_title;

    @Column(name = "answer_date")
    private Date answer_date;

    @Column(name = "answer_state")
    private String answer_state;

    @OneToOne(mappedBy = "qna_num")
    private Qna qna_num;

    @Lob
    private byte[] answer_content;




}
