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
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qipeng.pszj.entity.AboutUs;
import com.qipeng.pszj.service.AboutUsService;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:11
 *  @lastModified       
 *  @history           
 */

@RestController
public class AboutUsController {

	@Resource
	AboutUsService aboutUsService;
	
	@RequestMapping("/getAboutUs")
	public List<AboutUs> getAboutUsList(HttpServletRequest request) throws IOException{
		//String string = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
		//Map<String,Object> mapObj = JSONObject.fromObject(string); 
		//System.out.println(mapObj);
		
		//String id=(String)mapObj.get("id");
		
		List<AboutUs> aboutUsList= aboutUsService.find();
		return aboutUsList;
	}
}




