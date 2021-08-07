package com.inventory.stock.repository;

import com.inventory.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {
}
