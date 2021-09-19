package com.vote.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	void findByUsername(String username);

}
