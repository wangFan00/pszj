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

import com.qipeng.pszj.entity.Scene;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午3:13:14
 *  @lastModified       
 *  @history           
 */

@Repository
public interface SceneRepository extends JpaRepository<Scene,String>{
	/*
    * 查询所有要展示的轮播图
    * */
    @Query(value ="select s from Scene s where s.state=:state and s.category=:category")
    List<Scene> find(@Param("category")int category,@Param("state")int state);
}




