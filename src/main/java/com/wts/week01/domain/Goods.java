package com.wts.week01.domain;

public class Goods {

	private Integer gid;
	private String gname;
	private String datea;
	private Integer price;
	private Integer status;
	private Integer tid;
	private Integer bid;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", datea=" + datea + ", price=" + price + ", status=" + status
				+ ", tid=" + tid + ", bid=" + bid + "]";
	}
	public Goods(Integer gid, String gname, String datea, Integer price, Integer status, Integer tid, Integer bid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.datea = datea;
		this.price = price;
		this.status = status;
		this.tid = tid;
		this.bid = bid;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
}
