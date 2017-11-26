package com.test.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_test_copy")
public class UserTestCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 工号
     */
    @Column(name = "job_num")
    private String jobNum;

    /**
     * 登录账号
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 账户类型:1内部账户，2外部注册
     */
    private String type;

    /**
     * 所在部门，可空
     */
    private Integer depid;

    /**
     * 部門名稱
     */
    @Column(name = "dep_name")
    private String depName;

    private Integer comid;

    /**
     * qq账号
     */
    private String qq;

    /**
     * 公司名稱
     */
    @Column(name = "com_name")
    private String comName;

    /**
     * 在职状态：1在职，0离职，3删除
     */
    private String status;

    private String phone;

    @Column(name = "create_at")
    private Date createAt;

    /**
     * 更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 性别：0女，1男
     */
    private Integer gender;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取工号
     *
     * @return job_num - 工号
     */
    public String getJobNum() {
        return jobNum;
    }

    /**
     * 设置工号
     *
     * @param jobNum 工号
     */
    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    /**
     * 获取登录账号
     *
     * @return user_name - 登录账号
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录账号
     *
     * @param userName 登录账号
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取账户类型:1内部账户，2外部注册
     *
     * @return type - 账户类型:1内部账户，2外部注册
     */
    public String getType() {
        return type;
    }

    /**
     * 设置账户类型:1内部账户，2外部注册
     *
     * @param type 账户类型:1内部账户，2外部注册
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取所在部门，可空
     *
     * @return depid - 所在部门，可空
     */
    public Integer getDepid() {
        return depid;
    }

    /**
     * 设置所在部门，可空
     *
     * @param depid 所在部门，可空
     */
    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    /**
     * 获取部門名稱
     *
     * @return dep_name - 部門名稱
     */
    public String getDepName() {
        return depName;
    }

    /**
     * 设置部門名稱
     *
     * @param depName 部門名稱
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @return comid
     */
    public Integer getComid() {
        return comid;
    }

    /**
     * @param comid
     */
    public void setComid(Integer comid) {
        this.comid = comid;
    }

    /**
     * 获取qq账号
     *
     * @return qq - qq账号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置qq账号
     *
     * @param qq qq账号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取公司名稱
     *
     * @return com_name - 公司名稱
     */
    public String getComName() {
        return comName;
    }

    /**
     * 设置公司名稱
     *
     * @param comName 公司名稱
     */
    public void setComName(String comName) {
        this.comName = comName;
    }

    /**
     * 获取在职状态：1在职，0离职，3删除
     *
     * @return status - 在职状态：1在职，0离职，3删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置在职状态：1在职，0离职，3删除
     *
     * @param status 在职状态：1在职，0离职，3删除
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return create_at
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取更新时间
     *
     * @return update_at - 更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置更新时间
     *
     * @param updateAt 更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取性别：0女，1男
     *
     * @return gender - 性别：0女，1男
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别：0女，1男
     *
     * @param gender 性别：0女，1男
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }
}