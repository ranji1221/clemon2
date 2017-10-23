package org.ranji.lemon.common.core.persist.impl;

import org.ranji.lemon.common.core.model.User;
import org.ranji.lemon.common.core.persist.prototype.IUserDao;
import org.springframework.stereotype.Repository;

@Repository("JerseyUserDaoImpl") //-- 为解决其他项目中也有项目的类名，则利用@Autowired自动注入冲突的问题
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements IUserDao {
	
}
