package com.rentalappapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rentalappapi.api.model.OwnerIdRequest;
import com.rentalappapi.api.model.OwnerRequestBody;
import com.rentalappapi.api.service.OwnerService;

@RestController
@CrossOrigin
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    // Create a new owner
    @RequestMapping(value = "/createOwner", method = RequestMethod.POST)
    public ResponseEntity<?> createOwner(@RequestBody OwnerRequestBody ownerRequestBody) throws Exception {
        return ResponseEntity.ok(ownerService.createOwner(ownerRequestBody));
    }

    // Update an existing owner
    @RequestMapping(value = "/updateOwner", method = RequestMethod.PUT)
    public ResponseEntity<?> updateOwner(@RequestBody OwnerRequestBody ownerRequestBody) throws Exception {
        return ResponseEntity.ok(ownerService.updateOwner(ownerRequestBody));
    }

    // List all owners with pagination
    @RequestMapping(value = "/listAllOwners", method = RequestMethod.GET)
    public ResponseEntity<?> listAllOwners(@RequestParam(defaultValue = "0") final Integer pageNumber,
                                           @RequestParam(defaultValue = "10") final Integer size) throws Exception {
        return ResponseEntity.ok(ownerService.listAllOwners(pageNumber, size));
    }

    // Delete an owner
    @RequestMapping(value = "/deleteOwner", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteOwner(@RequestBody OwnerIdRequest ownerIdRequest) throws Exception {
        return ResponseEntity.ok(ownerService.deleteOwner(ownerIdRequest));
    }

    // Get count of owners
    @RequestMapping(value = "/Ownerscount", method = RequestMethod.GET)
    public ResponseEntity<?> countNumberOfOwners() throws Exception {
        return ResponseEntity.ok(ownerService.countNumberOfOwners());
    }
}
