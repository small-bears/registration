package com.entity.view;

import com.entity.DiscussmenzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门诊信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
@TableName("discussmenzhenxinxi")
public class DiscussmenzhenxinxiView  extends DiscussmenzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmenzhenxinxiView(){
	}
 
 	public DiscussmenzhenxinxiView(DiscussmenzhenxinxiEntity discussmenzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussmenzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
