package com.boot.web.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 18:04
 * @discription account entity
 */
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private double money;
}
