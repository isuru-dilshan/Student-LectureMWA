package com.nibm.sb.payroll.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nibm.sb.payroll.model.User;
import com.nibm.sb.payroll.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
