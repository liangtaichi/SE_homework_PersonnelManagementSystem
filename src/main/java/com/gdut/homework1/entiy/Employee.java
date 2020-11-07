package com.gdut.homework1.entiy;

public class Employee {
    /**
     * @user_id 员工号
     * @name 员工姓名
     * @introduce 简介
     * @department 部门
     * @post 岗位
     * @wage 基本工资
     * @performance 绩效说明
     * @totalwages 总工资
     */
    int user_id;
    String name;
    String introduce;
    String department;
    String post;
    int wage;
    String performance;
    String totalwages;

    @Override
    public String toString() {
        return "Employee{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", department='" + department + '\'' +
                ", post='" + post + '\'' +
                ", wage=" + wage +
                ", performance='" + performance + '\'' +
                ", totalwages='" + totalwages + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getTotalwages() {
        return totalwages;
    }

    public void setTotalwages(String totalwages) {
        this.totalwages = totalwages;
    }
}
