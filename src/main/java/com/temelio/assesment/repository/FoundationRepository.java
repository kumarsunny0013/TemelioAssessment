package com.temelio.assesment.repository;

import com.temelio.assesment.entity.FoundationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoundationRepository extends JpaRepository<FoundationEntity, Long> {
}
