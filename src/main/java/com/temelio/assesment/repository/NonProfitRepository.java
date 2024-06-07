package com.temelio.assesment.repository;

import com.temelio.assesment.entity.NonprofitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonProfitRepository extends JpaRepository<NonprofitEntity, Long> {
}
