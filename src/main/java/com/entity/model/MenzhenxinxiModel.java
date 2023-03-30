package com.entity.model;

import com.entity.MenzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 门诊信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-27 00:00:07
 */
public class MenzhenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室类型
	 */
	
	private String keshileixing;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 挂号费
	 */
	
	private Integer guahaofei;
		
	/**
	 * 可约人数
	 */
	
	private Integer keyuerenshu;
		
	/**
	 * 上班日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangbanriqi;
		
	/**
	 * 排班表
	 */
	
	private String paibanbiao;
		
	/**
	 * 医生介绍
	 */
	
	private String yishengjieshao;
		
	/**
	 * 科室图片
	 */
	
	private String keshitupian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：科室类型
	 */
	 
	public void setKeshileixing(String keshileixing) {
		this.keshileixing = keshileixing;
	}
	
	/**
	 * 获取：科室类型
	 */
	public String getKeshileixing() {
		return keshileixing;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：挂号费
	 */
	 
	public void setGuahaofei(Integer guahaofei) {
		this.guahaofei = guahaofei;
	}
	
	/**
	 * 获取：挂号费
	 */
	public Integer getGuahaofei() {
		return guahaofei;
	}
				
	
	/**
	 * 设置：可约人数
	 */
	 
	public void setKeyuerenshu(Integer keyuerenshu) {
		this.keyuerenshu = keyuerenshu;
	}
	
	/**
	 * 获取：可约人数
	 */
	public Integer getKeyuerenshu() {
		return keyuerenshu;
	}
				
	
	/**
	 * 设置：上班日期
	 */
	 
	public void setShangbanriqi(Date shangbanriqi) {
		this.shangbanriqi = shangbanriqi;
	}
	
	/**
	 * 获取：上班日期
	 */
	public Date getShangbanriqi() {
		return shangbanriqi;
	}
				
	
	/**
	 * 设置：排班表
	 */
	 
	public void setPaibanbiao(String paibanbiao) {
		this.paibanbiao = paibanbiao;
	}
	
	/**
	 * 获取：排班表
	 */
	public String getPaibanbiao() {
		return paibanbiao;
	}
				
	
	/**
	 * 设置：医生介绍
	 */
	 
	public void setYishengjieshao(String yishengjieshao) {
		this.yishengjieshao = yishengjieshao;
	}
	
	/**
	 * 获取：医生介绍
	 */
	public String getYishengjieshao() {
		return yishengjieshao;
	}
				
	
	/**
	 * 设置：科室图片
	 */
	 
	public void setKeshitupian(String keshitupian) {
		this.keshitupian = keshitupian;
	}
	
	/**
	 * 获取：科室图片
	 */
	public String getKeshitupian() {
		return keshitupian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
