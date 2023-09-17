package com.demo.PureTicket.service;

import com.demo.PureTicket.Entity.User;
import com.demo.PureTicket.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor

public class UserService {

public class UserService implements UserDetailsService{

    private final UserRepository userRepository;

    public User saveUser(User user){
        validateDuplicateUser(user);
        return userRepository.save(user);
    }

    private void validateDuplicateUser(User user) {
        User findUser = userRepository.findByEmail(user.getUser_email());
        if(findUser != null){
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }

        @Override
        public UserDetails loadUserByUsername(String user_email) throws
                UsernameNotFoundException{
            User user = userRepository.findByEmail(user_email);

            if(user == null) {
                throw new UsernameNotFoundException(user_email);
            }
            return User.builder()
                    .user_name(user.getUser_email())
                    .user_pass(user.getUser_pass())
                    .roles(user.getRole().toString())
                    .build();
        }

}


}
