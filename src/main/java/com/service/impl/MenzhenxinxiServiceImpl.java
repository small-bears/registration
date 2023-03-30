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


import com.dao.MenzhenxinxiDao;
import com.entity.MenzhenxinxiEntity;
import com.service.MenzhenxinxiService;
import com.entity.vo.MenzhenxinxiVO;
import com.entity.view.MenzhenxinxiView;

@Service("menzhenxinxiService")
public class MenzhenxinxiServiceImpl extends ServiceImpl<MenzhenxinxiDao, MenzhenxinxiEntity> implements MenzhenxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenzhenxinxiEntity> page = this.selectPage(
                new Query<MenzhenxinxiEntity>(params).getPage(),
                new EntityWrapper<MenzhenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenzhenxinxiEntity> wrapper) {
		  Page<MenzhenxinxiView> page =new Query<MenzhenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenzhenxinxiVO> selectListVO(Wrapper<MenzhenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenzhenxinxiVO selectVO(Wrapper<MenzhenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenzhenxinxiView> selectListView(Wrapper<MenzhenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenzhenxinxiView selectView(Wrapper<MenzhenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
