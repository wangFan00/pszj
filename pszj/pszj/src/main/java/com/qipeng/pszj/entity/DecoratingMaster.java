/**	
 * <br>
 * Copyright 2014 IFlyTek. All rights reserved.<br>
 * <br>			 
 * Package: com.qipeng.pszj.model <br>
 * FileName: RotationChart.java <br>
 * <br>
 * @version
 * @author wangf
 * @created 2019年5月9日
 * @last Modified 
 * @history
 */

package com.qipeng.pszj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月9日 下午2:53:42
 *  @lastModified       
 *  @history           
 */

@Entity
@Table(name="decorating_master")
@Data
public class DecoratingMaster{

	@Id
	private String id;
	private String name;
	private String class_introduction;
	private String brief_introduction;
	private String page_address; 
	private int working_condition; 
	private int browse_times; 
	private int scoring_times; 
	private float average; 
}




