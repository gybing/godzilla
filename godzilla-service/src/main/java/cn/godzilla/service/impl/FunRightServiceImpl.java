package cn.godzilla.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.godzilla.dao.FunRightMapper;
import cn.godzilla.model.FunRight;
import cn.godzilla.service.FunRightService;

@Service("funRightService")
public class FunRightServiceImpl implements FunRightService {

	@Autowired
	private FunRightMapper dao;

	@Override
	public List<FunRight> findFunRightsByUsername(String username) {
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("username", username);
		List<FunRight> funRightList = dao.queryRightsByUsername(parameterMap);
		return funRightList;
	}

}