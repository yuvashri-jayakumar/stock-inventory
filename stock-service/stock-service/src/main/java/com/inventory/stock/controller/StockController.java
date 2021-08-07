package com.inventory.stock.controller;

import com.inventory.stock.entity.Stock;
import com.inventory.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {


    @Autowired
    StockService stockService;

    @GetMapping("/")
    private List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/{stockNo}")
    private Stock getStockByNo(@PathVariable("stockNo") int stockNo) {
        return stockService.getStockByNo(stockNo);
    }

    @PostMapping("/")
    private Stock saveStock(@RequestBody Stock stock) {
        return stockService.save(stock);
    }

    @PutMapping("/")
    private String update(@RequestBody Stock stock) {
        if(stock.getNumber() > 0) {
            try {
                stockService.getStockByNo(stock.getNumber());
                stockService.update(stock);
                return "Record Updated Ok";
            } catch(Exception e) {
                return "Stock not found";
            }

        } else {
            return "Stock not found";
        }
    }
}
