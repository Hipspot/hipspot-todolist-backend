package org.ec.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hello {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;

    public Hello() {
        super();
    }
}
