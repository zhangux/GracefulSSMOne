package com.qdzl.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long gid;
    private String name;
    private String ename;
    private String brands;
    private String info;
    private String einfo;
    private Integer isparameter;
    private Integer type;
    private Integer surplus;
    private Integer total;
    private String previewurl;
    private Timestamp uptime;
    private String fileurl;
    private Integer filetype;
    private String parameterjson;
    private String address;
    private String eaddress;
    private Integer gx;
    private Integer gy;
    private Double weight;
    private String format;
    private String unit;
    private String supplier;
    private Double purchase;
    private Double sales;
    private Date production_date;
    private Date expiration_date;
    private Integer term;
    private String sncode;
    private String bar_code;
    private String batch_number;
    private String remark;
    private Integer parent_id;
    private String comp_code;
    public Long getGid() {
        return gid;
    }
    public void setGid(Long gid) {
        this.gid = gid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getBrands() {
        return brands;
    }
    public void setBrands(String brands) {
        this.brands = brands;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getEinfo() {
        return einfo;
    }
    public void setEinfo(String einfo) {
        this.einfo = einfo;
    }
    public Integer getIsparameter() {
        return isparameter;
    }
    public void setIsparameter(Integer isparameter) {
        this.isparameter = isparameter;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getSurplus() {
        return surplus;
    }
    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public String getPreviewurl() {
        return previewurl;
    }
    public void setPreviewurl(String previewurl) {
        this.previewurl = previewurl;
    }
    public Timestamp getUptime() {
        return uptime;
    }
    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }
    public String getFileurl() {
        return fileurl;
    }
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }
    public Integer getFiletype() {
        return filetype;
    }
    public void setFiletype(Integer filetype) {
        this.filetype = filetype;
    }
    public String getParameterjson() {
        return parameterjson;
    }
    public void setParameterjson(String parameterjson) {
        this.parameterjson = parameterjson;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEaddress() {
        return eaddress;
    }
    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }
    public Integer getGx() {
        return gx;
    }
    public void setGx(Integer gx) {
        this.gx = gx;
    }
    public Integer getGy() {
        return gy;
    }
    public void setGy(Integer gy) {
        this.gy = gy;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getSupplier() {
        return supplier;
    }
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    public Double getPurchase() {
        return purchase;
    }
    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }
    public Double getSales() {
        return sales;
    }
    public void setSales(Double sales) {
        this.sales = sales;
    }
    public Date getProduction_date() {
        return production_date;
    }
    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }
    public Date getExpiration_date() {
        return expiration_date;
    }
    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }
    public Integer getTerm() {
        return term;
    }
    public void setTerm(Integer term) {
        this.term = term;
    }
    public String getSncode() {
        return sncode;
    }
    public void setSncode(String sncode) {
        this.sncode = sncode;
    }
    public String getBar_code() {
        return bar_code;
    }
    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }
    public String getBatch_number() {
        return batch_number;
    }
    public void setBatch_number(String batch_number) {
        this.batch_number = batch_number;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getParent_id() {
        return parent_id;
    }
    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }
    public String getComp_code() {
        return comp_code;
    }
    public void setComp_code(String comp_code) {
        this.comp_code = comp_code;
    }

}
