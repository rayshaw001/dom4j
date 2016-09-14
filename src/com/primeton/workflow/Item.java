package com.primeton.workflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Item implements Comparable<Item> {
	private String flowName;
	private String submitTime;
	private String createTime;
	private String creator;
	private String operator;
	private String timeLength;
	private String sysName;
	private String nodeName;
	
	public Item(String flowName, String submitTime, String createTime,
			String creator, String operator, String timeLength, String sysName,
			String nodeName) {
		super();
		this.flowName = flowName;
		this.submitTime = submitTime;
		this.createTime = createTime;
		this.creator = creator;
		this.operator = operator;
		this.timeLength = timeLength;
		this.sysName = sysName;
		this.nodeName = nodeName;
	}


	public Item(){
		
	}


	public Item(String length){
		this.timeLength = length;
	}


/*
	public static void main(String[] args) {
		Item itm = new Item();
		itm.setTimeLength("1.9");
		
		Item item = new Item();
		item.setTimeLength("2.5");
		
		Item items = new Item();
		items.setTimeLength("0.9");
		
		List<Item> set = new ArrayList<Item>();
		set.add(itm);
		set.add(item);
		set.add(items);
		set.add(new Item("100"));
		set.add(new Item("55"));
		Collections.sort(set);
		for(Item i:set){
			System.out.println(i.getTimeLength());
		}
	}
	*/
	
	
	
	
	
	
	
	public String getFlowName() {
		return flowName;
	}
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getTimeLength() {
		return timeLength;
	}
	public void setTimeLength(String timeLength) {
		this.timeLength = timeLength;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	@Override
	public int compareTo(Item o) {
		if(Float.parseFloat(o.getTimeLength()) > Float.parseFloat(this.getTimeLength())){
			return 1;
		} else if(Float.parseFloat(o.getTimeLength()) < Float.parseFloat(this.getTimeLength())){
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getCreateTime() + "\t" + this.getCreator() + "\t" + this.getFlowName() + "\t" + this.getNodeName() + "\t"
		+ this.getOperator() + "\t" + this.getSubmitTime() + "\t" + this.getSysName() + "\t" + this.getTimeLength() + "\n";
	}
}
