package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<GlucoseReading> glucoseReadings = new ArrayList<>();

    // Constructeurs
    public User() {}

    public User(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public List<GlucoseReading> getGlucoseReadings() {
        return Collections.unmodifiableList(glucoseReadings);
    }

    // Méthodes pour gérer la relation One-to-Many
    public void addGlucoseReading(GlucoseReading reading) {
        glucoseReadings.add(reading);
        reading.setUser(this);
    }

    public void removeGlucoseReading(GlucoseReading reading) {
        glucoseReadings.remove(reading);
        reading.setUser(null);
    }

    // Méthodes spécifiques au domaine
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getAverageGlucoseLevel() {
        if (glucoseReadings.isEmpty()) {
            return 0.0;
        }
        double total = glucoseReadings.stream()
                .mapToDouble(GlucoseReading::getGlucoseLevel)
                .sum();
        return total / glucoseReadings.size();
    }

    public boolean isHyperglycemic(double threshold) {
        return glucoseReadings.stream()
                .anyMatch(reading -> reading.getGlucoseLevel() > threshold);
    }

    // Méthodes utilitaires
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}