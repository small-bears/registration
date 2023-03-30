package com.dao;

import com.entity.GaiyuetongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GaiyuetongzhiVO;
import com.entity.view.GaiyuetongzhiView;


/**
 * 改约通知
 * 
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface GaiyuetongzhiDao extends BaseMapper<GaiyuetongzhiEntity> {
	
	List<GaiyuetongzhiVO> selectListVO(@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);
	
	GaiyuetongzhiVO selectVO(@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);
	
	List<GaiyuetongzhiView> selectListView(@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);

	List<GaiyuetongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);
	
	GaiyuetongzhiView selectView(@Param("ew") Wrapper<GaiyuetongzhiEntity> wrapper);
	

}
