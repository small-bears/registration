package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MenzhenxinxiEntity;
import com.entity.view.MenzhenxinxiView;

import com.service.MenzhenxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 门诊信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
@RestController
@RequestMapping("/menzhenxinxi")
public class MenzhenxinxiController {
    @Autowired
    private MenzhenxinxiService menzhenxinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MenzhenxinxiEntity menzhenxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			menzhenxinxi.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MenzhenxinxiEntity> ew = new EntityWrapper<MenzhenxinxiEntity>();
    	PageUtils page = menzhenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, menzhenxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MenzhenxinxiEntity menzhenxinxi, 
		HttpServletRequest request){
        EntityWrapper<MenzhenxinxiEntity> ew = new EntityWrapper<MenzhenxinxiEntity>();
    	PageUtils page = menzhenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, menzhenxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MenzhenxinxiEntity menzhenxinxi){
       	EntityWrapper<MenzhenxinxiEntity> ew = new EntityWrapper<MenzhenxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( menzhenxinxi, "menzhenxinxi")); 
        return R.ok().put("data", menzhenxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MenzhenxinxiEntity menzhenxinxi){
        EntityWrapper< MenzhenxinxiEntity> ew = new EntityWrapper< MenzhenxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( menzhenxinxi, "menzhenxinxi")); 
		MenzhenxinxiView menzhenxinxiView =  menzhenxinxiService.selectView(ew);
		return R.ok("查询门诊信息成功").put("data", menzhenxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MenzhenxinxiEntity menzhenxinxi = menzhenxinxiService.selectById(id);
		menzhenxinxi.setClicknum(menzhenxinxi.getClicknum()+1);
		menzhenxinxi.setClicktime(new Date());
		menzhenxinxiService.updateById(menzhenxinxi);
        return R.ok().put("data", menzhenxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MenzhenxinxiEntity menzhenxinxi = menzhenxinxiService.selectById(id);
		menzhenxinxi.setClicknum(menzhenxinxi.getClicknum()+1);
		menzhenxinxi.setClicktime(new Date());
		menzhenxinxiService.updateById(menzhenxinxi);
        return R.ok().put("data", menzhenxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MenzhenxinxiEntity menzhenxinxi, HttpServletRequest request){
    	menzhenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(menzhenxinxi);

        menzhenxinxiService.insert(menzhenxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MenzhenxinxiEntity menzhenxinxi, HttpServletRequest request){
    	menzhenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(menzhenxinxi);

        menzhenxinxiService.insert(menzhenxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MenzhenxinxiEntity menzhenxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(menzhenxinxi);
        menzhenxinxiService.updateById(menzhenxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        menzhenxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<MenzhenxinxiEntity> wrapper = new EntityWrapper<MenzhenxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishenggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = menzhenxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,MenzhenxinxiEntity menzhenxinxi, HttpServletRequest request,String pre){
        EntityWrapper<MenzhenxinxiEntity> ew = new EntityWrapper<MenzhenxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = menzhenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, menzhenxinxi), params), params));
        return R.ok().put("data", page);
    }





}
