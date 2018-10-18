package fr.dorianmaliszewski.app.springbootjwtapi.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "roles")
public class Role extends BaseIdEntity{
    private String name;
}
