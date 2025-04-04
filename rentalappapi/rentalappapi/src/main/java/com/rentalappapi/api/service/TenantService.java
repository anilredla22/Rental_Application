package com.rentalappapi.api.service;

import com.rentalappapi.api.entity.TenantEntity;
import com.rentalappapi.api.model.TenantIdRequest;
import com.rentalappapi.api.model.TenantRequestBody;
import com.rentalappapi.api.repositories.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    public TenantEntity createTenant(TenantRequestBody tenantRequestBodyObj) {
        TenantEntity newTenant = new TenantEntity();
        newTenant.setFirstName(tenantRequestBodyObj.getFirstName());
        newTenant.setLastName(tenantRequestBodyObj.getLastName());
        newTenant.setEmailId(tenantRequestBodyObj.getEmailId());
        newTenant.setPhoneNumber(tenantRequestBodyObj.getPhoneNumber());
        newTenant.setIsMarried(tenantRequestBodyObj.getIsMarried());
       

        return tenantRepository.save(newTenant);
    }

    public TenantEntity updateTenant(TenantRequestBody tenantRequestBodyObj) {
        TenantEntity existingTenant = new TenantEntity();
        existingTenant.setTenantId(tenantRequestBodyObj.getTenantId()); // Must for update
        existingTenant.setFirstName(tenantRequestBodyObj.getFirstName());
        existingTenant.setLastName(tenantRequestBodyObj.getLastName());
        existingTenant.setEmailId(tenantRequestBodyObj.getEmailId());
        existingTenant.setPhoneNumber(tenantRequestBodyObj.getPhoneNumber());
        existingTenant.setIsMarried(tenantRequestBodyObj.getIsMarried());
        

        return tenantRepository.save(existingTenant);
    }

    public Page<TenantEntity> listAllTenantsFromDb(int pageNumber, int size) {
        Pageable pageable = PageRequest.of(pageNumber, size);
        return tenantRepository.listAllTenantsFromDb(pageable);
    }

    public String deleteTenant(TenantIdRequest tenantIdRequest) {
        int tenantId = tenantIdRequest.getTenantId();
        tenantRepository.deleteById(tenantId);
        return "Tenant Deleted";
    }

    public String countNumberOfTenants() {
        return tenantRepository.countNumberOfTenants();
    }

	
}
