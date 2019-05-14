/**	
 * <br>
 * Copyright 2014 IFlyTek. All rights reserved.<br>
 * <br>			 
 * Package: com.qipeng.pszj.dao <br>
 * FileName: RotationChartDao.java <br>
 * <br>
 * @version
 * @author wangf
 * @created 2019年5月9日
 * @last Modified 
 * @history
 */

package com.qipeng.pszj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qipeng.pszj.entity.Coupon;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午3:13:14
 *  @lastModified       
 *  @history           
 */

@Repository
public interface CouponRepository extends JpaRepository<Coupon,String>{
	/*
    * 查询所有要展示的轮播图
    * */
    @Query(value ="select c from Coupon c where c.whether_to_issue=:whether_to_issue and c.is_it_effective=:is_it_effective")
    List<Coupon> find(@Param("whether_to_issue")int whether_to_issue,@Param("is_it_effective")int is_it_effective);
}




