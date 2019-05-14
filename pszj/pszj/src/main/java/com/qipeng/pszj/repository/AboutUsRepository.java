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
import org.springframework.stereotype.Repository;

import com.qipeng.pszj.entity.AboutUs;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午3:13:14
 *  @lastModified       
 *  @history           
 */

@Repository
public interface AboutUsRepository extends JpaRepository<AboutUs,String>{
	/*
    * 查询所有要展示的轮播图
    * */
    @Query(value ="select a from AboutUs a")
    List<AboutUs> find();
}




