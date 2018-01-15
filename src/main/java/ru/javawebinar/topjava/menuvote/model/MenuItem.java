package ru.javawebinar.topjava.menuvote.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "menu_items", uniqueConstraints = {@UniqueConstraint(columnNames = "menu_id, name", name = "menu_description_idx")})

public class MenuItem extends AbstractNamedEntity {

    @Column(name = "menu_id", nullable = false)
    private Integer menuId;

    @Column(name = "price", nullable = false)
    @NotNull
    @Range(min = 10, max = 10000)
    private float price;

    public MenuItem(){}

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getMenuId() {

        return menuId;
    }

    public float getPrice() {
        return price;
    }
}
