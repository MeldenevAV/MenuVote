package ru.javawebinar.topjava.menuvote.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "restaurants", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "restaurant_idx")})
public class Restaurant extends AbstractNamedEntity {
    public Restaurant() {
    }

}
