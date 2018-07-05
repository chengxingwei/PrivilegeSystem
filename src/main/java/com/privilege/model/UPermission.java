package com.privilege.model;

import java.io.Serializable;

public class UPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    /** 操作的url */
    private String url;

    /** 操作的名称 */
    private String name;

    private  Integer url_type;

    private  Long pid;

    private  Integer deep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUrl_type() {
        return url_type;
    }

    public void setUrl_type(Integer url_type) {
        this.url_type = url_type;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }
}
