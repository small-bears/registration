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


import com.dao.QuxiaoyuyueDao;
import com.entity.QuxiaoyuyueEntity;
import com.service.QuxiaoyuyueService;
import com.entity.vo.QuxiaoyuyueVO;
import com.entity.view.QuxiaoyuyueView;

@Service("quxiaoyuyueService")
public class QuxiaoyuyueServiceImpl extends ServiceImpl<QuxiaoyuyueDao, QuxiaoyuyueEntity> implements QuxiaoyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoyuyueEntity> page = this.selectPage(
                new Query<QuxiaoyuyueEntity>(params).getPage(),
                new EntityWrapper<QuxiaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaoyuyueEntity> wrapper) {
		  Page<QuxiaoyuyueView> page =new Query<QuxiaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaoyuyueVO> selectListVO(Wrapper<QuxiaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoyuyueVO selectVO(Wrapper<QuxiaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoyuyueView> selectListView(Wrapper<QuxiaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoyuyueView selectView(Wrapper<QuxiaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
