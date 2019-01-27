/**
 * Project Name:yibai-spring-annotation
 * File Name:UserDao.java
 * Package Name:com.yibai.spring.annotation.service
 * Date:2019年1月21日下午11:02:44
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.service;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName:UserDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月21日 下午11:02:44 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

@Repository
@Setter
@Getter
@AllArgsConstructor
@Slf4j
public class UserDao {

	int tag = 1;

	public UserDao() {
		log.debug("构造器");
	}

}
