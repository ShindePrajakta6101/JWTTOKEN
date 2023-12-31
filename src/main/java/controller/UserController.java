package controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.User;
import repository.UserRepo;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired private UserRepo userRepo;

    @GetMapping("/info")
    public org.springframework.security.core.userdetails.User getUserDetails(){
        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepo.findByEmail(email).get();
    }


}