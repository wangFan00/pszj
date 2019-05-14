/**	
 * <br>
 * Copyright 2014 IFlyTek. All rights reserved.<br>
 * <br>			 
 * Package: com.qipeng.pszj.service <br>
 * FileName: RotationChartService.java <br>
 * <br>
 * @version
 * @author wangf
 * @created 2019年5月9日
 * @last Modified 
 * @history
 */

package com.qipeng.pszj.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.qipeng.pszj.entity.User;
import com.qipeng.pszj.repository.UserRepository;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:56
 *  @lastModified       
 *  @history           
 */

@Service
public class UserService {
	
	@Resource
	UserRepository userRepository;
	
	@Resource(name = "sessionFactory")
	private  SessionFactory sessionFactory;
	
	public List<User> find(String id) {
        List<User> list = null;
        try {
            list = userRepository.find(id);
        } catch (Exception e) {
        }
        return list;
    }
	
	public  int findUserService(String userId,String couponId) {
		String sql = "select * from user_vouchers where user_id='"+userId
				+"' and coupon_id ='"+couponId+"' and state=1";
		return sessionFactory.openSession().createSQLQuery(sql).list().size();
		
	}
}




