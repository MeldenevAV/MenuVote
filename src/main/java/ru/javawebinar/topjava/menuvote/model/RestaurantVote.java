package ru.javawebinar.topjava.menuvote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="restaurant_vote", uniqueConstraints = {@UniqueConstraint(columnNames = "restaurant_id, user_id, vote_date", name = "restaurant_user_date_idx")})
public class RestaurantVote extends AbstractBaseEntity {

    @Column(name="restaurant_id", nullable=false)
    @NotNull
    private Integer restaurantId;

    @Column(name="user_id", nullable=false)
    @NotNull
    private Integer userId;

    @Column(name="vote_date", nullable = false)
    @NotNull
    private LocalDate voteDate;

    @Column(name="vote_time", nullable = false)
    @NotNull
    private LocalTime voteTime;

    public RestaurantVote() {
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setVoteDate(LocalDate voteDate) {
        this.voteDate = voteDate;
    }

    public void setVoteTime(LocalTime voteTime) {
        this.voteTime = voteTime;
    }

    public Integer getRestaurantId() {

        return restaurantId;
    }

    public Integer getUserId() {
        return userId;
    }

    public LocalDate getVoteDate() {
        return voteDate;
    }

    public LocalTime getVoteTime() {
        return voteTime;
    }
}
