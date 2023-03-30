package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengView;


/**
 * 医生
 *
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface YishengService extends IService<YishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengVO> selectListVO(Wrapper<YishengEntity> wrapper);
   	
   	YishengVO selectVO(@Param("ew") Wrapper<YishengEntity> wrapper);
   	
   	List<YishengView> selectListView(Wrapper<YishengEntity> wrapper);
   	
   	YishengView selectView(@Param("ew") Wrapper<YishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengEntity> wrapper);
   	

}

