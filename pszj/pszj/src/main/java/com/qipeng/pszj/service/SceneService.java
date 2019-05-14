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

import org.springframework.stereotype.Service;

import com.qipeng.pszj.entity.Scene;
import com.qipeng.pszj.repository.SceneRepository;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:56
 *  @lastModified       
 *  @history           
 */

@Service
public class SceneService {
	
	@Resource
	SceneRepository sceneRepository;
	
	public List<Scene> find(int category,int state) {
        List<Scene> list = null;
        try {
            list = sceneRepository.find(category,state);
        } catch (Exception e) {
        }
        return list;
    }
}




