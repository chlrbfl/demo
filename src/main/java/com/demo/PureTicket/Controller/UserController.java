package com.demo.PureTicket.Controller;

import com.demo.PureTicket.DTO.UserFormDto;
import com.demo.PureTicket.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @GetMapping(value = "/new")
    public String userForm(Model model){
        model.addAttribute("userFormDto", new UserFormDto());
        return "user/userForm";
    }

    @GetMapping(value = "/login")
    public String loginUser() {
        return "/user/userLoginForm";
    }

    @GetMapping(value = "/login/error")
    public String loginError(Model model){
        model.addAttribute("loginErrorMsg", "아이디 또는 비밀번호를 다시 입력해주세요.");
        return "user/userLoginForm";
    }

}
