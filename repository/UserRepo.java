package org.em.bankservice.repository;

import org.em.bankservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    boolean existByUsername(String username);

    boolean existByEmail(String email);
}
