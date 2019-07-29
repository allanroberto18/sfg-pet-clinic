package com.alr.sfgpetclinic.services;

import com.alr.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

  /**
   * Get owner by name
   * @param lastName String
   * @return Owner
   */
  Owner findByLastName(String lastName);

  /**
   * Get owner by id
   * @param id Long
   * @return Owner
   */
  Owner findById(Long id);

  /**
   * Save owner
   * @param owner Owner
   * @return Owner
   */
  Owner save(Owner owner);

  /**
   * Get all owners
   * @return Set<Owner>
   */
  Set<Owner> findAll();
}
