package org.blue.sys.weixin.model;

import java.io.Serializable;
import java.util.Date;


public class AccessToken implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4036648423522575460L;

	private Integer id;

    private String token;

    private Date expirestime;

    private Date addtime;
    
    private String appId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getExpirestime() {
        return expirestime;
    }

    public void setExpirestime(Date expirestime) {
        this.expirestime = expirestime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

	public void setAppId(String appId) {
		this.appId=appId;
	}
	
	public String getAddId()
	{
		return appId;
	}
}