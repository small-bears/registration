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


import com.dao.GaiyuetongzhiDao;
import com.entity.GaiyuetongzhiEntity;
import com.service.GaiyuetongzhiService;
import com.entity.vo.GaiyuetongzhiVO;
import com.entity.view.GaiyuetongzhiView;

@Service("gaiyuetongzhiService")
public class GaiyuetongzhiServiceImpl extends ServiceImpl<GaiyuetongzhiDao, GaiyuetongzhiEntity> implements GaiyuetongzhiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaiyuetongzhiEntity> page = this.selectPage(
                new Query<GaiyuetongzhiEntity>(params).getPage(),
                new EntityWrapper<GaiyuetongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaiyuetongzhiEntity> wrapper) {
		  Page<GaiyuetongzhiView> page =new Query<GaiyuetongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GaiyuetongzhiVO> selectListVO(Wrapper<GaiyuetongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GaiyuetongzhiVO selectVO(Wrapper<GaiyuetongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GaiyuetongzhiView> selectListView(Wrapper<GaiyuetongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaiyuetongzhiView selectView(Wrapper<GaiyuetongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
