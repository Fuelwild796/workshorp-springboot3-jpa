package com.educandoweb.demo.services;

import com.educandoweb.demo.entitieDTO.UserDTO;
import com.educandoweb.demo.entities.User;
import com.educandoweb.demo.repositories.UserRepository;
import com.educandoweb.demo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository repository;

    public List<UserDTO> findAll() {
        return repository.findAll();
    }

    public UserDTO findById(Long id) {
       Optional<UserDTO> obj = repository.findById(id);
       return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public UserDTO insert(UserDTO user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public UserDTO update(Long id, UserDTO obj) {
        UserDTO entity = repository.getReferenceById(id);
        updateData(entity,obj);
        return repository.save(entity);

    }

    private void updateData(UserDTO entity, UserDTO obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
    }




}
