package com.rentalappapi.api.repositories;

import com.rentalappapi.api.entity.OwnerEntity;
import com.rentalappapi.api.model.OwnerRequestBody;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<OwnerEntity, Integer> {

    @Query(value = "SELECT * FROM anil_owners", nativeQuery = true)
    Page<OwnerEntity> listAllOwners(Pageable pageable);

    @Query(value = "SELECT COUNT(*) FROM anil_owners", nativeQuery = true)
    String countNumberOfOwners();
}
