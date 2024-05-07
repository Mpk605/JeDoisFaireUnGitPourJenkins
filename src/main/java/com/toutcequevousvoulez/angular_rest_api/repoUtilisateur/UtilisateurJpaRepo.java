package com.toutcequevousvoulez.angular_rest_api.repoUtilisateur;

import com.toutcequevousvoulez.angular_rest_api.utilisateurs.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurJpaRepo extends JpaRepository<Utilisateur, Long> {
}
