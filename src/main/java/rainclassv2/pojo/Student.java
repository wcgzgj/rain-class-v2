package rainclassv2.pojo;

import java.util.Date;

public class Student {
    private Long id;

    private String loginname;

    private String realname;

    private String password;

    private String phone;

    private String parentphone;

    private Date createtime;

    private Date logintime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParentphone() {
        return parentphone;
    }

    public void setParentphone(String parentphone) {
        this.parentphone = parentphone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginname=").append(loginname);
        sb.append(", realname=").append(realname);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", parentphone=").append(parentphone);
        sb.append(", createtime=").append(createtime);
        sb.append(", logintime=").append(logintime);
        sb.append("]");
        return sb.toString();
    }
}