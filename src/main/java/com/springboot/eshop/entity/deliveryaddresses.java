package com.springboot.eshop.entity;

import java.util.Date;

public class deliveryaddresses {
    private String id;

    private String name;

    private String phone;

    private String sheng;

    private String city;

    private String town;

    private String moreaddress;

    private String userguid;

    private Date createtime;

    private Long isremoved;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getMoreaddress() {
        return moreaddress;
    }

    public void setMoreaddress(String moreaddress) {
        this.moreaddress = moreaddress == null ? null : moreaddress.trim();
    }

    public String getUserguid() {
        return userguid;
    }

    public void setUserguid(String userguid) {
        this.userguid = userguid == null ? null : userguid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getIsremoved() {
        return isremoved;
    }

    public void setIsremoved(Long isremoved) {
        this.isremoved = isremoved;
    }
}