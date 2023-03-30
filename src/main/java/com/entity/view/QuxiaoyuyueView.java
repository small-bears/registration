package com.entity.view;

import com.entity.QuxiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 取消预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
@TableName("quxiaoyuyue")
public class QuxiaoyuyueView  extends QuxiaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaoyuyueView(){
	}
 
 	public QuxiaoyuyueView(QuxiaoyuyueEntity quxiaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
