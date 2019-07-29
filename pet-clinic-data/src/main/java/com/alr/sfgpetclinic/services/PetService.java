package com.alr.sfgpetclinic.services;

import com.alr.sfgpetclinic.models.Pet;

import java.util.Set;

public interface PetService {
  
  /**
   * Get pet by id
   * @param id Long
   * @return Pet
   */
  Pet findById(Long id);

  /**
   * Save pet
   * @param pet Pet
   * @return Pet
   */
  Pet save(Pet pet);

  /**
   * Get all pets
   * @return Set<Pet>
   */
  Set<Pet> findAll();

}
