package com.aaa.project.system.networkresource.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 网络资源表 networkresource
 * 
 * @author teacherChen
 * @date 2019-08-02
 */
public class Networkresource extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 资源id号 */
	private String resId;
	/** 资源名称 */
	private String resName;
	/** 资源所在市 */
	private String resCity;
	/** 资源所在县（区） */
	private String resCounty;
	/** 代维驻点 */
	private Integer stagId;
	/** 入网时间 */
	private Date resTime;
	/** 经纬度 */
	private String longLat;
	/** 是否禁用 */
	private Integer enable;

	public void setResId(String resId) 
	{
		this.resId = resId;
	}

	public String getResId() 
	{
		return resId;
	}
	public void setResName(String resName) 
	{
		this.resName = resName;
	}

	public String getResName() 
	{
		return resName;
	}
	public void setResCity(String resCity) 
	{
		this.resCity = resCity;
	}

	public String getResCity() 
	{
		return resCity;
	}
	public void setResCounty(String resCounty) 
	{
		this.resCounty = resCounty;
	}

	public String getResCounty() 
	{
		return resCounty;
	}
	public void setStagId(Integer stagId) 
	{
		this.stagId = stagId;
	}

	public Integer getStagId() 
	{
		return stagId;
	}
	public void setResTime(Date resTime) 
	{
		this.resTime = resTime;
	}

	public Date getResTime() 
	{
		return resTime;
	}
	public void setLongLat(String longLat) 
	{
		this.longLat = longLat;
	}

	public String getLongLat() 
	{
		return longLat;
	}
	public void setEnable(Integer enable) 
	{
		this.enable = enable;
	}

	public Integer getEnable() 
	{
		return enable;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resId", getResId())
            .append("resName", getResName())
            .append("resCity", getResCity())
            .append("resCounty", getResCounty())
            .append("stagId", getStagId())
            .append("resTime", getResTime())
            .append("longLat", getLongLat())
            .append("enable", getEnable())
            .toString();
    }
}
