package com.internship.project.controller.dto;

import com.internship.project.model.Inventory;

public class DTOMapper {

	public InventoryDTO toDto(Inventory inventory) {
		return new InventoryDTO(inventory.getCostCenter(), inventory.getInventoryNumber(), inventory.getDescription(),
				inventory.getSerialNumber(), inventory.getSupplier(), inventory.getUser(), inventory.getLocation(),
				inventory.getRoom(), inventory.getDate(), inventory.getValue(), inventory.getResidualValue());// de
																												// completat
	}

	public Inventory toInventory(InventoryDTO inventoryDTO) {
		return new Inventory(inventoryDTO.getCostCenter(), inventoryDTO.getInventoryNumber(), inventoryDTO.getDescription(),
				inventoryDTO.getSerialNumber(), inventoryDTO.getSupplier(), inventoryDTO.getUser(), inventoryDTO.getLocation(),
				inventoryDTO.getRoom(), inventoryDTO.getDate(), inventoryDTO.getValue(), inventoryDTO.getResidualValue());// de completat
	}
}
