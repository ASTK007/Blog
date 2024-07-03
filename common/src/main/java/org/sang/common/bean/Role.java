package org.sang.common.bean;

import java.io.Serializable;

/**
 * Created by sang on 2017/12/17.
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public Role() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(Long id, String name) {

        this.id = id;
        this.name = name;
    }
}
