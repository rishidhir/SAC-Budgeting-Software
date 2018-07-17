/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment;
import java.util.*;
/**
 *
 * @author rishidhir
 */
public class Club {
    private String name;
    private String president;
    private String email;
    private String phone;
    private String executive;
    private Date date; 
    private String money;

public Club (String name, String president, String email, String phone, String executive, Date date, String money) {
    this.name = name;
    this.president = president;
    this.email = email;
    this.phone = phone;
    this.executive = executive; 
    this.date = date;
    this.money = money;
}
public String getName() {
    return name;
    }

public String getPresident() {
    return president;
    }

public String getEmail() {
    return email;
    }

public String getPhone() {
    return phone;
    }

public String getExecutive() {
    return executive;
    }

public Date getDate() {
    return date;
    }

public String getMoney() {
    return money;
    }

public void chanegName(String name) {
    this.name = name;
    }

public void changePresident(String president) {
    this.president = president;
    }

public void changeEmail(String email) {
    this.email = email;
    }

public void changePhone(String phone) {
    this.phone = phone;
    }

public void changeExecutive(String executive) {
    this.executive = executive;
    }

public void changeDate(Date date) {
    this.date = date;
    }

public void getMoney(String money) {
    this.money = money;
    }
}

