package com.budget.first_project.entity;

import javax.persistence.*;

@Entity
@Table(name="records")
public class Report {

    // define fields

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "record_id")
    private int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "comments")
    private String comments;

    @Column(name="record_type")
    private String record_type;

    @Column(name="time_stamp")
    private String time_stamp;

    @Column(name = "user_id")
    private int user_id;


    // define constructors

    public Report() {

    }

    public Report(double amount, String comments, String record_type, String time_stamp, int user_id) {
        this.amount = amount;
        this.comments = comments;
        this.record_type = record_type;
        this.time_stamp = time_stamp;
        this.user_id = user_id;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRecord_type() {
        return record_type;
    }

    public void setRecord_type(String record_type) {
        this.record_type = record_type;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    // define tostring

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", amount=" + amount +
                ", comments='" + comments + '\'' +
                ", record_type='" + record_type + '\'' +
                ", time_stamp='" + time_stamp + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
