package com.venus.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venus.api.domain.ResponseRoleDto;
import com.venus.api.repository.RolesRepository;
import com.venus.api.repository.entity.Roles;
import com.venus.api.service.RoleService;

@Service
public class RoleServiceImpl extends BaseService implements RoleService {

	@Autowired
	private RolesRepository rolesRepository;
	
	public List<ResponseRoleDto> findAll() {
		
		return (List<ResponseRoleDto>) convertComponent.toList(
				(List<Roles>) rolesRepository.findAll() , ResponseRoleDto.class);
	}
}
