package com.venus.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.venus.api.repository.entity.Users;


public interface UsersRepository extends CrudRepository<Users, Long> {

	public Users findByEmail(String email);
	
	public long countByEmail(String email);
}
