package com.venus.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venus.api.repository.RolesRepository;
import com.venus.api.repository.entity.Roles;
import com.venus.api.service.RoleService;
import com.venus.common.dto.RoleDto;

@Service
public class RoleServiceImpl extends BaseService implements RoleService {

	@Autowired
	private RolesRepository rolesRepository;
	
	public List<RoleDto> findAll() {
		
		return (List<RoleDto>) convertComponent.toList(
				(List<Roles>) rolesRepository.findAll() , RoleDto.class);
	}
}
