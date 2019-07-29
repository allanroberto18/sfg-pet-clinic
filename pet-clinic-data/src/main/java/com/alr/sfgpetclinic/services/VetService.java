package com.alr.sfgpetclinic.services;

import com.alr.sfgpetclinic.models.Vet;
import java.util.Set;

public interface VetService {

  /**
   * Get vet by id
   * @param id Long
   * @return Vet
   */
  Vet findById(Long id);

  /**
   * Save vet
   * @param vet Vet
   * @return Vet
   */
  Vet save(Vet vet);

  /**
   * Get all vets
   * @return Set<Vet>
   */
  Set<Vet> findAll();
}
