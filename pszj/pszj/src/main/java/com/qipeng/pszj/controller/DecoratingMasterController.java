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

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qipeng.pszj.entity.DecoratingMaster;
import com.qipeng.pszj.service.DecoratingMasterService;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:11
 *  @lastModified       
 *  @history           
 */

@RestController
public class DecoratingMasterController {

	@Resource
	DecoratingMasterService decoratingMasterService;
	
	@RequestMapping("/getDecoratingMasterList")
	public List<DecoratingMaster> getDecoratingMasterList() throws IOException{
		
		List<DecoratingMaster> decoratingMasterList= decoratingMasterService.find();
		return decoratingMasterList;
	}
}




