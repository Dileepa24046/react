package com.example.demo.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockReqDTO {
    private List<Long> itemIds;  
}
