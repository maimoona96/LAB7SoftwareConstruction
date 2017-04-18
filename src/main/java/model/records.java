/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "EMPLOYEE")

public class records {

    public long getUse_Id() {
        return Use_Id;
    }

    public void setUse_Id(long Use_Id) {
        this.Use_Id = Use_Id;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public int getTimeTake() {
        return timeTake;
    }

    public void setTimeTake(int timeTake) {
        this.timeTake = timeTake;
    }

    public String getLogin_state() {
        return login_state;
    }

    public void setLogin_state(String login_state) {
        this.login_state = login_state;
    }
  

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
        private long Use_Id;
        private String scheme;
        private int timeTake;
        private String login_state;
        
        
        
    
}
