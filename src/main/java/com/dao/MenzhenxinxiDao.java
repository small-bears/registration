package com.dao;

import com.entity.MenzhenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenzhenxinxiVO;
import com.entity.view.MenzhenxinxiView;


/**
 * 门诊信息
 * 
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface MenzhenxinxiDao extends BaseMapper<MenzhenxinxiEntity> {
	
	List<MenzhenxinxiVO> selectListVO(@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);
	
	MenzhenxinxiVO selectVO(@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);
	
	List<MenzhenxinxiView> selectListView(@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);

	List<MenzhenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);
	
	MenzhenxinxiView selectView(@Param("ew") Wrapper<MenzhenxinxiEntity> wrapper);
	

}
