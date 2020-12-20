package com.liuhao.dao.admin;


import com.liuhao.domain.admin.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 菜单管理dao
 *
 */
@Repository
public interface MenuDao {
	public int add(Menu menu);
	public List<Menu> findList(Map<String, Object> queryMap);
	public List<Menu> findTopList();

	public int getTotal(Map<String, Object> queryMap);

	public int edit(Menu menu);

	public int delete(Long id);

	public List<Menu> findChildernList(Long parentId);

	public List<Menu> findListByIds(String ids);
}
