package com.example.tramis.service;

import com.example.tramis.entity.Invoice;

import java.util.List;

public interface IExcelDataService {
    List<Invoice> getExcelDataAsList();

    int saveExcelData(List<Invoice> invoices);
}
