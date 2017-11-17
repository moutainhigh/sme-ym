package com.gsccs.sme.api.domain.site;

import com.gsccs.sme.api.domain.base.Domain;

public class Channel extends Domain {
	
	private Long id;
	private Long parid;
	private String parids;
	private String title;
	private String logo;
	private String templet;
	private String site;
	private String url;
	private String status;
	private Integer clicknum;
	private String pagemark;
	private Integer indexnum;
	private String metaTitle;
	private String metaKeywords;
	private String metaDescr;
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParid() {
		return parid;
	}

	public void setParid(Long parid) {
		this.parid = parid;
	}

	public String getParids() {
		return parids;
	}

	public void setParids(String parids) {
		this.parids = parids;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTemplet() {
		return templet;
	}

	public void setTemplet(String templet) {
		this.templet = templet;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		if (url ==null || url.trim().length()<=0){
			url = "/channel"+id+".html";
		}
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getClicknum() {
		return clicknum;
	}

	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}

	public String getPagemark() {
		return pagemark;
	}

	public void setPagemark(String pagemark) {
		this.pagemark = pagemark;
	}

	public Integer getIndexnum() {
		return indexnum;
	}

	public void setIndexnum(Integer indexnum) {
		this.indexnum = indexnum;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescr() {
		return metaDescr;
	}

	public void setMetaDescr(String metaDescr) {
		this.metaDescr = metaDescr;
	}

	
}
