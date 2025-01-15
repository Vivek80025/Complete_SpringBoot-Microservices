package com.vivek.SpringSecurityP02_RoleBase_Auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleBaseController {

    //only admin access
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/transfer")
    public String moneyTransfer(){
        return "transfer 10000 successfully";
    }

    //admin and user can access
    @PreAuthorize("hasRole('USER','ADMIN')")
    @GetMapping("/update")
    public String update(){
        return "home loan is available";
    }
}
