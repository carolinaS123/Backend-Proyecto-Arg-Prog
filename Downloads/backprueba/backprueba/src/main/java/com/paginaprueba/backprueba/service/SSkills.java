/*package com.paginaprueba.backprueba.service;

import com.paginaprueba.backprueba.model.Skills;
import com.paginaprueba.backprueba.repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills {

    @Autowired
    RSkills rSkills;

    public List<Skills> list() {
        return rSkills.findAll();
    }

    public Optional<Skills> getOne(Long id) {
        return rSkills.findById(id);
    }

    public Optional<Skills> getBySkill(String skill) {
        return rSkills.findBySkill(skill);
    }

    public void save(Skills habil) {
        rSkills.save(habil);
    }

    public void delete(Long id) {
        rSkills.deleteById(id);
    }

    public boolean existsById(Long id) {
        return rSkills.existsById(id);
    }

    public boolean existsBySkill(String skill) {
        return rSkills.existsBySkill(skill);
    }
}
*/