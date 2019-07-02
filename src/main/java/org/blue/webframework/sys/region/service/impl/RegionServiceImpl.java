package org.blue.webframework.sys.region.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.blue.webframework.sys.region.dao.RegionMapper;
import org.blue.webframework.sys.region.model.Region;
import org.blue.webframework.sys.region.service.RegionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("RegionService")
public class RegionServiceImpl implements RegionService {

	@Resource
	RegionMapper regionMapper;



	private void createBeiJing(){
		Region region;
		region=new Region();
		region.setId(110000);
		region.setName("北京市");
		region.setName_en("BeiJing");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110001);
		region.setName("北京市");
		region.setName_en("BeiJing");
		region.setPid(110000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110100);
		region.setName("东城区");
		region.setName_en("dongchengqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110200);
		region.setName("西城区");
		region.setName_en("xichengqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110500);
		region.setName("朝阳区");
		region.setName_en("zhaoyangqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110600);
		region.setName("丰台区");
		region.setName_en("fengtaiqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110700);
		region.setName("石景山区");
		region.setName_en("shijingshanqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110800);
		region.setName("海淀区");
		region.setName_en("haidianqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(110900);
		region.setName("门头沟区");
		region.setName_en("mentougouqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111100);
		region.setName("房山区");
		region.setName_en("fangshanqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111200);
		region.setName("通州区");
		region.setName_en("tongzhouqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111300);
		region.setName("顺义区");
		region.setName_en("shunyiqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111400);
		region.setName("昌平区");
		region.setName_en("changpingqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111500);
		region.setName("大兴区");
		region.setName_en("daxingqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111600);
		region.setName("怀柔区");
		region.setName_en("huairouqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(111700);
		region.setName("平谷区");
		region.setName_en("pingguqu");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(112800);
		region.setName("密云县");
		region.setName_en("miyunxian");
		region.setPid(110001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(112900);
		region.setName("延庆县");
		region.setName_en("yanqingxian");
		region.setPid(110001);
		regionMapper.insert(region);
	}

	private void createTianJing(){
		Region region;
		region=new Region();
		region.setId(120000);
		region.setName("天津市");
		region.setName_en("TianJing");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120001);
		region.setName("天津市");
		region.setName_en("TianJin");
		region.setPid(120000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120100);
		region.setName("和平区");
		region.setName_en("hepingqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120200);
		region.setName("河东区");
		region.setName_en("hedongqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120300);
		region.setName("河西区");
		region.setName_en("hexiqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120400);
		region.setName("南开区");
		region.setName_en("nankaiqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120500);
		region.setName("河北区");
		region.setName_en("hebeiqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120600);
		region.setName("红桥区");
		region.setName_en("hongqiaoqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(120900);
		region.setName("滨海新区");
		region.setName_en("binhaixinqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(121000);
		region.setName("东丽区");
		region.setName_en("dongliqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(121100);
		region.setName("西青区");
		region.setName_en("xiqingqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(121200);
		region.setName("津南区");
		region.setName_en("jinnanqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(121300);
		region.setName("北辰区");
		region.setName_en("beichenqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(121400);
		region.setName("武清区");
		region.setName_en("wuqingqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(121500);
		region.setName("宝坻区");
		region.setName_en("baodiqu");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(122100);
		region.setName("宁河县");
		region.setName_en("ninghexian");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(122300);
		region.setName("静海县");
		region.setName_en("jinghaixian");
		region.setPid(120001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(122500);
		region.setName("蓟县");
		region.setName_en("jixian");
		region.setPid(120001);
		regionMapper.insert(region);
	}

	private void createHeBei(){
		Region region;
		region=new Region();
		region.setId(130000);
		region.setName("河北省");
		region.setName_en("HeBei");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130100);
		region.setName("石家庄市");
		region.setName_en("shijiazhuangshi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130102);
		region.setName("长安区");
		region.setName_en("zhanganqu");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130103);
		region.setName("桥东区");
		region.setName_en("qiaodongqu");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130104);
		region.setName("桥西区");
		region.setName_en("qiaoxiqu");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130105);
		region.setName("新华区");
		region.setName_en("xinhuaqu");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130107);
		region.setName("井陉矿区");
		region.setName_en("jingxingkuangqu");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130108);
		region.setName("裕华区");
		region.setName_en("yuhuaqu");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130121);
		region.setName("井陉县");
		region.setName_en("jingxingxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130123);
		region.setName("正定县");
		region.setName_en("zhengdingxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130124);
		region.setName("栾城县");
		region.setName_en("luanchengxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130125);
		region.setName("行唐县");
		region.setName_en("xingtangxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130126);
		region.setName("灵寿县");
		region.setName_en("lingshouxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130127);
		region.setName("高邑县");
		region.setName_en("gaoyixian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130128);
		region.setName("深泽县");
		region.setName_en("shenzexian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130129);
		region.setName("赞皇县");
		region.setName_en("zanhuangxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130130);
		region.setName("无极县");
		region.setName_en("wujixian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130131);
		region.setName("平山县");
		region.setName_en("pingshanxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130132);
		region.setName("元氏县");
		region.setName_en("yuanshixian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130133);
		region.setName("赵县");
		region.setName_en("zhaoxian");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130181);
		region.setName("辛集市");
		region.setName_en("xinjishi");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130182);
		region.setName("藁城市");
		region.setName_en("gaochengshi");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130183);
		region.setName("晋州市");
		region.setName_en("jinzhoushi");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130184);
		region.setName("新乐市");
		region.setName_en("xinleshi");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130185);
		region.setName("鹿泉市");
		region.setName_en("luquanshi");
		region.setPid(130100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130200);
		region.setName("唐山市");
		region.setName_en("tangshanshi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130202);
		region.setName("路南区");
		region.setName_en("lunanqu");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130203);
		region.setName("路北区");
		region.setName_en("lubeiqu");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130204);
		region.setName("古冶区");
		region.setName_en("guyequ");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130205);
		region.setName("开平区");
		region.setName_en("kaipingqu");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130207);
		region.setName("丰南区");
		region.setName_en("fengnanqu");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130208);
		region.setName("丰润区");
		region.setName_en("fengrunqu");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130223);
		region.setName("滦县");
		region.setName_en("luanxian");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130224);
		region.setName("滦南县");
		region.setName_en("luannanxian");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130225);
		region.setName("乐亭县");
		region.setName_en("letingxian");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130227);
		region.setName("迁西县");
		region.setName_en("qianxixian");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130229);
		region.setName("玉田县");
		region.setName_en("yutianxian");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130230);
		region.setName("唐海县");
		region.setName_en("tanghaixian");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130281);
		region.setName("遵化市");
		region.setName_en("zunhuashi");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130283);
		region.setName("迁安市");
		region.setName_en("qiananshi");
		region.setPid(130200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130300);
		region.setName("秦皇岛市");
		region.setName_en("qinhuangdao");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130301);
		region.setName("海港区");
		region.setName_en("haigangqu");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130303);
		region.setName("山海关区");
		region.setName_en("shanhaiguanqu");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130304);
		region.setName("北戴河区");
		region.setName_en("beidaihequ");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130321);
		region.setName("青龙满族自治县");
		region.setName_en("qinglongmanzuzizhixian");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130322);
		region.setName("昌黎县");
		region.setName_en("changlixian");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130323);
		region.setName("抚宁县");
		region.setName_en("funingxian");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130324);
		region.setName("卢龙县");
		region.setName_en("lulongxian");
		region.setPid(130300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130400);
		region.setName("邯郸市");
		region.setName_en("handanshi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130402);
		region.setName("邯山区");
		region.setName_en("hanshanqu");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130403);
		region.setName("丛台区");
		region.setName_en("congtaiqu");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130404);
		region.setName("复兴区");
		region.setName_en("fuxingqu");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130406);
		region.setName("峰峰矿区");
		region.setName_en("fengfengkuangqu");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130421);
		region.setName("邯郸县");
		region.setName_en("handanxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130423);
		region.setName("临漳县");
		region.setName_en("linzhangxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130424);
		region.setName("成安县");
		region.setName_en("chenganxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130425);
		region.setName("大名县");
		region.setName_en("damingxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130426);
		region.setName("涉县");
		region.setName_en("shexian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130427);
		region.setName("磁县");
		region.setName_en("cixian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130428);
		region.setName("肥乡县");
		region.setName_en("feixiangxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130429);
		region.setName("永年县");
		region.setName_en("yongnianxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130430);
		region.setName("邱县");
		region.setName_en("qiuxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130431);
		region.setName("鸡泽县");
		region.setName_en("jizexian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130432);
		region.setName("广平县");
		region.setName_en("guangpingxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130433);
		region.setName("馆陶县");
		region.setName_en("guantaoxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130434);
		region.setName("魏县");
		region.setName_en("weixian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130435);
		region.setName("曲周县");
		region.setName_en("quzhouxian");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130481);
		region.setName("武安市");
		region.setName_en("wuanshi");
		region.setPid(130400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130500);
		region.setName("邢台市");
		region.setName_en("xingtaishi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130502);
		region.setName("桥东区");
		region.setName_en("qiaodongqu");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130503);
		region.setName("桥西区");
		region.setName_en("qiaoxiqu");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130521);
		region.setName("邢台县");
		region.setName_en("xingtaixian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130522);
		region.setName("临城县");
		region.setName_en("linchengxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130523);
		region.setName("内丘县");
		region.setName_en("neiqiuxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130524);
		region.setName("柏乡县");
		region.setName_en("boxiangxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130525);
		region.setName("隆尧县");
		region.setName_en("longyaoxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130526);
		region.setName("任县");
		region.setName_en("renxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130527);
		region.setName("南和县");
		region.setName_en("nanhexian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130528);
		region.setName("宁晋县");
		region.setName_en("ningjinxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130529);
		region.setName("巨鹿县");
		region.setName_en("juluxian");
		region.setPid(130529);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130530);
		region.setName("新河县");
		region.setName_en("xinhexian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130531);
		region.setName("广宗县");
		region.setName_en("guangzongxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130532);
		region.setName("平乡县");
		region.setName_en("pingxiangxian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130533);
		region.setName("威县");
		region.setName_en("weixian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130534);
		region.setName("清河县");
		region.setName_en("qinghexian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130535);
		region.setName("临西县");
		region.setName_en("linxixian");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130581);
		region.setName("南宫市");
		region.setName_en("nangongshi");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130582);
		region.setName("沙河市");
		region.setName_en("shaheshi");
		region.setPid(130500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130600);
		region.setName("保定市");
		region.setName_en("baodingshi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130601);
		region.setName("新市区");
		region.setName_en("xinshiqu");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130603);
		region.setName("北市区");
		region.setName_en("beishiqu");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130604);
		region.setName("南市区");
		region.setName_en("nanshiqu");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130621);
		region.setName("满城县");
		region.setName_en("manchengxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130622);
		region.setName("清苑县");
		region.setName_en("qingyuanxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130623);
		region.setName("涞水县");
		region.setName_en("laishuixian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130624);
		region.setName("阜平县");
		region.setName_en("fupingxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130625);
		region.setName("徐水县");
		region.setName_en("xushuixian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130626);
		region.setName("定兴县");
		region.setName_en("dingxingxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130627);
		region.setName("唐县");
		region.setName_en("tangxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130628);
		region.setName("高阳县");
		region.setName_en("gaoyangxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130629);
		region.setName("容城县");
		region.setName_en("rongchengxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130630);
		region.setName("涞源县");
		region.setName_en("laiyuanxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130631);
		region.setName("望都县");
		region.setName_en("wangdouxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130632);
		region.setName("安新县");
		region.setName_en("anxinxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130633);
		region.setName("易县");
		region.setName_en("yixian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130634);
		region.setName("曲阳县");
		region.setName_en("quyangxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130635);
		region.setName("蠡县");
		region.setName_en("lixian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130636);
		region.setName("顺平县");
		region.setName_en("shunpingxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130637);
		region.setName("博野县");
		region.setName_en("boyexian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130638);
		region.setName("雄县");
		region.setName_en("xiongxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130681);
		region.setName("涿州市");
		region.setName_en("zhuozhoushi");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130682);
		region.setName("定州市");
		region.setName_en("dingzhoushi");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130683);
		region.setName("安国市");
		region.setName_en("anguoshi");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130684);
		region.setName("高碑店市");
		region.setName_en("gaobeidianshi");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130685);
		region.setName("白沟新城县");
		region.setName_en("baigouxinchengxian");
		region.setPid(130600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130700);
		region.setName("张家口市");
		region.setName_en("zhangjiakoushi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130702);
		region.setName("桥东区");
		region.setName_en("qiaodongqu");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130703);
		region.setName("桥西区");
		region.setName_en("qiaoxiqu");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130705);
		region.setName("宣化区");
		region.setName_en("xuanhuaqu");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130706);
		region.setName("下花园区");
		region.setName_en("xiahuayuanqu");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130721);
		region.setName("宣化县");
		region.setName_en("xuanhuaxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130722);
		region.setName("张北县");
		region.setName_en("zhangbeixian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130723);
		region.setName("康保县");
		region.setName_en("kangbaoxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130724);
		region.setName("沽源县");
		region.setName_en("guyuanxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130725);
		region.setName("尚义县");
		region.setName_en("shangyixian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130726);
		region.setName("蔚县");
		region.setName_en("yuxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130727);
		region.setName("阳原县");
		region.setName_en("yangyuanxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130728);
		region.setName("怀安县");
		region.setName_en("huaianxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130729);
		region.setName("万全县");
		region.setName_en("wanquanxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130730);
		region.setName("怀来县");
		region.setName_en("huailaixian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130731);
		region.setName("涿鹿县");
		region.setName_en("zhuoluxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130732);
		region.setName("赤城县");
		region.setName_en("chichengxian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130733);
		region.setName("崇礼县");
		region.setName_en("chonglixian");
		region.setPid(130700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130800);
		region.setName("承德市");
		region.setName_en("chegndeshi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130802);
		region.setName("双桥区");
		region.setName_en("shuangqiaoqu");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130803);
		region.setName("双滦区");
		region.setName_en("shuangluanqu");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130804);
		region.setName("鹰手营子矿区");
		region.setName_en("yingshouyingzikuangqu");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130821);
		region.setName("承德县");
		region.setName_en("chengdexian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130822);
		region.setName("兴隆县");
		region.setName_en("xinglongxian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130823);
		region.setName("平泉县");
		region.setName_en("pingquanxian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130824);
		region.setName("滦平县");
		region.setName_en("luanpingxian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130825);
		region.setName("隆化县");
		region.setName_en("longhuaxian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130826);
		region.setName("丰宁满族自治县");
		region.setName_en("fengningmanzuzizhixian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130827);
		region.setName("宽城满族自治县");
		region.setName_en("kuanchengmanzuzizhixian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130828);
		region.setName("围场满族蒙古族自治县");
		region.setName_en("weichangmanzumengguzuzizhixian");
		region.setPid(130800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130900);
		region.setName("沧州市");
		region.setName_en("cangzhoushi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130902);
		region.setName("新华区");
		region.setName_en("xinhuaqu");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130903);
		region.setName("运河区");
		region.setName_en("yunhequ");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130921);
		region.setName("沧县");
		region.setName_en("cangxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130922);
		region.setName("青县");
		region.setName_en("qingxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130923);
		region.setName("东光县");
		region.setName_en("dongguangxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130924);
		region.setName("海兴县");
		region.setName_en("haixingxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130925);
		region.setName("盐山县");
		region.setName_en("yanshanxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130926);
		region.setName("肃宁县");
		region.setName_en("suningxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130927);
		region.setName("南皮县");
		region.setName_en("nanpixian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130928);
		region.setName("吴桥县");
		region.setName_en("wuqiaoxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130929);
		region.setName("献县");
		region.setName_en("xianxian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130930);
		region.setName("孟村回族自治县");
		region.setName_en("mengcunhuizuzizhixian");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130981);
		region.setName("泊头市");
		region.setName_en("botoushi");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130982);
		region.setName("任丘市");
		region.setName_en("renqiushi");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130983);
		region.setName("黄骅市");
		region.setName_en("huanghuashi");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(130984);
		region.setName("河间市");
		region.setName_en("hejianshi");
		region.setPid(130900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131000);
		region.setName("廊坊市");
		region.setName_en("langfangshi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131002);
		region.setName("安次区");
		region.setName_en("anciqu");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131003);
		region.setName("广阳区");
		region.setName_en("guangyangqu");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131022);
		region.setName("固安县");
		region.setName_en("guanxian");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131023);
		region.setName("永清县");
		region.setName_en("yongqingxian");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131024);
		region.setName("香河县");
		region.setName_en("xianghexian");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131025);
		region.setName("大城县");
		region.setName_en("daichengxian");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131026);
		region.setName("文安县");
		region.setName_en("wenanxian");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131028);
		region.setName("大厂回族自治县");
		region.setName_en("dachanghuizuzizhixian");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131081);
		region.setName("霸州市");
		region.setName_en("bazhoushi");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131082);
		region.setName("三河市");
		region.setName_en("sanheshi");
		region.setPid(131000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131100);
		region.setName("衡水市");
		region.setName_en("hengshuishi");
		region.setPid(130000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131102);
		region.setName("桃城区");
		region.setName_en("taochengqu");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131121);
		region.setName("枣强县");
		region.setName_en("zaoqiangxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131122);
		region.setName("武邑县");
		region.setName_en("wuyixian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131123);
		region.setName("武强县");
		region.setName_en("wuqiangxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131124);
		region.setName("饶阳县");
		region.setName_en("raoyangxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131125);
		region.setName("安平县");
		region.setName_en("anpingxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131126);
		region.setName("故城县");
		region.setName_en("guchengxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131127);
		region.setName("景县");
		region.setName_en("jingxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131128);
		region.setName("阜城县");
		region.setName_en("fuchengxian");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131181);
		region.setName("冀州市");
		region.setName_en("jizhoushi");
		region.setPid(131100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(131182);
		region.setName("深州市");
		region.setName_en("shenzhoushi");
		region.setPid(131100);
		regionMapper.insert(region);
	}

	private void createShanXi(){
		Region region;
		region=new Region();
		region.setId(140000);
		region.setName("山西省");
		region.setName_en("ShanXi");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140100);
		region.setName("太原市");
		region.setName_en("taiyuanshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140105);
		region.setName("小店区");
		region.setName_en("xiaodianqu");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140106);
		region.setName("迎泽区");
		region.setName_en("yingzequ");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140107);
		region.setName("杏花岭区");
		region.setName_en("xinghualingqu");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140108);
		region.setName("尖草坪区");
		region.setName_en("jiancaopingqu");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140109);
		region.setName("万柏林区");
		region.setName_en("wanbolinqu");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140110);
		region.setName("晋源区");
		region.setName_en("jinyuanqu");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140121);
		region.setName("清徐县");
		region.setName_en("qingxuxian");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140122);
		region.setName("阳曲县");
		region.setName_en("yangquxian");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140123);
		region.setName("娄烦县");
		region.setName_en("loufanxian");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140181);
		region.setName("古交市");
		region.setName_en("gujiaoshi");
		region.setPid(140100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140200);
		region.setName("大同市");
		region.setName_en("datongshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140202);
		region.setName("城区");
		region.setName_en("chengqu");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140203);
		region.setName("矿区");
		region.setName_en("kuangqu");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140211);
		region.setName("南郊区");
		region.setName_en("nanjiaoqu");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140212);
		region.setName("新荣区");
		region.setName_en("xinrongqu");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140221);
		region.setName("阳高县");
		region.setName_en("yanggaoxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140222);
		region.setName("天镇县");
		region.setName_en("tianzhenxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140223);
		region.setName("广灵县");
		region.setName_en("guanglingxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140224);
		region.setName("灵丘县");
		region.setName_en("lingqiuxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140225);
		region.setName("浑源县");
		region.setName_en("hunyuanxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140226);
		region.setName("左云县");
		region.setName_en("zuoyunxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140227);
		region.setName("大同县");
		region.setName_en("datongxian");
		region.setPid(140200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140300);
		region.setName("阳泉市");
		region.setName_en("yangquanshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140302);
		region.setName("城区");
		region.setName_en("chengqu");
		region.setPid(140300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140303);
		region.setName("矿区");
		region.setName_en("kuangqu");
		region.setPid(140300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140311);
		region.setName("郊区");
		region.setName_en("jiaoqu");
		region.setPid(140300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140321);
		region.setName("平定县");
		region.setName_en("pingdingxian");
		region.setPid(140300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140322);
		region.setName("盂县");
		region.setName_en("yuxian");
		region.setPid(140300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140400);
		region.setName("长治市");
		region.setName_en("changzhishi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140402);
		region.setName("城区");
		region.setName_en("chengqu");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140411);
		region.setName("郊区");
		region.setName_en("jiaoqu");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140421);
		region.setName("长治县");
		region.setName_en("zhangzhixian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140423);
		region.setName("襄垣县");
		region.setName_en("xiangyuanxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140424);
		region.setName("屯留县");
		region.setName_en("tunliuxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140425);
		region.setName("平顺县");
		region.setName_en("pingshunxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140426);
		region.setName("黎城县");
		region.setName_en("lichengxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140427);
		region.setName("壶关县");
		region.setName_en("huguanxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140428);
		region.setName("长子县");
		region.setName_en("zhangzixian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140429);
		region.setName("武乡县");
		region.setName_en("wuxiangxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140430);
		region.setName("沁县");
		region.setName_en("qinxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140431);
		region.setName("沁源县");
		region.setName_en("qinyuanxian");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140481);
		region.setName("潞城市");
		region.setName_en("luchengshi");
		region.setPid(140400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140500);
		region.setName("晋城市");
		region.setName_en("jinchengshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140502);
		region.setName("城区");
		region.setName_en("chengqu");
		region.setPid(140500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140521);
		region.setName("沁水县");
		region.setName_en("qinshuixian");
		region.setPid(140500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140522);
		region.setName("阳城县");
		region.setName_en("yangchengxian");
		region.setPid(140500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140524);
		region.setName("陵川县");
		region.setName_en("lingchuanxian");
		region.setPid(140500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140525);
		region.setName("泽州县");
		region.setName_en("zezhouxian");
		region.setPid(140500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140581);
		region.setName("高平市");
		region.setName_en("gaopingshi");
		region.setPid(140500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140600);
		region.setName("朔州市");
		region.setName_en("shuozhoushi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140602);
		region.setName("朔城区");
		region.setName_en("shuochengqu");
		region.setPid(140600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140603);
		region.setName("平鲁区");
		region.setName_en("pingluqu");
		region.setPid(140600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140621);
		region.setName("山阴县");
		region.setName_en("shanyinxian");
		region.setPid(140600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140622);
		region.setName("应县");
		region.setName_en("yingxian");
		region.setPid(140600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140623);
		region.setName("右玉县");
		region.setName_en("youyuxian");
		region.setPid(140600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140624);
		region.setName("怀仁县");
		region.setName_en("huairenxian");
		region.setPid(140600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140700);
		region.setName("晋中市");
		region.setName_en("jinzhongshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140702);
		region.setName("榆次区");
		region.setName_en("yuciqu");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140721);
		region.setName("榆社县");
		region.setName_en("yushexian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140722);
		region.setName("左权县");
		region.setName_en("zuoquanxian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140723);
		region.setName("和顺县");
		region.setName_en("heshunxian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140724);
		region.setName("昔阳县");
		region.setName_en("xiyangxian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140725);
		region.setName("寿阳县");
		region.setName_en("shouyangxian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140726);
		region.setName("太谷县");
		region.setName_en("taiguxian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140727);
		region.setName("祁县");
		region.setName_en("qixian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140728);
		region.setName("平遥县");
		region.setName_en("pingyaoxian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140729);
		region.setName("灵石县");
		region.setName_en("lingshixian");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140781);
		region.setName("介休市");
		region.setName_en("jiexiushi");
		region.setPid(140700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140800);
		region.setName("运城市");
		region.setName_en("yunchengshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140802);
		region.setName("盐湖区");
		region.setName_en("yanhuqu");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140821);
		region.setName("临猗县");
		region.setName_en("linyixian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140822);
		region.setName("万荣县");
		region.setName_en("wanrongxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140823);
		region.setName("闻喜县");
		region.setName_en("wenxixian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140824);
		region.setName("稷山县");
		region.setName_en("jishanxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140825);
		region.setName("新绛县");
		region.setName_en("xinjiangxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140826);
		region.setName("绛县");
		region.setName_en("jiangxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140827);
		region.setName("垣曲县");
		region.setName_en("yuanquxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140828);
		region.setName("夏县");
		region.setName_en("xiaxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140829);
		region.setName("平陆县");
		region.setName_en("pingluxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140830);
		region.setName("芮城县");
		region.setName_en("ruichengxian");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140881);
		region.setName("永济市");
		region.setName_en("yongjishi");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140882);
		region.setName("河津市");
		region.setName_en("hejinshi");
		region.setPid(140800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140900);
		region.setName("忻州市");
		region.setName_en("xinzhoushi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140901);
		region.setName("忻府区");
		region.setName_en("xinfuqu");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140921);
		region.setName("定襄县");
		region.setName_en("dingxiangxian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140922);
		region.setName("五台县");
		region.setName_en("wutaixian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140923);
		region.setName("代县");
		region.setName_en("daixian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140924);
		region.setName("繁峙县");
		region.setName_en("fanzhixian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140925);
		region.setName("宁武县");
		region.setName_en("ningwuxian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140926);
		region.setName("静乐县");
		region.setName_en("jinglexian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140927);
		region.setName("神池县");
		region.setName_en("shenchixian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140928);
		region.setName("五寨县");
		region.setName_en("wuzhaixian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140929);
		region.setName("岢岚县");
		region.setName_en("kelanxian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140930);
		region.setName("河曲县");
		region.setName_en("hequxian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140931);
		region.setName("保德县");
		region.setName_en("baodexian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140932);
		region.setName("偏关县");
		region.setName_en("pianguanxian");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(140981);
		region.setName("原平市");
		region.setName_en("yuanpingshi");
		region.setPid(140900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141000);
		region.setName("临汾市");
		region.setName_en("linfenshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141002);
		region.setName("尧都区");
		region.setName_en("yaodouqu");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141021);
		region.setName("曲沃县");
		region.setName_en("quwoxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141022);
		region.setName("翼城县");
		region.setName_en("yichengxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141023);
		region.setName("襄汾县");
		region.setName_en("xiangfenxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141024);
		region.setName("洪洞县");
		region.setName_en("hongdongxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141025);
		region.setName("古县");
		region.setName_en("guxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141026);
		region.setName("安泽县");
		region.setName_en("anzexian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141027);
		region.setName("浮山县");
		region.setName_en("fushanxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141028);
		region.setName("吉县");
		region.setName_en("jixian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141029);
		region.setName("乡宁县");
		region.setName_en("xiangningxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141030);
		region.setName("大宁县");
		region.setName_en("daningxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141031);
		region.setName("隰县");
		region.setName_en("xixian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141032);
		region.setName("永和县");
		region.setName_en("yonghexian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141033);
		region.setName("蒲县");
		region.setName_en("puxian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141034);
		region.setName("汾西县");
		region.setName_en("fenxixian");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141081);
		region.setName("侯马市");
		region.setName_en("houmashi");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141082);
		region.setName("霍州市");
		region.setName_en("huozhoushi");
		region.setPid(141000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141100);
		region.setName("吕梁市");
		region.setName_en("lvliangshi");
		region.setPid(140000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141102);
		region.setName("离石区");
		region.setName_en("lishiqu");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141121);
		region.setName("文水县");
		region.setName_en("wenshuixian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141122);
		region.setName("交城县");
		region.setName_en("jiaochengxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141123);
		region.setName("兴县");
		region.setName_en("xingxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141124);
		region.setName("临县");
		region.setName_en("linxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141125);
		region.setName("柳林县");
		region.setName_en("liulinxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141126);
		region.setName("石楼县");
		region.setName_en("shilouxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141127);
		region.setName("岚县");
		region.setName_en("lanxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141128);
		region.setName("方山县");
		region.setName_en("fangshanxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141129);
		region.setName("中阳县");
		region.setName_en("zhongyangxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141130);
		region.setName("交口县");
		region.setName_en("jiaokouxian");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141181);
		region.setName("孝义市");
		region.setName_en("xiaoyishi");
		region.setPid(141100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(141182);
		region.setName("汾阳市");
		region.setName_en("fenyangshi");
		region.setPid(141100);
		regionMapper.insert(region);
	}

	private void createNeiMengGu(){
		Region region;
		region=new Region();
		region.setId(150000);
		region.setName("内蒙古自治区");
		region.setName_en("NeiMengGu");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150100);
		region.setName("呼和浩特市");
		region.setName_en("huhehaoteshi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150102);
		region.setName("新城区");
		region.setName_en("xinchengqu");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150103);
		region.setName("回民区");
		region.setName_en("huiminqu");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150104);
		region.setName("玉泉区");
		region.setName_en("yuquanqu");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150105);
		region.setName("赛罕区");
		region.setName_en("saihanqu");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150121);
		region.setName("土默特左旗");
		region.setName_en("tumotezuoqi");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150122);
		region.setName("托克托县");
		region.setName_en("tuoketuoxian");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150123);
		region.setName("和林格尔县");
		region.setName_en("helingeerxian");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150124);
		region.setName("清水河县");
		region.setName_en("qingshuihexian");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150125);
		region.setName("武川县");
		region.setName_en("wuchuanxian");
		region.setPid(150100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150200);
		region.setName("包头市");
		region.setName_en("baotoushi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150202);
		region.setName("东河区");
		region.setName_en("donghequ");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150203);
		region.setName("昆都仑区");
		region.setName_en("kundoulunqu");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150204);
		region.setName("青山区");
		region.setName_en("qingshanqu");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150205);
		region.setName("石拐区");
		region.setName_en("shiguaiqu");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150206);
		region.setName("白云矿区");
		region.setName_en("baiyunkuangqu");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150207);
		region.setName("九原区");
		region.setName_en("jiuyuanqu");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150221);
		region.setName("土默特右旗");
		region.setName_en("tumoteyouqi");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150222);
		region.setName("固阳县");
		region.setName_en("guyangxian");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150223);
		region.setName("达尔罕茂明安联合旗");
		region.setName_en("daerhanmaominganlianheqi");
		region.setPid(150200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150300);
		region.setName("乌海市");
		region.setName_en("wuhaishi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150302);
		region.setName("海勃湾区");
		region.setName_en("haibowanqu");
		region.setPid(150300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150303);
		region.setName("海南区");
		region.setName_en("hainanqu");
		region.setPid(150300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150304);
		region.setName("乌达区");
		region.setName_en("wudaqu");
		region.setPid(150300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150400);
		region.setName("赤峰市");
		region.setName_en("chifengshi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150402);
		region.setName("红山区");
		region.setName_en("hongshanqu");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150403);
		region.setName("元宝山区");
		region.setName_en("yuanbaoshanqu");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150404);
		region.setName("松山区");
		region.setName_en("songshanqu");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150421);
		region.setName("阿鲁科尔沁旗");
		region.setName_en("alukeerqinqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150422);
		region.setName("巴林左旗");
		region.setName_en("balinzuoqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150423);
		region.setName("巴林右旗");
		region.setName_en("balinyouqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150424);
		region.setName("林西县");
		region.setName_en("linxixian");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150425);
		region.setName("克什克腾旗");
		region.setName_en("keshenketengqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150426);
		region.setName("翁牛特旗");
		region.setName_en("wengniuteqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150428);
		region.setName("喀喇沁旗");
		region.setName_en("kalaqinqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150429);
		region.setName("宁城县");
		region.setName_en("ningchengxian");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150430);
		region.setName("敖汉旗");
		region.setName_en("aohanqi");
		region.setPid(150400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150500);
		region.setName("通辽市");
		region.setName_en("tongliaoshi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150502);
		region.setName("科尔沁区");
		region.setName_en("keerqinqu");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150521);
		region.setName("科尔沁左翼中旗");
		region.setName_en("keerqinzuoyizhongqi");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150522);
		region.setName("科尔沁左翼后旗");
		region.setName_en("keerqinzuoyihouqi");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150523);
		region.setName("开鲁县");
		region.setName_en("kailuxian");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150524);
		region.setName("库伦旗");
		region.setName_en("kulunqi");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150525);
		region.setName("奈曼旗");
		region.setName_en("naimanqi");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150526);
		region.setName("扎鲁特旗");
		region.setName_en("zhaluteqi");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150581);
		region.setName("霍林郭勒市");
		region.setName_en("huolinguoleshi");
		region.setPid(150500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150600);
		region.setName("鄂尔多斯市");
		region.setName_en("eerduosishi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150602);
		region.setName("东胜区");
		region.setName_en("dongshengqu");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150621);
		region.setName("达拉特旗");
		region.setName_en("dalateqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150622);
		region.setName("准格尔旗");
		region.setName_en("zhungeerqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150623);
		region.setName("鄂托克前旗");
		region.setName_en("etuokeqianqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150624);
		region.setName("鄂托克旗");
		region.setName_en("etuokeqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150625);
		region.setName("杭锦旗");
		region.setName_en("hangjinqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150626);
		region.setName("乌审旗");
		region.setName_en("wushenqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150627);
		region.setName("伊金霍洛旗");
		region.setName_en("yijinhuoluoqi");
		region.setPid(150600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150700);
		region.setName("呼伦贝尔市");
		region.setName_en("hulunbeiershi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150702);
		region.setName("海拉尔区");
		region.setName_en("hailaerqu");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150721);
		region.setName("阿荣旗");
		region.setName_en("arongqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150722);
		region.setName("莫力达瓦达斡尔族自治旗");
		region.setName_en("molidawadawoerzuzizhiqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150723);
		region.setName("鄂伦春自治旗");
		region.setName_en("elunchunzizhiqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150724);
		region.setName("鄂温克族自治旗");
		region.setName_en("ewenkezuzizhiqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150725);
		region.setName("陈巴尔虎旗");
		region.setName_en("chenbaerhuqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150726);
		region.setName("新巴尔虎左旗");
		region.setName_en("xinbaerhuzuoqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150727);
		region.setName("新巴尔虎右旗");
		region.setName_en("xinbaerhuyouqi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150781);
		region.setName("满洲里市");
		region.setName_en("manzhoulishi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150782);
		region.setName("牙克石市");
		region.setName_en("yakeshishi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150783);
		region.setName("扎兰屯市");
		region.setName_en("zhalantunshi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150784);
		region.setName("额尔古纳市");
		region.setName_en("eergunashi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150785);
		region.setName("根河市");
		region.setName_en("genheshi");
		region.setPid(150700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150800);
		region.setName("巴彦淖尔市");
		region.setName_en("bayanzhuoershi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150802);
		region.setName("临河区");
		region.setName_en("linhequ");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150821);
		region.setName("五原县");
		region.setName_en("wuyuanxian");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150822);
		region.setName("磴口县");
		region.setName_en("dengkouxian");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150823);
		region.setName("乌拉特前旗");
		region.setName_en("wulateqianqi");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150824);
		region.setName("乌拉特中旗");
		region.setName_en("wulatezhongqi");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150825);
		region.setName("乌拉特后旗");
		region.setName_en("wulatehouqi");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150826);
		region.setName("杭锦后旗");
		region.setName_en("hangjinhouqi");
		region.setPid(150800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150900);
		region.setName("乌兰察布市");
		region.setName_en("wulanchabushi");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150902);
		region.setName("集宁区");
		region.setName_en("jiningqu");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150921);
		region.setName("卓资县");
		region.setName_en("zhuozixian");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150922);
		region.setName("化德县");
		region.setName_en("huadexian");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150923);
		region.setName("商都县");
		region.setName_en("shangdouxian");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150924);
		region.setName("兴和县");
		region.setName_en("xinghexian");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150925);
		region.setName("凉城县");
		region.setName_en("liangchengxian");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150926);
		region.setName("察哈尔右翼前旗");
		region.setName_en("chahaeryouyiqianqi");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150927);
		region.setName("察哈尔右翼中旗");
		region.setName_en("chahaeryouyizhongqi");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150928);
		region.setName("察哈尔右翼后旗");
		region.setName_en("chahaeryouyihouqi");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150929);
		region.setName("四子王旗");
		region.setName_en("siziwangqi");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(150981);
		region.setName("丰镇市");
		region.setName_en("fengzhenshi");
		region.setPid(150900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152200);
		region.setName("兴安盟");
		region.setName_en("xinganmeng");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152201);
		region.setName("乌兰浩特市");
		region.setName_en("wulanhaoteshi");
		region.setPid(152200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152202);
		region.setName("阿尔山市");
		region.setName_en("aershanshi");
		region.setPid(152200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152221);
		region.setName("科尔沁右翼前旗");
		region.setName_en("keerqinyouyiqianqi");
		region.setPid(152200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152222);
		region.setName("科尔沁右翼中旗");
		region.setName_en("keerqinyouyizhongqi");
		region.setPid(152200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152223);
		region.setName("扎赉特旗");
		region.setName_en("zhalaiteqi");
		region.setPid(152200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152224);
		region.setName("突泉县");
		region.setName_en("tuquanxian");
		region.setPid(152200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152500);
		region.setName("锡林郭勒盟");
		region.setName_en("xilinguolemeng");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152501);
		region.setName("二连浩特市");
		region.setName_en("erlianhaoteshi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152502);
		region.setName("锡林浩特市");
		region.setName_en("xilinhaoteshi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152522);
		region.setName("阿巴嘎旗");
		region.setName_en("abagaqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152523);
		region.setName("苏尼特左旗");
		region.setName_en("sunitezuoqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152524);
		region.setName("苏尼特右旗");
		region.setName_en("suniteyouqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152525);
		region.setName("东乌珠穆沁旗");
		region.setName_en("dongwuzhumuqinqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152526);
		region.setName("西乌珠穆沁旗");
		region.setName_en("xiwuzhumuqinqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152527);
		region.setName("太仆寺旗");
		region.setName_en("taipusiqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152528);
		region.setName("镶黄旗");
		region.setName_en("xianghuangqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152529);
		region.setName("正镶白旗");
		region.setName_en("zhengxiangbaiqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152530);
		region.setName("正蓝旗");
		region.setName_en("zhenglanqi");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152531);
		region.setName("多伦县");
		region.setName_en("duolunxian");
		region.setPid(152500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152900);
		region.setName("阿拉善盟");
		region.setName_en("alashanmeng");
		region.setPid(150000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152921);
		region.setName("阿拉善左旗");
		region.setName_en("alashanzuoqi");
		region.setPid(152900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152922);
		region.setName("阿拉善右旗");
		region.setName_en("alashanyouqi");
		region.setPid(152900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(152923);
		region.setName("额济纳旗");
		region.setName_en("ejinaqi");
		region.setPid(152900);
		regionMapper.insert(region);
	}

	private void createLiaoNing(){
		Region region;
		region=new Region();
		region.setId(210000);
		region.setName("辽宁省");
		region.setName_en("LiaoNing");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210100);
		region.setName("沈阳市");
		region.setName_en("shenyangshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210102);
		region.setName("和平区");
		region.setName_en("hepingqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210103);
		region.setName("沈河区");
		region.setName_en("shenhequ");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210104);
		region.setName("大东区");
		region.setName_en("dadongqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210105);
		region.setName("皇姑区");
		region.setName_en("huangguqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210106);
		region.setName("铁西区");
		region.setName_en("tiexiqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210111);
		region.setName("苏家屯区");
		region.setName_en("sujiatunqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210112);
		region.setName("东陵区");
		region.setName_en("donglingqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210113);
		region.setName("新城子区");
		region.setName_en("xinchengziqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210114);
		region.setName("于洪区");
		region.setName_en("yuhongqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210122);
		region.setName("辽中县");
		region.setName_en("liaozhongxian");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210123);
		region.setName("康平县");
		region.setName_en("kangpingxian");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210124);
		region.setName("法库县");
		region.setName_en("fakuxian");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210181);
		region.setName("新民市");
		region.setName_en("xinminshi");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210182);
		region.setName("沈北新区");
		region.setName_en("shenbeixinqu");
		region.setPid(210100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210200);
		region.setName("大连市");
		region.setName_en("dalianshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210202);
		region.setName("中山区");
		region.setName_en("zhongshanqu");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210203);
		region.setName("西岗区");
		region.setName_en("xigangqu");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210204);
		region.setName("沙河口区");
		region.setName_en("shahekouqu");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210211);
		region.setName("甘井子区");
		region.setName_en("ganjingziqu");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210212);
		region.setName("旅顺口区");
		region.setName_en("lvshunkouqu");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210213);
		region.setName("金州区");
		region.setName_en("jinzhouqu");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210224);
		region.setName("长海县");
		region.setName_en("zhanghaixian");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210281);
		region.setName("瓦房店市");
		region.setName_en("wafangdianshi");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210282);
		region.setName("普兰店市");
		region.setName_en("pulandianshi");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210283);
		region.setName("庄河市");
		region.setName_en("zhuangheshi");
		region.setPid(210200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210300);
		region.setName("鞍山市");
		region.setName_en("anshanshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210302);
		region.setName("铁东区");
		region.setName_en("tiedongqu");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210303);
		region.setName("铁西区");
		region.setName_en("tiexiqu");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210304);
		region.setName("立山区");
		region.setName_en("lishanqu");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210311);
		region.setName("千山区");
		region.setName_en("qianshanqu");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210321);
		region.setName("台安县");
		region.setName_en("taianxian");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210323);
		region.setName("岫岩满族自治县");
		region.setName_en("xiuyanmanzuzizhixian");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210381);
		region.setName("海城市");
		region.setName_en("haichengshi");
		region.setPid(210300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210400);
		region.setName("抚顺市");
		region.setName_en("ffushunshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210402);
		region.setName("新抚区");
		region.setName_en("xinfuqu");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210403);
		region.setName("东洲区");
		region.setName_en("dongzhouqu");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210404);
		region.setName("望花区");
		region.setName_en("wanghuaqu");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210411);
		region.setName("顺城区");
		region.setName_en("shunchengqu");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210421);
		region.setName("抚顺县");
		region.setName_en("fushunxian");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210422);
		region.setName("新宾满族自治县");
		region.setName_en("xinbinmanzuzizhixian");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210423);
		region.setName("清原满族自治县");
		region.setName_en("qingyuanmanzuzizhixian");
		region.setPid(210400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210500);
		region.setName("本溪市");
		region.setName_en("benxishi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210502);
		region.setName("平山区");
		region.setName_en("pingshanqu");
		region.setPid(210500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210503);
		region.setName("溪湖??");
		region.setName_en("xihu??");
		region.setPid(210500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210504);
		region.setName("明山区");
		region.setName_en("mingshanqu");
		region.setPid(210500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210505);
		region.setName("南芬区");
		region.setName_en("nanfenqu");
		region.setPid(210500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210521);
		region.setName("本溪满族自治县");
		region.setName_en("benximanzuzizhixian");
		region.setPid(210500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210522);
		region.setName("桓仁满族自治县");
		region.setName_en("huanrenmanzuzizhixian");
		region.setPid(210500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210600);
		region.setName("丹东市");
		region.setName_en("dandongshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210602);
		region.setName("元宝区");
		region.setName_en("yuanbaoqu");
		region.setPid(210600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210603);
		region.setName("振兴区");
		region.setName_en("zhenxingqu");
		region.setPid(210600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210604);
		region.setName("振安区");
		region.setName_en("zhenanqu");
		region.setPid(210600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210624);
		region.setName("宽甸满族自治县");
		region.setName_en("kuandianmanzuzizhixian");
		region.setPid(210600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210681);
		region.setName("东港市");
		region.setName_en("donggangshi");
		region.setPid(210600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210682);
		region.setName("凤城市");
		region.setName_en("fengchengshi");
		region.setPid(210600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210700);
		region.setName("锦州市");
		region.setName_en("jinzhoushi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210702);
		region.setName("古塔区");
		region.setName_en("gutaqu");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210703);
		region.setName("凌河区");
		region.setName_en("linghequ");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210711);
		region.setName("太和区");
		region.setName_en("taihequ");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210726);
		region.setName("黑山县");
		region.setName_en("heishanxian");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210727);
		region.setName("义县");
		region.setName_en("yixian");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210781);
		region.setName("凌海市");
		region.setName_en("linghaishi");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210782);
		region.setName("北宁市");
		region.setName_en("beiningshi");
		region.setPid(210700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210800);
		region.setName("营口市");
		region.setName_en("yingkoushi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210802);
		region.setName("站前区");
		region.setName_en("zhanqianqu");
		region.setPid(210800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210803);
		region.setName("西市区");
		region.setName_en("xishiqu");
		region.setPid(210800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210804);
		region.setName("鲅鱼圈区");
		region.setName_en("bayuquanqu");
		region.setPid(210800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210811);
		region.setName("老边区");
		region.setName_en("laobianqu");
		region.setPid(210800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210881);
		region.setName("盖州市");
		region.setName_en("gaizhoushi");
		region.setPid(210800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210882);
		region.setName("大石桥市");
		region.setName_en("dashiqiaoshi");
		region.setPid(210800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210900);
		region.setName("阜新市");
		region.setName_en("fuxinshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210902);
		region.setName("海州区");
		region.setName_en("haizhouqu");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210903);
		region.setName("新邱区");
		region.setName_en("xinqiuqu");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210904);
		region.setName("太平区");
		region.setName_en("taipingqu");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210905);
		region.setName("清河门区");
		region.setName_en("qinghemenqu");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210911);
		region.setName("细河区");
		region.setName_en("xihequ");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210921);
		region.setName("阜新蒙古族自治县");
		region.setName_en("fuxinmengguzuzizhixian");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(210922);
		region.setName("彰武县");
		region.setName_en("zhangwuxian");
		region.setPid(210900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211000);
		region.setName("辽阳市");
		region.setName_en("liaoyangshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211002);
		region.setName("白塔区");
		region.setName_en("baitaqu");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211003);
		region.setName("文圣区");
		region.setName_en("wenshengqu");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211004);
		region.setName("宏伟区");
		region.setName_en("hongweiqu");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211005);
		region.setName("弓长岭区");
		region.setName_en("gongzhanglingqu");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211011);
		region.setName("太子河区");
		region.setName_en("taizihequ");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211021);
		region.setName("辽阳县");
		region.setName_en("liaoyangxian");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211081);
		region.setName("灯塔市");
		region.setName_en("dengtashi");
		region.setPid(211000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211100);
		region.setName("盘锦市");
		region.setName_en("panjinshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211102);
		region.setName("双台子区");
		region.setName_en("shuangtaiziqu");
		region.setPid(211100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211103);
		region.setName("兴隆台区");
		region.setName_en("xinglongtaiqu");
		region.setPid(211100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211121);
		region.setName("大洼县");
		region.setName_en("dawaxian");
		region.setPid(211100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211122);
		region.setName("盘山县");
		region.setName_en("panshanxian");
		region.setPid(211100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211200);
		region.setName("铁岭市");
		region.setName_en("tielingshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211202);
		region.setName("银州区");
		region.setName_en("yinzhouqu");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211204);
		region.setName("清河区");
		region.setName_en("qinghequ");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211221);
		region.setName("铁岭县");
		region.setName_en("tielingxian");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211223);
		region.setName("西丰县");
		region.setName_en("xifengxian");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211224);
		region.setName("昌图县");
		region.setName_en("changtuxian");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211281);
		region.setName("调兵山市");
		region.setName_en("diaobingshanshi");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211282);
		region.setName("开原市");
		region.setName_en("kaiyuanshi");
		region.setPid(211200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211300);
		region.setName("朝阳市");
		region.setName_en("chaoyangshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211302);
		region.setName("双塔区");
		region.setName_en("shuangtaqu");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211303);
		region.setName("龙城区");
		region.setName_en("longchengqu");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211321);
		region.setName("朝阳县");
		region.setName_en("zhaoyangxian");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211322);
		region.setName("建平县");
		region.setName_en("jianpingxian");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211324);
		region.setName("喀喇沁左翼蒙古族自治县");
		region.setName_en("kalaqinzuoyimengguzuzizhixian");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211381);
		region.setName("北票市");
		region.setName_en("beipiaoshi");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211382);
		region.setName("凌源市");
		region.setName_en("lingyuanshi");
		region.setPid(211300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211400);
		region.setName("葫芦岛市");
		region.setName_en("huludaoshi");
		region.setPid(210000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211402);
		region.setName("连山区");
		region.setName_en("lianshanqu");
		region.setPid(211400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211403);
		region.setName("龙港区");
		region.setName_en("longgangqu");
		region.setPid(211400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211404);
		region.setName("南票区");
		region.setName_en("nanpiaoqu");
		region.setPid(211400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211421);
		region.setName("绥中县");
		region.setName_en("suizhongxian");
		region.setPid(211400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211422);
		region.setName("建昌县");
		region.setName_en("jianchangxian");
		region.setPid(211400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(211481);
		region.setName("兴城市");
		region.setName_en("xingchengshi");
		region.setPid(211400);
		regionMapper.insert(region);
	}

	private void createJiLin(){
		Region region;
		region=new Region();
		region.setId(220000);
		region.setName("吉林省");
		region.setName_en("JiLin");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220100);
		region.setName("长春市");
		region.setName_en("changchunshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220102);
		region.setName("南关区");
		region.setName_en("nanguanqu");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220103);
		region.setName("宽城区");
		region.setName_en("kuanchengqu");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220104);
		region.setName("朝阳区");
		region.setName_en("zhaoyangqu");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220105);
		region.setName("二道区");
		region.setName_en("erdaoqu");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220106);
		region.setName("绿园区");
		region.setName_en("lvyuanqu");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220112);
		region.setName("双阳区");
		region.setName_en("shuangyangqu");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220122);
		region.setName("农安县");
		region.setName_en("nonganxian");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220181);
		region.setName("九台市");
		region.setName_en("jiutaishi");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220182);
		region.setName("榆树市");
		region.setName_en("yushushi");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220183);
		region.setName("德惠市");
		region.setName_en("dehuishi");
		region.setPid(220100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220200);
		region.setName("吉林市");
		region.setName_en("jilinshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220202);
		region.setName("昌邑区");
		region.setName_en("changyiqu");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220203);
		region.setName("龙潭区");
		region.setName_en("longtanqu");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220204);
		region.setName("船营区");
		region.setName_en("chuanyingqu");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220211);
		region.setName("丰满区");
		region.setName_en("fengmanqu");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220221);
		region.setName("永吉县");
		region.setName_en("yongjixian");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220281);
		region.setName("蛟河市");
		region.setName_en("jiaoheshi");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220282);
		region.setName("桦甸市");
		region.setName_en("huadianshi");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220283);
		region.setName("舒兰市");
		region.setName_en("shulanshi");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220284);
		region.setName("磐石市");
		region.setName_en("panshishi");
		region.setPid(220200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220300);
		region.setName("四平市");
		region.setName_en("sipingshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220302);
		region.setName("铁西区");
		region.setName_en("tiexiqu");
		region.setPid(220300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220303);
		region.setName("铁东区");
		region.setName_en("tiedongqu");
		region.setPid(220300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220322);
		region.setName("梨树县");
		region.setName_en("lishuxian");
		region.setPid(220300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220323);
		region.setName("伊通满族自治县");
		region.setName_en("yitongmanzuzizhixian");
		region.setPid(220300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220381);
		region.setName("公主岭市");
		region.setName_en("gongzhulingshi");
		region.setPid(220300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220382);
		region.setName("双辽市");
		region.setName_en("shuangliaoshi");
		region.setPid(220300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220400);
		region.setName("辽源市");
		region.setName_en("liaoyuanshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220402);
		region.setName("龙山区");
		region.setName_en("longshanqu");
		region.setPid(220400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220403);
		region.setName("西安区");
		region.setName_en("xianqu");
		region.setPid(220400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220421);
		region.setName("东丰县");
		region.setName_en("dongfengxian");
		region.setPid(220400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220422);
		region.setName("东辽县");
		region.setName_en("dongliaoxian");
		region.setPid(220400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220500);
		region.setName("通化市");
		region.setName_en("tonghuashi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220502);
		region.setName("东昌区");
		region.setName_en("dongchangqu");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220503);
		region.setName("二道江区");
		region.setName_en("erdaojiangqu");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220521);
		region.setName("通化县");
		region.setName_en("tonghuaxian");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220523);
		region.setName("辉南县");
		region.setName_en("huinanxian");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220524);
		region.setName("柳河县");
		region.setName_en("liuhexian");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220581);
		region.setName("梅河口市");
		region.setName_en("meihekoushi");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220582);
		region.setName("集安市");
		region.setName_en("jianshi");
		region.setPid(220500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220600);
		region.setName("白山市");
		region.setName_en("baishanshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220602);
		region.setName("八道江区");
		region.setName_en("badaojiangqu");
		region.setPid(220600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220621);
		region.setName("抚松县");
		region.setName_en("fusongxian");
		region.setPid(220600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220622);
		region.setName("靖宇县");
		region.setName_en("jingyuxian");
		region.setPid(220600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220623);
		region.setName("长白朝鲜族自治县");
		region.setName_en("zhangbaichaoxianzuzizhixian");
		region.setPid(220600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220625);
		region.setName("江源区");
		region.setName_en("jiangyuanqu");
		region.setPid(220600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220681);
		region.setName("临江市");
		region.setName_en("linjiangshi");
		region.setPid(220600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220700);
		region.setName("松原市");
		region.setName_en("songyuanshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220702);
		region.setName("宁江区");
		region.setName_en("ningjiangqu");
		region.setPid(220700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220721);
		region.setName("前郭尔罗斯蒙古族自治县");
		region.setName_en("qianguoerluosimengguzuzizhixian");
		region.setPid(220700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220722);
		region.setName("长岭县");
		region.setName_en("zhanglingxian");
		region.setPid(220700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220723);
		region.setName("乾安县");
		region.setName_en("qiananxian");
		region.setPid(220700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220724);
		region.setName("扶余市");
		region.setName_en("fuyushi");
		region.setPid(220700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220800);
		region.setName("白城市");
		region.setName_en("baichengshi");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220802);
		region.setName("洮北区");
		region.setName_en("taobeiqu");
		region.setPid(220800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220821);
		region.setName("镇赉县");
		region.setName_en("zhenlaixian");
		region.setPid(220800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220822);
		region.setName("通榆县");
		region.setName_en("tongyuxian");
		region.setPid(220800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220881);
		region.setName("洮南市");
		region.setName_en("taonanshi");
		region.setPid(220800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(220882);
		region.setName("大安市");
		region.setName_en("daanshi");
		region.setPid(220800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222400);
		region.setName("延边朝鲜族自治州");
		region.setName_en("chaoxianzizhiqu");
		region.setPid(220000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222401);
		region.setName("延吉市");
		region.setName_en("yanjishi");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222402);
		region.setName("图们市");
		region.setName_en("tumenshi");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222403);
		region.setName("敦化市");
		region.setName_en("dunhuashi");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222404);
		region.setName("珲春市");
		region.setName_en("hunchunshi");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222405);
		region.setName("龙井市");
		region.setName_en("longjingshi");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222406);
		region.setName("和龙市");
		region.setName_en("helongshi");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222424);
		region.setName("汪清县");
		region.setName_en("wangqingxian");
		region.setPid(222400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(222426);
		region.setName("安图县");
		region.setName_en("antuxian");
		region.setPid(222400);
		regionMapper.insert(region);
	}

	private void createHeiLongJiang(){
		Region region;
		region=new Region();
		region.setId(230000);
		region.setName("黑龙江省");
		region.setName_en("HeiLongJiang");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230100);
		region.setName("哈尔滨市");
		region.setName_en("haerbinshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230102);
		region.setName("道里区");
		region.setName_en("daoliqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230103);
		region.setName("南岗区");
		region.setName_en("nangangqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230104);
		region.setName("道外区");
		region.setName_en("daowaiqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230106);
		region.setName("香坊区");
		region.setName_en("xiangfangqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230107);
		region.setName("动力区");
		region.setName_en("dongliqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230108);
		region.setName("平房区");
		region.setName_en("pingfangqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230109);
		region.setName("松北区");
		region.setName_en("songbeiqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230111);
		region.setName("呼兰区");
		region.setName_en("hulanqu");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230123);
		region.setName("依兰县");
		region.setName_en("yilanxian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230124);
		region.setName("方正县");
		region.setName_en("fangzhengxian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230125);
		region.setName("宾县");
		region.setName_en("binxian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230126);
		region.setName("巴彦县");
		region.setName_en("bayanxian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230127);
		region.setName("木兰县");
		region.setName_en("mulanxian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230128);
		region.setName("通河县");
		region.setName_en("tonghexian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230129);
		region.setName("延寿县");
		region.setName_en("yanshouxian");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230181);
		region.setName("阿城市");
		region.setName_en("achengshi");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230182);
		region.setName("双城市");
		region.setName_en("shuangchengshi");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230183);
		region.setName("尚志市");
		region.setName_en("shangzhishi");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230184);
		region.setName("五常市");
		region.setName_en("wuchangshi");
		region.setPid(230100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230200);
		region.setName("齐齐哈尔市");
		region.setName_en("qiqihaershi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230202);
		region.setName("龙沙区");
		region.setName_en("longshaqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230203);
		region.setName("建华区");
		region.setName_en("jianhuaqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230204);
		region.setName("铁锋区");
		region.setName_en("tiefengqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230205);
		region.setName("昂昂溪区");
		region.setName_en("angangxiqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230206);
		region.setName("富拉尔基区");
		region.setName_en("fulaerjiqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230207);
		region.setName("碾子山区");
		region.setName_en("nianzishanqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230208);
		region.setName("梅里斯达斡尔族区");
		region.setName_en("meilisidawoerzuqu");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230221);
		region.setName("龙江县");
		region.setName_en("longjiangxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230223);
		region.setName("依安县");
		region.setName_en("yianxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230224);
		region.setName("泰来县");
		region.setName_en("tailaixian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230225);
		region.setName("甘南县");
		region.setName_en("gannanxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230227);
		region.setName("富裕县");
		region.setName_en("fuyuxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230229);
		region.setName("克山县");
		region.setName_en("keshanxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230230);
		region.setName("克东县");
		region.setName_en("kedongxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230231);
		region.setName("拜泉县");
		region.setName_en("baiquanxian");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230281);
		region.setName("讷河市");
		region.setName_en("neheshi");
		region.setPid(230200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230300);
		region.setName("鸡西市");
		region.setName_en("jixishi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230302);
		region.setName("鸡冠区");
		region.setName_en("jiguanqu");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230303);
		region.setName("恒山区");
		region.setName_en("hengshanqu");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230304);
		region.setName("滴道区");
		region.setName_en("didaoqu");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230305);
		region.setName("梨树区");
		region.setName_en("lishuqu");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230306);
		region.setName("城子河区");
		region.setName_en("chengzihequ");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230307);
		region.setName("麻山区");
		region.setName_en("mashanqu");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230321);
		region.setName("鸡东县");
		region.setName_en("jidongxian");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230381);
		region.setName("虎林市");
		region.setName_en("hulinshi");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230382);
		region.setName("密山市");
		region.setName_en("mishanshi");
		region.setPid(230300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230400);
		region.setName("鹤岗市");
		region.setName_en("hegangshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230402);
		region.setName("向阳区");
		region.setName_en("xiangyangqu");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230403);
		region.setName("工农区");
		region.setName_en("gongnongqu");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230404);
		region.setName("南山区");
		region.setName_en("nanshanqu");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230405);
		region.setName("兴安区");
		region.setName_en("xinganqu");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230406);
		region.setName("东山区");
		region.setName_en("dongshanqu");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230407);
		region.setName("兴山区");
		region.setName_en("xingshanqu");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230421);
		region.setName("萝北县");
		region.setName_en("luobeixian");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230422);
		region.setName("绥滨县");
		region.setName_en("suibinxian");
		region.setPid(230400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230500);
		region.setName("双鸭山市");
		region.setName_en("shuangyashanshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230502);
		region.setName("尖山区");
		region.setName_en("jianshanqu");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230503);
		region.setName("岭东区");
		region.setName_en("lingdongqu");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230505);
		region.setName("四方台区");
		region.setName_en("sifangtaiqu");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230506);
		region.setName("宝山区");
		region.setName_en("baoshanqu");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230521);
		region.setName("集贤县");
		region.setName_en("jixianxian");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230522);
		region.setName("友谊县");
		region.setName_en("youyixian");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230523);
		region.setName("宝清县");
		region.setName_en("baoqingxian");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230524);
		region.setName("饶河县");
		region.setName_en("raohexian");
		region.setPid(230500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230600);
		region.setName("大庆市");
		region.setName_en("daqingshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230602);
		region.setName("萨尔图区");
		region.setName_en("saertuqu");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230603);
		region.setName("龙凤区");
		region.setName_en("longfengqu");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230604);
		region.setName("让胡路区");
		region.setName_en("ranghuluqu");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230605);
		region.setName("红岗区");
		region.setName_en("honggangqu");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230606);
		region.setName("大同区");
		region.setName_en("datongqu");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230621);
		region.setName("肇州县");
		region.setName_en("zhaozhouxian");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230622);
		region.setName("肇源县");
		region.setName_en("zhaoyuanxian");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230623);
		region.setName("林甸县");
		region.setName_en("lindianxian");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230624);
		region.setName("杜尔伯特蒙古族自治县");
		region.setName_en("duerbotemengguzuzizhixian");
		region.setPid(230600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230700);
		region.setName("伊春市");
		region.setName_en("yichunshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230702);
		region.setName("伊春区");
		region.setName_en("yichunqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230703);
		region.setName("南岔区");
		region.setName_en("nanchaqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230704);
		region.setName("友好区");
		region.setName_en("youhaoqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230705);
		region.setName("西林区");
		region.setName_en("xilinqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230706);
		region.setName("翠峦区");
		region.setName_en("cuiluanqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230707);
		region.setName("新青区");
		region.setName_en("xinqingqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230708);
		region.setName("美溪区");
		region.setName_en("meixiqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230709);
		region.setName("金山屯区");
		region.setName_en("jinshantunqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230710);
		region.setName("五营区");
		region.setName_en("wuyingqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230711);
		region.setName("乌马河区");
		region.setName_en("wumahequ");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230712);
		region.setName("汤旺河区");
		region.setName_en("tangwanghequ");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230713);
		region.setName("带岭区");
		region.setName_en("dailingqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230714);
		region.setName("乌伊岭区");
		region.setName_en("wuyilingqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230715);
		region.setName("红星区");
		region.setName_en("hongxingqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230716);
		region.setName("上甘岭区");
		region.setName_en("shangganlingqu");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230722);
		region.setName("嘉荫县");
		region.setName_en("jiayinxian");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230781);
		region.setName("铁力市");
		region.setName_en("tielishi");
		region.setPid(230700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230800);
		region.setName("佳木斯市");
		region.setName_en("jiamusishi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230803);
		region.setName("向阳区");
		region.setName_en("xiangyangqu");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230804);
		region.setName("前进区");
		region.setName_en("qianjinqu");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230805);
		region.setName("东风区");
		region.setName_en("dongfengqu");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230811);
		region.setName("郊区");
		region.setName_en("jiaoqu");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230822);
		region.setName("桦南县");
		region.setName_en("huananxian");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230826);
		region.setName("桦川县");
		region.setName_en("huachuanxian");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230828);
		region.setName("汤原县");
		region.setName_en("tangyuanxian");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230833);
		region.setName("抚远县");
		region.setName_en("fuyuanxian");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230881);
		region.setName("同江市");
		region.setName_en("tongjiangshi");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230882);
		region.setName("富锦市");
		region.setName_en("fujinshi");
		region.setPid(230800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230900);
		region.setName("七台河市");
		region.setName_en("qitaiheshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230902);
		region.setName("新兴区");
		region.setName_en("xinxingqu");
		region.setPid(230900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230903);
		region.setName("桃山区");
		region.setName_en("taoshanqu");
		region.setPid(230900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230904);
		region.setName("茄子河区");
		region.setName_en("qiezihequ");
		region.setPid(230900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(230921);
		region.setName("勃利县");
		region.setName_en("bolixian");
		region.setPid(230900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231000);
		region.setName("牡丹江市");
		region.setName_en("mudanjiangshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231002);
		region.setName("东安区");
		region.setName_en("donganqu");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231003);
		region.setName("阳明区");
		region.setName_en("yangmingqu");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231004);
		region.setName("爱民区");
		region.setName_en("aiminqu");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231005);
		region.setName("西安区");
		region.setName_en("xianqu");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231024);
		region.setName("东宁县");
		region.setName_en("dongningxian");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231025);
		region.setName("林口县");
		region.setName_en("linkouxian");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231081);
		region.setName("绥芬河市");
		region.setName_en("suifenheshi");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231083);
		region.setName("海林市");
		region.setName_en("hailinshi");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231084);
		region.setName("宁安市");
		region.setName_en("ninganshi");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231085);
		region.setName("穆棱市");
		region.setName_en("mulengshi");
		region.setPid(231000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231100);
		region.setName("黑河市");
		region.setName_en("heiheshi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231102);
		region.setName("爱辉区");
		region.setName_en("aihuiqu");
		region.setPid(231100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231121);
		region.setName("嫩江县");
		region.setName_en("nenjiangxian");
		region.setPid(231100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231123);
		region.setName("逊克县");
		region.setName_en("xunkexian");
		region.setPid(231100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231124);
		region.setName("孙吴县");
		region.setName_en("sunwuxian");
		region.setPid(231100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231181);
		region.setName("北安市");
		region.setName_en("beianshi");
		region.setPid(231100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231182);
		region.setName("五大连池市");
		region.setName_en("wudalianchishi");
		region.setPid(231100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231200);
		region.setName("绥化市");
		region.setName_en("suihuashi");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231201);
		region.setName("北林区");
		region.setName_en("beilinqu");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231221);
		region.setName("望奎县");
		region.setName_en("wangkuixian");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231222);
		region.setName("兰西县");
		region.setName_en("lanxixian");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231223);
		region.setName("青冈县");
		region.setName_en("qinggangxian");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231224);
		region.setName("庆安县");
		region.setName_en("qinganxian");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231225);
		region.setName("明水县");
		region.setName_en("mingshuixian");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231226);
		region.setName("绥棱县");
		region.setName_en("suilengxian");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231281);
		region.setName("安达市");
		region.setName_en("andashi");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231282);
		region.setName("肇东市");
		region.setName_en("zhaodongshi");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(231283);
		region.setName("海伦市");
		region.setName_en("hailunshi");
		region.setPid(231200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232700);
		region.setName("大兴安岭地区");
		region.setName_en("daxinganling");
		region.setPid(230000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232701);
		region.setName("加格达奇区");
		region.setName_en("jiagedaqiqu");
		region.setPid(232700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232702);
		region.setName("松岭区");
		region.setName_en("songlingqu");
		region.setPid(232700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232703);
		region.setName("新林区");
		region.setName_en("xinlinqu");
		region.setPid(232700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232704);
		region.setName("呼中区");
		region.setName_en("huzhongqu");
		region.setPid(232700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232721);
		region.setName("呼玛县");
		region.setName_en("humaxian");
		region.setPid(232700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232722);
		region.setName("塔河县");
		region.setName_en("tahexian");
		region.setPid(232700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(232723);
		region.setName("漠河县");
		region.setName_en("mohexian");
		region.setPid(232700);
		regionMapper.insert(region);
	}

	private void createShangHai(){
		Region region;
		region=new Region();
		region.setId(310000);
		region.setName("上海市");
		region.setName_en("ShangHai");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310001);
		region.setName("上海市");
		region.setName_en("ShangHai");
		region.setPid(310000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310100);
		region.setName("黄浦区");
		region.setName_en("huangpuqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310300);
		region.setName("卢湾区");
		region.setName_en("luwanqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310400);
		region.setName("徐汇区");
		region.setName_en("xuhuiqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310500);
		region.setName("长宁区");
		region.setName_en("zhangningqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310600);
		region.setName("静安区");
		region.setName_en("jinganqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310700);
		region.setName("普陀区");
		region.setName_en("putuoqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310800);
		region.setName("闸北区");
		region.setName_en("zhabeiqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(310900);
		region.setName("虹口区");
		region.setName_en("hongkouqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311000);
		region.setName("杨浦区");
		region.setName_en("yangpuqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311200);
		region.setName("闵行区");
		region.setName_en("minxingqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311300);
		region.setName("宝山区");
		region.setName_en("baoshanqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311400);
		region.setName("嘉定区");
		region.setName_en("jiadingqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311500);
		region.setName("浦东新区");
		region.setName_en("pudongxinqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311600);
		region.setName("金山区");
		region.setName_en("jinshanqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311700);
		region.setName("松江区");
		region.setName_en("songjiangqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311800);
		region.setName("青浦区");
		region.setName_en("qingpuqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(311900);
		region.setName("南汇区");
		region.setName_en("nanhuiqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(312000);
		region.setName("奉贤区");
		region.setName_en("fengxianqu");
		region.setPid(310001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(313000);
		region.setName("崇明县");
		region.setName_en("chongmingxian");
		region.setPid(310001);
		regionMapper.insert(region);
	}

	private void createJiangSu(){
		Region region;
		region=new Region();
		region.setId(320000);
		region.setName("江苏省");
		region.setName_en("JiangSu");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320100);
		region.setName("南京市");
		region.setName_en("nanjingshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320102);
		region.setName("玄武区");
		region.setName_en("xuanwuqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320103);
		region.setName("白下区");
		region.setName_en("baixiaqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320104);
		region.setName("秦淮区");
		region.setName_en("qinhuaiqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320105);
		region.setName("建邺区");
		region.setName_en("jianyequ");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320106);
		region.setName("鼓楼区");
		region.setName_en("gulouqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320107);
		region.setName("下关区");
		region.setName_en("xiaguanqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320111);
		region.setName("浦口区");
		region.setName_en("pukouqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320113);
		region.setName("栖霞区");
		region.setName_en("qixiaqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320114);
		region.setName("雨花台区");
		region.setName_en("yuhuataiqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320115);
		region.setName("江宁区");
		region.setName_en("jiangningqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320116);
		region.setName("六合区");
		region.setName_en("luhequ");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320124);
		region.setName("溧水区");
		region.setName_en("lishuiqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320125);
		region.setName("高淳区");
		region.setName_en("gaochunqu");
		region.setPid(320100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320200);
		region.setName("无锡市");
		region.setName_en("wuxishi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320202);
		region.setName("崇安区");
		region.setName_en("chonganqu");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320203);
		region.setName("南长区");
		region.setName_en("nanzhangqu");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320204);
		region.setName("北塘区");
		region.setName_en("beitangqu");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320205);
		region.setName("锡山区");
		region.setName_en("xishanqu");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320206);
		region.setName("惠山区");
		region.setName_en("huishanqu");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320211);
		region.setName("滨湖区");
		region.setName_en("binhuqu");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320281);
		region.setName("江阴市");
		region.setName_en("jiangyinshi");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320282);
		region.setName("宜兴市");
		region.setName_en("yixingshi");
		region.setPid(320200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320300);
		region.setName("徐州市");
		region.setName_en("xuzhoushi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320301);
		region.setName("泉山区");
		region.setName_en("quanshanqu");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320302);
		region.setName("鼓楼区");
		region.setName_en("gulouqu");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320303);
		region.setName("云龙区");
		region.setName_en("yunlongqu");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320304);
		region.setName("九里区");
		region.setName_en("jiuliqu");
		region.setPid(320301);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320305);
		region.setName("贾汪区");
		region.setName_en("jiawangqu");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320321);
		region.setName("丰县");
		region.setName_en("fengxian");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320322);
		region.setName("沛县");
		region.setName_en("peixian");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320323);
		region.setName("铜山县");
		region.setName_en("tongshanxian");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320324);
		region.setName("睢宁县");
		region.setName_en("suiningxian");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320381);
		region.setName("新沂市");
		region.setName_en("xinyishi");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320382);
		region.setName("邳州市");
		region.setName_en("pizhoushi");
		region.setPid(320300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320400);
		region.setName("常州市");
		region.setName_en("changzhoushi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320402);
		region.setName("天宁区");
		region.setName_en("tianningqu");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320404);
		region.setName("钟楼区");
		region.setName_en("zhonglouqu");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320405);
		region.setName("戚墅堰区");
		region.setName_en("qishuyanqu");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320411);
		region.setName("新北区");
		region.setName_en("xinbeiqu");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320412);
		region.setName("武进区");
		region.setName_en("wujinqu");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320481);
		region.setName("溧阳市");
		region.setName_en("liyangshi");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320482);
		region.setName("金坛市");
		region.setName_en("jintanshi");
		region.setPid(320400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320500);
		region.setName("苏州市");
		region.setName_en("suzhoushi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320502);
		region.setName("沧浪区");
		region.setName_en("canglangqu");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320503);
		region.setName("平江区");
		region.setName_en("pingjiangqu");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320504);
		region.setName("金阊区");
		region.setName_en("jinchangqu");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320505);
		region.setName("虎丘区");
		region.setName_en("huqiuqu");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320506);
		region.setName("吴中区");
		region.setName_en("wuzhongqu");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320507);
		region.setName("相城区");
		region.setName_en("xiangchengqu");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320581);
		region.setName("常熟市");
		region.setName_en("changshushi");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320582);
		region.setName("张家港市");
		region.setName_en("zhangjiagangshi");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320583);
		region.setName("昆山市");
		region.setName_en("kunshanshi");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320584);
		region.setName("吴江市");
		region.setName_en("wujiangshi");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320585);
		region.setName("太仓市");
		region.setName_en("taicangshi");
		region.setPid(320500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320600);
		region.setName("南通市");
		region.setName_en("nantongshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320602);
		region.setName("崇川区");
		region.setName_en("chongchuanqu");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320611);
		region.setName("港闸区");
		region.setName_en("gangzhaqu");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320621);
		region.setName("海安县");
		region.setName_en("haianxian");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320623);
		region.setName("如东县");
		region.setName_en("rudongxian");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320681);
		region.setName("启东市");
		region.setName_en("qidongshi");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320682);
		region.setName("如皋市");
		region.setName_en("rugaoshi");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320683);
		region.setName("通州市");
		region.setName_en("tongzhoushi");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320684);
		region.setName("海门市");
		region.setName_en("haimenshi");
		region.setPid(320600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320700);
		region.setName("连云港市");
		region.setName_en("lianyungangshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320703);
		region.setName("连云区");
		region.setName_en("lianyunqu");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320705);
		region.setName("新浦区");
		region.setName_en("xinpuqu");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320706);
		region.setName("海州区");
		region.setName_en("haizhouqu");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320721);
		region.setName("赣榆县");
		region.setName_en("ganyuxian");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320722);
		region.setName("东海县");
		region.setName_en("donghaixian");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320723);
		region.setName("灌云县");
		region.setName_en("guanyunxian");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320724);
		region.setName("灌南县");
		region.setName_en("guannanxian");
		region.setPid(320700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320800);
		region.setName("淮安市");
		region.setName_en("huaianshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320802);
		region.setName("清河区");
		region.setName_en("qinghequ");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320803);
		region.setName("楚州区");
		region.setName_en("chuzhouqu");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320804);
		region.setName("淮阴区");
		region.setName_en("huaiyinqu");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320811);
		region.setName("清浦区");
		region.setName_en("qingpuqu");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320826);
		region.setName("涟水县");
		region.setName_en("lianshuixian");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320829);
		region.setName("洪泽县");
		region.setName_en("hongzexian");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320830);
		region.setName("盱眙县");
		region.setName_en("xuyixian");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320831);
		region.setName("金湖县");
		region.setName_en("jinhuxian");
		region.setPid(320800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320900);
		region.setName("盐城市");
		region.setName_en("yanchengshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320902);
		region.setName("亭湖区");
		region.setName_en("tinghuqu");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320903);
		region.setName("盐都区");
		region.setName_en("yandouqu");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320921);
		region.setName("响水县");
		region.setName_en("xiangshuixian");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320922);
		region.setName("滨海县");
		region.setName_en("binhaixian");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320923);
		region.setName("阜宁县");
		region.setName_en("funingxian");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320924);
		region.setName("射阳县");
		region.setName_en("sheyangxian");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320925);
		region.setName("建湖县");
		region.setName_en("jianhuxian");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320981);
		region.setName("东台市");
		region.setName_en("dongtaishi");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(320982);
		region.setName("大丰市");
		region.setName_en("dafengshi");
		region.setPid(320900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321000);
		region.setName("扬州市");
		region.setName_en("yangzhou");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321002);
		region.setName("广陵区");
		region.setName_en("guanglingqu");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321003);
		region.setName("邗江区");
		region.setName_en("hanjiangqu");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321011);
		region.setName("维扬区");
		region.setName_en("weiyangqu");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321023);
		region.setName("宝应县");
		region.setName_en("baoyingxian");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321081);
		region.setName("仪征市");
		region.setName_en("yizhengshi");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321084);
		region.setName("高邮市");
		region.setName_en("gaoyoushi");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321088);
		region.setName("江都市");
		region.setName_en("jiangdushi");
		region.setPid(321000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321100);
		region.setName("镇江市");
		region.setName_en("zhenjiangshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321102);
		region.setName("京口区");
		region.setName_en("jingkouqu");
		region.setPid(321100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321111);
		region.setName("润州区");
		region.setName_en("runzhouqu");
		region.setPid(321100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321112);
		region.setName("丹徒区");
		region.setName_en("dantuqu");
		region.setPid(321100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321181);
		region.setName("丹阳市");
		region.setName_en("danyangshi");
		region.setPid(321100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321182);
		region.setName("扬中市");
		region.setName_en("yangzhongshi");
		region.setPid(321100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321183);
		region.setName("句容市");
		region.setName_en("jurongshi");
		region.setPid(321100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321200);
		region.setName("泰州市");
		region.setName_en("taizhoushi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321202);
		region.setName("海陵区");
		region.setName_en("hailingqu");
		region.setPid(321200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321203);
		region.setName("高港区");
		region.setName_en("gaogangqu");
		region.setPid(321200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321281);
		region.setName("兴化市");
		region.setName_en("xinghuashi");
		region.setPid(321200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321282);
		region.setName("靖江市");
		region.setName_en("jingjiangshi");
		region.setPid(321200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321283);
		region.setName("泰兴市");
		region.setName_en("taixingshi");
		region.setPid(321200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321284);
		region.setName("姜堰市");
		region.setName_en("jiangyanshi");
		region.setPid(321200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321300);
		region.setName("宿迁市");
		region.setName_en("suqianshi");
		region.setPid(320000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321302);
		region.setName("宿城区");
		region.setName_en("suchengqu");
		region.setPid(321300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321311);
		region.setName("宿豫区");
		region.setName_en("suyuqu");
		region.setPid(321300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321322);
		region.setName("沭阳县");
		region.setName_en("shuyangxian");
		region.setPid(321300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321323);
		region.setName("泗阳县");
		region.setName_en("siyangxian");
		region.setPid(321300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(321324);
		region.setName("泗洪县");
		region.setName_en("sihongxian");
		region.setPid(321300);
		regionMapper.insert(region);
	}

	private void createZheJiang(){
		Region region;
		region=new Region();
		region.setId(330000);
		region.setName("浙江省");
		region.setName_en("ZheJiang");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330100);
		region.setName("杭州市");
		region.setName_en("hangzhoushi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330102);
		region.setName("上城区");
		region.setName_en("shangchengqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330103);
		region.setName("下城区");
		region.setName_en("xiachengqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330104);
		region.setName("江干区");
		region.setName_en("jiangganqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330105);
		region.setName("拱墅区");
		region.setName_en("gongshuqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330106);
		region.setName("西湖区");
		region.setName_en("xihuqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330108);
		region.setName("滨江区");
		region.setName_en("binjiangqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330109);
		region.setName("萧山区");
		region.setName_en("xiaoshanqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330110);
		region.setName("余杭区");
		region.setName_en("yuhangqu");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330122);
		region.setName("桐庐县");
		region.setName_en("tongluxian");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330127);
		region.setName("淳安县");
		region.setName_en("chunanxian");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330182);
		region.setName("建德市");
		region.setName_en("jiandeshi");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330183);
		region.setName("富阳市");
		region.setName_en("fuyangshi");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330185);
		region.setName("临安市");
		region.setName_en("linanshi");
		region.setPid(330100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330200);
		region.setName("宁波市");
		region.setName_en("ningboshi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330203);
		region.setName("海曙区");
		region.setName_en("haishuqu");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330204);
		region.setName("江东区");
		region.setName_en("jiangdongqu");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330205);
		region.setName("江北区");
		region.setName_en("jiangbeiqu");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330206);
		region.setName("北仑区");
		region.setName_en("beilunqu");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330211);
		region.setName("镇海区");
		region.setName_en("zhenhaiqu");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330212);
		region.setName("鄞州区");
		region.setName_en("yinzhouqu");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330225);
		region.setName("象山县");
		region.setName_en("xiangshanxian");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330226);
		region.setName("宁海县");
		region.setName_en("ninghaixian");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330281);
		region.setName("余姚市");
		region.setName_en("yuyaoshi");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330282);
		region.setName("慈溪市");
		region.setName_en("cixishi");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330283);
		region.setName("奉化市");
		region.setName_en("fenghuashi");
		region.setPid(330200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330300);
		region.setName("温州市");
		region.setName_en("wenzhoushi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330302);
		region.setName("鹿城区");
		region.setName_en("luchengqu");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330303);
		region.setName("龙湾区");
		region.setName_en("longwanqu");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330304);
		region.setName("瓯海区");
		region.setName_en("ouhaiqu");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330322);
		region.setName("洞头县");
		region.setName_en("dongtouxian");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330324);
		region.setName("永嘉县");
		region.setName_en("yongjiaxian");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330326);
		region.setName("平阳县");
		region.setName_en("pingyangxian");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330327);
		region.setName("苍南县");
		region.setName_en("cangnanxian");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330328);
		region.setName("文成县");
		region.setName_en("wenchengxian");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330329);
		region.setName("泰顺县");
		region.setName_en("taishunxian");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330381);
		region.setName("瑞安市");
		region.setName_en("ruianshi");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330382);
		region.setName("乐清市");
		region.setName_en("yueqingshi");
		region.setPid(330300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330400);
		region.setName("嘉兴市");
		region.setName_en("jiaxingshi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330402);
		region.setName("南湖区");
		region.setName_en("nanhuqu");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330411);
		region.setName("秀洲区");
		region.setName_en("xiuzhouqu");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330421);
		region.setName("嘉善县");
		region.setName_en("jiashanxian");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330424);
		region.setName("海盐县");
		region.setName_en("haiyanxian");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330481);
		region.setName("海宁市");
		region.setName_en("hainingshi");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330482);
		region.setName("平湖市");
		region.setName_en("pinghushi");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330483);
		region.setName("桐乡市");
		region.setName_en("tongxiangshi");
		region.setPid(330400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330500);
		region.setName("湖州市");
		region.setName_en("huzhoushi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330502);
		region.setName("吴兴区");
		region.setName_en("wuxingqu");
		region.setPid(330500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330503);
		region.setName("南浔区");
		region.setName_en("nanxunqu");
		region.setPid(330500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330521);
		region.setName("德清县");
		region.setName_en("deqingxian");
		region.setPid(330500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330522);
		region.setName("长兴县");
		region.setName_en("changxingxian");
		region.setPid(330500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330523);
		region.setName("安吉县");
		region.setName_en("anjixian");
		region.setPid(330500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330600);
		region.setName("绍兴市");
		region.setName_en("shaoxingshi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330602);
		region.setName("越城区");
		region.setName_en("yuechengqu");
		region.setPid(330600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330621);
		region.setName("绍兴县");
		region.setName_en("shaoxingxian");
		region.setPid(330600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330624);
		region.setName("新昌县");
		region.setName_en("xinchangxian");
		region.setPid(330600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330681);
		region.setName("诸暨市");
		region.setName_en("zhujishi");
		region.setPid(330600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330682);
		region.setName("上虞市");
		region.setName_en("shangyushi");
		region.setPid(330600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330683);
		region.setName("嵊州市");
		region.setName_en("shengzhoushi");
		region.setPid(330600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330700);
		region.setName("金华市");
		region.setName_en("jinhuashi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330702);
		region.setName("婺城区");
		region.setName_en("wuchengqu");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330703);
		region.setName("金东区");
		region.setName_en("jindongqu");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330723);
		region.setName("武义县");
		region.setName_en("wuyixian");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330726);
		region.setName("浦江县");
		region.setName_en("pujiangxian");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330727);
		region.setName("磐安县");
		region.setName_en("pananxian");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330781);
		region.setName("兰溪市");
		region.setName_en("lanxishi");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330782);
		region.setName("义乌市");
		region.setName_en("yiwushi");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330783);
		region.setName("东阳市");
		region.setName_en("dongyangshi");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330784);
		region.setName("永康市");
		region.setName_en("yongkangshi");
		region.setPid(330700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330800);
		region.setName("衢州市");
		region.setName_en("quzhoushi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330802);
		region.setName("柯城区");
		region.setName_en("kechengqu");
		region.setPid(330800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330803);
		region.setName("衢江区");
		region.setName_en("qujiangqu");
		region.setPid(330800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330822);
		region.setName("常山县");
		region.setName_en("changshanxian");
		region.setPid(330800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330824);
		region.setName("开化县");
		region.setName_en("kaihuaxian");
		region.setPid(330800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330825);
		region.setName("龙游县");
		region.setName_en("longyouxian");
		region.setPid(330800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330881);
		region.setName("江山市");
		region.setName_en("jiangshanshi");
		region.setPid(330800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330900);
		region.setName("舟山市");
		region.setName_en("zhoushanshi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330902);
		region.setName("定海区");
		region.setName_en("dinghaiqu");
		region.setPid(330900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330903);
		region.setName("普陀区");
		region.setName_en("putuoqu");
		region.setPid(330900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330921);
		region.setName("岱山县");
		region.setName_en("daishanxian");
		region.setPid(330900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(330922);
		region.setName("嵊泗县");
		region.setName_en("shengsixian");
		region.setPid(330900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331000);
		region.setName("台州市");
		region.setName_en("taizhoushi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331002);
		region.setName("椒江区");
		region.setName_en("jiaojiangqu");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331003);
		region.setName("黄岩区");
		region.setName_en("huangyanqu");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331004);
		region.setName("路桥区");
		region.setName_en("luqiaoqu");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331021);
		region.setName("玉环县");
		region.setName_en("yuhuanxian");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331022);
		region.setName("三门县");
		region.setName_en("sanmenxian");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331023);
		region.setName("天台县");
		region.setName_en("tiantaixian");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331024);
		region.setName("仙居县");
		region.setName_en("xianjuxian");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331081);
		region.setName("温岭市");
		region.setName_en("wenlingshi");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331082);
		region.setName("临海市");
		region.setName_en("linhaishi");
		region.setPid(331000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331100);
		region.setName("丽水市");
		region.setName_en("lishuishi");
		region.setPid(330000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331102);
		region.setName("莲都区");
		region.setName_en("liandouqu");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331121);
		region.setName("青田县");
		region.setName_en("qingtianxian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331122);
		region.setName("缙云县");
		region.setName_en("jinyunxian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331123);
		region.setName("遂昌县");
		region.setName_en("suichangxian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331124);
		region.setName("松阳县");
		region.setName_en("songyangxian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331125);
		region.setName("云和县");
		region.setName_en("yunhexian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331126);
		region.setName("庆元县");
		region.setName_en("qingyuanxian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331127);
		region.setName("景宁畲族自治县");
		region.setName_en("jingningshezuzizhixian");
		region.setPid(331100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(331181);
		region.setName("龙泉市");
		region.setName_en("longquanshi");
		region.setPid(331100);
		regionMapper.insert(region);
	}

	private void createAnHui(){
		Region region;
		region=new Region();
		region.setId(340000);
		region.setName("安徽省");
		region.setName_en("AnHui");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340100);
		region.setName("合肥市");
		region.setName_en("hefeishi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340102);
		region.setName("瑶海区");
		region.setName_en("yaohaiqu");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340103);
		region.setName("庐阳区");
		region.setName_en("luyangqu");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340104);
		region.setName("蜀山区");
		region.setName_en("shushanqu");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340111);
		region.setName("包河区");
		region.setName_en("baohequ");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340121);
		region.setName("长丰县");
		region.setName_en("zhangfengxian");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340122);
		region.setName("肥东县");
		region.setName_en("feidongxian");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340123);
		region.setName("肥西县");
		region.setName_en("feixixian");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340124);
		region.setName("庐江县");
		region.setName_en("lujiangxian");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340181);
		region.setName("巢湖市");
		region.setName_en("chaohushi");
		region.setPid(340100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340200);
		region.setName("芜湖市");
		region.setName_en("wuhushi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340202);
		region.setName("镜湖区");
		region.setName_en("jinghuqu");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340203);
		region.setName("马塘区");
		region.setName_en("matangqu");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340207);
		region.setName("鸠江区");
		region.setName_en("jiujiangqu");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340221);
		region.setName("芜湖县");
		region.setName_en("wuhuxian");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340222);
		region.setName("繁昌县");
		region.setName_en("fanchangxian");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340223);
		region.setName("南陵县");
		region.setName_en("nanlingxian");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340225);
		region.setName("无为县");
		region.setName_en("wuweixian");
		region.setPid(340200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340300);
		region.setName("蚌埠市");
		region.setName_en("bengbushi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340302);
		region.setName("龙子湖区");
		region.setName_en("longzihuqu");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340303);
		region.setName("蚌山区");
		region.setName_en("bangshanqu");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340304);
		region.setName("禹会区");
		region.setName_en("yuhuiqu");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340311);
		region.setName("淮上区");
		region.setName_en("huaishangqu");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340321);
		region.setName("怀远县");
		region.setName_en("huaiyuanxian");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340322);
		region.setName("五河县");
		region.setName_en("wuhexian");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340323);
		region.setName("固镇县");
		region.setName_en("guzhenxian");
		region.setPid(340300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340400);
		region.setName("淮南市");
		region.setName_en("huainanshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340402);
		region.setName("大通区");
		region.setName_en("datongqu");
		region.setPid(340400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340403);
		region.setName("田家庵区");
		region.setName_en("tianjiaanqu");
		region.setPid(340400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340404);
		region.setName("谢家集区");
		region.setName_en("xiejiajiqu");
		region.setPid(340400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340405);
		region.setName("八公山区");
		region.setName_en("bagongshanqu");
		region.setPid(340400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340406);
		region.setName("潘集区");
		region.setName_en("panjiqu");
		region.setPid(340400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340421);
		region.setName("凤台县");
		region.setName_en("fengtaixian");
		region.setPid(340400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340500);
		region.setName("马鞍山市");
		region.setName_en("maanshanshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340502);
		region.setName("金家庄区");
		region.setName_en("jinjiazhuangqu");
		region.setPid(340500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340503);
		region.setName("花山区");
		region.setName_en("huashanqu");
		region.setPid(340500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340504);
		region.setName("雨山区");
		region.setName_en("yushanqu");
		region.setPid(340500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340521);
		region.setName("当涂县");
		region.setName_en("dangtuxian");
		region.setPid(340500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340522);
		region.setName("含山县");
		region.setName_en("hanshanxian");
		region.setPid(340500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340523);
		region.setName("和县");
		region.setName_en("hexian");
		region.setPid(340500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340600);
		region.setName("淮北市");
		region.setName_en("huaibeishi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340602);
		region.setName("杜集区");
		region.setName_en("dujiqu");
		region.setPid(340600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340603);
		region.setName("相山区");
		region.setName_en("xiangshanqu");
		region.setPid(340600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340604);
		region.setName("烈山区");
		region.setName_en("lieshanqu");
		region.setPid(340600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340621);
		region.setName("濉溪县");
		region.setName_en("suixixian");
		region.setPid(340600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340700);
		region.setName("铜陵市");
		region.setName_en("tonglingshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340702);
		region.setName("铜官山区");
		region.setName_en("tongguanshanqu");
		region.setPid(340700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340703);
		region.setName("狮子山区");
		region.setName_en("shizishanqu");
		region.setPid(340700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340711);
		region.setName("郊区");
		region.setName_en("jiaoqu");
		region.setPid(340700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340721);
		region.setName("铜陵县");
		region.setName_en("tonglingxian");
		region.setPid(340700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340800);
		region.setName("安庆市");
		region.setName_en("anqingshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340802);
		region.setName("迎江区");
		region.setName_en("yingjiangqu");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340803);
		region.setName("大观区");
		region.setName_en("daguanqu");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340811);
		region.setName("宜秀区");
		region.setName_en("yixiuqu");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340822);
		region.setName("怀宁县");
		region.setName_en("huainingxian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340823);
		region.setName("枞阳县");
		region.setName_en("zongyangxian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340824);
		region.setName("潜山县");
		region.setName_en("qianshanxian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340825);
		region.setName("太湖县");
		region.setName_en("taihuxian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340826);
		region.setName("宿松县");
		region.setName_en("susongxian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340827);
		region.setName("望江县");
		region.setName_en("wangjiangxian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340828);
		region.setName("岳西县");
		region.setName_en("yuexixian");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(340881);
		region.setName("桐城市");
		region.setName_en("tongchengshi");
		region.setPid(340800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341000);
		region.setName("黄山市");
		region.setName_en("huangshanshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341001);
		region.setName("黄山区");
		region.setName_en("huangshanqu");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341002);
		region.setName("屯溪区");
		region.setName_en("tunxiqu");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341004);
		region.setName("徽州区");
		region.setName_en("huizhouqu");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341021);
		region.setName("歙县");
		region.setName_en("shexian");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341022);
		region.setName("休宁县");
		region.setName_en("xiuningxian");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341023);
		region.setName("黟县");
		region.setName_en("yixian");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341024);
		region.setName("祁门县");
		region.setName_en("qimenxian");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341091);
		region.setName("汤口镇");
		region.setName_en("tangkouzhen");
		region.setPid(341000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341100);
		region.setName("滁州市");
		region.setName_en("chuzhoushi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341102);
		region.setName("琅琊区");
		region.setName_en("langyaqu");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341103);
		region.setName("南谯区");
		region.setName_en("nanqiaoqu");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341122);
		region.setName("来安县");
		region.setName_en("laianxian");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341124);
		region.setName("全椒县");
		region.setName_en("quanjiaoxian");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341125);
		region.setName("定远县");
		region.setName_en("dingyuanxian");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341126);
		region.setName("凤阳县");
		region.setName_en("fengyangxian");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341181);
		region.setName("天长市");
		region.setName_en("tianzhangshi");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341182);
		region.setName("明光市");
		region.setName_en("mingguangshi");
		region.setPid(341100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341200);
		region.setName("阜阳市");
		region.setName_en("fuyangshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341201);
		region.setName("颍泉区");
		region.setName_en("yingquanqu");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341202);
		region.setName("颍州区");
		region.setName_en("yingzhouqu");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341203);
		region.setName("颍东区");
		region.setName_en("yingdongqu");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341221);
		region.setName("临泉县");
		region.setName_en("linquanxian");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341222);
		region.setName("太和县");
		region.setName_en("taihexian");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341225);
		region.setName("阜南县");
		region.setName_en("funanxian");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341226);
		region.setName("颍上县");
		region.setName_en("yingshangxian");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341282);
		region.setName("界首市");
		region.setName_en("jieshoushi");
		region.setPid(341200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341300);
		region.setName("宿州市");
		region.setName_en("suzhoushi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341302);
		region.setName("埇桥区");
		region.setName_en("yongqiaoqu");
		region.setPid(341300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341321);
		region.setName("砀山县");
		region.setName_en("dangshanxian");
		region.setPid(341300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341322);
		region.setName("萧县");
		region.setName_en("xiaoxian");
		region.setPid(341300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341323);
		region.setName("灵璧县");
		region.setName_en("lingbixian");
		region.setPid(341300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341324);
		region.setName("泗县");
		region.setName_en("sixian");
		region.setPid(341300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341500);
		region.setName("六安市");
		region.setName_en("liuanshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341502);
		region.setName("金安区");
		region.setName_en("jinanqu");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341503);
		region.setName("裕安区");
		region.setName_en("yuanqu");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341521);
		region.setName("寿县");
		region.setName_en("shouxian");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341522);
		region.setName("霍邱县");
		region.setName_en("huoqiuxian");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341523);
		region.setName("舒城县");
		region.setName_en("shuchengxian");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341524);
		region.setName("金寨县");
		region.setName_en("jinzhaixian");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341525);
		region.setName("霍山县");
		region.setName_en("huoshanxian");
		region.setPid(341500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341600);
		region.setName("亳州市");
		region.setName_en("haozhoushi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341601);
		region.setName("谯城区");
		region.setName_en("qiaochengqu");
		region.setPid(341600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341621);
		region.setName("涡阳县");
		region.setName_en("woyangxian");
		region.setPid(341600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341622);
		region.setName("蒙城县");
		region.setName_en("mengchengxian");
		region.setPid(341600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341623);
		region.setName("利辛县");
		region.setName_en("lixinxian");
		region.setPid(341600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341700);
		region.setName("池州市");
		region.setName_en("chizhoushi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341702);
		region.setName("贵池区");
		region.setName_en("guichiqu");
		region.setPid(341700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341721);
		region.setName("东至县");
		region.setName_en("dongzhixian");
		region.setPid(341700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341722);
		region.setName("石台县");
		region.setName_en("shitaixian");
		region.setPid(341700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341723);
		region.setName("青阳县");
		region.setName_en("qingyangxian");
		region.setPid(341700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341800);
		region.setName("宣城市");
		region.setName_en("xuanchengshi");
		region.setPid(340000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341802);
		region.setName("宣州区");
		region.setName_en("xuanzhouqu");
		region.setPid(341800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341821);
		region.setName("郎溪县");
		region.setName_en("langxixian");
		region.setPid(341800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341822);
		region.setName("广德县");
		region.setName_en("guangdexian");
		region.setPid(341800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341823);
		region.setName("泾县");
		region.setName_en("jingxian");
		region.setPid(341800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341824);
		region.setName("绩溪县");
		region.setName_en("jixixian");
		region.setPid(341800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341825);
		region.setName("旌德县");
		region.setName_en("jingdexian");
		region.setPid(341800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(341881);
		region.setName("宁国市");
		region.setName_en("ningguoshi");
		region.setPid(341800);
		regionMapper.insert(region);
	}

	private void createFuJian(){
		Region region;
		region=new Region();
		region.setId(350000);
		region.setName("福建省");
		region.setName_en("FuJian");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350100);
		region.setName("福州市");
		region.setName_en("fuzhoushi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350102);
		region.setName("鼓楼区");
		region.setName_en("gulouqu");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350103);
		region.setName("台江区");
		region.setName_en("taijiangqu");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350104);
		region.setName("仓山区");
		region.setName_en("cangshanqu");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350105);
		region.setName("马尾区");
		region.setName_en("mayiqu");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350111);
		region.setName("晋安区");
		region.setName_en("jinanqu");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350121);
		region.setName("闽侯县");
		region.setName_en("minhouxian");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350122);
		region.setName("连江县");
		region.setName_en("lianjiangxian");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350123);
		region.setName("罗源县");
		region.setName_en("luoyuanxian");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350124);
		region.setName("闽清县");
		region.setName_en("minqingxian");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350125);
		region.setName("永泰县");
		region.setName_en("yongtaixian");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350128);
		region.setName("平潭县");
		region.setName_en("pingtanxian");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350181);
		region.setName("福清市");
		region.setName_en("fuqingshi");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350182);
		region.setName("长乐市");
		region.setName_en("zhangleshi");
		region.setPid(350100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350200);
		region.setName("厦门市");
		region.setName_en("xiamenshi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350203);
		region.setName("思明区");
		region.setName_en("simingqu");
		region.setPid(350200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350205);
		region.setName("海沧区");
		region.setName_en("haicangqu");
		region.setPid(350200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350206);
		region.setName("湖里区");
		region.setName_en("huliqu");
		region.setPid(350200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350211);
		region.setName("集美区");
		region.setName_en("jimeiqu");
		region.setPid(350200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350212);
		region.setName("同安区");
		region.setName_en("tonganqu");
		region.setPid(350200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350213);
		region.setName("翔安区");
		region.setName_en("xianganqu");
		region.setPid(350200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350300);
		region.setName("莆田市");
		region.setName_en("putianshi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350302);
		region.setName("城厢区");
		region.setName_en("chengxiangqu");
		region.setPid(350300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350303);
		region.setName("涵江区");
		region.setName_en("hanjiangqu");
		region.setPid(350300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350304);
		region.setName("荔城区");
		region.setName_en("lichengqu");
		region.setPid(350300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350305);
		region.setName("秀屿区");
		region.setName_en("xiuyuqu");
		region.setPid(350300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350322);
		region.setName("仙游县");
		region.setName_en("xianyouxian");
		region.setPid(350300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350400);
		region.setName("三明市");
		region.setName_en("sanmingshi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350402);
		region.setName("梅列区");
		region.setName_en("meiliequ");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350403);
		region.setName("三元区");
		region.setName_en("sanyuanqu");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350421);
		region.setName("明溪县");
		region.setName_en("mingxixian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350423);
		region.setName("清流县");
		region.setName_en("qingliuxian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350424);
		region.setName("宁化县");
		region.setName_en("ninghuaxian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350425);
		region.setName("大田县");
		region.setName_en("datianxian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350426);
		region.setName("尤溪县");
		region.setName_en("youxixian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350427);
		region.setName("沙县");
		region.setName_en("shaxian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350428);
		region.setName("将乐县");
		region.setName_en("jianglexian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350429);
		region.setName("泰宁县");
		region.setName_en("tainingxian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350430);
		region.setName("建宁县");
		region.setName_en("jianningxian");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350481);
		region.setName("永安市");
		region.setName_en("yonganshi");
		region.setPid(350400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350500);
		region.setName("泉州市");
		region.setName_en("quanzhoushi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350502);
		region.setName("鲤城区");
		region.setName_en("lichengqu");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350503);
		region.setName("丰泽区");
		region.setName_en("fengzequ");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350504);
		region.setName("洛江区");
		region.setName_en("luojiangqu");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350505);
		region.setName("泉港区");
		region.setName_en("quangangqu");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350521);
		region.setName("惠安县");
		region.setName_en("huianxian");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350524);
		region.setName("安溪县");
		region.setName_en("anxixian");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350525);
		region.setName("永春县");
		region.setName_en("yongchunxian");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350526);
		region.setName("德化县");
		region.setName_en("dehuaxian");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350527);
		region.setName("金门县");
		region.setName_en("jinmenxian");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350581);
		region.setName("石狮市");
		region.setName_en("shishishi");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350582);
		region.setName("晋江市");
		region.setName_en("jinjiangshi");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350583);
		region.setName("南安市");
		region.setName_en("nananshi");
		region.setPid(350500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350600);
		region.setName("漳州市");
		region.setName_en("zhangzhoushi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350602);
		region.setName("芗城区");
		region.setName_en("xiangchengqu");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350603);
		region.setName("龙文区");
		region.setName_en("longwenqu");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350622);
		region.setName("云霄县");
		region.setName_en("yunxiaoxian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350623);
		region.setName("漳浦县");
		region.setName_en("zhangpuxian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350624);
		region.setName("诏安县");
		region.setName_en("zhaoanxian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350625);
		region.setName("长泰县");
		region.setName_en("zhangtaixian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350626);
		region.setName("东山县");
		region.setName_en("dongshanxian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350627);
		region.setName("南靖县");
		region.setName_en("nanjingxian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350628);
		region.setName("平和县");
		region.setName_en("pinghexian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350629);
		region.setName("华安县");
		region.setName_en("huaanxian");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350681);
		region.setName("龙海市");
		region.setName_en("longhaishi");
		region.setPid(350600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350700);
		region.setName("南平市");
		region.setName_en("nanpingshi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350702);
		region.setName("延平区");
		region.setName_en("yanpingqu");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350721);
		region.setName("顺昌县");
		region.setName_en("shunchangxian");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350722);
		region.setName("浦城县");
		region.setName_en("puchengxian");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350723);
		region.setName("光泽县");
		region.setName_en("guangzexian");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350724);
		region.setName("松溪县");
		region.setName_en("songxixian");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350725);
		region.setName("政和县");
		region.setName_en("zhenghexian");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350781);
		region.setName("邵武市");
		region.setName_en("shaowushi");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350782);
		region.setName("武夷山市");
		region.setName_en("wuyishanshi");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350783);
		region.setName("建瓯市");
		region.setName_en("jianoushi");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350784);
		region.setName("建阳市");
		region.setName_en("jianyangshi");
		region.setPid(350700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350800);
		region.setName("龙岩市");
		region.setName_en("longyanshi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350802);
		region.setName("新罗区");
		region.setName_en("xinluoqu");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350821);
		region.setName("长汀县");
		region.setName_en("zhangtingxian");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350822);
		region.setName("永定县");
		region.setName_en("yongdingxian");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350823);
		region.setName("上杭县");
		region.setName_en("shanghangxian");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350824);
		region.setName("武平县");
		region.setName_en("wupingxian");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350825);
		region.setName("连城县");
		region.setName_en("lianchengxian");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350881);
		region.setName("漳平市");
		region.setName_en("zhangpingshi");
		region.setPid(350800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350900);
		region.setName("宁德市");
		region.setName_en("ningdeshi");
		region.setPid(350000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350902);
		region.setName("蕉城区");
		region.setName_en("jiaochengqu");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350921);
		region.setName("霞浦县");
		region.setName_en("xiapuxian");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350922);
		region.setName("古田县");
		region.setName_en("gutianxian");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350923);
		region.setName("屏南县");
		region.setName_en("pingnanxian");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350924);
		region.setName("寿宁县");
		region.setName_en("shouningxian");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350925);
		region.setName("周宁县");
		region.setName_en("zhouningxian");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350926);
		region.setName("柘荣县");
		region.setName_en("zherongxian");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350981);
		region.setName("福安市");
		region.setName_en("fuanshi");
		region.setPid(350900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(350982);
		region.setName("福鼎市");
		region.setName_en("fudingshi");
		region.setPid(350900);
		regionMapper.insert(region);
	}

	private void createJiangXi(){
		Region region;
		region=new Region();
		region.setId(360000);
		region.setName("江西省");
		region.setName_en("JiangXi");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360100);
		region.setName("南昌市");
		region.setName_en("nanchangshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360102);
		region.setName("东湖区");
		region.setName_en("donghuqu");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360103);
		region.setName("西湖区");
		region.setName_en("xihuqu");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360104);
		region.setName("青云谱区");
		region.setName_en("qingyunpuqu");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360105);
		region.setName("湾里区");
		region.setName_en("wanliqu");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360111);
		region.setName("青山湖区");
		region.setName_en("qingshanhuqu");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360121);
		region.setName("南昌县");
		region.setName_en("nanchangxian");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360122);
		region.setName("新建县");
		region.setName_en("xinjianxian");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360123);
		region.setName("安义县");
		region.setName_en("anyixian");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360124);
		region.setName("进贤县");
		region.setName_en("jinxianxian");
		region.setPid(360100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360200);
		region.setName("景德镇市");
		region.setName_en("jingdezhenshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360202);
		region.setName("昌江区");
		region.setName_en("changjiangqu");
		region.setPid(360200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360203);
		region.setName("珠山区");
		region.setName_en("zhushanqu");
		region.setPid(360200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360222);
		region.setName("浮梁县");
		region.setName_en("fuliangxian");
		region.setPid(360200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360281);
		region.setName("乐平市");
		region.setName_en("lepingshi");
		region.setPid(360200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360300);
		region.setName("萍乡市");
		region.setName_en("pingxiangshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360302);
		region.setName("安源区");
		region.setName_en("anyuanqu");
		region.setPid(360300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360313);
		region.setName("湘东区");
		region.setName_en("xiangdongqu");
		region.setPid(360300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360321);
		region.setName("莲花县");
		region.setName_en("lianhuaxian");
		region.setPid(360300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360322);
		region.setName("上栗县");
		region.setName_en("shanglixian");
		region.setPid(360300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360323);
		region.setName("芦溪县");
		region.setName_en("luxixian");
		region.setPid(360300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360400);
		region.setName("九江市");
		region.setName_en("jiujiangshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360402);
		region.setName("庐山区");
		region.setName_en("lushanqu");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360403);
		region.setName("浔阳区");
		region.setName_en("xunyangqu");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360421);
		region.setName("九江县");
		region.setName_en("jiujiangxian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360423);
		region.setName("武宁县");
		region.setName_en("wuningxian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360424);
		region.setName("修水县");
		region.setName_en("xiushuixian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360425);
		region.setName("永修县");
		region.setName_en("yongxiuxian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360426);
		region.setName("德安县");
		region.setName_en("deanxian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360427);
		region.setName("星子县");
		region.setName_en("xingzixian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360428);
		region.setName("都昌县");
		region.setName_en("douchangxian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360429);
		region.setName("湖口县");
		region.setName_en("hukouxian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360430);
		region.setName("彭泽县");
		region.setName_en("pengzexian");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360481);
		region.setName("瑞昌市");
		region.setName_en("ruichangshi");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360482);
		region.setName("共青城市");
		region.setName_en("gongqingchengshi");
		region.setPid(360400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360500);
		region.setName("新余市");
		region.setName_en("xinyushi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360502);
		region.setName("渝水区");
		region.setName_en("yushuiqu");
		region.setPid(360500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360521);
		region.setName("分宜县");
		region.setName_en("fenyixian");
		region.setPid(360500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360600);
		region.setName("鹰潭市");
		region.setName_en("yingtanshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360602);
		region.setName("月湖区");
		region.setName_en("yuehuqu");
		region.setPid(360600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360622);
		region.setName("余江县");
		region.setName_en("yujiangxian");
		region.setPid(360600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360681);
		region.setName("贵溪市");
		region.setName_en("guixishi");
		region.setPid(360600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360700);
		region.setName("赣州市");
		region.setName_en("ganzhoushi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360702);
		region.setName("章贡区");
		region.setName_en("zhanggongqu");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360721);
		region.setName("赣县");
		region.setName_en("ganxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360722);
		region.setName("信丰县");
		region.setName_en("xinfengxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360723);
		region.setName("大余县");
		region.setName_en("dayuxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360724);
		region.setName("上犹县");
		region.setName_en("shangyouxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360725);
		region.setName("崇义县");
		region.setName_en("chongyixian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360726);
		region.setName("安远县");
		region.setName_en("anyuanxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360727);
		region.setName("龙南县");
		region.setName_en("longnanxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360728);
		region.setName("定南县");
		region.setName_en("dingnanxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360729);
		region.setName("全南县");
		region.setName_en("quannanxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360730);
		region.setName("宁都县");
		region.setName_en("ningdouxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360731);
		region.setName("于都县");
		region.setName_en("yudouxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360732);
		region.setName("兴国县");
		region.setName_en("xingguoxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360733);
		region.setName("会昌县");
		region.setName_en("huichangxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360734);
		region.setName("寻乌县");
		region.setName_en("xunwuxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360735);
		region.setName("石城县");
		region.setName_en("shichengxian");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360781);
		region.setName("瑞金市");
		region.setName_en("ruijinshi");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360782);
		region.setName("南康市");
		region.setName_en("nankangshi");
		region.setPid(360700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360800);
		region.setName("吉安市");
		region.setName_en("jianshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360802);
		region.setName("吉州区");
		region.setName_en("jizhouqu");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360803);
		region.setName("青原区");
		region.setName_en("qingyuanqu");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360821);
		region.setName("吉安县");
		region.setName_en("jianxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360822);
		region.setName("吉水县");
		region.setName_en("jishuixian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360823);
		region.setName("峡江县");
		region.setName_en("xiajiangxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360824);
		region.setName("新干县");
		region.setName_en("xinganxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360825);
		region.setName("永丰县");
		region.setName_en("yongfengxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360826);
		region.setName("泰和县");
		region.setName_en("taihexian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360827);
		region.setName("遂川县");
		region.setName_en("suichuanxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360828);
		region.setName("万安县");
		region.setName_en("wananxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360829);
		region.setName("安福县");
		region.setName_en("anfuxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360830);
		region.setName("永新县");
		region.setName_en("yongxinxian");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360881);
		region.setName("井冈山市");
		region.setName_en("jinggangshanshi");
		region.setPid(360800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360900);
		region.setName("宜春市");
		region.setName_en("yichunshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360902);
		region.setName("袁州区");
		region.setName_en("yuanzhouqu");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360921);
		region.setName("奉新县");
		region.setName_en("fengxinxian");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360922);
		region.setName("万载县");
		region.setName_en("wanzaixian");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360923);
		region.setName("上高县");
		region.setName_en("shanggaoxian");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360924);
		region.setName("宜丰县");
		region.setName_en("yifengxian");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360925);
		region.setName("靖安县");
		region.setName_en("jinganxian");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360926);
		region.setName("铜鼓县");
		region.setName_en("tongguxian");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360981);
		region.setName("丰城市");
		region.setName_en("fengchengshi");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360982);
		region.setName("樟树市");
		region.setName_en("zhangshushi");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(360983);
		region.setName("高安市");
		region.setName_en("gaoanshi");
		region.setPid(360900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361000);
		region.setName("抚州市");
		region.setName_en("fuzhoushi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361002);
		region.setName("临川区");
		region.setName_en("linchuanqu");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361021);
		region.setName("南城县");
		region.setName_en("nanchengxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361022);
		region.setName("黎川县");
		region.setName_en("lichuanxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361023);
		region.setName("南丰县");
		region.setName_en("nanfengxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361024);
		region.setName("崇仁县");
		region.setName_en("chongrenxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361025);
		region.setName("乐安县");
		region.setName_en("leanxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361026);
		region.setName("宜黄县");
		region.setName_en("yihuangxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361027);
		region.setName("金溪县");
		region.setName_en("jinxixian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361028);
		region.setName("资溪县");
		region.setName_en("zixixian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361029);
		region.setName("东乡县");
		region.setName_en("dongxiangxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361030);
		region.setName("广昌县");
		region.setName_en("guangchangxian");
		region.setPid(361000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361100);
		region.setName("上饶市");
		region.setName_en("shangraoshi");
		region.setPid(360000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361102);
		region.setName("信州区");
		region.setName_en("xinzhouqu");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361121);
		region.setName("上饶县");
		region.setName_en("shangraoxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361122);
		region.setName("广丰县");
		region.setName_en("guangfengxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361123);
		region.setName("玉山县");
		region.setName_en("yushanxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361124);
		region.setName("铅山县");
		region.setName_en("yanshanxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361125);
		region.setName("横峰县");
		region.setName_en("hengfengxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361126);
		region.setName("弋阳县");
		region.setName_en("yiyangxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361127);
		region.setName("余干县");
		region.setName_en("yuganxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361128);
		region.setName("鄱阳县");
		region.setName_en("poyangxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361129);
		region.setName("万年县");
		region.setName_en("wannianxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361130);
		region.setName("婺源县");
		region.setName_en("wuyuanxian");
		region.setPid(361100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(361181);
		region.setName("德兴市");
		region.setName_en("dexingshi");
		region.setPid(361100);
		regionMapper.insert(region);
	}

	private void createShanDong(){
		Region region;
		region=new Region();
		region.setId(370000);
		region.setName("山东省");
		region.setName_en("ShanDong");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370100);
		region.setName("济南市");
		region.setName_en("jinanshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370102);
		region.setName("历下区");
		region.setName_en("lixiaqu");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370103);
		region.setName("市中区");
		region.setName_en("shizhongqu");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370104);
		region.setName("槐荫区");
		region.setName_en("huaiyinqu");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370105);
		region.setName("天桥区");
		region.setName_en("tianqiaoqu");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370112);
		region.setName("历城区");
		region.setName_en("lichengqu");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370113);
		region.setName("长清区");
		region.setName_en("zhangqingqu");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370124);
		region.setName("平阴县");
		region.setName_en("pingyinxian");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370125);
		region.setName("济阳县");
		region.setName_en("jiyangxian");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370126);
		region.setName("商河县");
		region.setName_en("shanghexian");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370181);
		region.setName("章丘市");
		region.setName_en("zhangqiushi");
		region.setPid(370100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370200);
		region.setName("青岛市");
		region.setName_en("qingdaoshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370202);
		region.setName("市南区");
		region.setName_en("shinanqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370203);
		region.setName("市北区");
		region.setName_en("shibeiqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370205);
		region.setName("四方区");
		region.setName_en("sifangqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370211);
		region.setName("黄岛区");
		region.setName_en("huangdaoqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370212);
		region.setName("崂山区");
		region.setName_en("laoshanqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370213);
		region.setName("李沧区");
		region.setName_en("licangqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370214);
		region.setName("城阳区");
		region.setName_en("chengyangqu");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370281);
		region.setName("胶州市");
		region.setName_en("jiaozhoushi");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370282);
		region.setName("即墨市");
		region.setName_en("jimoshi");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370283);
		region.setName("平度市");
		region.setName_en("pingdushi");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370284);
		region.setName("胶南市");
		region.setName_en("jiaonanshi");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370285);
		region.setName("莱西市");
		region.setName_en("laixishi");
		region.setPid(370200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370300);
		region.setName("淄博市");
		region.setName_en("ziboshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370302);
		region.setName("淄川区");
		region.setName_en("zichuanqu");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370303);
		region.setName("张店区");
		region.setName_en("zhangdianqu");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370304);
		region.setName("博山区");
		region.setName_en("boshanqu");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370305);
		region.setName("临淄区");
		region.setName_en("linziqu");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370306);
		region.setName("周村区");
		region.setName_en("zhoucunqu");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370321);
		region.setName("桓台县");
		region.setName_en("huantaixian");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370322);
		region.setName("高青县");
		region.setName_en("gaoqingxian");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370323);
		region.setName("沂源县");
		region.setName_en("yiyuanxian");
		region.setPid(370300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370400);
		region.setName("枣庄市");
		region.setName_en("zaozhuangshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370402);
		region.setName("市中区");
		region.setName_en("shizhongqu");
		region.setPid(370400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370403);
		region.setName("薛城区");
		region.setName_en("xuechengqu");
		region.setPid(370400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370404);
		region.setName("峄城区");
		region.setName_en("yichengqu");
		region.setPid(370400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370405);
		region.setName("台儿庄区");
		region.setName_en("taierzhuangqu");
		region.setPid(370400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370406);
		region.setName("山亭区");
		region.setName_en("shantingqu");
		region.setPid(370400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370481);
		region.setName("滕州市");
		region.setName_en("tengzhoushi");
		region.setPid(370400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370500);
		region.setName("东营市");
		region.setName_en("dongyingshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370502);
		region.setName("东营区");
		region.setName_en("dongyingqu");
		region.setPid(370500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370503);
		region.setName("河口区");
		region.setName_en("hekouqu");
		region.setPid(370500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370521);
		region.setName("垦利县");
		region.setName_en("kenlixian");
		region.setPid(370500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370522);
		region.setName("利津县");
		region.setName_en("lijinxian");
		region.setPid(370500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370523);
		region.setName("广饶县");
		region.setName_en("guangraoxian");
		region.setPid(370500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370600);
		region.setName("烟台市");
		region.setName_en("yantaishi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370602);
		region.setName("芝罘区");
		region.setName_en("zhifuqu");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370611);
		region.setName("福山区");
		region.setName_en("fushanqu");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370612);
		region.setName("牟平区");
		region.setName_en("mupingqu");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370613);
		region.setName("莱山区");
		region.setName_en("laishanqu");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370634);
		region.setName("长岛县");
		region.setName_en("zhangdaoxian");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370681);
		region.setName("龙口市");
		region.setName_en("longkoushi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370682);
		region.setName("莱阳市");
		region.setName_en("laiyangshi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370683);
		region.setName("莱州市");
		region.setName_en("laizhoushi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370684);
		region.setName("蓬莱市");
		region.setName_en("penglaishi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370685);
		region.setName("招远市");
		region.setName_en("zhaoyuanshi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370686);
		region.setName("栖霞市");
		region.setName_en("qixiashi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370687);
		region.setName("海阳市");
		region.setName_en("haiyangshi");
		region.setPid(370600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370700);
		region.setName("潍坊市");
		region.setName_en("weifangshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370702);
		region.setName("潍城区");
		region.setName_en("weichengqu");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370703);
		region.setName("寒亭区");
		region.setName_en("hantingqu");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370704);
		region.setName("坊子区");
		region.setName_en("fangziqu");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370705);
		region.setName("奎文区");
		region.setName_en("kuiwenqu");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370724);
		region.setName("临朐县");
		region.setName_en("linquxian");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370725);
		region.setName("昌乐县");
		region.setName_en("changlexian");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370781);
		region.setName("青州市");
		region.setName_en("qingzhoushi");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370782);
		region.setName("诸城市");
		region.setName_en("zhuchengshi");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370783);
		region.setName("寿光市");
		region.setName_en("shouguangshi");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370784);
		region.setName("安丘市");
		region.setName_en("anqiushi");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370785);
		region.setName("高密市");
		region.setName_en("gaomishi");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370786);
		region.setName("昌邑市");
		region.setName_en("changyishi");
		region.setPid(370700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370800);
		region.setName("济宁市");
		region.setName_en("jiningshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370802);
		region.setName("市中区");
		region.setName_en("shizhongqu");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370811);
		region.setName("任城区");
		region.setName_en("renchengqu");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370826);
		region.setName("微山县");
		region.setName_en("weishanxian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370827);
		region.setName("鱼台县");
		region.setName_en("yutaixian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370828);
		region.setName("金乡县");
		region.setName_en("jinxiangxian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370829);
		region.setName("嘉祥县");
		region.setName_en("jiaxiangxian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370830);
		region.setName("汶上县");
		region.setName_en("wenshangxian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370831);
		region.setName("泗水县");
		region.setName_en("sishuixian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370832);
		region.setName("梁山县");
		region.setName_en("liangshanxian");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370881);
		region.setName("曲阜市");
		region.setName_en("qufushi");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370882);
		region.setName("兖州市");
		region.setName_en("yanzhoushi");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370883);
		region.setName("邹城市");
		region.setName_en("zouchengshi");
		region.setPid(370800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370900);
		region.setName("泰安市");
		region.setName_en("taianshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370901);
		region.setName("岱岳区");
		region.setName_en("daiyuequ");
		region.setPid(370900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370902);
		region.setName("泰山区");
		region.setName_en("taishanqu");
		region.setPid(370900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370921);
		region.setName("宁阳县");
		region.setName_en("ningyangxian");
		region.setPid(370900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370923);
		region.setName("东平县");
		region.setName_en("dongpingxian");
		region.setPid(370900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370982);
		region.setName("新泰市");
		region.setName_en("xintaishi");
		region.setPid(370900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(370983);
		region.setName("肥城市");
		region.setName_en("feichengshi");
		region.setPid(370900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371000);
		region.setName("威海市");
		region.setName_en("weihaishi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371002);
		region.setName("环翠区");
		region.setName_en("huancuiqu");
		region.setPid(371000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371081);
		region.setName("文登市");
		region.setName_en("wendengshi");
		region.setPid(371000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371082);
		region.setName("荣成市");
		region.setName_en("rongchengshi");
		region.setPid(371000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371083);
		region.setName("乳山市");
		region.setName_en("rushanshi");
		region.setPid(371000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371100);
		region.setName("日照市");
		region.setName_en("rizhaoshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371102);
		region.setName("东港区");
		region.setName_en("donggangqu");
		region.setPid(371100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371103);
		region.setName("岚山区");
		region.setName_en("lanshanqu");
		region.setPid(371100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371121);
		region.setName("五莲县");
		region.setName_en("wulianxian");
		region.setPid(371100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371122);
		region.setName("莒县");
		region.setName_en("juxian");
		region.setPid(371100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371200);
		region.setName("莱芜市");
		region.setName_en("laiwushi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371202);
		region.setName("莱城区");
		region.setName_en("laichengqu");
		region.setPid(371200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371203);
		region.setName("钢城区");
		region.setName_en("gangchengqu");
		region.setPid(371200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371300);
		region.setName("临沂市");
		region.setName_en("linfenshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371302);
		region.setName("兰山区");
		region.setName_en("lanshanqu");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371311);
		region.setName("罗庄区");
		region.setName_en("luozhuangqu");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371312);
		region.setName("河东区");
		region.setName_en("hedongqu");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371321);
		region.setName("沂南县");
		region.setName_en("yinanxian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371322);
		region.setName("郯城县");
		region.setName_en("tanchengxian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371323);
		region.setName("沂水县");
		region.setName_en("yishuixian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371324);
		region.setName("苍山县");
		region.setName_en("cangshanxian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371325);
		region.setName("费县");
		region.setName_en("feixian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371326);
		region.setName("平邑县");
		region.setName_en("pingyixian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371327);
		region.setName("莒南县");
		region.setName_en("junanxian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371328);
		region.setName("蒙阴县");
		region.setName_en("mengyinxian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371329);
		region.setName("临沭县");
		region.setName_en("linshuxian");
		region.setPid(371300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371400);
		region.setName("德州市");
		region.setName_en("dezhoushi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371402);
		region.setName("德城区");
		region.setName_en("dechengqu");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371421);
		region.setName("陵县");
		region.setName_en("lingxian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371422);
		region.setName("宁津县");
		region.setName_en("ningjinxian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371423);
		region.setName("庆云县");
		region.setName_en("qingyunxian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371424);
		region.setName("临邑县");
		region.setName_en("linyixian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371425);
		region.setName("齐河县");
		region.setName_en("qihexian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371426);
		region.setName("平原县");
		region.setName_en("pingyuanxian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371427);
		region.setName("夏津县");
		region.setName_en("xiajinxian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371428);
		region.setName("武城县");
		region.setName_en("wuchengxian");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371481);
		region.setName("乐陵市");
		region.setName_en("lelingshi");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371482);
		region.setName("禹城市");
		region.setName_en("yuchengshi");
		region.setPid(371400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371500);
		region.setName("聊城市");
		region.setName_en("liaochengshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371502);
		region.setName("东昌府区");
		region.setName_en("dongchangfuqu");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371521);
		region.setName("阳谷县");
		region.setName_en("yangguxian");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371522);
		region.setName("莘县");
		region.setName_en("xinxian");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371523);
		region.setName("茌平县");
		region.setName_en("chipingxian");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371524);
		region.setName("东阿县");
		region.setName_en("dongexian");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371525);
		region.setName("冠县");
		region.setName_en("guanxian");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371526);
		region.setName("高唐县");
		region.setName_en("gaotangxian");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371581);
		region.setName("临清市");
		region.setName_en("linqingshi");
		region.setPid(371500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371600);
		region.setName("滨州市");
		region.setName_en("binzhoushi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371602);
		region.setName("滨城区");
		region.setName_en("binchengqu");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371621);
		region.setName("惠民县");
		region.setName_en("huiminxian");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371622);
		region.setName("阳信县");
		region.setName_en("yangxinxian");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371623);
		region.setName("无棣县");
		region.setName_en("wudixian");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371624);
		region.setName("沾化县");
		region.setName_en("zhanhuaxian");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371625);
		region.setName("博兴县");
		region.setName_en("boxingxian");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371626);
		region.setName("邹平县");
		region.setName_en("zoupingxian");
		region.setPid(371600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371700);
		region.setName("菏泽市");
		region.setName_en("hezeshi");
		region.setPid(370000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371702);
		region.setName("牡丹区");
		region.setName_en("mudanqu");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371721);
		region.setName("曹县");
		region.setName_en("caoxian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371722);
		region.setName("单县");
		region.setName_en("danxian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371723);
		region.setName("成武县");
		region.setName_en("chengwuxian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371724);
		region.setName("巨野县");
		region.setName_en("juyexian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371725);
		region.setName("郓城县");
		region.setName_en("yunchengxian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371726);
		region.setName("鄄城县");
		region.setName_en("juanchengxian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371727);
		region.setName("定陶县");
		region.setName_en("dingtaoxian");
		region.setPid(371700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(371728);
		region.setName("东明县");
		region.setName_en("dongmingxian");
		region.setPid(371700);
		regionMapper.insert(region);
	}

	private void createHeNan(){
		Region region;
		region=new Region();
		region.setId(410000);
		region.setName("河南省");
		region.setName_en("HeNan");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410100);
		region.setName("郑州市");
		region.setName_en("zhengzhoushi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410101);
		region.setName("金水区");
		region.setName_en("jinshuiqu");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410102);
		region.setName("中原区");
		region.setName_en("zhongyuanqu");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410103);
		region.setName("二七区");
		region.setName_en("erqiqu");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410104);
		region.setName("管城回族区");
		region.setName_en("guanchenghuizuqu");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410106);
		region.setName("上街区");
		region.setName_en("shangjiequ");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410108);
		region.setName("惠济区");
		region.setName_en("huijiqu");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410122);
		region.setName("中牟县");
		region.setName_en("zhongmuxian");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410181);
		region.setName("巩义市");
		region.setName_en("gongyishi");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410182);
		region.setName("荥阳市");
		region.setName_en("yingyangshi");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410183);
		region.setName("新密市");
		region.setName_en("xinmishi");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410184);
		region.setName("新郑市");
		region.setName_en("xinzhengshi");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410185);
		region.setName("登封市");
		region.setName_en("dengfengshi");
		region.setPid(410100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410200);
		region.setName("开封市");
		region.setName_en("kaifengshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410202);
		region.setName("龙亭区");
		region.setName_en("longtingqu");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410203);
		region.setName("顺河回族区");
		region.setName_en("shunhehuizuqu");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410204);
		region.setName("鼓楼区");
		region.setName_en("gulouqu");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410205);
		region.setName("禹王台区");
		region.setName_en("yuwangtaiqu");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410211);
		region.setName("金明区");
		region.setName_en("jinmingqu");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410221);
		region.setName("杞县");
		region.setName_en("qixian");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410222);
		region.setName("通许县");
		region.setName_en("tongxuxian");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410223);
		region.setName("尉氏县");
		region.setName_en("weishixian");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410224);
		region.setName("开封县");
		region.setName_en("kaifengxian");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410225);
		region.setName("兰考县");
		region.setName_en("lankaoxian");
		region.setPid(410200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410300);
		region.setName("洛阳市");
		region.setName_en("luoyangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410302);
		region.setName("老城区");
		region.setName_en("laochengqu");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410303);
		region.setName("西工区");
		region.setName_en("xigongqu");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410304);
		region.setName("廛河回族区");
		region.setName_en("chanhehuizuqu");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410305);
		region.setName("涧西区");
		region.setName_en("jianxiqu");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410306);
		region.setName("吉利区");
		region.setName_en("jiliqu");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410307);
		region.setName("洛龙区");
		region.setName_en("luolongqu");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410322);
		region.setName("孟津县");
		region.setName_en("mengjinxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410323);
		region.setName("新安县");
		region.setName_en("xinanxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410324);
		region.setName("栾川县");
		region.setName_en("luanchuanxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410325);
		region.setName("嵩县");
		region.setName_en("songxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410326);
		region.setName("汝阳县");
		region.setName_en("ruyangxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410327);
		region.setName("宜阳县");
		region.setName_en("yiyangxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410328);
		region.setName("洛宁县");
		region.setName_en("luoningxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410329);
		region.setName("伊川县");
		region.setName_en("yichuanxian");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410381);
		region.setName("偃师市");
		region.setName_en("yanshishi");
		region.setPid(410300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410400);
		region.setName("平顶山市");
		region.setName_en("pingdingshanshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410402);
		region.setName("新华区");
		region.setName_en("xinhuaqu");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410403);
		region.setName("卫东区");
		region.setName_en("weidongqu");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410404);
		region.setName("石龙区");
		region.setName_en("shilongqu");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410411);
		region.setName("湛河区");
		region.setName_en("zhanhequ");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410421);
		region.setName("宝丰县");
		region.setName_en("baofengxian");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410422);
		region.setName("叶县");
		region.setName_en("yexian");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410423);
		region.setName("鲁山县");
		region.setName_en("lushanxian");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410425);
		region.setName("郏县");
		region.setName_en("jiaxian");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410481);
		region.setName("舞钢市");
		region.setName_en("wugangshi");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410482);
		region.setName("汝州市");
		region.setName_en("ruzhoushi");
		region.setPid(410400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410500);
		region.setName("安阳市");
		region.setName_en("anyangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410502);
		region.setName("文峰区");
		region.setName_en("wenfengqu");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410503);
		region.setName("北关区");
		region.setName_en("beiguanqu");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410505);
		region.setName("殷都区");
		region.setName_en("yindouqu");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410506);
		region.setName("龙安区");
		region.setName_en("longanqu");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410522);
		region.setName("安阳县");
		region.setName_en("anyangxian");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410523);
		region.setName("汤阴县");
		region.setName_en("tangyinxian");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410526);
		region.setName("滑县");
		region.setName_en("huaxian");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410527);
		region.setName("内黄县");
		region.setName_en("neihuangxian");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410581);
		region.setName("林州市");
		region.setName_en("linzhoushi");
		region.setPid(410500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410600);
		region.setName("鹤壁市");
		region.setName_en("hebishi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410602);
		region.setName("鹤山区");
		region.setName_en("heshanqu");
		region.setPid(410600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410603);
		region.setName("山城区");
		region.setName_en("shanchengqu");
		region.setPid(410600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410611);
		region.setName("淇滨区");
		region.setName_en("qibinqu");
		region.setPid(410600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410621);
		region.setName("浚县");
		region.setName_en("junxian");
		region.setPid(410600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410622);
		region.setName("淇县");
		region.setName_en("qixian");
		region.setPid(410600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410700);
		region.setName("新乡市");
		region.setName_en("xinxiangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410702);
		region.setName("红旗区");
		region.setName_en("hongqiqu");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410703);
		region.setName("卫滨区");
		region.setName_en("weibinqu");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410704);
		region.setName("凤泉区");
		region.setName_en("fengquanqu");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410711);
		region.setName("牧野区");
		region.setName_en("muyequ");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410721);
		region.setName("新乡县");
		region.setName_en("xinxiangxian");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410724);
		region.setName("获嘉县");
		region.setName_en("huojiaxian");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410725);
		region.setName("原阳县");
		region.setName_en("yuanyangxian");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410726);
		region.setName("延津县");
		region.setName_en("yanjinxian");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410727);
		region.setName("封丘县");
		region.setName_en("fengqiuxian");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410728);
		region.setName("长垣县");
		region.setName_en("zhangyuanxian");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410781);
		region.setName("卫辉市");
		region.setName_en("weihuishi");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410782);
		region.setName("辉县市");
		region.setName_en("huixianshi");
		region.setPid(410700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410800);
		region.setName("焦作市");
		region.setName_en("jiaozuoshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410802);
		region.setName("解放区");
		region.setName_en("jiefangqu");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410803);
		region.setName("中站区");
		region.setName_en("zhongzhanqu");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410804);
		region.setName("马村区");
		region.setName_en("macunqu");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410811);
		region.setName("山阳区");
		region.setName_en("shanyangqu");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410821);
		region.setName("修武县");
		region.setName_en("xiuwuxian");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410822);
		region.setName("博爱县");
		region.setName_en("boaixian");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410823);
		region.setName("武陟县");
		region.setName_en("wuzhixian");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410825);
		region.setName("温县");
		region.setName_en("wenxian");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410882);
		region.setName("沁阳市");
		region.setName_en("qinyangshi");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410883);
		region.setName("孟州市");
		region.setName_en("mengzhoushi");
		region.setPid(410800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410900);
		region.setName("濮阳市");
		region.setName_en("puyangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410902);
		region.setName("华龙区");
		region.setName_en("hualongqu");
		region.setPid(410900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410922);
		region.setName("清丰县");
		region.setName_en("qingfengxian");
		region.setPid(410900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410923);
		region.setName("南乐县");
		region.setName_en("nanlexian");
		region.setPid(410900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410926);
		region.setName("范县");
		region.setName_en("fanxian");
		region.setPid(410900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410927);
		region.setName("台前县");
		region.setName_en("taiqianxian");
		region.setPid(410900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(410928);
		region.setName("濮阳县");
		region.setName_en("puyangxian");
		region.setPid(410900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411000);
		region.setName("许昌市");
		region.setName_en("xuchangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411002);
		region.setName("魏都区");
		region.setName_en("weidouqu");
		region.setPid(411000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411023);
		region.setName("许昌县");
		region.setName_en("xuchangxian");
		region.setPid(411000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411024);
		region.setName("鄢陵县");
		region.setName_en("yanlingxian");
		region.setPid(411000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411025);
		region.setName("襄城县");
		region.setName_en("xiangchengxian");
		region.setPid(411000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411081);
		region.setName("禹州市");
		region.setName_en("yuzhoushi");
		region.setPid(411000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411082);
		region.setName("长葛市");
		region.setName_en("zhanggeshi");
		region.setPid(411000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411100);
		region.setName("漯河市");
		region.setName_en("luoheshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411101);
		region.setName("召陵区");
		region.setName_en("zhaolingqu");
		region.setPid(411100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411102);
		region.setName("源汇区");
		region.setName_en("yuanhuiqu");
		region.setPid(411100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411103);
		region.setName("郾城区");
		region.setName_en("yanchengqu");
		region.setPid(411100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411121);
		region.setName("舞阳县");
		region.setName_en("wuyangxian");
		region.setPid(411100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411122);
		region.setName("临颍县");
		region.setName_en("linyingxian");
		region.setPid(411100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411200);
		region.setName("三门峡市");
		region.setName_en("sanmenxiashi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411202);
		region.setName("湖滨区");
		region.setName_en("hubinqu");
		region.setPid(411200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411221);
		region.setName("渑池县");
		region.setName_en("mianchixian");
		region.setPid(411200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411222);
		region.setName("陕县");
		region.setName_en("shanxian");
		region.setPid(411200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411224);
		region.setName("卢氏县");
		region.setName_en("lushixian");
		region.setPid(411200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411281);
		region.setName("义马市");
		region.setName_en("yimashi");
		region.setPid(411200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411282);
		region.setName("灵宝市");
		region.setName_en("lingbaoshi");
		region.setPid(411200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411300);
		region.setName("南阳市");
		region.setName_en("nanyangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411302);
		region.setName("宛城区");
		region.setName_en("wanchengqu");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411303);
		region.setName("卧龙区");
		region.setName_en("wolongqu");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411321);
		region.setName("南召县");
		region.setName_en("nanzhaoxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411322);
		region.setName("方城县");
		region.setName_en("fangchengxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411323);
		region.setName("西峡县");
		region.setName_en("xixiaxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411324);
		region.setName("镇平县");
		region.setName_en("zhenpingxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411325);
		region.setName("内乡县");
		region.setName_en("neixiangxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411326);
		region.setName("淅川县");
		region.setName_en("xichuanxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411327);
		region.setName("社旗县");
		region.setName_en("sheqixian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411328);
		region.setName("唐河县");
		region.setName_en("tanghexian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411329);
		region.setName("新野县");
		region.setName_en("xinyexian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411330);
		region.setName("桐柏县");
		region.setName_en("tongboxian");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411381);
		region.setName("邓州市");
		region.setName_en("dengzhoushi");
		region.setPid(411300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411400);
		region.setName("商丘市");
		region.setName_en("shangqiushi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411402);
		region.setName("梁园区");
		region.setName_en("liangyuanqu");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411403);
		region.setName("睢阳区");
		region.setName_en("suiyangqu");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411421);
		region.setName("民权县");
		region.setName_en("minquanxian");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411422);
		region.setName("睢县");
		region.setName_en("suixian");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411423);
		region.setName("宁陵县");
		region.setName_en("ninglingxian");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411424);
		region.setName("柘城县");
		region.setName_en("zhechengxian");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411425);
		region.setName("虞城县");
		region.setName_en("yuchengxian");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411426);
		region.setName("夏邑县");
		region.setName_en("xiayixian");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411481);
		region.setName("永城市");
		region.setName_en("yongchengshi");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411482);
		region.setName("新区");
		region.setName_en("xinqu");
		region.setPid(411400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411500);
		region.setName("信阳市");
		region.setName_en("xinyangshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411502);
		region.setName("浉河区");
		region.setName_en("shihequ");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411503);
		region.setName("平桥区");
		region.setName_en("pingqiaoqu");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411521);
		region.setName("罗山县");
		region.setName_en("luoshanxian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411522);
		region.setName("光山县");
		region.setName_en("guangshanxian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411523);
		region.setName("新县");
		region.setName_en("xinxian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411524);
		region.setName("商城县");
		region.setName_en("shangchengxian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411525);
		region.setName("固始县");
		region.setName_en("gushixian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411526);
		region.setName("潢川县");
		region.setName_en("huangchuanxian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411527);
		region.setName("淮滨县");
		region.setName_en("huaibinxian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411528);
		region.setName("息县");
		region.setName_en("xixian");
		region.setPid(411500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411600);
		region.setName("周口市");
		region.setName_en("zhoukoushi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411602);
		region.setName("川汇区");
		region.setName_en("chuanhuiqu");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411621);
		region.setName("扶沟县");
		region.setName_en("fugouxian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411622);
		region.setName("西华县");
		region.setName_en("xihuaxian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411623);
		region.setName("商水县");
		region.setName_en("shangshuixian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411624);
		region.setName("沈丘县");
		region.setName_en("shenqiuxian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411625);
		region.setName("郸城县");
		region.setName_en("danchengxian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411626);
		region.setName("淮阳县");
		region.setName_en("huaiyangxian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411627);
		region.setName("太康县");
		region.setName_en("taikangxian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411628);
		region.setName("鹿邑县");
		region.setName_en("luyixian");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411681);
		region.setName("项城市");
		region.setName_en("xiangchengshi");
		region.setPid(411600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411700);
		region.setName("驻马店市");
		region.setName_en("zhumadianshi");
		region.setPid(410000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411702);
		region.setName("驿城区");
		region.setName_en("yichengqu");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411721);
		region.setName("西平县");
		region.setName_en("xipingxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411722);
		region.setName("上蔡县");
		region.setName_en("shangcaixian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411723);
		region.setName("平舆县");
		region.setName_en("pingyuxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411724);
		region.setName("正阳县");
		region.setName_en("zhengyangxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411725);
		region.setName("确山县");
		region.setName_en("queshanxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411726);
		region.setName("泌阳县");
		region.setName_en("biyangxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411727);
		region.setName("汝南县");
		region.setName_en("runanxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411728);
		region.setName("遂平县");
		region.setName_en("suipingxian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411729);
		region.setName("新蔡县");
		region.setName_en("xincaixian");
		region.setPid(411700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(411800);
		region.setName("济源市");
		region.setName_en("jiyuanshi");
		region.setPid(410000);
		regionMapper.insert(region);
	}

	private void createHuBei(){
		Region region;
		region=new Region();
		region.setId(420000);
		region.setName("湖北省");
		region.setName_en("HuBei");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420100);
		region.setName("武汉市");
		region.setName_en("wuhanshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420102);
		region.setName("江岸区");
		region.setName_en("jianganqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420103);
		region.setName("江汉区");
		region.setName_en("jianghanqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420104);
		region.setName("硚口区");
		region.setName_en("qiaokouqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420105);
		region.setName("汉阳区");
		region.setName_en("hanyangqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420106);
		region.setName("武昌区");
		region.setName_en("wuchangqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420107);
		region.setName("青山区");
		region.setName_en("qingshanqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420111);
		region.setName("洪山区");
		region.setName_en("hongshanqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420112);
		region.setName("东西湖区");
		region.setName_en("dongxihuqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420113);
		region.setName("汉南区");
		region.setName_en("hannanqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420114);
		region.setName("蔡甸区");
		region.setName_en("caidianqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420115);
		region.setName("江夏区");
		region.setName_en("jiangxiaqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420116);
		region.setName("黄陂区");
		region.setName_en("huangpoqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420117);
		region.setName("新洲区");
		region.setName_en("xinzhouqu");
		region.setPid(420100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420200);
		region.setName("黄石市");
		region.setName_en("huangshishi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420202);
		region.setName("黄石港区");
		region.setName_en("huangshigangqu");
		region.setPid(420200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420203);
		region.setName("西塞山区");
		region.setName_en("xisaishanqu");
		region.setPid(420200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420204);
		region.setName("下陆区");
		region.setName_en("xialuqu");
		region.setPid(420200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420205);
		region.setName("铁山区");
		region.setName_en("tieshanqu");
		region.setPid(420200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420222);
		region.setName("阳新县");
		region.setName_en("yangxinxian");
		region.setPid(420200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420281);
		region.setName("大冶市");
		region.setName_en("dayeshi");
		region.setPid(420200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420300);
		region.setName("十堰市");
		region.setName_en("shiyanshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420302);
		region.setName("茅箭区");
		region.setName_en("maojianqu");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420303);
		region.setName("张湾区");
		region.setName_en("zhangwanqu");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420321);
		region.setName("郧县");
		region.setName_en("yunxian");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420322);
		region.setName("郧西县");
		region.setName_en("yunxixian");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420323);
		region.setName("竹山县");
		region.setName_en("zhushanxian");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420324);
		region.setName("竹溪县");
		region.setName_en("zhuxixian");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420325);
		region.setName("房县");
		region.setName_en("fangxian");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420381);
		region.setName("丹江口市");
		region.setName_en("danjiangkoushi");
		region.setPid(420300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420500);
		region.setName("宜昌市");
		region.setName_en("yichangshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420502);
		region.setName("西陵区");
		region.setName_en("xilingqu");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420503);
		region.setName("伍家岗区");
		region.setName_en("wujiagangqu");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420504);
		region.setName("点军区");
		region.setName_en("dianjunqu");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420505);
		region.setName("猇亭区");
		region.setName_en("yaotingqu");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420506);
		region.setName("夷陵区");
		region.setName_en("yilingqu");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420525);
		region.setName("远安县");
		region.setName_en("yuananxian");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420526);
		region.setName("兴山县");
		region.setName_en("xingshanxian");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420527);
		region.setName("秭归县");
		region.setName_en("ziguixian");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420528);
		region.setName("长阳土家族自治县");
		region.setName_en("zhangyangtujiazuzizhixian");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420529);
		region.setName("五峰土家族自治县");
		region.setName_en("wufengtujiazuzizhixian");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420581);
		region.setName("宜都市");
		region.setName_en("yidushi");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420582);
		region.setName("当阳市");
		region.setName_en("dangyangshi");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420583);
		region.setName("枝江市");
		region.setName_en("zhijiangshi");
		region.setPid(420500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420600);
		region.setName("襄阳市");
		region.setName_en("xiangyangshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420602);
		region.setName("襄城区");
		region.setName_en("xiangchengqu");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420606);
		region.setName("樊城区");
		region.setName_en("fanchengqu");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420607);
		region.setName("襄州区");
		region.setName_en("xiangzhouqu");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420624);
		region.setName("南漳县");
		region.setName_en("nanzhangxian");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420625);
		region.setName("谷城县");
		region.setName_en("guchengxian");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420626);
		region.setName("保康县");
		region.setName_en("baokangxian");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420682);
		region.setName("老河口市");
		region.setName_en("laohekoushi");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420683);
		region.setName("枣阳市");
		region.setName_en("zaoyangshi");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420684);
		region.setName("宜城市");
		region.setName_en("yichengshi");
		region.setPid(420600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420700);
		region.setName("鄂州市");
		region.setName_en("ezhoushi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420702);
		region.setName("梁子湖区");
		region.setName_en("liangzihuqu");
		region.setPid(420700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420703);
		region.setName("华容区");
		region.setName_en("huarongqu");
		region.setPid(420700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420704);
		region.setName("鄂城区");
		region.setName_en("echengqu");
		region.setPid(420700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420800);
		region.setName("荆门市");
		region.setName_en("jingmenshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420802);
		region.setName("东宝区");
		region.setName_en("dongbaoqu");
		region.setPid(420800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420804);
		region.setName("掇刀区");
		region.setName_en("duodaoqu");
		region.setPid(420800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420821);
		region.setName("京山县");
		region.setName_en("jingshanxian");
		region.setPid(420800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420822);
		region.setName("沙洋县");
		region.setName_en("shayangxian");
		region.setPid(420800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420881);
		region.setName("钟祥市");
		region.setName_en("zhongxiangshi");
		region.setPid(420800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420900);
		region.setName("孝感市");
		region.setName_en("xiaoganshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420902);
		region.setName("孝南区");
		region.setName_en("xiaonanqu");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420921);
		region.setName("孝昌县");
		region.setName_en("xiaochangxian");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420922);
		region.setName("大悟县");
		region.setName_en("dawuxian");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420923);
		region.setName("云梦县");
		region.setName_en("yunmengxian");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420981);
		region.setName("应城市");
		region.setName_en("yingchengshi");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420982);
		region.setName("安陆市");
		region.setName_en("anlushi");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(420984);
		region.setName("汉川市");
		region.setName_en("hanchuanshi");
		region.setPid(420900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421000);
		region.setName("荆州市");
		region.setName_en("jingzhoushi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421002);
		region.setName("沙市区");
		region.setName_en("shashiqu");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421003);
		region.setName("荆州区");
		region.setName_en("jingzhouqu");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421022);
		region.setName("公安县");
		region.setName_en("gonganxian");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421023);
		region.setName("监利县");
		region.setName_en("jianlixian");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421024);
		region.setName("江陵县");
		region.setName_en("jianglingxian");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421081);
		region.setName("石首市");
		region.setName_en("shishoushi");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421083);
		region.setName("洪湖市");
		region.setName_en("honghushi");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421087);
		region.setName("松滋市");
		region.setName_en("songzishi");
		region.setPid(421000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421100);
		region.setName("黄冈市");
		region.setName_en("huanggangshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421102);
		region.setName("黄州区");
		region.setName_en("huangzhouqu");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421121);
		region.setName("团风县");
		region.setName_en("tuanfengxian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421122);
		region.setName("红安县");
		region.setName_en("honganxian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421123);
		region.setName("罗田县");
		region.setName_en("luotianxian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421124);
		region.setName("英山县");
		region.setName_en("yingshanxian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421125);
		region.setName("浠水县");
		region.setName_en("xishuixian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421126);
		region.setName("蕲春县");
		region.setName_en("qichunxian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421127);
		region.setName("黄梅县");
		region.setName_en("huangmeixian");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421181);
		region.setName("麻城市");
		region.setName_en("machengshi");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421182);
		region.setName("武穴市");
		region.setName_en("wuxueshi");
		region.setPid(421100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421200);
		region.setName("咸宁市");
		region.setName_en("xianningshi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421202);
		region.setName("咸安区");
		region.setName_en("xiananqu");
		region.setPid(421200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421221);
		region.setName("嘉鱼县");
		region.setName_en("jiayuxian");
		region.setPid(421200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421222);
		region.setName("通城县");
		region.setName_en("tongchengxian");
		region.setPid(421200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421223);
		region.setName("崇阳县");
		region.setName_en("chongyangxian");
		region.setPid(421200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421224);
		region.setName("通山县");
		region.setName_en("tongshanxian");
		region.setPid(421200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421281);
		region.setName("赤壁市");
		region.setName_en("chibishi");
		region.setPid(421200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421300);
		region.setName("随州市");
		region.setName_en("suizhoushi");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421302);
		region.setName("曾都区");
		region.setName_en("cengdouqu");
		region.setPid(421300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(421381);
		region.setName("广水市");
		region.setName_en("guangshuishi");
		region.setPid(421300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422800);
		region.setName("恩施土家族苗族自治州");
		region.setName_en("enshitujiazu");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422801);
		region.setName("恩施市");
		region.setName_en("enshishi");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422802);
		region.setName("利川市");
		region.setName_en("lichuanshi");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422822);
		region.setName("建始县");
		region.setName_en("jianshixian");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422823);
		region.setName("巴东县");
		region.setName_en("badongxian");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422825);
		region.setName("宣恩县");
		region.setName_en("xuanenxian");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422826);
		region.setName("咸丰县");
		region.setName_en("xianfengxian");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422827);
		region.setName("来凤县");
		region.setName_en("laifengxian");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(422828);
		region.setName("鹤峰县");
		region.setName_en("hefengxian");
		region.setPid(422800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(429000);
		region.setName("省直辖行政单位");
		region.setName_en("xingzhendanwei");
		region.setPid(420000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(429004);
		region.setName("仙桃市");
		region.setName_en("xiantaoshi");
		region.setPid(429000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(429005);
		region.setName("潜江市");
		region.setName_en("qianjiangshi");
		region.setPid(429000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(429006);
		region.setName("天门市");
		region.setName_en("tianmenshi");
		region.setPid(429000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(429021);
		region.setName("神农架林区");
		region.setName_en("shennongjialinqu");
		region.setPid(429000);
		regionMapper.insert(region);
	}

	private void createHuNan(){
		Region region;
		region=new Region();
		region.setId(430000);
		region.setName("湖南省");
		region.setName_en("HuNan");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430100);
		region.setName("长沙市");
		region.setName_en("changshashi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430102);
		region.setName("芙蓉区");
		region.setName_en("furongqu");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430103);
		region.setName("天心区");
		region.setName_en("tianxinqu");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430104);
		region.setName("岳麓区");
		region.setName_en("yueluqu");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430105);
		region.setName("开福区");
		region.setName_en("kaifuqu");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430111);
		region.setName("雨花区");
		region.setName_en("yuhuaqu");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430121);
		region.setName("长沙县");
		region.setName_en("zhangshaxian");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430122);
		region.setName("望城县");
		region.setName_en("wangchengxian");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430124);
		region.setName("宁乡县");
		region.setName_en("ningxiangxian");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430181);
		region.setName("浏阳市");
		region.setName_en("liuyangshi");
		region.setPid(430100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430200);
		region.setName("株洲市");
		region.setName_en("zhuzhoushi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430202);
		region.setName("荷塘区");
		region.setName_en("hetangqu");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430203);
		region.setName("芦淞区");
		region.setName_en("lusongqu");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430204);
		region.setName("石峰区");
		region.setName_en("shifengqu");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430211);
		region.setName("天元区");
		region.setName_en("tianyuanqu");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430221);
		region.setName("株洲县");
		region.setName_en("zhuzhouxian");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430223);
		region.setName("攸县");
		region.setName_en("youxian");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430224);
		region.setName("茶陵县");
		region.setName_en("chalingxian");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430225);
		region.setName("炎陵县");
		region.setName_en("yanlingxian");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430281);
		region.setName("醴陵市");
		region.setName_en("lilingshi");
		region.setPid(430200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430300);
		region.setName("湘潭市");
		region.setName_en("xiangtanshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430302);
		region.setName("雨湖区");
		region.setName_en("yuhuqu");
		region.setPid(430300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430304);
		region.setName("岳塘区");
		region.setName_en("yuetangqu");
		region.setPid(430300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430321);
		region.setName("湘潭县");
		region.setName_en("xiangtanxian");
		region.setPid(430300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430381);
		region.setName("湘乡市");
		region.setName_en("xiangxiangshi");
		region.setPid(430300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430382);
		region.setName("韶山市");
		region.setName_en("shaoshanshi");
		region.setPid(430300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430400);
		region.setName("衡阳市");
		region.setName_en("hengyangshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430405);
		region.setName("珠晖区");
		region.setName_en("zhuhuiqu");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430406);
		region.setName("雁峰区");
		region.setName_en("yanfengqu");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430407);
		region.setName("石鼓区");
		region.setName_en("shiguqu");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430408);
		region.setName("蒸湘区");
		region.setName_en("zhengxiangqu");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430412);
		region.setName("南岳区");
		region.setName_en("nanyuequ");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430421);
		region.setName("衡阳县");
		region.setName_en("hengyangxian");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430422);
		region.setName("衡南县");
		region.setName_en("hengnanxian");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430423);
		region.setName("衡山县");
		region.setName_en("hengshanxian");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430424);
		region.setName("衡东县");
		region.setName_en("hengdongxian");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430426);
		region.setName("祁东县");
		region.setName_en("qidongxian");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430481);
		region.setName("耒阳市");
		region.setName_en("leiyangshi");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430482);
		region.setName("常宁市");
		region.setName_en("changningshi");
		region.setPid(430400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430500);
		region.setName("邵阳市");
		region.setName_en("shaoyangshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430502);
		region.setName("双清区");
		region.setName_en("shuangqingqu");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430503);
		region.setName("大祥区");
		region.setName_en("daxiangqu");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430511);
		region.setName("北塔区");
		region.setName_en("beitaqu");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430521);
		region.setName("邵东县");
		region.setName_en("shaodongxian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430522);
		region.setName("新邵县");
		region.setName_en("xinshaoxian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430523);
		region.setName("邵阳县");
		region.setName_en("shaoyangxian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430524);
		region.setName("隆回县");
		region.setName_en("longhuixian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430525);
		region.setName("洞口县");
		region.setName_en("dongkouxian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430527);
		region.setName("绥宁县");
		region.setName_en("suiningxian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430528);
		region.setName("新宁县");
		region.setName_en("xinningxian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430529);
		region.setName("城步苗族自治县");
		region.setName_en("chengbumiaozuzizhixian");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430581);
		region.setName("武冈市");
		region.setName_en("wugangshi");
		region.setPid(430500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430600);
		region.setName("岳阳市");
		region.setName_en("yueyangshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430602);
		region.setName("岳阳楼区");
		region.setName_en("yueyanglouqu");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430603);
		region.setName("云溪区");
		region.setName_en("yunxiqu");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430611);
		region.setName("君山区");
		region.setName_en("junshanqu");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430621);
		region.setName("岳阳县");
		region.setName_en("yueyangxian");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430623);
		region.setName("华容县");
		region.setName_en("huarongxian");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430624);
		region.setName("湘阴县");
		region.setName_en("xiangyinxian");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430626);
		region.setName("平江县");
		region.setName_en("pingjiangxian");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430681);
		region.setName("汨罗市");
		region.setName_en("miluoshi");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430682);
		region.setName("临湘市");
		region.setName_en("linxiangshi");
		region.setPid(430600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430700);
		region.setName("常德市");
		region.setName_en("changdeshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430702);
		region.setName("武陵区");
		region.setName_en("wulingqu");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430703);
		region.setName("鼎城区");
		region.setName_en("dingchengqu");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430721);
		region.setName("安乡县");
		region.setName_en("anxiangxian");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430722);
		region.setName("汉寿县");
		region.setName_en("hanshouxian");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430723);
		region.setName("澧县");
		region.setName_en("lixian");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430724);
		region.setName("临澧县");
		region.setName_en("linlixian");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430725);
		region.setName("桃源县");
		region.setName_en("taoyuanxian");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430726);
		region.setName("石门县");
		region.setName_en("shimenxian");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430781);
		region.setName("津市市");
		region.setName_en("jinshishi");
		region.setPid(430700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430800);
		region.setName("张家界市");
		region.setName_en("zhangjiajieshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430802);
		region.setName("永定区");
		region.setName_en("yongdingqu");
		region.setPid(430800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430811);
		region.setName("武陵源区");
		region.setName_en("wulingyuanqu");
		region.setPid(430800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430821);
		region.setName("慈利县");
		region.setName_en("cilixian");
		region.setPid(430800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430822);
		region.setName("桑植县");
		region.setName_en("sangzhixian");
		region.setPid(430800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430900);
		region.setName("益阳市");
		region.setName_en("yiyangshi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430902);
		region.setName("资阳区");
		region.setName_en("ziyangqu");
		region.setPid(430900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430903);
		region.setName("赫山区");
		region.setName_en("heshanqu");
		region.setPid(430900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430921);
		region.setName("南县");
		region.setName_en("nanxian");
		region.setPid(430900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430922);
		region.setName("桃江县");
		region.setName_en("taojiangxian");
		region.setPid(430900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430923);
		region.setName("安化县");
		region.setName_en("anhuaxian");
		region.setPid(430900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(430981);
		region.setName("沅江市");
		region.setName_en("yuanjiangshi");
		region.setPid(430900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431000);
		region.setName("郴州市");
		region.setName_en("chenzhoushi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431002);
		region.setName("北湖区");
		region.setName_en("beihuqu");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431003);
		region.setName("苏仙区");
		region.setName_en("suxianqu");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431021);
		region.setName("桂阳县");
		region.setName_en("guiyangxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431022);
		region.setName("宜章县");
		region.setName_en("yizhangxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431023);
		region.setName("永兴县");
		region.setName_en("yongxingxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431024);
		region.setName("嘉禾县");
		region.setName_en("jiahexian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431025);
		region.setName("临武县");
		region.setName_en("linwuxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431026);
		region.setName("汝城县");
		region.setName_en("ruchengxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431027);
		region.setName("桂东县");
		region.setName_en("guidongxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431028);
		region.setName("安仁县");
		region.setName_en("anrenxian");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431081);
		region.setName("资兴市");
		region.setName_en("zixingshi");
		region.setPid(431000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431100);
		region.setName("永州市");
		region.setName_en("yongzhoushi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431102);
		region.setName("零陵区");
		region.setName_en("linglingqu");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431103);
		region.setName("冷水滩区");
		region.setName_en("lengshuitanqu");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431121);
		region.setName("祁阳县");
		region.setName_en("qiyangxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431122);
		region.setName("东安县");
		region.setName_en("donganxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431123);
		region.setName("双牌县");
		region.setName_en("shuangpaixian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431124);
		region.setName("道县");
		region.setName_en("daoxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431125);
		region.setName("江永县");
		region.setName_en("jiangyongxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431126);
		region.setName("宁远县");
		region.setName_en("ningyuanxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431127);
		region.setName("蓝山县");
		region.setName_en("lanshanxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431128);
		region.setName("新田县");
		region.setName_en("xintianxian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431129);
		region.setName("江华瑶族自治县");
		region.setName_en("jianghuayaozuzizhixian");
		region.setPid(431100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431200);
		region.setName("怀化市");
		region.setName_en("huaihuashi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431202);
		region.setName("鹤城区");
		region.setName_en("hechengqu");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431221);
		region.setName("中方县");
		region.setName_en("zhongfangxian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431222);
		region.setName("沅陵县");
		region.setName_en("yuanlingxian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431223);
		region.setName("辰溪县");
		region.setName_en("chenxixian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431224);
		region.setName("溆浦县");
		region.setName_en("xupuxian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431225);
		region.setName("会同县");
		region.setName_en("huitongxian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431226);
		region.setName("麻阳苗族自治县");
		region.setName_en("mayangmiaozuzizhixian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431227);
		region.setName("新晃侗族自治县");
		region.setName_en("xinhuangdongzuzizhixian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431228);
		region.setName("芷江侗族自治县");
		region.setName_en("zhijiangdongzuzizhixian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431229);
		region.setName("靖州苗族侗族自治县");
		region.setName_en("jingzhoumiaozudongzuzizhixian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431230);
		region.setName("通道侗族自治县");
		region.setName_en("tongdaodongzuzizhixian");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431281);
		region.setName("洪江市");
		region.setName_en("hongjiangshi");
		region.setPid(431200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431300);
		region.setName("娄底市");
		region.setName_en("loudishi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431302);
		region.setName("娄星区");
		region.setName_en("louxingqu");
		region.setPid(431300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431321);
		region.setName("双峰县");
		region.setName_en("shuangfengxian");
		region.setPid(431300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431322);
		region.setName("新化县");
		region.setName_en("xinhuaxian");
		region.setPid(431300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431381);
		region.setName("冷水江市");
		region.setName_en("lengshuijiangshi");
		region.setPid(431300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(431382);
		region.setName("涟源市");
		region.setName_en("lianyuanshi");
		region.setPid(431300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433100);
		region.setName("湘西土家族苗族自治州");
		region.setName_en("xiangxi");
		region.setPid(430000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433101);
		region.setName("吉首市");
		region.setName_en("jishoushi");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433122);
		region.setName("泸溪县");
		region.setName_en("luxixian");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433123);
		region.setName("凤凰县");
		region.setName_en("fenghuangxian");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433124);
		region.setName("花垣县");
		region.setName_en("huayuanxian");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433125);
		region.setName("保靖县");
		region.setName_en("baojingxian");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433126);
		region.setName("古丈县");
		region.setName_en("guzhangxian");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433127);
		region.setName("永顺县");
		region.setName_en("yongshunxian");
		region.setPid(433100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(433130);
		region.setName("龙山县");
		region.setName_en("longshanxian");
		region.setPid(433100);
		regionMapper.insert(region);
	}

	private void createGuangDong(){
		Region region;
		region=new Region();
		region.setId(440000);
		region.setName("广东省");
		region.setName_en("GuangDong");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440100);
		region.setName("广州市");
		region.setName_en("guangzhoushi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440103);
		region.setName("荔湾区");
		region.setName_en("liwanqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440104);
		region.setName("越秀区");
		region.setName_en("yuexiuqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440105);
		region.setName("海珠区");
		region.setName_en("haizhuqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440106);
		region.setName("天河区");
		region.setName_en("tianhequ");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440111);
		region.setName("白云区");
		region.setName_en("baiyunqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440112);
		region.setName("黄埔区");
		region.setName_en("huangpuqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440113);
		region.setName("番禺区");
		region.setName_en("panyuqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440114);
		region.setName("花都区");
		region.setName_en("huadouqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440115);
		region.setName("南沙区");
		region.setName_en("nanshaqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440116);
		region.setName("萝岗区");
		region.setName_en("luogangqu");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440183);
		region.setName("增城市");
		region.setName_en("zengchengshi");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440184);
		region.setName("从化市");
		region.setName_en("conghuashi");
		region.setPid(440100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440200);
		region.setName("韶关市");
		region.setName_en("shaoguanshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440203);
		region.setName("武江区");
		region.setName_en("wujiangqu");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440204);
		region.setName("浈江区");
		region.setName_en("zhenjiangqu");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440205);
		region.setName("曲江区");
		region.setName_en("qujiangqu");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440222);
		region.setName("始兴县");
		region.setName_en("shixingxian");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440224);
		region.setName("仁化县");
		region.setName_en("renhuaxian");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440229);
		region.setName("翁源县");
		region.setName_en("wengyuanxian");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440232);
		region.setName("乳源瑶族自治县");
		region.setName_en("ruyuanyaozuzizhixian");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440233);
		region.setName("新丰县");
		region.setName_en("xinfengxian");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440281);
		region.setName("乐昌市");
		region.setName_en("lechangshi");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440282);
		region.setName("南雄市");
		region.setName_en("nanxiongshi");
		region.setPid(440200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440300);
		region.setName("深圳市");
		region.setName_en("shenzhenshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440303);
		region.setName("罗湖区");
		region.setName_en("luohuqu");
		region.setPid(440300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440304);
		region.setName("福田区");
		region.setName_en("futianqu");
		region.setPid(440300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440305);
		region.setName("南山区");
		region.setName_en("nanshanqu");
		region.setPid(440300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440306);
		region.setName("宝安区");
		region.setName_en("baoanqu");
		region.setPid(440300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440307);
		region.setName("龙岗区");
		region.setName_en("longgangqu");
		region.setPid(440300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440308);
		region.setName("盐田区");
		region.setName_en("yantianqu");
		region.setPid(440300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440400);
		region.setName("珠海市");
		region.setName_en("zhuhaishi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440402);
		region.setName("香洲区");
		region.setName_en("xiangzhouqu");
		region.setPid(440400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440403);
		region.setName("斗门区");
		region.setName_en("doumenqu");
		region.setPid(440400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440404);
		region.setName("金湾区");
		region.setName_en("jinwanqu");
		region.setPid(440400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440500);
		region.setName("汕头市");
		region.setName_en("shantoushi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440507);
		region.setName("龙湖区");
		region.setName_en("longhuqu");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440511);
		region.setName("金平区");
		region.setName_en("jinpingqu");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440512);
		region.setName("濠江区");
		region.setName_en("haojiangqu");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440513);
		region.setName("潮阳区");
		region.setName_en("chaoyangqu");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440514);
		region.setName("潮南区");
		region.setName_en("chaonanqu");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440515);
		region.setName("澄海区");
		region.setName_en("chenghaiqu");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440523);
		region.setName("南澳县");
		region.setName_en("nanaoxian");
		region.setPid(440500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440600);
		region.setName("佛山市");
		region.setName_en("foshanshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440604);
		region.setName("禅城区");
		region.setName_en("shanchengqu");
		region.setPid(440600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440605);
		region.setName("南海区");
		region.setName_en("nanhaiqu");
		region.setPid(440600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440606);
		region.setName("顺德区");
		region.setName_en("shundequ");
		region.setPid(440600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440607);
		region.setName("三水区");
		region.setName_en("sanshuiqu");
		region.setPid(440600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440608);
		region.setName("高明区");
		region.setName_en("gaomingqu");
		region.setPid(440600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440700);
		region.setName("江门市");
		region.setName_en("jiangmenshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440703);
		region.setName("蓬江区");
		region.setName_en("pengjiangqu");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440704);
		region.setName("江海区");
		region.setName_en("jianghaiqu");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440705);
		region.setName("新会区");
		region.setName_en("xinhuiqu");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440781);
		region.setName("台山市");
		region.setName_en("taishanshi");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440783);
		region.setName("开平市");
		region.setName_en("kaipingshi");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440784);
		region.setName("鹤山市");
		region.setName_en("heshanshi");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440785);
		region.setName("恩平市");
		region.setName_en("enpingshi");
		region.setPid(440700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440800);
		region.setName("湛江市");
		region.setName_en("zhanjiangshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440802);
		region.setName("赤坎区");
		region.setName_en("chikanqu");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440803);
		region.setName("霞山区");
		region.setName_en("xiashanqu");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440804);
		region.setName("坡头区");
		region.setName_en("potouqu");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440811);
		region.setName("麻章区");
		region.setName_en("mazhangqu");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440823);
		region.setName("遂溪县");
		region.setName_en("suixixian");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440825);
		region.setName("徐闻县");
		region.setName_en("xuwenxian");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440881);
		region.setName("廉江市");
		region.setName_en("lianjiangshi");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440882);
		region.setName("雷州市");
		region.setName_en("leizhoushi");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440883);
		region.setName("吴川市");
		region.setName_en("wuchuanshi");
		region.setPid(440800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440900);
		region.setName("茂名市");
		region.setName_en("maomingshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440902);
		region.setName("茂南区");
		region.setName_en("maonanqu");
		region.setPid(440900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440903);
		region.setName("茂港区");
		region.setName_en("maogangqu");
		region.setPid(440900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440923);
		region.setName("电白县");
		region.setName_en("dianbaixian");
		region.setPid(440900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440981);
		region.setName("高州市");
		region.setName_en("gaozhoushi");
		region.setPid(440900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440982);
		region.setName("化州市");
		region.setName_en("huazhoushi");
		region.setPid(440900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(440983);
		region.setName("信宜市");
		region.setName_en("xinyishi");
		region.setPid(440900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441200);
		region.setName("肇庆市");
		region.setName_en("zhaoqingshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441202);
		region.setName("端州区");
		region.setName_en("duanzhouqu");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441203);
		region.setName("鼎湖区");
		region.setName_en("dinghuqu");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441223);
		region.setName("广宁县");
		region.setName_en("guangningxian");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441224);
		region.setName("怀集县");
		region.setName_en("huaijixian");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441225);
		region.setName("封开县");
		region.setName_en("fengkaixian");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441226);
		region.setName("德庆县");
		region.setName_en("deqingxian");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441283);
		region.setName("高要市");
		region.setName_en("gaoyaoshi");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441284);
		region.setName("四会市");
		region.setName_en("sihuishi");
		region.setPid(441200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441300);
		region.setName("惠州市");
		region.setName_en("huizhoushi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441302);
		region.setName("惠城区");
		region.setName_en("huichengqu");
		region.setPid(441300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441303);
		region.setName("惠阳区");
		region.setName_en("huiyangqu");
		region.setPid(441300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441322);
		region.setName("博罗县");
		region.setName_en("boluoxian");
		region.setPid(441300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441323);
		region.setName("惠东县");
		region.setName_en("huidongxian");
		region.setPid(441300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441324);
		region.setName("龙门县");
		region.setName_en("longmenxian");
		region.setPid(441300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441400);
		region.setName("梅州市");
		region.setName_en("meizhoushi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441402);
		region.setName("梅江区");
		region.setName_en("meijiangqu");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441421);
		region.setName("梅县");
		region.setName_en("meixian");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441422);
		region.setName("大埔县");
		region.setName_en("dabuxian");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441423);
		region.setName("丰顺县");
		region.setName_en("fengshunxian");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441424);
		region.setName("五华县");
		region.setName_en("wuhuaxian");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441426);
		region.setName("平远县");
		region.setName_en("pingyuanxian");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441427);
		region.setName("蕉岭县");
		region.setName_en("jiaolingxian");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441481);
		region.setName("兴宁市");
		region.setName_en("xingningshi");
		region.setPid(441400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441500);
		region.setName("汕尾市");
		region.setName_en("shanweishi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441502);
		region.setName("城区");
		region.setName_en("chengqu");
		region.setPid(441500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441521);
		region.setName("海丰县");
		region.setName_en("haifengxian");
		region.setPid(441500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441523);
		region.setName("陆河县");
		region.setName_en("luhexian");
		region.setPid(441500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441581);
		region.setName("陆丰市");
		region.setName_en("lufengshi");
		region.setPid(441500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441600);
		region.setName("河源市");
		region.setName_en("heyuanshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441602);
		region.setName("源城区");
		region.setName_en("yuanchengqu");
		region.setPid(441600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441621);
		region.setName("紫金县");
		region.setName_en("zijinxian");
		region.setPid(441600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441622);
		region.setName("龙川县");
		region.setName_en("longchuanxian");
		region.setPid(441600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441623);
		region.setName("连平县");
		region.setName_en("lianpingxian");
		region.setPid(441600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441624);
		region.setName("和平县");
		region.setName_en("hepingxian");
		region.setPid(441600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441625);
		region.setName("东源县");
		region.setName_en("dongyuanxian");
		region.setPid(441600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441700);
		region.setName("阳江市");
		region.setName_en("yangjiangshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441702);
		region.setName("江城区");
		region.setName_en("jiangchengqu");
		region.setPid(441700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441721);
		region.setName("阳西县");
		region.setName_en("yangxixian");
		region.setPid(441700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441723);
		region.setName("阳东县");
		region.setName_en("yangdongxian");
		region.setPid(441700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441781);
		region.setName("阳春市");
		region.setName_en("yangchunshi");
		region.setPid(441700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441800);
		region.setName("清远市");
		region.setName_en("qingyuanshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441802);
		region.setName("清城区");
		region.setName_en("qingchengqu");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441821);
		region.setName("佛冈县");
		region.setName_en("fogangxian");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441823);
		region.setName("阳山县");
		region.setName_en("yangshanxian");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441825);
		region.setName("连山壮族瑶族自治县");
		region.setName_en("lianshanzhuangzuyaozuzizhixian");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441826);
		region.setName("连南瑶族自治县");
		region.setName_en("liannanyaozuzizhixian");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441827);
		region.setName("清新县");
		region.setName_en("qingxinxian");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441881);
		region.setName("英德市");
		region.setName_en("yingdeshi");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441882);
		region.setName("连州市");
		region.setName_en("lianzhoushi");
		region.setPid(441800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441900);
		region.setName("东莞市");
		region.setName_en("dongguanshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441901);
		region.setName("莞城街道");
		region.setName_en("guanchengjiedao");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441902);
		region.setName("南城街道");
		region.setName_en("nanchengjiedao");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441903);
		region.setName("万江街道");
		region.setName_en("wanjiangjiedao");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441904);
		region.setName("东城街道");
		region.setName_en("dongchengjiedao");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441905);
		region.setName("石碣镇");
		region.setName_en("shijiezhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441906);
		region.setName("石龙镇");
		region.setName_en("shilongzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441907);
		region.setName("茶山镇");
		region.setName_en("chashanzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441908);
		region.setName("石排镇");
		region.setName_en("shipaizhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441909);
		region.setName("企石镇");
		region.setName_en("qishizhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441910);
		region.setName("横沥镇");
		region.setName_en("henglizhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441911);
		region.setName("桥头镇");
		region.setName_en("qiaotouzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441912);
		region.setName("谢岗镇");
		region.setName_en("xiegangzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441913);
		region.setName("东坑镇");
		region.setName_en("dongkengzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441914);
		region.setName("常平镇");
		region.setName_en("changpingzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441915);
		region.setName("寮步镇");
		region.setName_en("liaobuzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441916);
		region.setName("大朗镇");
		region.setName_en("dalangzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441917);
		region.setName("黄江镇");
		region.setName_en("huangjiangzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441918);
		region.setName("清溪镇");
		region.setName_en("qingxizhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441919);
		region.setName("塘厦镇");
		region.setName_en("tangshazhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441920);
		region.setName("凤岗镇");
		region.setName_en("fenggangzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441921);
		region.setName("长安镇");
		region.setName_en("zhanganzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441922);
		region.setName("虎门镇");
		region.setName_en("humenzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441923);
		region.setName("厚街镇");
		region.setName_en("houjiezhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441924);
		region.setName("沙田镇");
		region.setName_en("shatianzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441925);
		region.setName("道窖镇");
		region.setName_en("daojiaozhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441926);
		region.setName("洪梅镇");
		region.setName_en("hongmeizhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441927);
		region.setName("麻涌镇");
		region.setName_en("mayongzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441928);
		region.setName("中堂镇");
		region.setName_en("zhongtangzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441929);
		region.setName("高埗镇");
		region.setName_en("gaobuzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441930);
		region.setName("樟木头镇");
		region.setName_en("zhangmutouzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441931);
		region.setName("大岭山镇");
		region.setName_en("dalingshanzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441932);
		region.setName("望牛墩镇");
		region.setName_en("wangniudunzhen");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441933);
		region.setName("松山湖管委会");
		region.setName_en("songshanhuguanweihui");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441934);
		region.setName("虎门港管委会");
		region.setName_en("humengangguanweihui");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(441935);
		region.setName("东莞生态园");
		region.setName_en("dongguanshengtaiyuan");
		region.setPid(441900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442000);
		region.setName("中山市");
		region.setName_en("zhongshanshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442001);
		region.setName("石歧区");
		region.setName_en("shiqiqu");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442002);
		region.setName("东区");
		region.setName_en("dongqu");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442003);
		region.setName("西区");
		region.setName_en("xiqu");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442004);
		region.setName("南区");
		region.setName_en("nanqu");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442005);
		region.setName("五桂山区");
		region.setName_en("wuguishanqu");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442006);
		region.setName("火炬开发区");
		region.setName_en("huojukaifaqu");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442007);
		region.setName("板芙镇");
		region.setName_en("banfuzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442008);
		region.setName("大涌镇");
		region.setName_en("dayongzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442009);
		region.setName("东凤镇");
		region.setName_en("dongfengzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442010);
		region.setName("东升镇");
		region.setName_en("dongshengzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442011);
		region.setName("阜沙镇");
		region.setName_en("fushazhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442012);
		region.setName("港口镇");
		region.setName_en("gangkouzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442013);
		region.setName("古镇镇");
		region.setName_en("guzhenzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442014);
		region.setName("横栏镇");
		region.setName_en("henglanzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442015);
		region.setName("黄圃镇");
		region.setName_en("huangpuzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442016);
		region.setName("民众镇");
		region.setName_en("minzhongzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442017);
		region.setName("南朗镇");
		region.setName_en("nanlangzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442018);
		region.setName("南头镇");
		region.setName_en("nantouzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442019);
		region.setName("三角镇");
		region.setName_en("sanjiaozhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442020);
		region.setName("三乡镇");
		region.setName_en("sanxiangzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442021);
		region.setName("沙溪镇");
		region.setName_en("shaxizhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442022);
		region.setName("神湾镇");
		region.setName_en("shenwanzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442023);
		region.setName("坦洲镇");
		region.setName_en("tanzhouzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(442024);
		region.setName("小榄镇");
		region.setName_en("xiaolanzhen");
		region.setPid(442000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445100);
		region.setName("潮州市");
		region.setName_en("chaozhoushi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445102);
		region.setName("湘桥区");
		region.setName_en("xiangqiaoqu");
		region.setPid(445100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445121);
		region.setName("潮安区");
		region.setName_en("chaoanqu");
		region.setPid(445100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445122);
		region.setName("饶平县");
		region.setName_en("raopingxian");
		region.setPid(445100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445200);
		region.setName("揭阳市");
		region.setName_en("jieyangshi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445202);
		region.setName("榕城区");
		region.setName_en("rongchengqu");
		region.setPid(445200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445221);
		region.setName("揭东县");
		region.setName_en("jiedongxian");
		region.setPid(445200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445222);
		region.setName("揭西县");
		region.setName_en("jiexixian");
		region.setPid(445200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445224);
		region.setName("惠来县");
		region.setName_en("huilaixian");
		region.setPid(445200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445281);
		region.setName("普宁市");
		region.setName_en("puningshi");
		region.setPid(445200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445300);
		region.setName("云浮市");
		region.setName_en("yunfushi");
		region.setPid(440000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445302);
		region.setName("云城区");
		region.setName_en("yunchengqu");
		region.setPid(445300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445321);
		region.setName("新兴县");
		region.setName_en("xinxingxian");
		region.setPid(445300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445322);
		region.setName("郁南县");
		region.setName_en("yunanxian");
		region.setPid(445300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445323);
		region.setName("云安县");
		region.setName_en("yunanxian");
		region.setPid(445300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(445381);
		region.setName("罗定市");
		region.setName_en("luodingshi");
		region.setPid(445300);
		regionMapper.insert(region);
	}

	private void createGuangXi(){
		Region region;
		region=new Region();
		region.setId(450000);
		region.setName("广西壮族自治区");
		region.setName_en("GuangXi");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450100);
		region.setName("南宁市");
		region.setName_en("nanningshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450102);
		region.setName("兴宁区");
		region.setName_en("xingningqu");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450103);
		region.setName("青秀区");
		region.setName_en("qingxiuqu");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450105);
		region.setName("江南区");
		region.setName_en("jiangnanqu");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450107);
		region.setName("西乡塘区");
		region.setName_en("xixiangtangqu");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450108);
		region.setName("良庆区");
		region.setName_en("liangqingqu");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450109);
		region.setName("邕宁区");
		region.setName_en("yongningqu");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450122);
		region.setName("武鸣县");
		region.setName_en("wumingxian");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450123);
		region.setName("隆安县");
		region.setName_en("longanxian");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450124);
		region.setName("马山县");
		region.setName_en("mashanxian");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450125);
		region.setName("上林县");
		region.setName_en("shanglinxian");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450126);
		region.setName("宾阳县");
		region.setName_en("binyangxian");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450127);
		region.setName("横县");
		region.setName_en("hengxian");
		region.setPid(450100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450200);
		region.setName("柳州市");
		region.setName_en("liuzhoushi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450202);
		region.setName("城中区");
		region.setName_en("chengzhongqu");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450203);
		region.setName("鱼峰区");
		region.setName_en("yufengqu");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450204);
		region.setName("柳南区");
		region.setName_en("liunanqu");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450205);
		region.setName("柳北区");
		region.setName_en("liubeiqu");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450221);
		region.setName("柳江县");
		region.setName_en("liujiangxian");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450222);
		region.setName("柳城县");
		region.setName_en("liuchengxian");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450223);
		region.setName("鹿寨县");
		region.setName_en("luzhaixian");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450224);
		region.setName("融安县");
		region.setName_en("ronganxian");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450225);
		region.setName("融水苗族自治县");
		region.setName_en("rongshuimiaozuzizhixian");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450226);
		region.setName("三江侗族自治县");
		region.setName_en("sanjiangdongzuzizhixian");
		region.setPid(450200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450300);
		region.setName("桂林市");
		region.setName_en("guilinshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450302);
		region.setName("秀峰区");
		region.setName_en("xiufengqu");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450303);
		region.setName("叠彩区");
		region.setName_en("diecaiqu");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450304);
		region.setName("象山区");
		region.setName_en("xiangshanqu");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450305);
		region.setName("七星区");
		region.setName_en("qixingqu");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450311);
		region.setName("雁山区");
		region.setName_en("yanshanqu");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450321);
		region.setName("阳朔县");
		region.setName_en("yangshuoxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450322);
		region.setName("临桂区");
		region.setName_en("linguiqu");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450323);
		region.setName("灵川县");
		region.setName_en("lingchuanxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450324);
		region.setName("全州县");
		region.setName_en("quanzhouxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450325);
		region.setName("兴安县");
		region.setName_en("xinganxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450326);
		region.setName("永福县");
		region.setName_en("yongfuxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450327);
		region.setName("灌阳县");
		region.setName_en("guanyangxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450328);
		region.setName("龙胜各族自治县");
		region.setName_en("longshenggezuzizhixian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450329);
		region.setName("资源县");
		region.setName_en("ziyuanxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450330);
		region.setName("平乐县");
		region.setName_en("pinglexian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450331);
		region.setName("荔浦县");
		region.setName_en("lipuxian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450332);
		region.setName("恭城瑶族自治县");
		region.setName_en("gongchengyaozuzizhixian");
		region.setPid(450300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450400);
		region.setName("梧州市");
		region.setName_en("wuzhoushi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450403);
		region.setName("万秀区");
		region.setName_en("wanxiuqu");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450404);
		region.setName("蝶山区");
		region.setName_en("dieshanqu");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450405);
		region.setName("长洲区");
		region.setName_en("zhangzhouqu");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450421);
		region.setName("苍梧县");
		region.setName_en("cangwuxian");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450422);
		region.setName("藤县");
		region.setName_en("tengxian");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450423);
		region.setName("蒙山县");
		region.setName_en("mengshanxian");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450481);
		region.setName("岑溪市");
		region.setName_en("cenxishi");
		region.setPid(450400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450500);
		region.setName("北海市");
		region.setName_en("beihaishi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450502);
		region.setName("海城区");
		region.setName_en("haichengqu");
		region.setPid(450500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450503);
		region.setName("银海区");
		region.setName_en("yinhaiqu");
		region.setPid(450500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450512);
		region.setName("铁山港区");
		region.setName_en("tieshangangqu");
		region.setPid(450500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450521);
		region.setName("合浦县");
		region.setName_en("hepuxian");
		region.setPid(450500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450600);
		region.setName("防城港市");
		region.setName_en("fangchenggangshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450602);
		region.setName("港口区");
		region.setName_en("gangkouqu");
		region.setPid(450600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450603);
		region.setName("防城区");
		region.setName_en("fangchengqu");
		region.setPid(450600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450621);
		region.setName("上思县");
		region.setName_en("shangsixian");
		region.setPid(450600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450681);
		region.setName("东兴市");
		region.setName_en("dongxingshi");
		region.setPid(450600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450700);
		region.setName("钦州市");
		region.setName_en("qinzhoushi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450702);
		region.setName("钦南区");
		region.setName_en("qinnanqu");
		region.setPid(450700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450703);
		region.setName("钦北区");
		region.setName_en("qinbeiqu");
		region.setPid(450700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450721);
		region.setName("灵山县");
		region.setName_en("lingshanxian");
		region.setPid(450700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450722);
		region.setName("浦北县");
		region.setName_en("pubeixian");
		region.setPid(450700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450800);
		region.setName("贵港市");
		region.setName_en("guigangshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450802);
		region.setName("港北区");
		region.setName_en("gangbeiqu");
		region.setPid(450800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450803);
		region.setName("港南区");
		region.setName_en("gangnanqu");
		region.setPid(450800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450804);
		region.setName("覃塘区");
		region.setName_en("tantangqu");
		region.setPid(450800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450821);
		region.setName("平南县");
		region.setName_en("pingnanxian");
		region.setPid(450800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450881);
		region.setName("桂平市");
		region.setName_en("guipingshi");
		region.setPid(450800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450900);
		region.setName("玉林市");
		region.setName_en("yulinshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450902);
		region.setName("玉州区");
		region.setName_en("yuzhouqu");
		region.setPid(450900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450921);
		region.setName("容县");
		region.setName_en("rongxian");
		region.setPid(450900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450922);
		region.setName("陆川县");
		region.setName_en("luchuanxian");
		region.setPid(450900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450923);
		region.setName("博白县");
		region.setName_en("bobaixian");
		region.setPid(450900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450924);
		region.setName("兴业县");
		region.setName_en("xingyexian");
		region.setPid(450900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(450981);
		region.setName("北流市");
		region.setName_en("beiliushi");
		region.setPid(450900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451000);
		region.setName("百色市");
		region.setName_en("baiseshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451002);
		region.setName("右江区");
		region.setName_en("youjiangqu");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451021);
		region.setName("田阳县");
		region.setName_en("tianyangxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451022);
		region.setName("田东县");
		region.setName_en("tiandongxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451023);
		region.setName("平果县");
		region.setName_en("pingguoxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451024);
		region.setName("德保县");
		region.setName_en("debaoxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451025);
		region.setName("靖西县");
		region.setName_en("jingxixian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451026);
		region.setName("那坡县");
		region.setName_en("neipoxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451027);
		region.setName("凌云县");
		region.setName_en("lingyunxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451028);
		region.setName("乐业县");
		region.setName_en("leyexian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451029);
		region.setName("田林县");
		region.setName_en("tianlinxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451030);
		region.setName("西林县");
		region.setName_en("xilinxian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451031);
		region.setName("隆林各族自治县");
		region.setName_en("longlingezuzizhixian");
		region.setPid(451000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451100);
		region.setName("贺州市");
		region.setName_en("hezhoushi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451102);
		region.setName("八步区");
		region.setName_en("babuqu");
		region.setPid(451100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451121);
		region.setName("昭平县");
		region.setName_en("zhaopingxian");
		region.setPid(451100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451122);
		region.setName("钟山县");
		region.setName_en("zhongshanxian");
		region.setPid(451100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451123);
		region.setName("富川瑶族自治县");
		region.setName_en("fuchuanyaozuzizhixian");
		region.setPid(451100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451200);
		region.setName("河池市");
		region.setName_en("hechishi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451202);
		region.setName("金城江区");
		region.setName_en("jinchengjiangqu");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451221);
		region.setName("南丹县");
		region.setName_en("nandanxian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451222);
		region.setName("天峨县");
		region.setName_en("tianexian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451223);
		region.setName("凤山县");
		region.setName_en("fengshanxian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451224);
		region.setName("东兰县");
		region.setName_en("donglanxian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451225);
		region.setName("罗城仫佬族自治县");
		region.setName_en("luochengmulaozuzizhixian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451226);
		region.setName("环江毛南族自治县");
		region.setName_en("huanjiangmaonanzuzizhixian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451227);
		region.setName("巴马瑶族自治县");
		region.setName_en("bamayaozuzizhixian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451228);
		region.setName("都安瑶族自治县");
		region.setName_en("douanyaozuzizhixian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451229);
		region.setName("大化瑶族自治县");
		region.setName_en("dahuayaozuzizhixian");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451281);
		region.setName("宜州市");
		region.setName_en("yizhoushi");
		region.setPid(451200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451300);
		region.setName("来宾市");
		region.setName_en("laibinshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451302);
		region.setName("兴宾区");
		region.setName_en("xingbinqu");
		region.setPid(451300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451321);
		region.setName("忻城县");
		region.setName_en("xinchengxian");
		region.setPid(451300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451322);
		region.setName("象州县");
		region.setName_en("xiangzhouxian");
		region.setPid(451300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451323);
		region.setName("武宣县");
		region.setName_en("wuxuanxian");
		region.setPid(451300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451324);
		region.setName("金秀瑶族自治县");
		region.setName_en("jinxiuyaozuzizhixian");
		region.setPid(451300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451381);
		region.setName("合山市");
		region.setName_en("heshanshi");
		region.setPid(451300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451400);
		region.setName("崇左市");
		region.setName_en("chongzuoshi");
		region.setPid(450000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451402);
		region.setName("江洲区");
		region.setName_en("jiangzhouqu");
		region.setPid(451400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451421);
		region.setName("扶绥县");
		region.setName_en("fusuixian");
		region.setPid(451400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451422);
		region.setName("宁明县");
		region.setName_en("ningmingxian");
		region.setPid(451400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451423);
		region.setName("龙州县");
		region.setName_en("longzhouxian");
		region.setPid(451400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451424);
		region.setName("大新县");
		region.setName_en("daxinxian");
		region.setPid(451400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451425);
		region.setName("天等县");
		region.setName_en("tiandengxian");
		region.setPid(451400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(451481);
		region.setName("凭祥市");
		region.setName_en("pingxiangshi");
		region.setPid(451400);
		regionMapper.insert(region);
	}

	private void createHaiNan(){
		Region region;
		region=new Region();
		region.setId(460000);
		region.setName("海南省");
		region.setName_en("HaiNan");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(460100);
		region.setName("海口市");
		region.setName_en("haikoushi");
		region.setPid(460000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(460105);
		region.setName("秀英区");
		region.setName_en("xiuyingqu");
		region.setPid(460100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(460106);
		region.setName("龙华区");
		region.setName_en("longhuaqu");
		region.setPid(460100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(460107);
		region.setName("琼山区");
		region.setName_en("qiongshanqu");
		region.setPid(460100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(460108);
		region.setName("美兰区");
		region.setName_en("meilanqu");
		region.setPid(460100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(460200);
		region.setName("三亚市");
		region.setName_en("sanyashi");
		region.setPid(460000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469000);
		region.setName("省直辖县级行政单位");
		region.setName_en("xingzhengdanwei");
		region.setPid(460000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469001);
		region.setName("五指山市");
		region.setName_en("wuzhishanshi");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469002);
		region.setName("琼海市");
		region.setName_en("qionghaishi");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469003);
		region.setName("儋州市");
		region.setName_en("danzhoushi");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469005);
		region.setName("文昌市");
		region.setName_en("wenchangshi");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469006);
		region.setName("万宁市");
		region.setName_en("wanningshi");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469007);
		region.setName("东方市");
		region.setName_en("dongfangshi");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469025);
		region.setName("定安县");
		region.setName_en("dinganxian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469026);
		region.setName("屯昌县");
		region.setName_en("tunchangxian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469027);
		region.setName("澄迈县");
		region.setName_en("chengmaixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469028);
		region.setName("临高县");
		region.setName_en("lingaoxian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469030);
		region.setName("白沙黎族自治县");
		region.setName_en("baishalizuzizhixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469031);
		region.setName("昌江黎族自治县");
		region.setName_en("changjianglizuzizhixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469033);
		region.setName("乐东黎族自治县");
		region.setName_en("ledonglizuzizhixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469034);
		region.setName("陵水黎族自治县");
		region.setName_en("lingshuilizuzizhixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469035);
		region.setName("保亭黎族苗族自治县");
		region.setName_en("baotinglizumiaozuzizhixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469036);
		region.setName("琼中黎族苗族自治县");
		region.setName_en("qiongzhonglizumiaozuzizhixian");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469037);
		region.setName("西沙群岛");
		region.setName_en("xishaqundao");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469038);
		region.setName("南沙群岛");
		region.setName_en("nanshaqundao");
		region.setPid(469000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(469039);
		region.setName("中沙群岛的岛礁及其海域");
		region.setName_en("zhongshaqundaodedaojiaojiqihaiyu");
		region.setPid(469000);
		regionMapper.insert(region);
	}

	private void createChongQing(){
		Region region;
		region=new Region();
		region.setId(500000);
		region.setName("重庆市");
		region.setName_en("ChongQing");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500001);
		region.setName("重庆市");
		region.setName_en("ChongQing");
		region.setPid(500000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500100);
		region.setName("万州区");
		region.setName_en("wanzhouqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500101);
		region.setName("万州区");
		region.setName_en("wanzhouqu");
		region.setPid(500100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500200);
		region.setName("涪陵区");
		region.setName_en("fulingqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500201);
		region.setName("涪陵区");
		region.setName_en("fulingqu");
		region.setPid(500200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500300);
		region.setName("渝中区");
		region.setName_en("yuzhongqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500301);
		region.setName("渝中区");
		region.setName_en("yuzhongqu");
		region.setPid(500300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500400);
		region.setName("大渡口区");
		region.setName_en("dadukouqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500401);
		region.setName("大渡口区");
		region.setName_en("dadukouqu");
		region.setPid(500400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500500);
		region.setName("江北区");
		region.setName_en("jiangbeiqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500501);
		region.setName("江北区");
		region.setName_en("jiangbeiqu");
		region.setPid(500500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500600);
		region.setName("沙坪坝区");
		region.setName_en("shapingbaqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500601);
		region.setName("沙坪坝区");
		region.setName_en("shapingbaqu");
		region.setPid(500600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500700);
		region.setName("九龙坡区");
		region.setName_en("jiulongpoqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500701);
		region.setName("九龙坡区");
		region.setName_en("jiulongpoqu");
		region.setPid(500700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500800);
		region.setName("南岸区");
		region.setName_en("nananqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500801);
		region.setName("南岸区");
		region.setName_en("nananqu");
		region.setPid(500800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500900);
		region.setName("北碚区");
		region.setName_en("beibeiqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(500901);
		region.setName("北碚区");
		region.setName_en("beibeiqu");
		region.setPid(500900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501000);
		region.setName("万盛区");
		region.setName_en("wanshengqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501001);
		region.setName("万盛区");
		region.setName_en("wanshengqu");
		region.setPid(501000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501100);
		region.setName("双桥区");
		region.setName_en("shuangqiaoqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501101);
		region.setName("双桥区");
		region.setName_en("shuangqiaoqu");
		region.setPid(501100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501200);
		region.setName("渝北区");
		region.setName_en("yubeiqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501201);
		region.setName("渝北区");
		region.setName_en("yubeiqu");
		region.setPid(501200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501300);
		region.setName("巴南区");
		region.setName_en("bananqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501301);
		region.setName("巴南区");
		region.setName_en("bananqu");
		region.setPid(501300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501400);
		region.setName("黔江区");
		region.setName_en("qianjiangqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501401);
		region.setName("黔江区");
		region.setName_en("qianjiangqu");
		region.setPid(501400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501500);
		region.setName("长寿区");
		region.setName_en("zhangshouqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(501501);
		region.setName("长寿区");
		region.setName_en("zhangshouqu");
		region.setPid(501500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502200);
		region.setName("綦江区");
		region.setName_en("qijiangqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502201);
		region.setName("綦江区");
		region.setName_en("qijiangqu");
		region.setPid(502200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502300);
		region.setName("潼南县");
		region.setName_en("tongnanxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502301);
		region.setName("潼南县");
		region.setName_en("tongnanxian");
		region.setPid(502300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502400);
		region.setName("铜梁县");
		region.setName_en("tongliangxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502401);
		region.setName("铜梁县");
		region.setName_en("tongliangxian");
		region.setPid(502400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502500);
		region.setName("大足区");
		region.setName_en("dazuqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502501);
		region.setName("大足区");
		region.setName_en("dazuqu");
		region.setPid(502500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502600);
		region.setName("荣昌县");
		region.setName_en("rongchangxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502601);
		region.setName("荣昌县");
		region.setName_en("rongchangxian");
		region.setPid(502600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502700);
		region.setName("璧山县");
		region.setName_en("bishanxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502701);
		region.setName("璧山县");
		region.setName_en("bishanxian");
		region.setPid(502700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502800);
		region.setName("梁平县");
		region.setName_en("liangpingxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502801);
		region.setName("梁平县");
		region.setName_en("liangpingxian");
		region.setPid(502800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502900);
		region.setName("城口县");
		region.setName_en("chengkouxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(502901);
		region.setName("城口县");
		region.setName_en("chengkouxian");
		region.setPid(502900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503000);
		region.setName("丰都县");
		region.setName_en("fengdouxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503001);
		region.setName("丰都县");
		region.setName_en("fengdouxian");
		region.setPid(503000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503100);
		region.setName("垫江县");
		region.setName_en("dianjiangxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503101);
		region.setName("垫江县");
		region.setName_en("dianjiangxian");
		region.setPid(503100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503200);
		region.setName("武隆县");
		region.setName_en("wulongxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503201);
		region.setName("武隆县");
		region.setName_en("wulongxian");
		region.setPid(503200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503300);
		region.setName("忠县");
		region.setName_en("zhongxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503301);
		region.setName("忠县");
		region.setName_en("zhongxian");
		region.setPid(503300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503400);
		region.setName("开县");
		region.setName_en("kaixian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503401);
		region.setName("开县");
		region.setName_en("kaixian");
		region.setPid(503400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503500);
		region.setName("云阳县");
		region.setName_en("yunyangxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503501);
		region.setName("云阳县");
		region.setName_en("yunyangxian");
		region.setPid(503500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503600);
		region.setName("奉节县");
		region.setName_en("fengjiexian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503601);
		region.setName("奉节县");
		region.setName_en("fengjiexian");
		region.setPid(503600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503700);
		region.setName("巫山县");
		region.setName_en("wushanxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503701);
		region.setName("巫山县");
		region.setName_en("wushanxian");
		region.setPid(503700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503800);
		region.setName("巫溪县");
		region.setName_en("wuxixian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(503801);
		region.setName("巫溪县");
		region.setName_en("wuxixian");
		region.setPid(503800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504000);
		region.setName("石柱县");
		region.setName_en("shizhuxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504001);
		region.setName("石柱县");
		region.setName_en("shizhuxian");
		region.setPid(504000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504100);
		region.setName("秀山县");
		region.setName_en("xiushanxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504101);
		region.setName("秀山县");
		region.setName_en("xiushanxian");
		region.setPid(504100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504200);
		region.setName("酉阳县");
		region.setName_en("youyangxian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504201);
		region.setName("酉阳县");
		region.setName_en("youyangxian");
		region.setPid(504200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504300);
		region.setName("彭水县");
		region.setName_en("pengshuixian");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(504301);
		region.setName("彭水县");
		region.setName_en("pengshuixian");
		region.setPid(504300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508100);
		region.setName("江津区");
		region.setName_en("jiangjinqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508101);
		region.setName("江津区");
		region.setName_en("jiangjinqu");
		region.setPid(508100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508200);
		region.setName("合川区");
		region.setName_en("hechuanqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508201);
		region.setName("合川区");
		region.setName_en("hechuanqu");
		region.setPid(508200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508300);
		region.setName("永川区");
		region.setName_en("yongchuanqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508301);
		region.setName("永川区");
		region.setName_en("yongchuanqu");
		region.setPid(508300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508400);
		region.setName("南川区");
		region.setName_en("nanchuanqu");
		region.setPid(500001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(508401);
		region.setName("南川区");
		region.setName_en("nanchuanqu");
		region.setPid(508400);
		regionMapper.insert(region);
	}

	private void createSiChuan(){
		Region region;
		region=new Region();
		region.setId(510000);
		region.setName("四川省");
		region.setName_en("SiChuan");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510100);
		region.setName("成都市");
		region.setName_en("chengdoushi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510104);
		region.setName("锦江区");
		region.setName_en("jinjiangqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510105);
		region.setName("青羊区");
		region.setName_en("qingyangqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510106);
		region.setName("金牛区");
		region.setName_en("jinniuqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510107);
		region.setName("武侯区");
		region.setName_en("wuhouqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510108);
		region.setName("成华区");
		region.setName_en("chenghuaqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510112);
		region.setName("龙泉驿区");
		region.setName_en("longquanyiqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510113);
		region.setName("青白江区");
		region.setName_en("qingbaijiangqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510114);
		region.setName("新都区");
		region.setName_en("xindouqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510115);
		region.setName("温江区");
		region.setName_en("wenjiangqu");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510121);
		region.setName("金堂县");
		region.setName_en("jintangxian");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510122);
		region.setName("双流县");
		region.setName_en("shuangliuxian");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510124);
		region.setName("郫县");
		region.setName_en("pixian");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510129);
		region.setName("大邑县");
		region.setName_en("dayixian");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510131);
		region.setName("蒲江县");
		region.setName_en("pujiangxian");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510132);
		region.setName("新津县");
		region.setName_en("xinjinxian");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510181);
		region.setName("都江堰市");
		region.setName_en("dujiangyanshi");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510182);
		region.setName("彭州市");
		region.setName_en("pengzhoushi");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510183);
		region.setName("邛崃市");
		region.setName_en("qionglaishi");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510184);
		region.setName("崇州市");
		region.setName_en("chongzhoushi");
		region.setPid(510100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510300);
		region.setName("自贡市");
		region.setName_en("zigongshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510302);
		region.setName("自流井区");
		region.setName_en("ziliujingqu");
		region.setPid(510300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510303);
		region.setName("贡井区");
		region.setName_en("gongjingqu");
		region.setPid(510300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510304);
		region.setName("大安区");
		region.setName_en("daanqu");
		region.setPid(510300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510311);
		region.setName("沿滩区");
		region.setName_en("yantanqu");
		region.setPid(510300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510321);
		region.setName("荣县");
		region.setName_en("rongxian");
		region.setPid(510300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510322);
		region.setName("富顺县");
		region.setName_en("fushunxian");
		region.setPid(510300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510400);
		region.setName("攀枝花市");
		region.setName_en("panzhihuashi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510402);
		region.setName("东区");
		region.setName_en("dongqu");
		region.setPid(510400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510403);
		region.setName("西区");
		region.setName_en("xiqu");
		region.setPid(510400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510411);
		region.setName("仁和区");
		region.setName_en("renhequ");
		region.setPid(510400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510421);
		region.setName("米易县");
		region.setName_en("miyixian");
		region.setPid(510400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510422);
		region.setName("盐边县");
		region.setName_en("yanbianxian");
		region.setPid(510400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510500);
		region.setName("泸州市");
		region.setName_en("luzhoushi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510502);
		region.setName("江阳区");
		region.setName_en("jiangyangqu");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510503);
		region.setName("纳溪区");
		region.setName_en("naxiqu");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510504);
		region.setName("龙马潭区");
		region.setName_en("longmatanqu");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510521);
		region.setName("泸县");
		region.setName_en("luxian");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510522);
		region.setName("合江县");
		region.setName_en("hejiangxian");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510524);
		region.setName("叙永县");
		region.setName_en("xuyongxian");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510525);
		region.setName("古蔺县");
		region.setName_en("gulinxian");
		region.setPid(510500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510600);
		region.setName("德阳市");
		region.setName_en("deyangshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510603);
		region.setName("旌阳区");
		region.setName_en("jingyangqu");
		region.setPid(510600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510623);
		region.setName("中江县");
		region.setName_en("zhongjiangxian");
		region.setPid(510600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510626);
		region.setName("罗江县");
		region.setName_en("luojiangxian");
		region.setPid(510600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510681);
		region.setName("广汉市");
		region.setName_en("guanghanshi");
		region.setPid(510600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510682);
		region.setName("什邡市");
		region.setName_en("shenfangshi");
		region.setPid(510600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510683);
		region.setName("绵竹市");
		region.setName_en("mianzhushi");
		region.setPid(510600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510700);
		region.setName("绵阳市");
		region.setName_en("mianyangshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510703);
		region.setName("涪城区");
		region.setName_en("fuchengqu");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510704);
		region.setName("游仙区");
		region.setName_en("youxianqu");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510722);
		region.setName("三台县");
		region.setName_en("santaixian");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510723);
		region.setName("盐亭县");
		region.setName_en("yantingxian");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510724);
		region.setName("安县");
		region.setName_en("anxian");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510725);
		region.setName("梓潼县");
		region.setName_en("zitongxian");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510726);
		region.setName("北川羌族自治县");
		region.setName_en("beichuanqiangzuzizhixian");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510727);
		region.setName("平武县");
		region.setName_en("pingwuxian");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510781);
		region.setName("江油市");
		region.setName_en("jiangyoushi");
		region.setPid(510700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510800);
		region.setName("广元市");
		region.setName_en("guangyuanshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510802);
		region.setName("市中区");
		region.setName_en("shizhongqu");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510811);
		region.setName("元坝区");
		region.setName_en("yuanbaqu");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510812);
		region.setName("朝天区");
		region.setName_en("chaotianqu");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510821);
		region.setName("旺苍县");
		region.setName_en("wangcangxian");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510822);
		region.setName("青川县");
		region.setName_en("qingchuanxian");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510823);
		region.setName("剑阁县");
		region.setName_en("jiangexian");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510824);
		region.setName("苍溪县");
		region.setName_en("cangxixian");
		region.setPid(510800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510900);
		region.setName("遂宁市");
		region.setName_en("suiningshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510903);
		region.setName("船山区");
		region.setName_en("chuanshanqu");
		region.setPid(510900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510904);
		region.setName("安居区");
		region.setName_en("anjuqu");
		region.setPid(510900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510921);
		region.setName("蓬溪县");
		region.setName_en("pengxixian");
		region.setPid(510900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510922);
		region.setName("射洪县");
		region.setName_en("shehongxian");
		region.setPid(510900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(510923);
		region.setName("大英县");
		region.setName_en("dayingxian");
		region.setPid(510900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511000);
		region.setName("内江市");
		region.setName_en("neijiangshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511002);
		region.setName("市中区");
		region.setName_en("shizhongqu");
		region.setPid(511000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511011);
		region.setName("东兴区");
		region.setName_en("dongxingqu");
		region.setPid(511000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511024);
		region.setName("威远县");
		region.setName_en("weiyuanxian");
		region.setPid(511000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511025);
		region.setName("资中县");
		region.setName_en("zizhongxian");
		region.setPid(511000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511028);
		region.setName("隆昌县");
		region.setName_en("longchangxian");
		region.setPid(511000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511100);
		region.setName("乐山市");
		region.setName_en("leshanshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511102);
		region.setName("市中区");
		region.setName_en("shizhongqu");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511111);
		region.setName("沙湾区");
		region.setName_en("shawanqu");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511112);
		region.setName("五通桥区");
		region.setName_en("wutongqiaoqu");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511113);
		region.setName("金口河区");
		region.setName_en("jinkouhequ");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511123);
		region.setName("犍为县");
		region.setName_en("qianweixian");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511124);
		region.setName("井研县");
		region.setName_en("jingyanxian");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511126);
		region.setName("夹江县");
		region.setName_en("jiajiangxian");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511129);
		region.setName("沐川县");
		region.setName_en("muchuanxian");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511132);
		region.setName("峨边彝族自治县");
		region.setName_en("ebianyizuzizhixian");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511133);
		region.setName("马边彝族自治县");
		region.setName_en("mabianyizuzizhixian");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511181);
		region.setName("峨眉山市");
		region.setName_en("emeishanshi");
		region.setPid(511100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511300);
		region.setName("南充市");
		region.setName_en("nanchongshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511302);
		region.setName("顺庆区");
		region.setName_en("shunqingqu");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511303);
		region.setName("高坪区");
		region.setName_en("gaopingqu");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511304);
		region.setName("嘉陵区");
		region.setName_en("jialingqu");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511321);
		region.setName("南部县");
		region.setName_en("nanbuxian");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511322);
		region.setName("营山县");
		region.setName_en("yingshanxian");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511323);
		region.setName("蓬安县");
		region.setName_en("penganxian");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511324);
		region.setName("仪陇县");
		region.setName_en("yilongxian");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511325);
		region.setName("西充县");
		region.setName_en("xichongxian");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511381);
		region.setName("阆中市");
		region.setName_en("langzhongshi");
		region.setPid(511300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511400);
		region.setName("眉山市");
		region.setName_en("meishanshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511402);
		region.setName("东坡区");
		region.setName_en("dongpoqu");
		region.setPid(511400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511421);
		region.setName("仁寿县");
		region.setName_en("renshouxian");
		region.setPid(511400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511422);
		region.setName("彭山县");
		region.setName_en("pengshanxian");
		region.setPid(511400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511423);
		region.setName("洪雅县");
		region.setName_en("hongyaxian");
		region.setPid(511400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511424);
		region.setName("丹棱县");
		region.setName_en("danlengxian");
		region.setPid(511400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511425);
		region.setName("青神县");
		region.setName_en("qingshenxian");
		region.setPid(511400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511500);
		region.setName("宜宾市");
		region.setName_en("yibinshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511502);
		region.setName("翠屏区");
		region.setName_en("cuipingqu");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511521);
		region.setName("宜宾县");
		region.setName_en("yibinxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511522);
		region.setName("南溪县");
		region.setName_en("nanxixian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511523);
		region.setName("江安县");
		region.setName_en("jianganxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511524);
		region.setName("长宁县");
		region.setName_en("zhangningxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511525);
		region.setName("高县");
		region.setName_en("gaoxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511526);
		region.setName("珙县");
		region.setName_en("gongxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511527);
		region.setName("筠连县");
		region.setName_en("yunlianxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511528);
		region.setName("兴文县");
		region.setName_en("xingwenxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511529);
		region.setName("屏山县");
		region.setName_en("pingshanxian");
		region.setPid(511500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511600);
		region.setName("广安市");
		region.setName_en("guanganshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511602);
		region.setName("广安区");
		region.setName_en("guanganqu");
		region.setPid(511600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511621);
		region.setName("岳池县");
		region.setName_en("yuechixian");
		region.setPid(511600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511622);
		region.setName("武胜县");
		region.setName_en("wushengxian");
		region.setPid(511600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511623);
		region.setName("邻水县");
		region.setName_en("linshuixian");
		region.setPid(511600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511681);
		region.setName("华蓥市");
		region.setName_en("huayingshi");
		region.setPid(511600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511682);
		region.setName("广安区");
		region.setName_en("guanganqu");
		region.setPid(511600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511700);
		region.setName("达州市");
		region.setName_en("dazhoushi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511702);
		region.setName("通川区");
		region.setName_en("tongchuanqu");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511721);
		region.setName("达川区");
		region.setName_en("dachuanqu");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511722);
		region.setName("宣汉县");
		region.setName_en("xuanhanxian");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511723);
		region.setName("开江县");
		region.setName_en("kaijiangxian");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511724);
		region.setName("大竹县");
		region.setName_en("dazhuxian");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511725);
		region.setName("渠县");
		region.setName_en("quxian");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511781);
		region.setName("万源市");
		region.setName_en("wanyuanshi");
		region.setPid(511700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511800);
		region.setName("雅安市");
		region.setName_en("yaanshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511801);
		region.setName("雨城区");
		region.setName_en("yuchengqu");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511802);
		region.setName("雨城区");
		region.setName_en("yuchengqu");
		region.setPid(511801);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511821);
		region.setName("名山区");
		region.setName_en("mingshanqu");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511822);
		region.setName("荥经县");
		region.setName_en("yingjingxian");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511823);
		region.setName("汉源县");
		region.setName_en("hanyuanxian");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511824);
		region.setName("石棉县");
		region.setName_en("shimianxian");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511825);
		region.setName("天全县");
		region.setName_en("tianquanxian");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511826);
		region.setName("芦山县");
		region.setName_en("lushanxian");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511827);
		region.setName("宝兴县");
		region.setName_en("baoxingxian");
		region.setPid(511800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511900);
		region.setName("巴中市");
		region.setName_en("bazhongshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511902);
		region.setName("巴州区");
		region.setName_en("bazhouqu");
		region.setPid(511900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511921);
		region.setName("通江县");
		region.setName_en("tongjiangxian");
		region.setPid(511900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511922);
		region.setName("南江县");
		region.setName_en("nanjiangxian");
		region.setPid(511900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(511923);
		region.setName("平昌县");
		region.setName_en("pingchangxian");
		region.setPid(511900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(512000);
		region.setName("资阳市");
		region.setName_en("ziyangshi");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(512002);
		region.setName("雁江区");
		region.setName_en("yanjiangqu");
		region.setPid(512000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(512021);
		region.setName("安岳县");
		region.setName_en("anyuexian");
		region.setPid(512000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(512022);
		region.setName("乐至县");
		region.setName_en("lezhixian");
		region.setPid(512000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(512081);
		region.setName("简阳市");
		region.setName_en("jianyangshi");
		region.setPid(512000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513200);
		region.setName("阿坝藏族羌族自治州");
		region.setName_en("abeizangzu");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513221);
		region.setName("汶川县");
		region.setName_en("wenchuanxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513222);
		region.setName("理县");
		region.setName_en("lixian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513223);
		region.setName("茂县");
		region.setName_en("maoxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513224);
		region.setName("松潘县");
		region.setName_en("songpanxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513225);
		region.setName("九寨沟县");
		region.setName_en("jiuzhaigouxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513226);
		region.setName("金川县");
		region.setName_en("jinchuanxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513227);
		region.setName("小金县");
		region.setName_en("xiaojinxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513228);
		region.setName("黑水县");
		region.setName_en("heishuixian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513229);
		region.setName("马尔康县");
		region.setName_en("maerkangxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513230);
		region.setName("壤塘县");
		region.setName_en("rangtangxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513231);
		region.setName("阿坝县");
		region.setName_en("abaxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513232);
		region.setName("若尔盖县");
		region.setName_en("ruoergaixian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513233);
		region.setName("红原县");
		region.setName_en("hongyuanxian");
		region.setPid(513200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513300);
		region.setName("甘孜藏族自治州");
		region.setName_en("ganzizangzu");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513321);
		region.setName("康定县");
		region.setName_en("kangdingxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513322);
		region.setName("泸定县");
		region.setName_en("ludingxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513323);
		region.setName("丹巴县");
		region.setName_en("danbaxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513324);
		region.setName("九龙县");
		region.setName_en("jiulongxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513325);
		region.setName("雅江县");
		region.setName_en("yajiangxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513326);
		region.setName("道孚县");
		region.setName_en("daofuxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513327);
		region.setName("炉霍县");
		region.setName_en("luhuoxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513328);
		region.setName("甘孜县");
		region.setName_en("ganzixian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513329);
		region.setName("新龙县");
		region.setName_en("xinlongxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513330);
		region.setName("德格县");
		region.setName_en("degexian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513331);
		region.setName("白玉县");
		region.setName_en("baiyuxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513332);
		region.setName("石渠县");
		region.setName_en("shiquxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513333);
		region.setName("色达县");
		region.setName_en("sedaxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513334);
		region.setName("理塘县");
		region.setName_en("litangxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513335);
		region.setName("巴塘县");
		region.setName_en("batangxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513336);
		region.setName("乡城县");
		region.setName_en("xiangchengxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513337);
		region.setName("稻城县");
		region.setName_en("daochengxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513338);
		region.setName("得荣县");
		region.setName_en("derongxian");
		region.setPid(513300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513400);
		region.setName("凉山彝族自治州");
		region.setName_en("liangshanyizu");
		region.setPid(510000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513401);
		region.setName("西昌市");
		region.setName_en("xichangshi");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513422);
		region.setName("木里藏族自治县");
		region.setName_en("mulizangzuzizhixian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513423);
		region.setName("盐源县");
		region.setName_en("yanyuanxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513424);
		region.setName("德昌县");
		region.setName_en("dechangxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513425);
		region.setName("会理县");
		region.setName_en("huilixian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513426);
		region.setName("会东县");
		region.setName_en("huidongxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513427);
		region.setName("宁南县");
		region.setName_en("ningnanxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513428);
		region.setName("普格县");
		region.setName_en("pugexian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513429);
		region.setName("布拖县");
		region.setName_en("butuoxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513430);
		region.setName("金阳县");
		region.setName_en("jinyangxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513431);
		region.setName("昭觉县");
		region.setName_en("zhaojuexian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513432);
		region.setName("喜德县");
		region.setName_en("xidexian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513433);
		region.setName("冕宁县");
		region.setName_en("mianningxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513434);
		region.setName("越西县");
		region.setName_en("yuexixian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513435);
		region.setName("甘洛县");
		region.setName_en("ganluoxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513436);
		region.setName("美姑县");
		region.setName_en("meiguxian");
		region.setPid(513400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(513437);
		region.setName("雷波县");
		region.setName_en("leiboxian");
		region.setPid(513400);
		regionMapper.insert(region);
	}

	private void createGuiZhou(){
		Region region;
		region=new Region();
		region.setId(520000);
		region.setName("贵州省");
		region.setName_en("GuiZhou");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520100);
		region.setName("贵阳市");
		region.setName_en("guiyangshi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520102);
		region.setName("南明区");
		region.setName_en("nanmingqu");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520103);
		region.setName("云岩区");
		region.setName_en("yunyanqu");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520111);
		region.setName("花溪区");
		region.setName_en("huaxiqu");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520112);
		region.setName("乌当区");
		region.setName_en("wudangqu");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520113);
		region.setName("白云区");
		region.setName_en("baiyunqu");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520114);
		region.setName("小河区");
		region.setName_en("xiaohequ");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520121);
		region.setName("开阳县");
		region.setName_en("kaiyangxian");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520122);
		region.setName("息烽县");
		region.setName_en("xifengxian");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520123);
		region.setName("修文县");
		region.setName_en("xiuwenxian");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520181);
		region.setName("清镇市");
		region.setName_en("qingzhenshi");
		region.setPid(520100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520200);
		region.setName("六盘水市");
		region.setName_en("liupanshuishi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520201);
		region.setName("钟山区");
		region.setName_en("zhongshanqu");
		region.setPid(520200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520203);
		region.setName("六枝特区");
		region.setName_en("liuzhitequ");
		region.setPid(520200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520221);
		region.setName("水城县");
		region.setName_en("shuichengxian");
		region.setPid(520200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520222);
		region.setName("盘县");
		region.setName_en("panxian");
		region.setPid(520200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520300);
		region.setName("遵义市");
		region.setName_en("zunyishi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520302);
		region.setName("红花岗区");
		region.setName_en("honghuagangqu");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520303);
		region.setName("汇川区");
		region.setName_en("huichuanqu");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520321);
		region.setName("遵义县");
		region.setName_en("zunyixian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520322);
		region.setName("桐梓县");
		region.setName_en("tongzixian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520323);
		region.setName("绥阳县");
		region.setName_en("suiyangxian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520324);
		region.setName("正安县");
		region.setName_en("zhenganxian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520325);
		region.setName("道真仡佬族苗族自治县");
		region.setName_en("daozhengelaozumiaozuzizhixian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520326);
		region.setName("务川仡佬族苗族自治县");
		region.setName_en("wuchuangelaozumiaozuzizhixian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520327);
		region.setName("凤冈县");
		region.setName_en("fenggangxian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520328);
		region.setName("湄潭县");
		region.setName_en("meitanxian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520329);
		region.setName("余庆县");
		region.setName_en("yuqingxian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520330);
		region.setName("习水县");
		region.setName_en("xishuixian");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520381);
		region.setName("赤水市");
		region.setName_en("chishuishi");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520382);
		region.setName("仁怀市");
		region.setName_en("renhuaishi");
		region.setPid(520300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520400);
		region.setName("安顺市");
		region.setName_en("anshunshi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520402);
		region.setName("西秀区");
		region.setName_en("xixiuqu");
		region.setPid(520400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520421);
		region.setName("平坝县");
		region.setName_en("pingbaxian");
		region.setPid(520400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520422);
		region.setName("普定县");
		region.setName_en("pudingxian");
		region.setPid(520400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520423);
		region.setName("镇宁布依族苗族自治县");
		region.setName_en("zhenningbuyizumiaozuzizhixian");
		region.setPid(520400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520424);
		region.setName("关岭布依族苗族自治县");
		region.setName_en("guanlingbuyizumiaozuzizhixian");
		region.setPid(520400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(520425);
		region.setName("紫云苗族布依族自治县");
		region.setName_en("ziyunmiaozubuyizuzizhixian");
		region.setPid(520400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522200);
		region.setName("铜仁市");
		region.setName_en("tongrenshi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522201);
		region.setName("碧江区");
		region.setName_en("bijiangqu");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522222);
		region.setName("江口县");
		region.setName_en("jiangkouxian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522223);
		region.setName("玉屏侗族自治县");
		region.setName_en("yupingdongzuzizhixian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522224);
		region.setName("石阡县");
		region.setName_en("shiqianxian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522225);
		region.setName("思南县");
		region.setName_en("sinanxian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522226);
		region.setName("印江土家族苗族自治县");
		region.setName_en("yinjiangtujiazumiaozuzizhixian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522227);
		region.setName("德江县");
		region.setName_en("dejiangxian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522228);
		region.setName("沿河土家族自治县");
		region.setName_en("yanhetujiazuzizhixian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522229);
		region.setName("松桃苗族自治县");
		region.setName_en("songtaomiaozuzizhixian");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522230);
		region.setName("万山区");
		region.setName_en("wanshanqu");
		region.setPid(522200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522300);
		region.setName("黔西南布依族苗族自治州");
		region.setName_en("qianxi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522301);
		region.setName("兴义市");
		region.setName_en("xingyishi");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522322);
		region.setName("兴仁县");
		region.setName_en("xingrenxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522323);
		region.setName("普安县");
		region.setName_en("puanxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522324);
		region.setName("晴隆县");
		region.setName_en("qinglongxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522325);
		region.setName("贞丰县");
		region.setName_en("zhenfengxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522326);
		region.setName("望谟县");
		region.setName_en("wangmoxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522327);
		region.setName("册亨县");
		region.setName_en("cehengxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522328);
		region.setName("安龙县");
		region.setName_en("anlongxian");
		region.setPid(522300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522400);
		region.setName("毕节市");
		region.setName_en("bijieshi");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522401);
		region.setName("七星关区");
		region.setName_en("qixingguanqu");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522422);
		region.setName("大方县");
		region.setName_en("dafangxian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522423);
		region.setName("黔西县");
		region.setName_en("qianxixian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522424);
		region.setName("金沙县");
		region.setName_en("jinshaxian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522425);
		region.setName("织金县");
		region.setName_en("zhijinxian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522426);
		region.setName("纳雍县");
		region.setName_en("nayongxian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522427);
		region.setName("威宁彝族回族苗族自治县");
		region.setName_en("weiningyizuhuizumiaozuzizhixian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522428);
		region.setName("赫章县");
		region.setName_en("hezhangxian");
		region.setPid(522400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522600);
		region.setName("黔东南苗族侗族自治州");
		region.setName_en("qiandong");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522601);
		region.setName("凯里市");
		region.setName_en("kailishi");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522622);
		region.setName("黄平县");
		region.setName_en("huangpingxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522623);
		region.setName("施秉县");
		region.setName_en("shibingxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522624);
		region.setName("三穗县");
		region.setName_en("sansuixian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522625);
		region.setName("镇远县");
		region.setName_en("zhenyuanxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522626);
		region.setName("岑巩县");
		region.setName_en("cengongxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522627);
		region.setName("天柱县");
		region.setName_en("tianzhuxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522628);
		region.setName("锦屏县");
		region.setName_en("jinpingxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522629);
		region.setName("剑河县");
		region.setName_en("jianhexian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522630);
		region.setName("台江县");
		region.setName_en("taijiangxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522631);
		region.setName("黎平县");
		region.setName_en("lipingxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522632);
		region.setName("榕江县");
		region.setName_en("rongjiangxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522633);
		region.setName("从江县");
		region.setName_en("congjiangxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522634);
		region.setName("雷山县");
		region.setName_en("leishanxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522635);
		region.setName("麻江县");
		region.setName_en("majiangxian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522636);
		region.setName("丹寨县");
		region.setName_en("danzhaixian");
		region.setPid(522600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522700);
		region.setName("黔南布依族苗族自治州");
		region.setName_en("qiannan");
		region.setPid(520000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522701);
		region.setName("都匀市");
		region.setName_en("douyunshi");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522702);
		region.setName("福泉市");
		region.setName_en("fuquanshi");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522722);
		region.setName("荔波县");
		region.setName_en("liboxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522723);
		region.setName("贵定县");
		region.setName_en("guidingxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522725);
		region.setName("瓮安县");
		region.setName_en("wenganxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522726);
		region.setName("独山县");
		region.setName_en("dushanxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522727);
		region.setName("平塘县");
		region.setName_en("pingtangxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522728);
		region.setName("罗甸县");
		region.setName_en("luodianxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522729);
		region.setName("长顺县");
		region.setName_en("zhangshunxian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522730);
		region.setName("龙里县");
		region.setName_en("longlixian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522731);
		region.setName("惠水县");
		region.setName_en("huishuixian");
		region.setPid(522700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(522732);
		region.setName("三都水族自治县");
		region.setName_en("sandoushuizuzizhixian");
		region.setPid(522700);
		regionMapper.insert(region);
	}

	private void createYunNan(){
		Region region;
		region=new Region();
		region.setId(530000);
		region.setName("云南省");
		region.setName_en("YunNan");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530100);
		region.setName("昆明市");
		region.setName_en("kunmingshi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530102);
		region.setName("五华区");
		region.setName_en("wuhuaqu");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530103);
		region.setName("盘龙区");
		region.setName_en("panlongqu");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530111);
		region.setName("官渡区");
		region.setName_en("guanduqu");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530112);
		region.setName("西山区");
		region.setName_en("xishanqu");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530113);
		region.setName("东川区");
		region.setName_en("dongchuanqu");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530121);
		region.setName("呈贡县");
		region.setName_en("chenggongxian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530122);
		region.setName("晋宁县");
		region.setName_en("jinningxian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530124);
		region.setName("富民县");
		region.setName_en("fuminxian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530125);
		region.setName("宜良县");
		region.setName_en("yiliangxian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530126);
		region.setName("石林彝族自治县");
		region.setName_en("shilinyizuzizhixian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530127);
		region.setName("嵩明县");
		region.setName_en("songmingxian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530128);
		region.setName("禄劝彝族苗族自治县");
		region.setName_en("luquanyizumiaozuzizhixian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530129);
		region.setName("寻甸回族彝族自治县");
		region.setName_en("xundianhuizuyizuzizhixian");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530181);
		region.setName("安宁市");
		region.setName_en("anningshi");
		region.setPid(530100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530300);
		region.setName("曲靖市");
		region.setName_en("qujingshi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530302);
		region.setName("麒麟区");
		region.setName_en("qilinqu");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530321);
		region.setName("马龙县");
		region.setName_en("malongxian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530322);
		region.setName("陆良县");
		region.setName_en("luliangxian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530323);
		region.setName("师宗县");
		region.setName_en("shizongxian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530324);
		region.setName("罗平县");
		region.setName_en("luopingxian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530325);
		region.setName("富源县");
		region.setName_en("fuyuanxian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530326);
		region.setName("会泽县");
		region.setName_en("huizexian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530328);
		region.setName("沾益县");
		region.setName_en("zhanyixian");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530381);
		region.setName("宣威市");
		region.setName_en("xuanweishi");
		region.setPid(530300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530400);
		region.setName("玉溪市");
		region.setName_en("yuxishi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530402);
		region.setName("红塔区");
		region.setName_en("hongtaqu");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530421);
		region.setName("江川县");
		region.setName_en("jiangchuanxian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530422);
		region.setName("澄江县");
		region.setName_en("chengjiangxian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530423);
		region.setName("通海县");
		region.setName_en("tonghaixian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530424);
		region.setName("华宁县");
		region.setName_en("huaningxian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530425);
		region.setName("易门县");
		region.setName_en("yimenxian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530426);
		region.setName("峨山彝族自治县");
		region.setName_en("eshanyizuzizhixian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530427);
		region.setName("新平彝族傣族自治县");
		region.setName_en("xinpingyizudaizuzizhixian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530428);
		region.setName("元江哈尼族彝族傣族自治县");
		region.setName_en("yuanjianghanizuyizudaizuzizhixian");
		region.setPid(530400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530500);
		region.setName("保山市");
		region.setName_en("baoshanshi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530502);
		region.setName("隆阳区");
		region.setName_en("longyangqu");
		region.setPid(530500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530521);
		region.setName("施甸县");
		region.setName_en("shidianxian");
		region.setPid(530500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530522);
		region.setName("腾冲县");
		region.setName_en("tengchongxian");
		region.setPid(530500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530523);
		region.setName("龙陵县");
		region.setName_en("longlingxian");
		region.setPid(530500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530524);
		region.setName("昌宁县");
		region.setName_en("changningxian");
		region.setPid(530500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530600);
		region.setName("昭通市");
		region.setName_en("shaotongshi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530602);
		region.setName("昭阳区");
		region.setName_en("zhaoyangqu");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530621);
		region.setName("鲁甸县");
		region.setName_en("ludianxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530622);
		region.setName("巧家县");
		region.setName_en("qiaojiaxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530623);
		region.setName("盐津县");
		region.setName_en("yanjinxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530624);
		region.setName("大关县");
		region.setName_en("daguanxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530625);
		region.setName("永善县");
		region.setName_en("yongshanxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530626);
		region.setName("绥江县");
		region.setName_en("suijiangxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530627);
		region.setName("镇雄县");
		region.setName_en("zhenxiongxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530628);
		region.setName("彝良县");
		region.setName_en("yiliangxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530629);
		region.setName("威信县");
		region.setName_en("weixinxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530630);
		region.setName("水富县");
		region.setName_en("shuifuxian");
		region.setPid(530600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530700);
		region.setName("丽江市");
		region.setName_en("lijiangshi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530702);
		region.setName("古城区");
		region.setName_en("guchengqu");
		region.setPid(530700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530721);
		region.setName("玉龙纳西族自治县");
		region.setName_en("yulongnaxizuzizhixian");
		region.setPid(530700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530722);
		region.setName("永胜县");
		region.setName_en("yongshengxian");
		region.setPid(530700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530723);
		region.setName("华坪县");
		region.setName_en("huapingxian");
		region.setPid(530700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530724);
		region.setName("宁蒗彝族自治县");
		region.setName_en("ninglangyizuzizhixian");
		region.setPid(530700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530800);
		region.setName("普洱市");
		region.setName_en("puershi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530802);
		region.setName("翠云区");
		region.setName_en("cuiyunqu");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530821);
		region.setName("宁洱哈尼族彝族自治县");
		region.setName_en("ningerhanizuyizuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530822);
		region.setName("墨江哈尼族自治县");
		region.setName_en("mojianghanizuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530823);
		region.setName("景东彝族自治县");
		region.setName_en("jingdongyizuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530824);
		region.setName("景谷傣族彝族自治县");
		region.setName_en("jinggudaizuyizuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530825);
		region.setName("镇沅彝族哈尼族拉祜族自治县");
		region.setName_en("zhenyuanyizuhanizulahuzuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530826);
		region.setName("江城哈尼族彝族自治县");
		region.setName_en("jiangchenghanizuyizuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530827);
		region.setName("孟连傣族拉祜族佤族自治县");
		region.setName_en("mengliandaizulahuzuwazuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530828);
		region.setName("澜沧拉祜族自治县");
		region.setName_en("lancanglahuzuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530829);
		region.setName("西盟佤族自治县");
		region.setName_en("ximengwazuzizhixian");
		region.setPid(530800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530900);
		region.setName("临沧市");
		region.setName_en("lincangshi");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530902);
		region.setName("临翔区");
		region.setName_en("linxiangqu");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530921);
		region.setName("凤庆县");
		region.setName_en("fengqingxian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530922);
		region.setName("云县");
		region.setName_en("yunxian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530923);
		region.setName("永德县");
		region.setName_en("yongdexian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530924);
		region.setName("镇康县");
		region.setName_en("zhenkangxian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530925);
		region.setName("双江拉祜族佤族布朗族傣族自治县");
		region.setName_en("shuangjianglahuzuwazubulangzudaizuzizhixian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530926);
		region.setName("耿马傣族佤族自治县");
		region.setName_en("gengmadaizuwazuzizhixian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(530927);
		region.setName("沧源佤族自治县");
		region.setName_en("cangyuanwazuzizhixian");
		region.setPid(530900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532300);
		region.setName("楚雄彝族自治州");
		region.setName_en("chuxiongyizu");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532301);
		region.setName("楚雄市");
		region.setName_en("chuxiongshi");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532322);
		region.setName("双柏县");
		region.setName_en("shuangboxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532323);
		region.setName("牟定县");
		region.setName_en("moudingxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532324);
		region.setName("南华县");
		region.setName_en("nanhuaxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532325);
		region.setName("姚安县");
		region.setName_en("yaoanxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532326);
		region.setName("大姚县");
		region.setName_en("dayaoxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532327);
		region.setName("永仁县");
		region.setName_en("yongrenxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532328);
		region.setName("元谋县");
		region.setName_en("yuanmouxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532329);
		region.setName("武定县");
		region.setName_en("wudingxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532331);
		region.setName("禄丰县");
		region.setName_en("lufengxian");
		region.setPid(532300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532500);
		region.setName("红河哈尼族彝族自治州");
		region.setName_en("honghehani");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532501);
		region.setName("个旧市");
		region.setName_en("gejiushi");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532502);
		region.setName("开远市");
		region.setName_en("kaiyuanshi");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532522);
		region.setName("蒙自市");
		region.setName_en("mengzishi");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532523);
		region.setName("屏边苗族自治县");
		region.setName_en("pingbianmiaozuzizhixian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532524);
		region.setName("建水县");
		region.setName_en("jianshuixian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532525);
		region.setName("石屏县");
		region.setName_en("shipingxian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532526);
		region.setName("弥勒市");
		region.setName_en("mileshi");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532527);
		region.setName("泸西县");
		region.setName_en("luxixian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532528);
		region.setName("元阳县");
		region.setName_en("yuanyangxian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532529);
		region.setName("红河县");
		region.setName_en("honghexian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532530);
		region.setName("金平苗族瑶族傣族自治县");
		region.setName_en("jinpingmiaozuyaozudaizuzizhixian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532531);
		region.setName("绿春县");
		region.setName_en("lvchunxian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532532);
		region.setName("河口瑶族自治县");
		region.setName_en("hekouyaozuzizhixian");
		region.setPid(532500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532600);
		region.setName("文山壮族苗族自治州");
		region.setName_en("zhuangzu");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532621);
		region.setName("文山市");
		region.setName_en("wenshanshi");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532622);
		region.setName("砚山县");
		region.setName_en("yanshanxian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532623);
		region.setName("西畴县");
		region.setName_en("xichouxian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532624);
		region.setName("麻栗坡县");
		region.setName_en("malipoxian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532625);
		region.setName("马关县");
		region.setName_en("maguanxian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532626);
		region.setName("丘北县");
		region.setName_en("qiubeixian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532627);
		region.setName("广南县");
		region.setName_en("guangnanxian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532628);
		region.setName("富宁县");
		region.setName_en("funingxian");
		region.setPid(532600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532800);
		region.setName("西双版纳傣族自治州");
		region.setName_en("xishuangbanna");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532801);
		region.setName("景洪市");
		region.setName_en("jinghongshi");
		region.setPid(532800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532822);
		region.setName("勐海县");
		region.setName_en("menghaixian");
		region.setPid(532800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532823);
		region.setName("勐腊县");
		region.setName_en("menglaxian");
		region.setPid(532800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532900);
		region.setName("大理白族自治州");
		region.setName_en("dalibaizu");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532901);
		region.setName("大理市");
		region.setName_en("dalishi");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532922);
		region.setName("漾濞彝族自治县");
		region.setName_en("yangbiyizuzizhixian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532923);
		region.setName("祥云县");
		region.setName_en("xiangyunxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532924);
		region.setName("宾川县");
		region.setName_en("binchuanxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532925);
		region.setName("弥渡县");
		region.setName_en("miduxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532926);
		region.setName("南涧彝族自治县");
		region.setName_en("nanjianyizuzizhixian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532927);
		region.setName("巍山彝族回族自治县");
		region.setName_en("weishanyizuhuizuzizhixian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532928);
		region.setName("永平县");
		region.setName_en("yongpingxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532929);
		region.setName("云龙县");
		region.setName_en("yunlongxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532930);
		region.setName("洱源县");
		region.setName_en("eryuanxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532931);
		region.setName("剑川县");
		region.setName_en("jianchuanxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(532932);
		region.setName("鹤庆县");
		region.setName_en("heqingxian");
		region.setPid(532900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533100);
		region.setName("德宏傣族景颇族自治州");
		region.setName_en("dehongdaiz");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533102);
		region.setName("瑞丽市");
		region.setName_en("ruilishi");
		region.setPid(533100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533103);
		region.setName("潞西市");
		region.setName_en("luxishi");
		region.setPid(533100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533122);
		region.setName("梁河县");
		region.setName_en("lianghexian");
		region.setPid(533100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533123);
		region.setName("盈江县");
		region.setName_en("yingjiangxian");
		region.setPid(533100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533124);
		region.setName("陇川县");
		region.setName_en("longchuanxian");
		region.setPid(533100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533300);
		region.setName("怒江傈僳族自治州");
		region.setName_en("nujiang");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533321);
		region.setName("泸水县");
		region.setName_en("lushuixian");
		region.setPid(533300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533323);
		region.setName("福贡县");
		region.setName_en("fugongxian");
		region.setPid(533300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533324);
		region.setName("贡山独龙族怒族自治县");
		region.setName_en("gongshandulongzunuzuzizhixian");
		region.setPid(533300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533325);
		region.setName("兰坪白族普米族自治县");
		region.setName_en("lanpingbaizupumizuzizhixian");
		region.setPid(533300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533400);
		region.setName("迪庆藏族自治州");
		region.setName_en("diqing");
		region.setPid(530000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533421);
		region.setName("香格里拉县");
		region.setName_en("xianggelilaxian");
		region.setPid(533400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533422);
		region.setName("德钦县");
		region.setName_en("deqinxian");
		region.setPid(533400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(533423);
		region.setName("维西傈僳族自治县");
		region.setName_en("weixilisuzuzizhixian");
		region.setPid(533400);
		regionMapper.insert(region);
	}

	private void createXiZang(){
		Region region;
		region=new Region();
		region.setId(540000);
		region.setName("西藏自治区");
		region.setName_en("XiZang");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540100);
		region.setName("拉萨市");
		region.setName_en("lasashi");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540102);
		region.setName("城关区");
		region.setName_en("chengguanqu");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540121);
		region.setName("林周县");
		region.setName_en("linzhouxian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540122);
		region.setName("当雄县");
		region.setName_en("dangxiongxian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540123);
		region.setName("尼木县");
		region.setName_en("nimuxian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540124);
		region.setName("曲水县");
		region.setName_en("qushuixian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540125);
		region.setName("堆龙德庆县");
		region.setName_en("duilongdeqingxian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540126);
		region.setName("达孜县");
		region.setName_en("dazixian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(540127);
		region.setName("墨竹工卡县");
		region.setName_en("mozhugongkaxian");
		region.setPid(540100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542100);
		region.setName("昌都diqu");
		region.setName_en("changdoudiqu");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542121);
		region.setName("昌都县");
		region.setName_en("changdouxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542122);
		region.setName("江达县");
		region.setName_en("jiangdaxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542123);
		region.setName("贡觉县");
		region.setName_en("gongjuexian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542124);
		region.setName("类乌齐县");
		region.setName_en("leiwuqixian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542125);
		region.setName("丁青县");
		region.setName_en("dingqingxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542126);
		region.setName("察雅县");
		region.setName_en("chayaxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542127);
		region.setName("八宿县");
		region.setName_en("basuxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542128);
		region.setName("左贡县");
		region.setName_en("zuogongxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542129);
		region.setName("芒康县");
		region.setName_en("mangkangxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542132);
		region.setName("洛隆县");
		region.setName_en("luolongxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542133);
		region.setName("边坝县");
		region.setName_en("bianbaxian");
		region.setPid(542100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542200);
		region.setName("山南diqu");
		region.setName_en("shannandiqu");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542221);
		region.setName("乃东县");
		region.setName_en("naidongxian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542222);
		region.setName("扎囊县");
		region.setName_en("zhanangxian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542223);
		region.setName("贡嘎县");
		region.setName_en("gonggaxian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542224);
		region.setName("桑日县");
		region.setName_en("sangrixian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542225);
		region.setName("琼结县");
		region.setName_en("qiongjiexian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542226);
		region.setName("曲松县");
		region.setName_en("qusongxian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542227);
		region.setName("措美县");
		region.setName_en("cuomeixian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542228);
		region.setName("洛扎县");
		region.setName_en("luozhaxian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542229);
		region.setName("加查县");
		region.setName_en("jiachaxian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542231);
		region.setName("隆子县");
		region.setName_en("longzixian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542232);
		region.setName("错那县");
		region.setName_en("cuoneixian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542233);
		region.setName("浪卡子县");
		region.setName_en("langqiazixian");
		region.setPid(542200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542300);
		region.setName("日喀则地区");
		region.setName_en("rikaze");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542301);
		region.setName("日喀则市");
		region.setName_en("rikazeshi");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542322);
		region.setName("南木林县");
		region.setName_en("nanmulinxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542323);
		region.setName("江孜县");
		region.setName_en("jiangzixian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542324);
		region.setName("定日县");
		region.setName_en("dingrixian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542325);
		region.setName("萨迦县");
		region.setName_en("sajiaxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542326);
		region.setName("拉孜县");
		region.setName_en("lazixian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542327);
		region.setName("昂仁县");
		region.setName_en("angrenxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542328);
		region.setName("谢通门县");
		region.setName_en("xietongmenxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542329);
		region.setName("白朗县");
		region.setName_en("bailangxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542330);
		region.setName("仁布县");
		region.setName_en("renbuxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542331);
		region.setName("康马县");
		region.setName_en("kangmaxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542332);
		region.setName("定结县");
		region.setName_en("dingjiexian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542333);
		region.setName("仲巴县");
		region.setName_en("zhongbaxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542334);
		region.setName("亚东县");
		region.setName_en("yadongxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542335);
		region.setName("吉隆县");
		region.setName_en("jilongxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542336);
		region.setName("聂拉木县");
		region.setName_en("nielamuxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542337);
		region.setName("萨嘎县");
		region.setName_en("sagaxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542338);
		region.setName("岗巴县");
		region.setName_en("gangbaxian");
		region.setPid(542300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542400);
		region.setName("那曲地区");
		region.setName_en("naqu");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542421);
		region.setName("那曲县");
		region.setName_en("neiquxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542422);
		region.setName("嘉黎县");
		region.setName_en("jialixian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542423);
		region.setName("比如县");
		region.setName_en("biruxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542424);
		region.setName("聂荣县");
		region.setName_en("nierongxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542425);
		region.setName("安多县");
		region.setName_en("anduoxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542426);
		region.setName("申扎县");
		region.setName_en("shenzhaxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542427);
		region.setName("索县");
		region.setName_en("suoxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542428);
		region.setName("班戈县");
		region.setName_en("bangexian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542429);
		region.setName("巴青县");
		region.setName_en("baqingxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542430);
		region.setName("尼玛县");
		region.setName_en("nimaxian");
		region.setPid(542400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542500);
		region.setName("阿里地区");
		region.setName_en("ali");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542521);
		region.setName("普兰县");
		region.setName_en("pulanxian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542522);
		region.setName("札达县");
		region.setName_en("zhadaxian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542523);
		region.setName("噶尔县");
		region.setName_en("gaerxian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542524);
		region.setName("日土县");
		region.setName_en("rituxian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542525);
		region.setName("革吉县");
		region.setName_en("gejixian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542526);
		region.setName("改则县");
		region.setName_en("gaizexian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542527);
		region.setName("措勤县");
		region.setName_en("cuoqinxian");
		region.setPid(542500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542600);
		region.setName("林芝地区");
		region.setName_en("linzhi");
		region.setPid(540000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542621);
		region.setName("林芝县");
		region.setName_en("linzhixian");
		region.setPid(542600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542622);
		region.setName("工布江达县");
		region.setName_en("gongbujiangdaxian");
		region.setPid(542600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542623);
		region.setName("米林县");
		region.setName_en("milinxian");
		region.setPid(542600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542624);
		region.setName("墨脱县");
		region.setName_en("motuoxian");
		region.setPid(542600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542625);
		region.setName("波密县");
		region.setName_en("bomixian");
		region.setPid(542600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542626);
		region.setName("察隅县");
		region.setName_en("chayuxian");
		region.setPid(542600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(542627);
		region.setName("朗县");
		region.setName_en("langxian");
		region.setPid(542600);
		regionMapper.insert(region);
	}

	private void createShaanXi(){
		Region region;
		region=new Region();
		region.setId(610000);
		region.setName("陕西省");
		region.setName_en("ShaanXi");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610100);
		region.setName("西安市");
		region.setName_en("xianshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610101);
		region.setName("长安区");
		region.setName_en("zhanganqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610102);
		region.setName("新城区");
		region.setName_en("xinchengqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610103);
		region.setName("碑林区");
		region.setName_en("beilinqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610104);
		region.setName("莲湖区");
		region.setName_en("lianhuqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610111);
		region.setName("灞桥区");
		region.setName_en("baqiaoqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610112);
		region.setName("未央区");
		region.setName_en("weiyangqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610113);
		region.setName("雁塔区");
		region.setName_en("yantaqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610114);
		region.setName("阎良区");
		region.setName_en("yanliangqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610115);
		region.setName("临潼区");
		region.setName_en("lintongqu");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610122);
		region.setName("蓝田县");
		region.setName_en("lantianxian");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610124);
		region.setName("周至县");
		region.setName_en("zhouzhixian");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610125);
		region.setName("户县");
		region.setName_en("huxian");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610126);
		region.setName("高陵县");
		region.setName_en("gaolingxian");
		region.setPid(610100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610200);
		region.setName("铜川市");
		region.setName_en("tongchuanshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610202);
		region.setName("王益区");
		region.setName_en("wangyiqu");
		region.setPid(610200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610203);
		region.setName("印台区");
		region.setName_en("yintaiqu");
		region.setPid(610200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610204);
		region.setName("耀州区");
		region.setName_en("yaozhouqu");
		region.setPid(610200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610222);
		region.setName("宜君县");
		region.setName_en("yijunxian");
		region.setPid(610200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610300);
		region.setName("宝鸡市");
		region.setName_en("baojishi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610302);
		region.setName("渭滨区");
		region.setName_en("weibinqu");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610303);
		region.setName("金台区");
		region.setName_en("jintaiqu");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610304);
		region.setName("陈仓区");
		region.setName_en("chencangqu");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610322);
		region.setName("凤翔县");
		region.setName_en("fengxiangxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610323);
		region.setName("岐山县");
		region.setName_en("qishanxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610324);
		region.setName("扶风县");
		region.setName_en("fufengxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610326);
		region.setName("眉县");
		region.setName_en("meixian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610327);
		region.setName("陇县");
		region.setName_en("longxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610328);
		region.setName("千阳县");
		region.setName_en("qianyangxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610329);
		region.setName("麟游县");
		region.setName_en("linyouxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610330);
		region.setName("凤县");
		region.setName_en("fengxian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610331);
		region.setName("太白县");
		region.setName_en("taibaixian");
		region.setPid(610300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610400);
		region.setName("咸阳市");
		region.setName_en("xianyangshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610402);
		region.setName("秦都区");
		region.setName_en("qindouqu");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610404);
		region.setName("渭城区");
		region.setName_en("weichengqu");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610422);
		region.setName("三原县");
		region.setName_en("sanyuanxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610423);
		region.setName("泾阳县");
		region.setName_en("jingyangxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610424);
		region.setName("乾县");
		region.setName_en("qianxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610425);
		region.setName("礼泉县");
		region.setName_en("liquanxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610426);
		region.setName("永寿县");
		region.setName_en("yongshouxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610427);
		region.setName("彬县");
		region.setName_en("binxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610428);
		region.setName("长武县");
		region.setName_en("zhangwuxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610429);
		region.setName("旬邑县");
		region.setName_en("xunyixian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610430);
		region.setName("淳化县");
		region.setName_en("chunhuaxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610431);
		region.setName("武功县");
		region.setName_en("wugongxian");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610481);
		region.setName("兴平市");
		region.setName_en("xingpingshi");
		region.setPid(610400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610500);
		region.setName("渭南市");
		region.setName_en("weinanshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610502);
		region.setName("临渭区");
		region.setName_en("linweiqu");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610521);
		region.setName("华县");
		region.setName_en("huaxian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610522);
		region.setName("潼关县");
		region.setName_en("tongguanxian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610523);
		region.setName("大荔县");
		region.setName_en("dalixian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610524);
		region.setName("合阳县");
		region.setName_en("heyangxian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610525);
		region.setName("澄城县");
		region.setName_en("chengchengxian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610526);
		region.setName("蒲城县");
		region.setName_en("puchengxian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610527);
		region.setName("白水县");
		region.setName_en("baishuixian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610528);
		region.setName("富平县");
		region.setName_en("fupingxian");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610581);
		region.setName("韩城市");
		region.setName_en("hanchengshi");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610582);
		region.setName("华阴市");
		region.setName_en("huayinshi");
		region.setPid(610500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610600);
		region.setName("延安市");
		region.setName_en("yananshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610602);
		region.setName("宝塔区");
		region.setName_en("baotaqu");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610621);
		region.setName("延长县");
		region.setName_en("yanzhangxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610622);
		region.setName("延川县");
		region.setName_en("yanchuanxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610623);
		region.setName("子长县");
		region.setName_en("zizhangxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610624);
		region.setName("安塞县");
		region.setName_en("ansaixian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610625);
		region.setName("志丹县");
		region.setName_en("zhidanxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610626);
		region.setName("吴起县");
		region.setName_en("wuqixian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610627);
		region.setName("甘泉县");
		region.setName_en("ganquanxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610628);
		region.setName("富县");
		region.setName_en("fuxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610629);
		region.setName("洛川县");
		region.setName_en("luochuanxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610630);
		region.setName("宜川县");
		region.setName_en("yichuanxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610631);
		region.setName("黄龙县");
		region.setName_en("huanglongxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610632);
		region.setName("黄陵县");
		region.setName_en("huanglingxian");
		region.setPid(610600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610700);
		region.setName("汉中市");
		region.setName_en("hanzhongshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610702);
		region.setName("汉台区");
		region.setName_en("hantaiqu");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610721);
		region.setName("南郑县");
		region.setName_en("nanzhengxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610722);
		region.setName("城固县");
		region.setName_en("chengguxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610723);
		region.setName("洋县");
		region.setName_en("yangxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610724);
		region.setName("西乡县");
		region.setName_en("xixiangxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610725);
		region.setName("勉县");
		region.setName_en("mianxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610726);
		region.setName("宁强县");
		region.setName_en("ningqiangxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610727);
		region.setName("略阳县");
		region.setName_en("lveyangxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610728);
		region.setName("镇巴县");
		region.setName_en("zhenbaxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610729);
		region.setName("留坝县");
		region.setName_en("liubaxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610730);
		region.setName("佛坪县");
		region.setName_en("fopingxian");
		region.setPid(610700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610800);
		region.setName("榆林市");
		region.setName_en("yulinshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610802);
		region.setName("榆阳区");
		region.setName_en("yuyangqu");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610821);
		region.setName("神木县");
		region.setName_en("shenmuxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610822);
		region.setName("府谷县");
		region.setName_en("fuguxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610823);
		region.setName("横山县");
		region.setName_en("hengshanxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610824);
		region.setName("靖边县");
		region.setName_en("jingbianxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610825);
		region.setName("定边县");
		region.setName_en("dingbianxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610826);
		region.setName("绥德县");
		region.setName_en("suidexian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610827);
		region.setName("米脂县");
		region.setName_en("mizhixian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610828);
		region.setName("佳县");
		region.setName_en("jiaxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610829);
		region.setName("吴堡县");
		region.setName_en("wubuxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610830);
		region.setName("清涧县");
		region.setName_en("qingjianxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610831);
		region.setName("子洲县");
		region.setName_en("zizhouxian");
		region.setPid(610800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610900);
		region.setName("安康市");
		region.setName_en("ankangshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610902);
		region.setName("汉滨区");
		region.setName_en("hanbinqu");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610921);
		region.setName("汉阴县");
		region.setName_en("hanyinxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610922);
		region.setName("石泉县");
		region.setName_en("shiquanxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610923);
		region.setName("宁陕县");
		region.setName_en("ningshanxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610924);
		region.setName("紫阳县");
		region.setName_en("ziyangxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610925);
		region.setName("岚皋县");
		region.setName_en("langaoxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610926);
		region.setName("平利县");
		region.setName_en("pinglixian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610927);
		region.setName("镇坪县");
		region.setName_en("zhenpingxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610928);
		region.setName("旬阳县");
		region.setName_en("xunyangxian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(610929);
		region.setName("白河县");
		region.setName_en("baihexian");
		region.setPid(610900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611000);
		region.setName("商洛市");
		region.setName_en("shangluoshi");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611002);
		region.setName("商州区");
		region.setName_en("shangzhouqu");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611021);
		region.setName("洛南县");
		region.setName_en("luonanxian");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611022);
		region.setName("丹凤县");
		region.setName_en("danfengxian");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611023);
		region.setName("商南县");
		region.setName_en("shangnanxian");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611024);
		region.setName("山阳县");
		region.setName_en("shanyangxian");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611025);
		region.setName("镇安县");
		region.setName_en("zhenanxian");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611026);
		region.setName("柞水县");
		region.setName_en("zhashuixian");
		region.setPid(611000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611100);
		region.setName("杨凌示范区");
		region.setName_en("yangling");
		region.setPid(610000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(611103);
		region.setName("杨凌区");
		region.setName_en("yanglingqu");
		region.setPid(611100);
		regionMapper.insert(region);
	}

	private void createGanSu(){
		Region region;
		region=new Region();
		region.setId(620000);
		region.setName("甘肃省");
		region.setName_en("GanSu");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620100);
		region.setName("兰州市");
		region.setName_en("lanzhoushi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620102);
		region.setName("城关区");
		region.setName_en("chengguanqu");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620103);
		region.setName("七里河区");
		region.setName_en("qilihequ");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620104);
		region.setName("西固区");
		region.setName_en("xiguqu");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620105);
		region.setName("安宁区");
		region.setName_en("anningqu");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620111);
		region.setName("红古区");
		region.setName_en("hongguqu");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620121);
		region.setName("永登县");
		region.setName_en("yongdengxian");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620122);
		region.setName("皋兰县");
		region.setName_en("gaolanxian");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620123);
		region.setName("榆中县");
		region.setName_en("yuzhongxian");
		region.setPid(620100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620200);
		region.setName("嘉峪关市");
		region.setName_en("jiayuguanshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620300);
		region.setName("金昌市");
		region.setName_en("jinchangshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620301);
		region.setName("金川区");
		region.setName_en("jinchuanqu");
		region.setPid(620300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620321);
		region.setName("永昌县");
		region.setName_en("yongchangxian");
		region.setPid(620300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620400);
		region.setName("白银市");
		region.setName_en("baiyinshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620402);
		region.setName("白银区");
		region.setName_en("baiyinqu");
		region.setPid(620400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620403);
		region.setName("平川区");
		region.setName_en("pingchuanqu");
		region.setPid(620400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620421);
		region.setName("靖远县");
		region.setName_en("jingyuanxian");
		region.setPid(620400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620422);
		region.setName("会宁县");
		region.setName_en("huiningxian");
		region.setPid(620400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620423);
		region.setName("景泰县");
		region.setName_en("jingtaixian");
		region.setPid(620400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620500);
		region.setName("天水市");
		region.setName_en("tianshuishi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620501);
		region.setName("麦积区");
		region.setName_en("maijiqu");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620502);
		region.setName("秦州区");
		region.setName_en("qinzhouqu");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620521);
		region.setName("清水县");
		region.setName_en("qingshuixian");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620522);
		region.setName("秦安县");
		region.setName_en("qinanxian");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620523);
		region.setName("甘谷县");
		region.setName_en("ganguxian");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620524);
		region.setName("武山县");
		region.setName_en("wushanxian");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620525);
		region.setName("张家川回族自治县");
		region.setName_en("zhangjiachuanhuizuzizhixian");
		region.setPid(620500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620600);
		region.setName("武威市");
		region.setName_en("wuweishi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620602);
		region.setName("凉州区");
		region.setName_en("liangzhouqu");
		region.setPid(620600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620621);
		region.setName("民勤县");
		region.setName_en("minqinxian");
		region.setPid(620600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620622);
		region.setName("古浪县");
		region.setName_en("gulangxian");
		region.setPid(620600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620623);
		region.setName("天祝藏族自治县");
		region.setName_en("tianzhuzangzuzizhixian");
		region.setPid(620600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620700);
		region.setName("张掖市");
		region.setName_en("zhangyeshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620702);
		region.setName("甘州区");
		region.setName_en("ganzhouqu");
		region.setPid(620700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620721);
		region.setName("肃南裕固族自治县");
		region.setName_en("sunanyuguzuzizhixian");
		region.setPid(620700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620722);
		region.setName("民乐县");
		region.setName_en("minyuexian");
		region.setPid(620700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620723);
		region.setName("临泽县");
		region.setName_en("linzexian");
		region.setPid(620700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620724);
		region.setName("高台县");
		region.setName_en("gaotaixian");
		region.setPid(620700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620725);
		region.setName("山丹县");
		region.setName_en("shandanxian");
		region.setPid(620700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620800);
		region.setName("平凉市");
		region.setName_en("pingliangshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620802);
		region.setName("崆峒区");
		region.setName_en("kongtongqu");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620821);
		region.setName("泾川县");
		region.setName_en("jingchuanxian");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620822);
		region.setName("灵台县");
		region.setName_en("lingtaixian");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620823);
		region.setName("崇信县");
		region.setName_en("chongxinxian");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620824);
		region.setName("华亭县");
		region.setName_en("huatingxian");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620825);
		region.setName("庄浪县");
		region.setName_en("zhuanglangxian");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620826);
		region.setName("静宁县");
		region.setName_en("jingningxian");
		region.setPid(620800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620900);
		region.setName("酒泉市");
		region.setName_en("jiuquanshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620902);
		region.setName("肃州区");
		region.setName_en("suzhouqu");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620921);
		region.setName("金塔县");
		region.setName_en("jintaxian");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620922);
		region.setName("瓜洲县");
		region.setName_en("guazhouxian");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620923);
		region.setName("肃北蒙古族自治县");
		region.setName_en("subeimengguzuzizhixian");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620924);
		region.setName("阿克塞哈萨克族自治县");
		region.setName_en("akesaihasakezuzizhixian");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620981);
		region.setName("玉门市");
		region.setName_en("yumenshi");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(620982);
		region.setName("敦煌市");
		region.setName_en("dunhuangshi");
		region.setPid(620900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621000);
		region.setName("庆阳市");
		region.setName_en("qingyangshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621002);
		region.setName("西峰区");
		region.setName_en("xifengqu");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621021);
		region.setName("庆城县");
		region.setName_en("qingchengxian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621022);
		region.setName("环县");
		region.setName_en("huanxian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621023);
		region.setName("华池县");
		region.setName_en("huachixian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621024);
		region.setName("合水县");
		region.setName_en("heshuixian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621025);
		region.setName("正宁县");
		region.setName_en("zhengningxian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621026);
		region.setName("宁县");
		region.setName_en("ningxian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621027);
		region.setName("镇原县");
		region.setName_en("zhenyuanxian");
		region.setPid(621000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621100);
		region.setName("定西市");
		region.setName_en("dingxishi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621102);
		region.setName("安定区");
		region.setName_en("andingqu");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621121);
		region.setName("通渭县");
		region.setName_en("tongweixian");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621122);
		region.setName("陇西县");
		region.setName_en("longxixian");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621123);
		region.setName("渭源县");
		region.setName_en("weiyuanxian");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621124);
		region.setName("临洮县");
		region.setName_en("lintaoxian");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621125);
		region.setName("漳县");
		region.setName_en("zhangxian");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621126);
		region.setName("岷县");
		region.setName_en("minxian");
		region.setPid(621100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621200);
		region.setName("陇南市");
		region.setName_en("longnanshi");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621201);
		region.setName("武都区");
		region.setName_en("wudouqu");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621221);
		region.setName("成县");
		region.setName_en("chengxian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621222);
		region.setName("文县");
		region.setName_en("wenxian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621223);
		region.setName("宕昌县");
		region.setName_en("dangchangxian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621224);
		region.setName("康县");
		region.setName_en("kangxian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621225);
		region.setName("西和县");
		region.setName_en("xihexian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621226);
		region.setName("礼县");
		region.setName_en("lixian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621227);
		region.setName("徽县");
		region.setName_en("huixian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(621228);
		region.setName("两当县");
		region.setName_en("liangdangxian");
		region.setPid(621200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622900);
		region.setName("临夏回族自治州");
		region.setName_en("linxia");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622901);
		region.setName("临夏市");
		region.setName_en("linxiashi");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622921);
		region.setName("临夏县");
		region.setName_en("linxiaxian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622922);
		region.setName("康乐县");
		region.setName_en("kanglexian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622923);
		region.setName("永靖县");
		region.setName_en("yongjingxian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622924);
		region.setName("广河县");
		region.setName_en("guanghexian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622925);
		region.setName("和政县");
		region.setName_en("hezhengxian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622926);
		region.setName("东乡族自治县");
		region.setName_en("dongxiangzuzizhixian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(622927);
		region.setName("积石山保安族东乡族撒拉族自治县");
		region.setName_en("jishishanbaoanzudongxiangzusalazuzizhixian");
		region.setPid(622900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623000);
		region.setName("甘南藏族自治州");
		region.setName_en("gannan");
		region.setPid(620000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623001);
		region.setName("合作市");
		region.setName_en("hezuoshi");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623021);
		region.setName("临潭县");
		region.setName_en("lintanxian");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623022);
		region.setName("卓尼县");
		region.setName_en("zhuonixian");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623023);
		region.setName("舟曲县");
		region.setName_en("zhouquxian");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623024);
		region.setName("迭部县");
		region.setName_en("diebuxian");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623025);
		region.setName("玛曲县");
		region.setName_en("maquxian");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623026);
		region.setName("碌曲县");
		region.setName_en("liuquxian");
		region.setPid(623000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(623027);
		region.setName("夏河县");
		region.setName_en("xiahexian");
		region.setPid(623000);
		regionMapper.insert(region);
	}

	private void createQingHaiSheng(){
		Region region;
		region=new Region();
		region.setId(630000);
		region.setName("青海省");
		region.setName_en("QingHaiSheng");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630100);
		region.setName("西宁市");
		region.setName_en("xiningshi");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630102);
		region.setName("城东区");
		region.setName_en("chengdongqu");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630103);
		region.setName("城中区");
		region.setName_en("chengzhongqu");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630104);
		region.setName("城西区");
		region.setName_en("chengxiqu");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630105);
		region.setName("城北区");
		region.setName_en("chengbeiqu");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630121);
		region.setName("大通回族土族自治县");
		region.setName_en("datonghuizutuzuzizhixian");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630122);
		region.setName("湟中县");
		region.setName_en("huangzhongxian");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(630123);
		region.setName("湟源县");
		region.setName_en("huangyuanxian");
		region.setPid(630100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632100);
		region.setName("海东市");
		region.setName_en("haidongshi");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632121);
		region.setName("平安县");
		region.setName_en("pinganxian");
		region.setPid(632100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632122);
		region.setName("民和回族土族自治县");
		region.setName_en("minhehuizutuzuzizhixian");
		region.setPid(632100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632123);
		region.setName("乐都区");
		region.setName_en("ledouqu");
		region.setPid(632100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632126);
		region.setName("互助土族自治县");
		region.setName_en("huzhutuzuzizhixian");
		region.setPid(632100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632127);
		region.setName("化隆回族自治县");
		region.setName_en("hualonghuizuzizhixian");
		region.setPid(632100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632128);
		region.setName("循化撒拉族自治县");
		region.setName_en("xunhuasalazuzizhixian");
		region.setPid(632100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632200);
		region.setName("海北藏族自治州");
		region.setName_en("haibeizangzu");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632221);
		region.setName("门源回族自治县");
		region.setName_en("menyuanhuizuzizhixian");
		region.setPid(632200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632222);
		region.setName("祁连县");
		region.setName_en("qilianxian");
		region.setPid(632200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632223);
		region.setName("海晏县");
		region.setName_en("haiyanxian");
		region.setPid(632200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632224);
		region.setName("刚察县");
		region.setName_en("gangchaxian");
		region.setPid(632200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632300);
		region.setName("黄南藏族自治州");
		region.setName_en("huangnanzangzu");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632321);
		region.setName("同仁县");
		region.setName_en("tongrenxian");
		region.setPid(632300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632322);
		region.setName("尖扎县");
		region.setName_en("jianzhaxian");
		region.setPid(632300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632323);
		region.setName("泽库县");
		region.setName_en("zekuxian");
		region.setPid(632300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632324);
		region.setName("河南蒙古族自治县");
		region.setName_en("henanmengguzuzizhixian");
		region.setPid(632300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632500);
		region.setName("海南藏族自治州");
		region.setName_en("hainanzangzu");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632521);
		region.setName("共和县");
		region.setName_en("gonghexian");
		region.setPid(632500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632522);
		region.setName("同德县");
		region.setName_en("tongdexian");
		region.setPid(632500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632523);
		region.setName("贵德县");
		region.setName_en("guidexian");
		region.setPid(632500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632524);
		region.setName("兴海县");
		region.setName_en("xinghaixian");
		region.setPid(632500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632525);
		region.setName("贵南县");
		region.setName_en("guinanxian");
		region.setPid(632500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632600);
		region.setName("果洛藏族自治州");
		region.setName_en("guoluozangzu");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632621);
		region.setName("玛沁县");
		region.setName_en("maqinxian");
		region.setPid(632600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632622);
		region.setName("班玛县");
		region.setName_en("banmaxian");
		region.setPid(632600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632623);
		region.setName("甘德县");
		region.setName_en("gandexian");
		region.setPid(632600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632624);
		region.setName("达日县");
		region.setName_en("darixian");
		region.setPid(632600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632625);
		region.setName("久治县");
		region.setName_en("jiuzhixian");
		region.setPid(632600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632626);
		region.setName("玛多县");
		region.setName_en("maduoxian");
		region.setPid(632600);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632700);
		region.setName("玉树藏族自治州");
		region.setName_en("yushuzangzu");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632721);
		region.setName("玉树县");
		region.setName_en("yushuxian");
		region.setPid(632700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632722);
		region.setName("杂多县");
		region.setName_en("zaduoxian");
		region.setPid(632700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632723);
		region.setName("称多县");
		region.setName_en("chengduoxian");
		region.setPid(632700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632724);
		region.setName("治多县");
		region.setName_en("zhiduoxian");
		region.setPid(632700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632725);
		region.setName("囊谦县");
		region.setName_en("nangqianxian");
		region.setPid(632700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632726);
		region.setName("曲麻莱县");
		region.setName_en("qumalaixian");
		region.setPid(632700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632800);
		region.setName("海西蒙古族藏族自治州");
		region.setName_en("haiximengguzu");
		region.setPid(630000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632801);
		region.setName("格尔木市");
		region.setName_en("geermushi");
		region.setPid(632800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632802);
		region.setName("德令哈市");
		region.setName_en("delinghashi");
		region.setPid(632800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632821);
		region.setName("乌兰县");
		region.setName_en("wulanxian");
		region.setPid(632800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632822);
		region.setName("都兰县");
		region.setName_en("doulanxian");
		region.setPid(632800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(632823);
		region.setName("天峻县");
		region.setName_en("tianjunxian");
		region.setPid(632800);
		regionMapper.insert(region);
	}

	private void createNingXia(){
		Region region;
		region=new Region();
		region.setId(640000);
		region.setName("宁夏回族自治区");
		region.setName_en("NingXia");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640100);
		region.setName("银川市");
		region.setName_en("yinchuanshi");
		region.setPid(640000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640104);
		region.setName("兴庆区");
		region.setName_en("xingqingqu");
		region.setPid(640100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640105);
		region.setName("西夏区");
		region.setName_en("xixiaqu");
		region.setPid(640100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640106);
		region.setName("金凤区");
		region.setName_en("jinfengqu");
		region.setPid(640100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640121);
		region.setName("永宁县");
		region.setName_en("yongningxian");
		region.setPid(640100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640122);
		region.setName("贺兰县");
		region.setName_en("helanxian");
		region.setPid(640100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640181);
		region.setName("灵武市");
		region.setName_en("lingwushi");
		region.setPid(640100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640200);
		region.setName("石嘴山市");
		region.setName_en("shizuishanshi");
		region.setPid(640000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640202);
		region.setName("大武口区");
		region.setName_en("dawukouqu");
		region.setPid(640200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640205);
		region.setName("惠农县");
		region.setName_en("huinongxian");
		region.setPid(640200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640221);
		region.setName("平罗县");
		region.setName_en("pingluoxian");
		region.setPid(640200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640300);
		region.setName("吴忠市");
		region.setName_en("wuzhongshi");
		region.setPid(640000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640301);
		region.setName("红寺堡区");
		region.setName_en("hongsibaoqu");
		region.setPid(640300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640302);
		region.setName("利通区");
		region.setName_en("litongqu");
		region.setPid(640300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640323);
		region.setName("盐池县");
		region.setName_en("yanchixian");
		region.setPid(640300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640324);
		region.setName("同心县");
		region.setName_en("tongxinxian");
		region.setPid(640300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640381);
		region.setName("青铜峡市");
		region.setName_en("qingtongxiashi");
		region.setPid(640300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640400);
		region.setName("固原市");
		region.setName_en("guyuanshi");
		region.setPid(640000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640402);
		region.setName("原州区");
		region.setName_en("yuanzhouqu");
		region.setPid(640400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640422);
		region.setName("西吉县");
		region.setName_en("xijixian");
		region.setPid(640400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640423);
		region.setName("隆德县");
		region.setName_en("longdexian");
		region.setPid(640400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640424);
		region.setName("泾源县");
		region.setName_en("jingyuanxian");
		region.setPid(640400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640425);
		region.setName("彭阳县");
		region.setName_en("pengyangxian");
		region.setPid(640400);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640500);
		region.setName("中卫市");
		region.setName_en("zhongweishi");
		region.setPid(640000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640502);
		region.setName("沙坡头区");
		region.setName_en("shapotouqu");
		region.setPid(640500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640521);
		region.setName("中宁县");
		region.setName_en("zhongningxian");
		region.setPid(640500);
		regionMapper.insert(region);

		region=new Region();
		region.setId(640522);
		region.setName("海原县");
		region.setName_en("haiyuanxian");
		region.setPid(640500);
		regionMapper.insert(region);
	}

	private void createXinJiang(){
		Region region;
		region=new Region();
		region.setId(650000);
		region.setName("新疆维吾尔自治区");
		region.setName_en("XinJiang");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650100);
		region.setName("乌鲁木齐市");
		region.setName_en("wulumuqishi");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650102);
		region.setName("天山区");
		region.setName_en("tianshanqu");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650103);
		region.setName("沙依巴克区");
		region.setName_en("shayibakequ");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650104);
		region.setName("新市区");
		region.setName_en("xinshiqu");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650105);
		region.setName("水磨沟区");
		region.setName_en("shuimogouqu");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650106);
		region.setName("头屯河区");
		region.setName_en("toutunhequ");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650107);
		region.setName("达坂城区");
		region.setName_en("dabanchengqu");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650108);
		region.setName("东山区");
		region.setName_en("dongshanqu");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650121);
		region.setName("乌鲁木齐县");
		region.setName_en("wulumuqixian");
		region.setPid(650100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650200);
		region.setName("克拉玛依市");
		region.setName_en("kelamayishi");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650202);
		region.setName("独山子区");
		region.setName_en("dushanziqu");
		region.setPid(650200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650203);
		region.setName("克拉玛依区");
		region.setName_en("kelamayiqu");
		region.setPid(650200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650204);
		region.setName("白碱滩区");
		region.setName_en("baijiantanqu");
		region.setPid(650200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(650205);
		region.setName("乌尔禾区");
		region.setName_en("wuerhequ");
		region.setPid(650200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652100);
		region.setName("吐鲁番地区");
		region.setName_en("tulufan");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652101);
		region.setName("吐鲁番市");
		region.setName_en("tulufanshi");
		region.setPid(652100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652122);
		region.setName("鄯善县");
		region.setName_en("shanshanxian");
		region.setPid(652100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652123);
		region.setName("托克逊县");
		region.setName_en("tuokexunxian");
		region.setPid(652100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652200);
		region.setName("哈密地区");
		region.setName_en("hami");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652201);
		region.setName("哈密市");
		region.setName_en("hamishi");
		region.setPid(652200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652222);
		region.setName("巴里坤哈萨克自治县");
		region.setName_en("balikunhasakezizhixian");
		region.setPid(652200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652223);
		region.setName("伊吾县");
		region.setName_en("yiwuxian");
		region.setPid(652200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652300);
		region.setName("昌吉回族自治州");
		region.setName_en("changjihuizu");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652301);
		region.setName("昌吉市");
		region.setName_en("changjishi");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652302);
		region.setName("阜康市");
		region.setName_en("fukangshi");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652303);
		region.setName("米泉市");
		region.setName_en("miquanshi");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652323);
		region.setName("呼图壁县");
		region.setName_en("hutubixian");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652324);
		region.setName("玛纳斯县");
		region.setName_en("manasixian");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652325);
		region.setName("奇台县");
		region.setName_en("qitaixian");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652327);
		region.setName("吉木萨尔县");
		region.setName_en("jimusaerxian");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652328);
		region.setName("木垒哈萨克自治县");
		region.setName_en("muleihasakezizhixian");
		region.setPid(652300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652700);
		region.setName("博尔塔拉蒙古自治州");
		region.setName_en("boertalameng");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652701);
		region.setName("博乐市");
		region.setName_en("boleshi");
		region.setPid(652700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652722);
		region.setName("精河县");
		region.setName_en("jinghexian");
		region.setPid(652700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652723);
		region.setName("温泉县");
		region.setName_en("wenquanxian");
		region.setPid(652700);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652800);
		region.setName("巴音郭楞蒙古自治州");
		region.setName_en("bayinguonen");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652801);
		region.setName("库尔勒市");
		region.setName_en("kuerleshi");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652822);
		region.setName("轮台县");
		region.setName_en("luntaixian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652823);
		region.setName("尉犁县");
		region.setName_en("yulixian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652824);
		region.setName("若羌县");
		region.setName_en("ruoqiangxian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652825);
		region.setName("且末县");
		region.setName_en("qiemoxian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652826);
		region.setName("焉耆回族自治县");
		region.setName_en("yanqihuizuzizhixian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652827);
		region.setName("和静县");
		region.setName_en("hejingxian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652828);
		region.setName("和硕县");
		region.setName_en("heshuoxian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652829);
		region.setName("博湖县");
		region.setName_en("bohuxian");
		region.setPid(652800);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652900);
		region.setName("阿克苏地区");
		region.setName_en("akesu");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652901);
		region.setName("阿克苏市");
		region.setName_en("akesushi");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652922);
		region.setName("温宿县");
		region.setName_en("wensuxian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652923);
		region.setName("库车县");
		region.setName_en("kuchexian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652924);
		region.setName("沙雅县");
		region.setName_en("shayaxian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652925);
		region.setName("新和县");
		region.setName_en("xinhexian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652926);
		region.setName("拜城县");
		region.setName_en("baichengxian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652927);
		region.setName("乌什县");
		region.setName_en("wushenxian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652928);
		region.setName("阿瓦提县");
		region.setName_en("awatixian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(652929);
		region.setName("柯坪县");
		region.setName_en("kepingxian");
		region.setPid(652900);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653000);
		region.setName("克孜勒苏柯尔克孜自治州");
		region.setName_en("kezilesukeerke");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653001);
		region.setName("阿图什市");
		region.setName_en("atushenshi");
		region.setPid(653000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653022);
		region.setName("阿克陶县");
		region.setName_en("aketaoxian");
		region.setPid(653000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653023);
		region.setName("阿合奇县");
		region.setName_en("aheqixian");
		region.setPid(653000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653024);
		region.setName("乌恰县");
		region.setName_en("wuqiaxian");
		region.setPid(653000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653100);
		region.setName("喀什地区");
		region.setName_en("kashi");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653101);
		region.setName("喀什市");
		region.setName_en("kashishi");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653121);
		region.setName("疏附县");
		region.setName_en("shufuxian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653122);
		region.setName("疏勒县");
		region.setName_en("shulexian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653123);
		region.setName("英吉沙县");
		region.setName_en("yingjishaxian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653124);
		region.setName("泽普县");
		region.setName_en("zepuxian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653125);
		region.setName("莎车县");
		region.setName_en("shachexian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653126);
		region.setName("叶城县");
		region.setName_en("yechengxian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653127);
		region.setName("麦盖提县");
		region.setName_en("maigaitixian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653128);
		region.setName("岳普湖县");
		region.setName_en("yuepuhuxian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653129);
		region.setName("伽师县");
		region.setName_en("jiashixian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653130);
		region.setName("巴楚县");
		region.setName_en("bachuxian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653131);
		region.setName("塔什库尔干塔吉克自治县");
		region.setName_en("tashenkuergantajikezizhixian");
		region.setPid(653100);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653200);
		region.setName("和田地区");
		region.setName_en("hetian");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653201);
		region.setName("和田市");
		region.setName_en("hetianshi");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653221);
		region.setName("和田县");
		region.setName_en("hetianxian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653222);
		region.setName("墨玉县");
		region.setName_en("moyuxian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653223);
		region.setName("皮山县");
		region.setName_en("pishanxian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653224);
		region.setName("洛浦县");
		region.setName_en("luopuxian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653225);
		region.setName("策勒县");
		region.setName_en("celexian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653226);
		region.setName("于田县");
		region.setName_en("yutianxian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(653227);
		region.setName("民丰县");
		region.setName_en("minfengxian");
		region.setPid(653200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654000);
		region.setName("伊犁哈萨克自治州");
		region.setName_en("yalihasake");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654002);
		region.setName("伊宁市");
		region.setName_en("yiningshi");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654003);
		region.setName("奎屯市");
		region.setName_en("kuitunshi");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654021);
		region.setName("伊宁县");
		region.setName_en("yiningxian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654022);
		region.setName("察布查尔锡伯自治县");
		region.setName_en("chabuchaerxibozizhixian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654023);
		region.setName("霍城县");
		region.setName_en("huochengxian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654024);
		region.setName("巩留县");
		region.setName_en("gongliuxian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654025);
		region.setName("新源县");
		region.setName_en("xinyuanxian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654026);
		region.setName("昭苏县");
		region.setName_en("zhaosuxian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654027);
		region.setName("特克斯县");
		region.setName_en("tekesixian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654028);
		region.setName("尼勒克县");
		region.setName_en("nilekexian");
		region.setPid(654000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654200);
		region.setName("塔城地区");
		region.setName_en("tacheng");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654201);
		region.setName("塔城市");
		region.setName_en("tachengshi");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654202);
		region.setName("乌苏市");
		region.setName_en("wusushi");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654221);
		region.setName("额敏县");
		region.setName_en("eminxian");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654223);
		region.setName("沙湾县");
		region.setName_en("shawanxian");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654224);
		region.setName("托里县");
		region.setName_en("tuolixian");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654225);
		region.setName("裕民县");
		region.setName_en("yuminxian");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654226);
		region.setName("和布克赛尔蒙古自治县");
		region.setName_en("hebukesaiermengguzizhixian");
		region.setPid(654200);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654300);
		region.setName("阿勒泰地区");
		region.setName_en("aletai");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654301);
		region.setName("阿勒泰市");
		region.setName_en("aletaishi");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654321);
		region.setName("布尔津县");
		region.setName_en("buerjinxian");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654322);
		region.setName("富蕴县");
		region.setName_en("fuyunxian");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654323);
		region.setName("福海县");
		region.setName_en("fuhaixian");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654324);
		region.setName("哈巴河县");
		region.setName_en("habahexian");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654325);
		region.setName("青河县");
		region.setName_en("qinghexian");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(654326);
		region.setName("吉木乃县");
		region.setName_en("jimunaixian");
		region.setPid(654300);
		regionMapper.insert(region);

		region=new Region();
		region.setId(659000);
		region.setName("省直辖行政单位");
		region.setName_en("xingzhengdanwei");
		region.setPid(650000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(659001);
		region.setName("石河子市");
		region.setName_en("shihezishi");
		region.setPid(659000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(659002);
		region.setName("阿拉尔市");
		region.setName_en("alaershi");
		region.setPid(659000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(659003);
		region.setName("图木舒克市");
		region.setName_en("tumushukeshi");
		region.setPid(659000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(659004);
		region.setName("五家渠市");
		region.setName_en("wujiaqushi");
		region.setPid(659000);
		regionMapper.insert(region);
	}

	private void createXinjiangConstructionCorps(){
		Region region;
		region=new Region();
		region.setId(990000);
		region.setName("新疆建设兵团");
		region.setName_en("XinjiangConstructionCorps");
		region.setPid(1);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990001);
		region.setName("新疆建设兵团");
		region.setName_en("XinjiangConstructionCorps");
		region.setPid(990000);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990100);
		region.setName("第一师");
		region.setName_en("diyishi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990200);
		region.setName("第二师");
		region.setName_en("diershi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990300);
		region.setName("第三师");
		region.setName_en("disanshi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990400);
		region.setName("第四师");
		region.setName_en("disishi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990500);
		region.setName("第五师");
		region.setName_en("diwushi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990600);
		region.setName("第六师");
		region.setName_en("diliushi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990700);
		region.setName("第七师");
		region.setName_en("diqishi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990800);
		region.setName("第八师");
		region.setName_en("dibashi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(990900);
		region.setName("第九师");
		region.setName_en("dijiushi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(991000);
		region.setName("第十师");
		region.setName_en("dishishi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(991100);
		region.setName("建工师");
		region.setName_en("jiangongshi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(991200);
		region.setName("第十二师");
		region.setName_en("dishiershi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(991300);
		region.setName("第十三师");
		region.setName_en("dishisanshi");
		region.setPid(990001);
		regionMapper.insert(region);

		region=new Region();
		region.setId(991400);
		region.setName("第十四师");
		region.setName_en("dishisishi");
		region.setPid(990001);
		regionMapper.insert(region);
	}
	
	@Transactional
	public void createInitData(){
		Region region;
		region=new Region();
		region.setId(1);
		region.setName("中国");
		region.setName_en("CHINA");
		region.setPid(0);
		regionMapper.insert(region);
		createBeiJing();
		createTianJing();
		createHeBei();
		createShanXi();
		createNeiMengGu();
		createLiaoNing();
		createJiLin();
		createHeiLongJiang();
		createShangHai();
		createJiangSu();
		createZheJiang();
		createAnHui();
		createFuJian();
		createJiangXi();
		createShanDong();
		createHeNan();
		createHuBei();
		createHuNan();
		createGuangDong();
		createGuangXi();
		createHaiNan();
		createChongQing();
		createSiChuan();
		createGuiZhou();
		createYunNan();
		createXiZang();
		createShaanXi();
		createGanSu();
		createQingHaiSheng();
		createNingXia();
		createXinJiang();
		createXinjiangConstructionCorps();

	}

	@Override
	public List<Region> getAll() {
		return regionMapper.selectAllList(null);
	}

	@Override
	public void recreateTable() {
		regionMapper.dropTable();
		regionMapper.createTable();
		
	}

}
