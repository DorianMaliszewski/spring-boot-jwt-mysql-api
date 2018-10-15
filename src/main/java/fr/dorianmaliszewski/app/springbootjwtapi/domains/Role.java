package fr.dorianmaliszewski.app.springbootjwtapi.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Role extends BaseIdEntity{
    private String name;
}
