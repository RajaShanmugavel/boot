package com.raja.abc.data.repository;

import com.raja.abc.data.dao.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    /**
     *
     * @param lastName
     * @return
     */
    List<User> findByLastName(String lastName);

    List<User> findAllUsers();
}
