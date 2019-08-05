package org.blue.webframework.junit.basic;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestBase;
import org.blue.webframework.sys.pinyin.service.PinyinService;
import org.blue.webframework.sys.region.model.Region;
import org.blue.webframework.sys.region.service.RegionService;
import org.junit.Test;

public class RegionServiceTest extends SpringTestBase {

	@Resource
	RegionService regionService;
	
	@Resource
	PinyinService pinyinService;

	@Test
	public void writeFile() {
		try {

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\1.java")));
			List<Region> list = regionService.getAll();
			StringBuilder sb = new StringBuilder();


			for (Region region : list) {
				

				if(region.getName_en() == null)
					region.setName_en(pinyinService.getPinyin(region.getName()));
				if(region.getPid()<=1)
				{
					if(sb.length()>0)
					{
					writer.append("\t}");
					writer.newLine();
					}
					
					
					sb.append("\t\tcreate"+region.getName_en()+"();" + System.getProperty("line.separator"));
					
					writer.newLine();
					writer.append("\tprivate void create"+region.getName_en()+"(){");
					writer.newLine();
					writer.append("\t\tRegion region;");
					
				}
				writer.newLine();
				writer.append("\t\tregion=new Region();");
				writer.newLine();
				writer.append("\t\tregion.setId(" + region.getId() +");");
				writer.newLine();
				writer.append("\t\tregion.setName(\""+ region.getName()+"\");");
				writer.newLine();
				writer.append("\t\tregion.setName_en(\""+region.getName_en()+"\");");
				writer.newLine();
				writer.append("\t\tregion.setPid("+region.getPid()+");");
				writer.newLine();
				writer.append("\t\tregionMapper.insert(region);");
				writer.newLine();
			}
			
			writer.append("\t}");
			writer.newLine();
			
			writer.append("\tprivate void createChina(){");
			writer.newLine();
			writer.append(sb);
			writer.newLine();
			writer.append("\t}");
			writer.newLine();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
