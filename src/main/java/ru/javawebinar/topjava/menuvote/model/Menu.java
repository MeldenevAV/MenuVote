package ru.javawebinar.topjava.menuvote.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name="menus", uniqueConstraints = {@UniqueConstraint(columnNames = "restaurant_id, id, menu_date", name = "restaurant_menu_day_idx")})
public class Menu extends AbstractBaseEntity{

    @Column(name="restaurant_id", nullable = false)
    private Integer restaurantId;

    @Column(name="menu_date", nullable = false)
    @NotNull
    private LocalDate menuDate;

    public Menu(){}
}
