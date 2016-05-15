package com.venus.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.venus.api.repository.entity.UserProfile;


public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {

}
