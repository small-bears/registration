package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenzhenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenzhenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenzhenxinxiView;


/**
 * 门诊信息
 *
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface MenzhenxinxiService extends IService<MenzhenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenzhenxinxiVO> selectListVO(Wrapper<MenzhenxinxiEntity> wrapper);
   	
   	MenzhenxinxiVO selectVO(@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);
   	
   	List<MenzhenxinxiView> selectListView(Wrapper<MenzhenxinxiEntity> wrapper);
   	
   	MenzhenxinxiView selectView(@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenzhenxinxiEntity> wrapper);
   	

}

