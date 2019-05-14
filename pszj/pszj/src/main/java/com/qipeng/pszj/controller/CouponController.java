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

import com.qipeng.pszj.entity.Coupon;
import com.qipeng.pszj.service.CouponService;

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
public class CouponController {

	@Resource
	CouponService couponService;
	
	@RequestMapping("/getCouponList")
	public List<Coupon> getCouponList(HttpServletRequest request) throws IOException{
		String string = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
		Map<String,Object> mapObj = JSONObject.fromObject(string); 
		//System.out.println(mapObj);
		
		int whether_to_issue=(Integer)mapObj.get("whether_to_issue");
		int is_it_effective=(Integer)mapObj.get("is_it_effective");
		
		List<Coupon> sceneList= couponService.find(whether_to_issue,is_it_effective);
		return sceneList;
	}
}




