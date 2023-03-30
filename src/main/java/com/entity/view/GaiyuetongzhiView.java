package com.entity.view;

import com.entity.GaiyuetongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 改约通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
@TableName("gaiyuetongzhi")
public class GaiyuetongzhiView  extends GaiyuetongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GaiyuetongzhiView(){
	}
 
 	public GaiyuetongzhiView(GaiyuetongzhiEntity gaiyuetongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, gaiyuetongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
