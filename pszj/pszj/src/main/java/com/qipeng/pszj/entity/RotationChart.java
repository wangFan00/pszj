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
@Table(name="rotation_chart")
@Data
public class RotationChart{

	@Id
	private String id;
	private String name;
	private String file_name;
	private String address;
	private int state; 
}




