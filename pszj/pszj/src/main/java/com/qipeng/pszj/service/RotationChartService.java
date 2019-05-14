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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qipeng.pszj.entity.RotationChart;
import com.qipeng.pszj.repository.RotationChartRepository;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:56
 *  @lastModified       
 *  @history           
 */

@Service
public class RotationChartService {
	
	@Resource
	RotationChartRepository rotationChartEpository;
	
	public List<RotationChart> find(int state) {
        List<RotationChart> list = null;
        try {
            list = rotationChartEpository.find(state);
        } catch (Exception e) {
        }
        return list;
    }
}




