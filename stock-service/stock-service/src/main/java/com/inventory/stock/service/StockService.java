package com.inventory.stock.service;

import com.inventory.stock.entity.Stock;
import com.inventory.stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    public List<Stock> getAllStocks()
    {
        List<Stock> stocks = new ArrayList<Stock>();
        stockRepository.findAll().forEach(stock -> stocks.add(stock));
        return stocks;
    }
    public Stock getStockByNo(int id)
    {
        return stockRepository.findById(id).get();
    }

    public Stock save(Stock stock)
    {
        return stockRepository.save(stock);
    }

    //updating a record
    public void update(Stock stock)
    {
        stockRepository.save(stock);
    }
}
