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


import com.dao.YishengDao;
import com.entity.YishengEntity;
import com.service.YishengService;
import com.entity.vo.YishengVO;
import com.entity.view.YishengView;

@Service("yishengService")
public class YishengServiceImpl extends ServiceImpl<YishengDao, YishengEntity> implements YishengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengEntity> page = this.selectPage(
                new Query<YishengEntity>(params).getPage(),
                new EntityWrapper<YishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengEntity> wrapper) {
		  Page<YishengView> page =new Query<YishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengVO> selectListVO(Wrapper<YishengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengVO selectVO(Wrapper<YishengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengView> selectListView(Wrapper<YishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengView selectView(Wrapper<YishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
