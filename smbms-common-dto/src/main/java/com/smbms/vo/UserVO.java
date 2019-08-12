package com.smbms.vo;

/**
 * @Author 北方張
 * @create 2019-08-05 00:07
 * @description TODO
 * @ClassName UserVO.java
 */
public class UserVO {

    private Long userId;
    private String username;
    private String password;
    private String token;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserVO(Long userId, String username, String password, String token) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public UserVO() {

    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
