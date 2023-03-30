package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GaiyuetongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GaiyuetongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GaiyuetongzhiView;


/**
 * 改约通知
 *
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface GaiyuetongzhiService extends IService<GaiyuetongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GaiyuetongzhiVO> selectListVO(Wrapper<GaiyuetongzhiEntity> wrapper);
   	
   	GaiyuetongzhiVO selectVO(@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);
   	
   	List<GaiyuetongzhiView> selectListView(Wrapper<GaiyuetongzhiEntity> wrapper);
   	
   	GaiyuetongzhiView selectView(@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GaiyuetongzhiEntity> wrapper);
   	

}

