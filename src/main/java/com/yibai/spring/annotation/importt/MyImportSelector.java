/**
 * Project Name:yibai-spring-annotation
 * File Name:WhiteImportSelector.java
 * Package Name:com.yibai.spring.annotation.importt
 * Date:2019年1月9日下午10:11:07
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.importt;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.yibai.spring.annotation.bean.color.White;

/**
 * ClassName:WhiteImportSelector <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月9日 下午10:11:07 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		return new String[] { White.class.getName() };
	}

}
