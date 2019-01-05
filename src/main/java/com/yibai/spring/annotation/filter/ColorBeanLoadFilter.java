/**
 * Project Name:yibai-spring-annotation
 * File Name:ColorBeanLoadFIlter.java
 * Package Name:com.yibai.spring.annotation.filter
 * Date:2019年1月5日下午12:15:54
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.filter;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import com.yibai.spring.annotation.bean.color.Color;

/**
 * ClassName:ColorBeanLoadFIlter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2019年1月5日 下午12:15:54 <br/>
 * 
 * @author yibai
 * @version
 * @since JDK 1.6
 * @see
 */
public class ColorBeanLoadFilter implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// 当前被扫描类的注解信息
		@SuppressWarnings("unused")
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		// 当前被扫描类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		// 当前被扫描类资源信息
		@SuppressWarnings("unused")
		Resource resource = metadataReader.getResource();
		try {
			String className = classMetadata.getClassName();
			Class<?> forName = Class.forName(className);
			if (Color.class.isAssignableFrom(forName)) {
				// 如果是Color的子类，就加载到IOC容器
				return true;
			}
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		}
		return false;
	}

}
