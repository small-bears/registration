package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmenzhenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmenzhenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmenzhenxinxiView;


/**
 * 门诊信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface DiscussmenzhenxinxiService extends IService<DiscussmenzhenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmenzhenxinxiVO> selectListVO(Wrapper<DiscussmenzhenxinxiEntity> wrapper);
   	
   	DiscussmenzhenxinxiVO selectVO(@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);
   	
   	List<DiscussmenzhenxinxiView> selectListView(Wrapper<DiscussmenzhenxinxiEntity> wrapper);
   	
   	DiscussmenzhenxinxiView selectView(@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmenzhenxinxiEntity> wrapper);
   	

}

