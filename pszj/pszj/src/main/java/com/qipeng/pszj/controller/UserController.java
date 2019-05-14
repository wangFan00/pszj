/**	
 * <br>
 * Copyright 2014 IFlyTek. All rights reserved.<br>
 * <br>			 
 * Package: com.qipeng.pszj.controller <br>
 * FileName: RotationChartController.java <br>
 * <br>
 * @version
 * @author wangf
 * @created 2019年5月9日
 * @last Modified 
 * @history
 */

package com.qipeng.pszj.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qipeng.pszj.entity.User;
import com.qipeng.pszj.service.UserService;

import net.sf.json.JSONObject;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:11
 *  @lastModified       
 *  @history           
 */

@RestController
public class UserController {

	@Resource
	UserService userService;
	
	@RequestMapping("/getUser")
	public List<User> getUserList(HttpServletRequest request) throws IOException{
		String string = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
		Map<String,Object> mapObj = JSONObject.fromObject(string); 
		//System.out.println(mapObj);
		
		String id=(String)mapObj.get("id");
		
		List<User> userList= userService.find(id);
		return userList;
	}
	
	@RequestMapping("/setUserVouchers")
	public String setUserVouchers(HttpServletRequest request) throws IOException{
		String string = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
		Map<String,Object> mapObj = JSONObject.fromObject(string); 
		//System.out.println(mapObj);
		
		String userId=(String)mapObj.get("userId");
		String couponId=(String)mapObj.get("couponId");
		
		//验证当前用户是否领取过这个优惠券
		int userVouchers = userService.findUserService(userId,couponId);
		if(userVouchers>0){
			return "[{\"status\":0,\"msg\":\"不可重复领取！\"}]";
		}
		
		//如果当前用户没有领取过当前优惠券，则保存
		;
		return "[{\"status\":1,\"msg\":\"领取成功！\"}]";
	}
}




