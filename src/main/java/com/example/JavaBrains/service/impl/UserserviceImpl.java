package com.example.JavaBrains.service.impl;


import com.example.JavaBrains.service.Userservice;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserserviceImpl implements Userservice {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
