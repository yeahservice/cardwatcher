package at.yeah.card.entity;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Card extends PanacheEntity {
    public String name;
}