package com.example.tramis.service.impl;

import com.example.tramis.entity.Invoice;
import com.example.tramis.repository.InvoiceRepository;
import com.example.tramis.service.IExcelDataService;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class ExcelDataServiceImpl implements IExcelDataService {

    @Value("${app.upload.file:${user.home}}")
    public String EXCEL_FILE_PATH;

    @Autowired
    InvoiceRepository repo;

    Workbook workbook;

    public List<Invoice> getExcelDataAsList() {

        List<String> list = new ArrayList<String>();

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // Create the Workbook
        try {
            workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
        }

        // Retrieving the number of sheets in the Workbook
        System.out.println("-------Workbook has '" + workbook.getNumberOfSheets() + "' Sheets-----");

        // Getting the Sheet at index zero
        Sheet sheet = workbook.getSheetAt(0);

        // Getting number of columns in the Sheet
        int noOfColumns = sheet.getRow(0).getLastCellNum();
        System.out.println("-------Sheet has '"+noOfColumns+"' columns------");

        // Using for-each loop to iterate over the rows and columns
        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                list.add(cellValue);
            }
        }

        // filling excel data and creating list as List<Invoice>
        List<Invoice> invList = createList(list, noOfColumns);

        // Closing the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return invList;
    }

    private List<Invoice> createList(List<String> excelData, int noOfColumns) {

        ArrayList<Invoice> invList = new ArrayList<>();

        int i = noOfColumns;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yy", Locale.US);
        do {
            Invoice inv = new Invoice();

            inv.setId(Integer.valueOf(excelData.get(i)));
            inv.setBtt(excelData.get(i + 1).equals("Да"));
            if (!excelData.get(i + 2).isEmpty()) {
                inv.setArrivalDateTrain(LocalDate.parse(excelData.get(i + 2), dtf));
            }
            if (!excelData.get(i + 3).isEmpty()) {
                inv.setHbl(excelData.get(i + 3));
            }
            if (!excelData.get(i + 4).isEmpty()) {
                inv.setReleaseDate(LocalDate.parse(excelData.get(i + 4), dtf));
            }
            if (!excelData.get(i + 5).isEmpty()) {
                inv.setCustomsPost(excelData.get(i + 5));
            }
            if (!excelData.get(i + 6).isEmpty()) {
                inv.setVerificationDate(LocalDate.parse(excelData.get(i + 6), dtf));
            }
            if (!excelData.get(i + 8).isEmpty()) {
                inv.setCreateDate(LocalDate.parse(excelData.get(i + 8), dtf));
            }
            if (!excelData.get(i + 9).isEmpty()) {
                inv.setReceiptDate(LocalDate.parse(excelData.get(i + 9), dtf));
            }
            if (!excelData.get(i + 10).isEmpty()) {
                inv.setClient(excelData.get(i + 10));
            }
            if (!excelData.get(i + 11).isEmpty()) {
                inv.setProvider(excelData.get(i + 11));
            }
            if (!excelData.get(i + 12).isEmpty()) {
                inv.setInvoiceNumber(excelData.get(i + 12));
            }
            if (!excelData.get(i + 13).isEmpty()) {
                inv.setBrocker(excelData.get(i + 13));
            }
            if (!excelData.get(i + 14).isEmpty()) {
                inv.setRecipient(excelData.get(i + 14));
            }
            if (!excelData.get(i + 15).isEmpty()) {
                inv.setForwarding(excelData.get(i + 15));
            }
            if (!excelData.get(i + 16).isEmpty()) {
                inv.setStorage(excelData.get(i + 16));
            }
            if (!excelData.get(i + 17).isEmpty()) {
                inv.setContainerNumber(excelData.get(i + 17));
            }
            if (!excelData.get(i + 18).isEmpty()) {
                inv.setContainerType(excelData.get(i + 18));
            }
            if (!excelData.get(i + 19).isEmpty()) {
                inv.setDeliveryCondition(excelData.get(i + 19));
            }
            if (!excelData.get(i + 20).isEmpty()) {
                inv.setPlaceDispatch(excelData.get(i + 20));
            }
            if (!excelData.get(i + 21).isEmpty()) {
                inv.setCountryDispatch(excelData.get(i + 21));
            }
            if (!excelData.get(i + 22).isEmpty()) {
                inv.setPlaceDelivery(excelData.get(i + 22));
            }
            if (!excelData.get(i + 23).isEmpty()) {
                inv.setCountryDelivery(excelData.get(i + 23));
            }
            if (!excelData.get(i + 24).isEmpty()) {
                inv.setLine(excelData.get(i + 24));
            }
            if (!excelData.get(i + 25).isEmpty()) {
                inv.setAgent(excelData.get(i + 25));
            }
            if (!excelData.get(i + 26).isEmpty()) {
                inv.setProduct(excelData.get(i + 26));
            }
            if (!excelData.get(i + 27).isEmpty()) {
                inv.setOrderNumber(excelData.get(i + 27));
            }
            if (!excelData.get(i + 28).isEmpty()) {
                inv.setCountPlaces(Integer.valueOf(excelData.get(i + 28)));
            }
            if (!excelData.get(i + 29).isEmpty()) {
                inv.setWeightBrutto(Double.valueOf(excelData.get(i + 29).replace(',', '.')));
            }
            if (!excelData.get(i + 30).isEmpty()) {
                inv.setVolume(Double.valueOf(excelData.get(i + 30).replace(',', '.')));
            }
            if (!excelData.get(i + 31).isEmpty()) {
                inv.setCost(Double.valueOf(excelData.get(i + 31).replace(',', '.')));
            }
            if (!excelData.get(i + 32).isEmpty()) {
                inv.setLoadingConditions(excelData.get(i + 32));
            }
            if (!excelData.get(i + 33).isEmpty()) {
                inv.setReadyDate(LocalDate.parse(excelData.get(i + 33), dtf));
            }
            if (!excelData.get(i + 34).isEmpty()) {
                inv.setLoadingDate(LocalDate.parse(excelData.get(i + 34), dtf));
            }
            if (!excelData.get(i + 35).isEmpty()) {
                inv.setPacking(LocalDate.parse(excelData.get(i + 35), dtf));
            }
            if (!excelData.get(i + 36).isEmpty()) {
                inv.setExitSeaDate(LocalDate.parse(excelData.get(i + 36), dtf));
            }
            if (!excelData.get(i + 37).isEmpty()) {
                inv.setConsignment(excelData.get(i + 37));
            }
            if (!excelData.get(i + 38).isEmpty()) {
                inv.setCommercialDocuments(LocalDate.parse(excelData.get(i + 38), dtf));
            }
            if (!excelData.get(i + 39).isEmpty()) {
                inv.setTelex(LocalDate.parse(excelData.get(i + 39), dtf));
            }
            if (!excelData.get(i + 40).isEmpty()) {
                inv.setRemark(excelData.get(i + 40));
            }
            if (!excelData.get(i + 41).isEmpty()) {
                inv.setDispatchDocuments(LocalDate.parse(excelData.get(i + 41), dtf));
            }
            if (!excelData.get(i + 42).isEmpty()) {
                inv.setArrivalDate(LocalDate.parse(excelData.get(i + 42), dtf));
            }
            if (!excelData.get(i + 43).isEmpty()) {
                inv.setPort(excelData.get(i + 43));
            }
            if (!excelData.get(i + 44).isEmpty()) {
                inv.setDeliveryDocuments(LocalDate.parse(excelData.get(i + 44), dtf));
            }
            if (!excelData.get(i + 45).isEmpty()) {
                inv.setFilingDeclaration(LocalDate.parse(excelData.get(i + 45), dtf));
            }
            if (!excelData.get(i + 46).isEmpty()) {
                inv.setIssueDeclaration(LocalDate.parse(excelData.get(i + 46), dtf));
            }
            if (!excelData.get(i + 47).isEmpty()) {
                inv.setNumberDeclaration(excelData.get(i + 47));
            }
            if (!excelData.get(i + 48).isEmpty()) {
                inv.setDispatchDate(LocalDate.parse(excelData.get(i + 48), dtf));
            }
            if (!excelData.get(i + 49).isEmpty()) {
                inv.setDateUnloading(LocalDate.parse(excelData.get(i + 49), dtf));
            }

            invList.add(inv);
            i = i + 50;

        } while (i < excelData.size());
        return invList;
    }

    @Override
    public int saveExcelData(List<Invoice> invoices) {
        invoices = repo.saveAll(invoices);
        return invoices.size();
    }
}
