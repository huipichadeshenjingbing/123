package com.liuhao.service.admin.impl;

import com.liuhao.dao.admin.AuthorityDao;
import com.liuhao.domain.admin.Authority;
import com.liuhao.service.admin.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;

	@Override
	public int add(Authority authority) {

		return authorityDao.add(authority);
	}

	@Override
	public int deleteByRoleId(Long roleId) {

		return authorityDao.deleteByRoleId(roleId);
	}

	@Override
	public List<Authority> findListByRoleId(Long roleId) {

		return authorityDao.findListByRoleId(roleId);
	}

}
