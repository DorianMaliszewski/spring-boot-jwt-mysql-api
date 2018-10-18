package fr.dorianmaliszewski.app.springbootjwtapi.repository;

import fr.dorianmaliszewski.app.springbootjwtapi.domains.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
