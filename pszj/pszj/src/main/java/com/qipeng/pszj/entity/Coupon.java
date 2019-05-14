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

import java.util.Date;

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
@Table(name="coupon")
@Data
public class Coupon{

	@Id
	private String id;
	private String name;
	private int preferential_quota;
	private int minimum_amount;
	private String due_time; 
	private int whether_to_issue;
	private int is_it_effective;
}




