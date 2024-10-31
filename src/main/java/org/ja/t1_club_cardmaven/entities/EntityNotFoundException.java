package org.ja.t1_club_cardmaven.entities;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entityName, String parameter, String value) {
        super("Entity with name " + entityName + " and " + parameter + "=" + value + " not found");
    }
}
