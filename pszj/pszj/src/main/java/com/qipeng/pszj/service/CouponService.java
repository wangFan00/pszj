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

import com.qipeng.pszj.entity.Coupon;
import com.qipeng.pszj.repository.CouponRepository;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:57:56
 *  @lastModified       
 *  @history           
 */

@Service
public class CouponService {
	
	@Resource
	CouponRepository couponRepository;
	
	public List<Coupon> find(int whether_to_issue,int is_it_effective) {
        List<Coupon> list = null;
        try {
            list = couponRepository.find(whether_to_issue,is_it_effective);
        } catch (Exception e) {
        }
        return list;
    }
}




