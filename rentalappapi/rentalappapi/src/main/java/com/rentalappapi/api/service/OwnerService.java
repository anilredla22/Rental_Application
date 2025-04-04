package com.rentalappapi.api.service;

import com.rentalappapi.api.entity.OwnerEntity;
import com.rentalappapi.api.model.OwnerIdRequest;
import com.rentalappapi.api.model.OwnerRequestBody;
import com.rentalappapi.api.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    // Create a new owner
    public OwnerEntity createOwner(OwnerRequestBody ownerRequestBody) {
        OwnerEntity newOwner = new OwnerEntity();
        newOwner.setName(ownerRequestBody.getName());
        newOwner.setEmail(ownerRequestBody.getEmail());
        newOwner.setPassword(ownerRequestBody.getPassword());
        newOwner.setPhoneNumber(ownerRequestBody.getPhoneNumber());
        newOwner.setAddress(ownerRequestBody.getAddress());
        newOwner.setRegistrationDate(ownerRequestBody.getRegistrationDate());
        return ownerRepository.save(newOwner);
    }

    // Update an existing owner
    public OwnerEntity updateOwner(OwnerRequestBody ownerRequestBody) {
        OwnerEntity existingOwner = ownerRepository.findById(ownerRequestBody.getOwnerId()).orElseThrow(() -> new RuntimeException("Owner not found"));
        existingOwner.setName(ownerRequestBody.getName());
        existingOwner.setEmail(ownerRequestBody.getEmail());
        existingOwner.setPassword(ownerRequestBody.getPassword());
        existingOwner.setPhoneNumber(ownerRequestBody.getPhoneNumber());
        existingOwner.setAddress(ownerRequestBody.getAddress());
        existingOwner.setRegistrationDate(ownerRequestBody.getRegistrationDate());
        return ownerRepository.save(existingOwner);
    }

    // List all owners with pagination
    public Page<OwnerEntity> listAllOwners(int pageNumber, int size) {
        Pageable pageable = PageRequest.of(pageNumber, size);
        return ownerRepository.listAllOwners(pageable);
    }

    // Delete an owner by ID
    public String deleteOwner(OwnerIdRequest ownerIdRequest) {
        ownerRepository.deleteById(ownerIdRequest.getOwnerId());
        return "Owner Deleted";
    }

    // Count the total number of owners
    public long countNumberOfOwners() {
        return ownerRepository.count();
    }
}
