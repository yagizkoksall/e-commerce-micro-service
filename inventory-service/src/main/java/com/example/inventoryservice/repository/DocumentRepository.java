package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentRepository extends JpaRepository<Document, UUID> {
}
