package com.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Entity
@Table(name = "glucose_readings")
public class GlucoseReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private Double glucoseLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Constructeurs
    public GlucoseReading() {}

    public GlucoseReading(LocalDateTime timestamp, Double glucoseLevel, User user) {
        this.timestamp = timestamp;
        this.glucoseLevel = glucoseLevel;
        this.user = user;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public Double getGlucoseLevel() { return glucoseLevel; }
    public void setGlucoseLevel(Double glucoseLevel) { this.glucoseLevel = glucoseLevel; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    // Méthodes spécifiques au domaine
    public boolean isHyperglycemic() {
        return glucoseLevel > 180; // Plus de 180 mg/dL est considéré comme hyperglycémique
    }

    public boolean isHypoglycemic() {
        return glucoseLevel < 70; // Moins de 70 mg/dL est considéré comme hypoglycémique
    }

    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return timestamp.format(formatter);
    }

    public String getGlycemicStatus() {
        if (isHyperglycemic()) return "High";
        if (isHypoglycemic()) return "Low";
        return "Normal";
    }

    // Utile pour la préparation des graphiques
    public Long getTimestampInMillis() {
        return timestamp.atZone(java.time.ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    // Méthodes utilitaires
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlucoseReading that = (GlucoseReading) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "GlucoseReading{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", glucoseLevel=" + glucoseLevel +
                ", user=" + user.getUsername() +
                '}';
    }
}