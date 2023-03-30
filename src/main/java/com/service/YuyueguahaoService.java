package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueguahaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueguahaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueguahaoView;


/**
 * 预约挂号
 *
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface YuyueguahaoService extends IService<YuyueguahaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueguahaoVO> selectListVO(Wrapper<YuyueguahaoEntity> wrapper);
   	
   	YuyueguahaoVO selectVO(@Param("ew") Wrapper<YuyueguahaoEntity> wrapper);
   	
   	List<YuyueguahaoView> selectListView(Wrapper<YuyueguahaoEntity> wrapper);
   	
   	YuyueguahaoView selectView(@Param("ew") Wrapper<YuyueguahaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueguahaoEntity> wrapper);
   	

}

