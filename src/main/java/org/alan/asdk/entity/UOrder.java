package org.alan.asdk.entity;

import org.alan.asdk.cache.impl.logic.UChannelCache;
import org.alan.asdk.cache.impl.logic.UGameCache;
import org.alan.asdk.utils.TimeFormater;
import net.sf.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 订单对象
 */

@Entity
@Table(name = "uorder")
public class UOrder {

    @Id
    private long orderID;
    private int appID;
    private int channelID;
    private int userID;
    private String username;
    private String productName;
    private String productDesc;
    private int money;  //单位 分
    private String currency; //币种
    private String roleID;
    private String roleName;
    private String serverID;
    private String serverName;
    private int state;
    private String channelOrderID;
    private String extension;
    private Date createdTime;
    private int diamond;

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("orderID", orderID + "");
        json.put("productID",productName);
        json.put("userID", userID);
        json.put("roleID", roleID);
        json.put("channelID", channelID);
        json.put("serverID", serverID);
        json.put("diamond",diamond);
        json.put("money", money);
        json.put("currency", currency);
        json.put("extension", extension);
        json.put("appID", appID);

        UGame game = getGame();

        json.put("appName", game == null ? "" : game.getName());
        UChannel channel = getChannel();
        json.put("channelName", channel == null ? "" : channel.getMaster().getMasterName());
        json.put("username", username);
        json.put("productName", productName);
        json.put("productDesc", productDesc);
        json.put("roleName", roleName);
        json.put("serverName", serverName);
        json.put("state", state);
        json.put("channelOrderID", channelOrderID);
        json.put("createdTime", TimeFormater.format_default(createdTime));
        return json;
    }

    public UChannel getChannel() {

        return UChannelCache.getInstance().get(this.channelID);
    }


    public UGame getGame() {

        return UGameCache.getInstance().get(this.appID);
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }

    public int getChannelID() {
        return channelID;
    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getChannelOrderID() {
        return channelOrderID;
    }

    public void setChannelOrderID(String channelOrderID) {
        this.channelOrderID = channelOrderID;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getServerID() {
        return serverID;
    }

    public void setServerID(String serverID) {
        this.serverID = serverID;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }
}
