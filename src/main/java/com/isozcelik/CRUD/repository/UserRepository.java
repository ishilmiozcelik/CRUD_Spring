package com.isozcelik.CRUD.repository;

import com.isozcelik.CRUD.entity.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

    List<User> findByName(String name);

}
