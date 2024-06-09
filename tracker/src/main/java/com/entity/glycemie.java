package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;

@Entity
@Table(name = "diabetes")
public class glycemie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(name = "time")
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime time;



    @Column(name = "glucose_level")
    private float glucoseLevel;

    @ManyToOne@JoinColumn(name = "idDibate")
    private User user;

    public glycemie() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public glycemie(LocalDate date, LocalTime time, float glucoseLevel) {
        this.date = date;
        this.time = time;
        this.glucoseLevel = glucoseLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
public LocalTime getTime() {
        return time;
}
public void setTime(LocalTime time) {
        this.time = time;
}

    public float getGlucoseLevel() {
        return glucoseLevel;
    }

    public void setGlucoseLevel(float glucoseLevel) {
        this.glucoseLevel = glucoseLevel;
    }

    @Override
    public String toString() {
        return "Diabete{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", glucoseLevel=" + glucoseLevel +
                ", user=" + user +
                '}';
    }
}
