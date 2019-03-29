package com.at.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "t_user")
@Data
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "t_id")
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

}
