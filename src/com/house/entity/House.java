package com.house.entity;

import lombok.*;

import java.util.Date;

/**
 * 房屋实体类
 *
 * @author chriy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    /**
     * 房屋ID
     */
    private int houseId;
    /**
     * 房屋标题描述西信息
     */
    private String houseDesc;
    /**
     * 几室几厅
     */
    private String houseModel;
    /**
     * 面积
     */
    private String houseArea;
    /**
     * 楼层
     */
    private String houseFloor;
    /**
     * 类型
     */
    private String houseType;
    /**
     * 价格
     */
    private int housePrice;
    /**
     * 地址
     */
    private String houseAddress;
    /**
     * 简介图片
     */
    private String houseImage;
    /**
     * 小区名
     */
    private String communityName;
    /**
     * 联系人
     */
    private String houseLinkMan;
    /**
     * 房屋朝向
     */
    private String houseOriented;
    /**
     * 详细图片
     */
    private String houseDetailsImg;
    /**
     * 发布人员
     */
    private String publisher;
    /**
     * 发布时间
     */
    private Date publishTime;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public String getHouseModel() {
        return houseModel;
    }

    public void setHouseModel(String houseModel) {
        this.houseModel = houseModel;
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(String houseFloor) {
        this.houseFloor = houseFloor;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseImage() {
        return houseImage;
    }

    public void setHouseImage(String houseImage) {
        this.houseImage = houseImage;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getHouseLinkMan() {
        return houseLinkMan;
    }

    public void setHouseLinkMan(String houseLinkMan) {
        this.houseLinkMan = houseLinkMan;
    }

    public String getHouseOriented() {
        return houseOriented;
    }

    public void setHouseOriented(String houseOriented) {
        this.houseOriented = houseOriented;
    }

    public String getHouseDetailsImg() {
        return houseDetailsImg;
    }

    public void setHouseDetailsImg(String houseDetailsImg) {
        this.houseDetailsImg = houseDetailsImg;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public House(int houseId, String houseDesc, String houseModel, String houseArea, String houseFloor, String houseType, int housePrice, String houseAddress, String houseImage, String communityName, String houseLinkMan, String houseOriented, String houseDetailsImg, String publisher, Date publishTime) {
        this.houseId = houseId;
        this.houseDesc = houseDesc;
        this.houseModel = houseModel;
        this.houseArea = houseArea;
        this.houseFloor = houseFloor;
        this.houseType = houseType;
        this.housePrice = housePrice;
        this.houseAddress = houseAddress;
        this.houseImage = houseImage;
        this.communityName = communityName;
        this.houseLinkMan = houseLinkMan;
        this.houseOriented = houseOriented;
        this.houseDetailsImg = houseDetailsImg;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }

    public House() {
    }
}
