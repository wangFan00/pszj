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

import com.qipeng.pszj.entity.DecoratingMaster;
import com.qipeng.pszj.repository.DecoratingMasterRepository;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:56
 *  @lastModified       
 *  @history           
 */

@Service
public class DecoratingMasterService {
	
	@Resource
	DecoratingMasterRepository decoratingMasterRepository;
	
	public List<DecoratingMaster> find() {
        List<DecoratingMaster> list = null;
        try {
            list = decoratingMasterRepository.find();
        } catch (Exception e) {
        }
        return list;
    }
}




