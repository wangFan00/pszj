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

import com.qipeng.pszj.entity.Scene;
import com.qipeng.pszj.service.SceneService;

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
public class SceneController {

	@Resource
	SceneService sceneService;
	
	@RequestMapping("/getSceneList")
	public List<Scene> getSceneList(HttpServletRequest request) throws IOException{
		String string = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
		Map<String,Object> mapObj = JSONObject.fromObject(string); 
		//System.out.println(mapObj);
		
		int category=(Integer)mapObj.get("category");
		
		List<Scene> sceneList= sceneService.find(category,1);
		return sceneList;
	}
}




