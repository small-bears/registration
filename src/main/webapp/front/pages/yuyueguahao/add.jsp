<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>
		html::after {
			position: fixed;
			top: 0;
			right: 0;
			left: 0;
			bottom: 0;
			content: '';
			display: block;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
			z-index: -1;
		}
		#swiper {
			overflow: hidden;
			margin: 0 auto;
		}
		#swiper .layui-carousel-ind li {
			width: 16px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 50px;
			background-color: rgba(16, 41, 60, 1);
			box-shadow: 0 0 0px rgba(110,22,64,1);
		}
		#swiper .layui-carousel-ind li.layui-this {
			width: 24px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 50px;
			background-color: rgba(255, 255, 255, 1);
			box-shadow: 0 0 0px rgba(110,22,64,.8);
		}
		
		button, button:focus {
			outline: none;
		}
		
		.data-add-container .add .layui-select-title .layui-unselect {
			padding: 0 12px;
			height: 40px;
			font-size: 14px;
			color: #333;
			border-radius: 4px;
			border-width: 1px;
			border-style: solid;
			border-color: rgba(156, 187, 252, 1);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(110,22,64,0);
			text-align: left;
		}
		.data-add-container .add .layui-form-item {
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-form-label {
			margin: 0;
			position: inherit;
			background: transparent;
			border: 0;
		}
		.data-add-container .add .layui-input-block {
			margin: 0;
			flex: 1;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-input-inline {
			margin: 0;
			flex: 1;
			display: flex;
		}
	</style>
	<body>


		<div id="app">
		
			<!-- 轮播图 -->
			<!-- <div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div> -->
			<div class="layui-carousel" id="swiper" :style='{"boxShadow":"0 0 0px  rgba(110,22,64,.8)","margin":"0 auto","borderColor":"rgba(0,0,0,.3)","borderRadius":"0px","borderWidth":"0","width":"100%","borderStyle":"solid"}'>
			  <div carousel-item id="swiper-item">
				<div v-for="(item,index) in swiperList" :key="index">
					<img style="width: 100%;height: 100%;object-fit:cover;" :src="item.img" />
				</div>
			  </div>
			</div>
			<!-- 轮播图 -->
		
			<div class="data-add-container" :style='{"padding":"20px","boxShadow":"1px 1px 6px rgba(110,22,64,0)","margin":"30px auto","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"10px","borderWidth":"1px","borderStyle":"solid"}'>
		
				<form class="layui-form layui-form-pane add" lay-filter="myForm">
					
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">科室名称：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.keshimingcheng" type="text" :readonly="ro.keshimingcheng" name="keshimingcheng" id="keshimingcheng" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">科室类型：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.keshileixing" type="text" :readonly="ro.keshileixing" name="keshileixing" id="keshileixing" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">医生工号：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.yishenggonghao" type="text" :readonly="ro.yishenggonghao" name="yishenggonghao" id="yishenggonghao" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">医生姓名：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.yishengxingming" type="text" :readonly="ro.yishengxingming" name="yishengxingming" id="yishengxingming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">职称：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.zhicheng" type="text" :readonly="ro.zhicheng" name="zhicheng" id="zhicheng" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">挂号费：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.guahaofei" type="text" :readonly="ro.guahaofei" name="guahaofei" id="guahaofei" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
		                <label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">可约人数</label>
		                <div class="layui-input-block">
		                    <select name="keyuerenshu" id="keyuerenshu" lay-filter="keyuerenshu"  >
		                        <option value="">请选择</option>
		                        <option v-for="(item,index) in keyuerenshu" v-bind:key="index" :value="item">{{item}}</option>
		                    </select>
		                </div>
		            </div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">预约时间：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' type="text" name="yuyueshijian" id="yuyueshijian" autocomplete="off" class="layui-input" >
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">预约说明：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.yuyueshuoming" type="text" :readonly="ro.yuyueshuoming" name="yuyueshuoming" id="yuyueshuoming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">账号：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.zhanghao" type="text" :readonly="ro.zhanghao" name="zhanghao" id="zhanghao" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item" pane>
						<label :style='{"width":"94px","padding":"0 12px 0 0","fontSize":"14px","color":"#333","textAlign":"right"}' class="layui-form-label">姓名：</label>
						<div class="layui-input-block">
							<input :style='{"padding":"0 12px","boxShadow":"0 0 6px rgba(110,22,64,0)","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","color":"#333","borderRadius":"4px","textAlign":"left","borderWidth":"1px","fontSize":"14px","borderStyle":"solid","height":"40px"}' v-model="detail.xingming" type="text" :readonly="ro.xingming" name="xingming" id="xingming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            
		
					<div :style='{"padding":"10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 0 10px 0","borderColor":"rgba(156, 187, 252, 1)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0 0 3px 0","borderStyle":"dotted"}' class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 10px","borderColor":"#ccc","backgroundColor":"rgba(156, 187, 252, 1)","color":"#fff","borderRadius":"8px","borderWidth":"0","width":"25%","fontSize":"14px","borderStyle":"solid","height":"44px"}'  class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(110,22,64,0)","margin":"0 10px","borderColor":"#ccc","backgroundColor":"rgba(156, 187, 252, 1)","color":"rgba(255, 255, 255, 1)","borderRadius":"8px","borderWidth":"0","width":"25%","fontSize":"14px","borderStyle":"solid","height":"44px"}' type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					baseurl: '',
					dataList: [],
					ro:{
                                        keshimingcheng : false,
                                        keshileixing : false,
                                        yishenggonghao : false,
                                        yishengxingming : false,
                                        zhicheng : false,
                                        guahaofei : false,
                                        keyuerenshu : false,
                                        yuyueshijian : false,
                                        yuyueshuoming : false,
                                        zhanghao : false,
                                        xingming : false,
                                        crossuserid : false,
                                        crossrefid : false,
                                        sfsh : false,
                                        shhf : false,
                                        ispay : false,
					},
                    detail: {
                        keshimingcheng: '',
                        keshileixing: '',
                        yishenggonghao: '',
                        yishengxingming: '',
                        zhicheng: '',
                        guahaofei: '',
                        keyuerenshu: '',
                        yuyueshijian: '',
                        yuyueshuoming: '',
                        zhanghao: '',
                        xingming: '',
                        crossuserid: '',
                        crossrefid: '',
                        sfsh: '',
                        shhf: '',
                        ispay: '',
                    },
					keyuerenshu: '1'.split(','),
					centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {



                },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})


			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
				var tinymce = layui.tinymce;
				vue.baseurl = http.baseurl;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img style="width: 100%;height: 100%;object-fit:cover;" class="swiper-item" src="' + http.baseurl+item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						vue.$nextTick(() => {
						  carousel.render({
						  	elem: '#swiper',
							width: '100%',
						  	height: '450px',
						  	arrow: 'hover',
						  	anim: 'default',
						  	autoplay: 'true',
						  	interval: '3000',
						  	indicator: 'inside'
						  });
						
						})
					}
				});

                form.on('select(keyuerenshu)', function (data) {
                    vue.detail.keyuerenshu=data.value;
                });
                                jquery('#yuyueshijian').val(getCurDateTime());
				laydate.render({
					elem: '#yuyueshijian',
					type: 'datetime'
				});
				
                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
                        if(key=='zhanghao'){
                                vue.detail['zhanghao'] = data[`${key}`]
                                vue.ro.zhanghao = true;
                                continue;
                        }
                        if(key=='xingming'){
                                vue.detail['xingming'] = data[`${key}`]
                                vue.ro.xingming = true;
                                continue;
                        }
					}
				});

                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var o in obj){
                                        if(o=='keshimingcheng'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.keshimingcheng = true;
                                                continue;
                                        }
                                        if(o=='keshileixing'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.keshileixing = true;
                                                continue;
                                        }
                                        if(o=='yishenggonghao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.yishenggonghao = true;
                                                continue;
                                        }
                                        if(o=='yishengxingming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.yishengxingming = true;
                                                continue;
                                        }
                                        if(o=='zhicheng'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhicheng = true;
                                                continue;
                                        }
                                        if(o=='guahaofei'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.guahaofei = true;
                                                continue;
                                        }
                                        if(o=='keyuerenshu'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.keyuerenshu = true;
                                                continue;
                                        }
                                        if(o=='yuyueshijian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.yuyueshijian = true;
                                                jquery('#yuyueshijian').val(obj[o]);
                                                continue;
                                        }
                                        if(o=='yuyueshuoming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.yuyueshuoming = true;
                                                continue;
                                        }
                                        if(o=='zhanghao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhanghao = true;
                                                continue;
                                        }
                                        if(o=='xingming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.xingming = true;
                                                continue;
                                        }
                                        if(o=='crossuserid'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.crossuserid = true;
                                                continue;
                                        }
                                        if(o=='crossrefid'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.crossrefid = true;
                                                continue;
                                        }
					}
				}
				
				vue.detail.keyuerenshu = 0
				vue.ro.keyuerenshu = false;

				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
                    if(!isIntNumer(data.guahaofei)){
                        layer.msg('挂号费应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isIntNumer(data.keyuerenshu)){
                        layer.msg('可约人数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }

					// 跨表计算判断
                    var obj = JSON.parse(localStorage.getItem('crossObj'));
                    obj.keyuerenshu = obj.keyuerenshu - data.keyuerenshu
                    if(obj.keyuerenshu<0){
                        layer.msg(`可约人数不足`, {
					 		time: 2000,
					 		icon: 5
					 	});
                        return false
                    }
					
                    // 比较大小

                //更新跨表属性
               var crossuserid;
               var crossrefid;
               var crossoptnum;
                if(http.getParam('corss')){
                        var statusColumnName = localStorage.getItem('statusColumnName');
                        var statusColumnValue = localStorage.getItem('statusColumnValue');
                        if(statusColumnName!='') {
                                var obj = JSON.parse(localStorage.getItem('crossObj'));
				if(!statusColumnName.startsWith("[")) {
					for (var o in obj){
						if(o==statusColumnName){
							obj[o] = statusColumnValue;
						}
					}
					var table = localStorage.getItem('crossTable');
					http.requestJson(`${table}/update`,'post',obj,(res)=>{});
				} else {
                                       crossuserid=Number(localStorage.getItem('userid'));
                                       crossrefid=obj['id'];
                                       crossoptnum=localStorage.getItem('statusColumnName');
                                       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
				}
                        }
                }
                        if(crossrefid && crossuserid) {
                                data.crossuserid=crossuserid;
                                data.crossrefid=crossrefid;
                                http.request('yuyueguahao/list', 'get', {
                                        page: 1,
                                        limit: 10,
                                        crossuserid:crossuserid,
                                        crossrefid:crossrefid,
                                }, function(res) {
                                        if(res.data.total>=crossoptnum) {
                                                layer.msg(localStorage.getItem('tips'), {
                                                        time: 2000,
                                                        icon: 6
                                                })
                                             return false;
                                        } else {
                                            // 跨表计算

                                            var obj = JSON.parse(localStorage.getItem('crossObj'));
                                            var table = localStorage.getItem('crossTable');

                                            obj.keyuerenshu = parseFloat(obj.keyuerenshu) - parseFloat(data.keyuerenshu)

                                            http.requestJson(`${table}/update`,'post',obj,(res)=>{});
                                            // 提交数据
                                            http.requestJson('yuyueguahao' + '/add', 'post', data, function(res) {
                                                    layer.msg('提交成功', {
                                                            time: 2000,
                                                            icon: 6
                                                    }, function() {
                                                            back();
                                                    });
                                             });
                                        }
                                });
                        } else {
                                // 跨表计算

                                var obj = JSON.parse(localStorage.getItem('crossObj'));
                                var table = localStorage.getItem('crossTable');
                                obj.keyuerenshu = obj.keyuerenshu - data.keyuerenshu
                                http.requestJson(`${table}/update`,'post',obj,(res)=>{});
                                // 提交数据
                                http.requestJson('yuyueguahao' + '/add', 'post', data, function(res) {
                                        layer.msg('提交成功', {
                                                time: 2000,
                                                icon: 6
                                        }, function() {
                                                back();
                                        });
                                 });
                        }
			return false
			});
		});
		</script>
	</body>
</html>
