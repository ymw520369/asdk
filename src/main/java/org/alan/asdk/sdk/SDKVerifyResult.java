package org.alan.asdk.sdk;

import net.sf.json.JSONObject;

/**
 * SDK 验证结果
 */
public class SDKVerifyResult {

    private boolean success;

    private String userID;

    private String userName;

    private String nickName;

    private String extension;

    public SDKVerifyResult() {

    }

    public SDKVerifyResult(boolean suc, String userID, String userName, String nickName) {
        this.success = suc;
        this.userID = userID;
        this.userName = userName;
        this.nickName = nickName;
        this.extension = "";
    }


    public SDKVerifyResult(boolean suc, String userID, String userName, String nickName, String ext) {
        this.success = suc;
        this.userID = userID;
        this.userName = userName;
        this.nickName = nickName;
        this.extension = ext;
    }

    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("success" , this.success);
        json.put("userID" , this.userID);
        json.put("userName" , this.userName);
        json.put("nickName" , this.nickName);
        json.put("extension" , this.extension);
        return json;
    }

    @Override
    public String toString() {
        return toJSON().toString();
    }

    public SDKVerifyResult(boolean suc) {
        this.success = suc;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
