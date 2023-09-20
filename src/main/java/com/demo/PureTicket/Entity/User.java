package com.demo.PureTicket.Entity;

import com.demo.PureTicket.Constant.Role;
import com.demo.PureTicket.DTO.UserFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@ToString

//@Table(name = 'user')

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //회원번호

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "user_pass")
    private String user_pass;

    @Column(name = "user_name")
    private String user_name;

    @Column(unique = true)
    private String user_email;

    @Column(name = "user_birth")
    private Date user_birth;

    @Column(name = "user_phone")
    private String user_phone;

    @Column(name = "sub_date")
    private LocalDate sub_date;


    @OneToMany(mappedBy = "pay_num")
    private List<Pay> pay = new ArrayList<>();

    @OneToMany(mappedBy = "qna_num")
    private List<Qna> qna = new ArrayList<>();

    @OneToMany(mappedBy = "resv_num")
    private List<ResvHistory> resvnum = new ArrayList<>();

    @OneToMany(mappedBy = "post_num")
    private List<Genre> genre = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Role role;


    public static User createUser(UserFormDto userFormDto, PasswordEncoder passwodEncoder) {

        User user = new User();
        user.setUser_name(userFormDto.getUser_name());
        user.setUser_email(userFormDto.getUser_email());
        String user_pass = passwodEncoder.encode(userFormDto.getUser_pass());
        user.setUser_pass(user_pass);
        user.setRole(Role.USER);
        return user;
    }


}
