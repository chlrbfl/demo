package com.demo.PureTicket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Qna {

    @Id //문의번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qna_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resv_num")
    private ResvHistory resv_num;

    @Column(name = "qna_title")
    private String qna_title;

    @Column(name = "qna_content")
    private String qna_content;

    @Column(name = "qna_date")
    private Date qna_date;

    @OneToOne(mappedBy = "Answer")
    private Qna answer_num;





}
