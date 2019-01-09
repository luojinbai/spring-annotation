/**
 * Project Name:yibai-spring-annotation
 * File Name:ImportConfig.java
 * Package Name:com.yibai.spring.annotation.importt
 * Date:2019年1月9日下午10:04:43
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.importt;
/**
 * ClassName:ImportConfig <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月9日 下午10:04:43 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import org.springframework.context.annotation.Bean;

import com.yibai.spring.annotation.bean.color.Black;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImportConfig {

	public ImportConfig() {
		log.debug("构造器");
	}

	@Bean
	public Black black() {
		log.debug("配置加载： 加载Black");
		return new Black();
	}

}
