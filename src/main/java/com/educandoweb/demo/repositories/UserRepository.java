package com.educandoweb.demo.repositories;

import com.educandoweb.demo.entitieDTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.demo.entities.User;


public interface UserRepository extends JpaRepository<UserDTO, Long> {
}
