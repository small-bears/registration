package com.dao;

import com.entity.DiscussmenzhenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmenzhenxinxiVO;
import com.entity.view.DiscussmenzhenxinxiView;


/**
 * 门诊信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public interface DiscussmenzhenxinxiDao extends BaseMapper<DiscussmenzhenxinxiEntity> {
	
	List<DiscussmenzhenxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);
	
	DiscussmenzhenxinxiVO selectVO(@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);
	
	List<DiscussmenzhenxinxiView> selectListView(@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);

	List<DiscussmenzhenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);
	
	DiscussmenzhenxinxiView selectView(@Param("ew") Wrapper<DiscussmenzhenxinxiEntity> wrapper);
	

}
