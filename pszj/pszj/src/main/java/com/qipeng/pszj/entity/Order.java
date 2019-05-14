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
@Table(name="order")
@Data
public class Order{

	@Id
	private String id;
	private String user_id;
	private String scene_id;
	private String order_number;
	private float payment_amount;
	private int use_vouchers;
	private String coupon_id;
	private String remarks;
	private String order_time;
	private int order_status; 
}




