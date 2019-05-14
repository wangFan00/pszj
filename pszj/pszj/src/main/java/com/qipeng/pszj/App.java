package com.qipeng.pszj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * {}
 *  
 *  @author wangf
 *  @created 2019年5月8日 下午3:04:15
 *  @lastModified       
 *  @history           
 */

@SpringBootApplication
//@EnableJpaRepositories
public class App {
	
	public static void main (String []args){
		SpringApplication.run(App.class, args);
	}
}




