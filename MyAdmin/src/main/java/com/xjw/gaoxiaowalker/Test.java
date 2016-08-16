package com.xjw.gaoxiaowalker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class Test
{
	public static String getContentByJsoup(String url){
		String content = "";
		try {
			//System.out.println("time=====start");
			Date startdate = new Date();
			Document doc = Jsoup.connect(url)
					.data("jquery","java")
					.userAgent("Mozilla")  
			        .cookie("auth", "token")  
			        .timeout(50000)  
			        .get();
			Date enddate=new Date();  
	        Long time=enddate.getTime()-startdate.getTime();  
	        //System.out.println("使用Jsoup耗时=="+time);  
	        //System.out.println("time=====end");  
	        content=doc.toString();// 获取网站源码html内容
	        
		} catch (Exception e) {
			// TODO: handle exception
		}
		//System.out.println(content);
		return content;
	}
	
	public static String getDivContentByJsoup(String content,String patten){
		String divContent="";  
	    Document doc=Jsoup.parse(content);  
	    Elements divs=doc.select(patten);//.getElementsByClass("list_zpqz1_vip border  no-b-border");  
	    divContent=divs.toString();  
	    //System.out.println("div==="+divContent);  
	    return divContent;
	}
	
	static List<SchoolInfo> listinfo = new ArrayList<SchoolInfo>();
	public static List<SchoolInfo> getInfoByContent(String content){
		Document doc=Jsoup.parse(content);
		Elements divs=doc.getElementsByClass("ltitle");
		Elements ltime_divs=doc.getElementsByClass("ltime");
		Elements lcompany_divs=doc.getElementsByClass("lcompany");
		Elements lsalary_divs=doc.getElementsByClass("lsalary");
		Elements link_divs=doc.getElementsByClass("ltitle").select("a");
		SchoolInfo info = null;
		for(int i = 0 ; i<divs.size() ; i++){
			info = new SchoolInfo();
			
			// 标题
			info.setTitle(divs.get(i).text());
			// 报名截止时间
			info.setLastDate(ltime_divs.get(i).text());
			info.setCity(lcompany_divs.get(i).text());
			info.setNum(lsalary_divs.get(i).text());
			info.setUrl(link_divs.get(i).attr("href"));
			/*if(link_divs.get(i).attr("href").indexOf("gaoxiaojiaoshi")!=-1){
				
			}*/
			listinfo.add(info);
		}
		
		
		return listinfo;
	}
	
	public static void main(String[] args) {
		for(int i = 1 ; i<51 ; i++){
			String htmlContent = getContentByJsoup("http://www.gaoxiaojob.com/zhaopin/gaoxiaojiaoshi/index_"+i+".html");
			String divContent = getDivContentByJsoup(htmlContent,"div.list_zpqz1_vip");
			String gaoxiaoDivContent = getDivContentByJsoup(divContent, "div.style2");
			getInfoByContent(gaoxiaoDivContent);
		}
		
		//System.out.println(listinfo.size());
		for(SchoolInfo s : listinfo){
			System.out.println(s.toString());
		}
	}
}
