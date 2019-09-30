package com.raja.abc.data.repository;

import com.raja.abc.data.dao.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);
}
