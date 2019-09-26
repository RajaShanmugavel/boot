package com.raja.abc.data.repository;

import com.raja.abc.data.dao.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
