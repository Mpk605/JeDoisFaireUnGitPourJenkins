package com.toutcequevousvoulez.angular_rest_api.utilisateurs;

import com.toutcequevousvoulez.angular_rest_api.repoUtilisateur.UtilisateurJpaRepo;
import com.toutcequevousvoulez.angular_rest_api.utilisateurs.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurController {
    private final UtilisateurJpaRepo utilisateurJpaRepo;

    @Autowired
    public UtilisateurController(UtilisateurJpaRepo utilisateurJpaRepo) {
        this.utilisateurJpaRepo = utilisateurJpaRepo;
    }

    @GetMapping("formation/jpa/utilisateurs")
    public List<Utilisateur> recupererListeUtilisateur() {
        return utilisateurJpaRepo.findAll();
    }

    @GetMapping("formation/jpa/utilisateur/{id}")
    public Utilisateur recuperationParExempleRecuperationDansUtilisateurParSonIdNEstCePas(@PathVariable long id) {
        return utilisateurJpaRepo.findById(id).orElse(null);
    }

    @PostMapping("formation/jpa/utilisateur")
    public void createUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurJpaRepo.save(utilisateur);
    }

    @PutMapping("formation/jpa/utilisateur/{id}")
    public void updateUtilisateur(@PathVariable long id, @RequestBody Utilisateur utilisateur) {
        if (utilisateurJpaRepo.findById(id).isEmpty()) return;

        Utilisateur utilisateurToUpdate = utilisateurJpaRepo.findById(id).orElse(new Utilisateur());

        utilisateurToUpdate.setNom(utilisateur.getNom());
        utilisateurToUpdate.setAge(utilisateur.getAge());
        utilisateurToUpdate.setCompetences(utilisateur.getCompetences());
        utilisateurToUpdate.setNote(utilisateur.getNote());
        utilisateurToUpdate.setImage(utilisateur.getImage());

        utilisateurJpaRepo.save(utilisateurToUpdate);
    }

    @DeleteMapping("formation/jpa/utilisateur/{id}")
    public void deleteUtilisateur(@PathVariable long id) {
        utilisateurJpaRepo.deleteById(id);
    }
}
