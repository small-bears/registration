package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussmenzhenxinxiDao;
import com.entity.DiscussmenzhenxinxiEntity;
import com.service.DiscussmenzhenxinxiService;
import com.entity.vo.DiscussmenzhenxinxiVO;
import com.entity.view.DiscussmenzhenxinxiView;

@Service("discussmenzhenxinxiService")
public class DiscussmenzhenxinxiServiceImpl extends ServiceImpl<DiscussmenzhenxinxiDao, DiscussmenzhenxinxiEntity> implements DiscussmenzhenxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmenzhenxinxiEntity> page = this.selectPage(
                new Query<DiscussmenzhenxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussmenzhenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmenzhenxinxiEntity> wrapper) {
		  Page<DiscussmenzhenxinxiView> page =new Query<DiscussmenzhenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmenzhenxinxiVO> selectListVO(Wrapper<DiscussmenzhenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmenzhenxinxiVO selectVO(Wrapper<DiscussmenzhenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmenzhenxinxiView> selectListView(Wrapper<DiscussmenzhenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmenzhenxinxiView selectView(Wrapper<DiscussmenzhenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
