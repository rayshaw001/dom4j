package com.primeton.workflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class OrderByLength {
	public static final String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
		"<BODY>" + 
			  "<ITEMS>" + 
				  "<ITEM>" +
					  "<FLOWNAME>差旅费流程</FLOWNAME>" +
					  "<SUBMITTIME>2016-09-13 10:15:01</SUBMITTIME>" +
					  "<CREATETIME>2016-09-13 10:31:01</CREATETIME>" +
					  "<CREATOR>SYSADMIN</CREATOR>" +
					  "<OPERATOR> SYSADMIN </OPERATOR>" +
					  "<TIMELENGTH>20</TIMELENGTH>" +
					  "<SYSNAME>财务系统</SYSNAME>" +
					  "<NODENAME>经理审批</NODENAME>" +
				"</ITEM>" +
				"<ITEM>" +
					  "<FLOWNAME>请假流程</FLOWNAME>" +
					  "<SUBMITTIME>2016-09-13 10:15:01</SUBMITTIME>" +
					  "<CREATETIME>2016-09-13 8:31:01</CREATETIME>" +
					  "<CREATOR>SYSADMIN</CREATOR>" +
					  "<OPERATOR>SYSADMIN</OPERATOR>" +
					  "<TIMELENGTH>35</TIMELENGTH>" +
					  "<SYSNAME>EHR系统</SYSNAME>" +
					  "<NODENAME>经理审批</NODENAME>" +
				"</ITEM>" +
			"</ITEMS>" +
		"</BODY>";
	
		public static void main(String[] args) throws DocumentException {
			
			System.out.println(getSortedList(xml));
		}
		
		public static List<Item> getSortedList(String xml) throws DocumentException{
			Document doc = DocumentHelper.parseText(xml);
			Element ele = doc.getRootElement();
			ele = ele.element("ITEMS");
			List<Element> eles = ele.elements();
			List<Item> result = new ArrayList<Item>();
			Item item;
			for(Element e:eles){
				item = new Item();
				item.setFlowName(e.element("FLOWNAME").getData().toString().trim());
				item.setSubmitTime(e.element("SUBMITTIME").getData().toString().trim());
				item.setCreateTime(e.element("CREATETIME").getData().toString().trim());
				item.setCreator(e.element("CREATOR").getData().toString().trim());
				item.setTimeLength(e.element("TIMELENGTH").getData().toString().trim());
				item.setSysName(e.element("SYSNAME").getData().toString().trim());
				item.setNodeName(e.element("NODENAME").getData().toString().trim());
				item.setOperator(e.element("OPERATOR").getData().toString().trim());
				result.add(item);
			}
			Collections.sort(result);
			return result;
		}
}
