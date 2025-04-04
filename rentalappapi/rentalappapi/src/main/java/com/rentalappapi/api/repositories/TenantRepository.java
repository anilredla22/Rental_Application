

package com.rentalappapi.api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rentalappapi.api.entity.TenantEntity;

@Repository
public interface TenantRepository extends CrudRepository<TenantEntity, Integer> {

    @Query(value = "SELECT * FROM anil_tenants", nativeQuery = true)
    Page<TenantEntity> listAllTenantsFromDb(Pageable pageable);

    @Query(value = "SELECT count(*) FROM anil_tenants", nativeQuery = true)
    String countNumberOfTenants();
}
