package com.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idDiabete;

        @Column
        private String nameDiabete;

        @Column
        private Integer poids;

        @Column
        private Integer taille;

        @Column
        private Integer ageDiabete;

        @Column
        private String genre;

    @OneToMany(mappedBy = "user")
    private Collection<glycemie> valuesGlycemies;


    public Collection<glycemie> getValuesGlycemies() {
        return valuesGlycemies;
    }

    public void setValuesGlycemies(Collection<glycemie> valuesGlycemies) {
        this.valuesGlycemies = valuesGlycemies;
    }

    public Integer getIdDiabete() {
            return idDiabete;
        }

        public void setIdDiabete(Integer idDiabete) {
            this.idDiabete = idDiabete;
        }

        public String getNameDiabete() {
            return nameDiabete;
        }

        public void setNameDiabete(String nameDiabete) {
            this.nameDiabete = nameDiabete;
        }

        public Integer getPoids() {
            return poids;
        }

        public void setPoids(Integer poids) {
            this.poids = poids;
        }

        public Integer getTaille() {
            return taille;
        }

        public void setTaille(Integer taille) {
            this.taille = taille;
        }

        public Integer getAgeDiabete() {
            return ageDiabete;
        }

        public void setAgeDiabete(Integer ageDiabete) {
            this.ageDiabete = ageDiabete;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }
    }


