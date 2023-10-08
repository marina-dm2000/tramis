package com.example.tramis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identity", nullable = false)
    private Long identity;

    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "btt", nullable = false)
    private Boolean btt = false;

    @Column(name = "arrival_date_train")
    private LocalDate arrivalDateTrain;

    @Column(name = "hbl", nullable = false, length = 3)
    private String hbl;

    @Column(name = "customs_post", length = Integer.MAX_VALUE)
    private String customsPost;

    @Column(name = "verification_date")
    private LocalDate verificationDate;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "receipt_date")
    private LocalDate receiptDate;

    @Column(name = "client", length = Integer.MAX_VALUE)
    private String client;

    @Column(name = "provider", length = Integer.MAX_VALUE)
    private String provider;

    @Column(name = "invoice_number", length = Integer.MAX_VALUE)
    private String invoiceNumber;

    @Column(name = "brocker", length = Integer.MAX_VALUE)
    private String brocker;

    @Column(name = "recipient", length = Integer.MAX_VALUE)
    private String recipient;

    @Column(name = "forwarding", length = Integer.MAX_VALUE)
    private String forwarding;

    @Column(name = "storage", length = Integer.MAX_VALUE)
    private String storage;

    @Column(name = "container_number", length = Integer.MAX_VALUE)
    private String containerNumber;

    @Column(name = "container_type", length = Integer.MAX_VALUE)
    private String containerType;

    @Column(name = "delivery_condition", length = 3)
    private String deliveryCondition;

    @Column(name = "place_dispatch", length = Integer.MAX_VALUE)
    private String placeDispatch;

    @Column(name = "country_dispatch", length = Integer.MAX_VALUE)
    private String countryDispatch;

    @Column(name = "place_delivery", length = Integer.MAX_VALUE)
    private String placeDelivery;

    @Column(name = "country_delivery", length = Integer.MAX_VALUE)
    private String countryDelivery;

    @Column(name = "line", length = Integer.MAX_VALUE)
    private String line;

    @Column(name = "agent", length = Integer.MAX_VALUE)
    private String agent;

    @Column(name = "product", length = Integer.MAX_VALUE)
    private String product;

    @Column(name = "order_number", length = Integer.MAX_VALUE)
    private String orderNumber;

    @Column(name = "count_places")
    private Integer countPlaces;

    @Column(name = "weight_brutto")
    private Double weightBrutto;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "loading_conditions", length = Integer.MAX_VALUE)
    private String loadingConditions;

    @Column(name = "ready_date")
    private LocalDate readyDate;

    @Column(name = "loading_date")
    private LocalDate loadingDate;

    @Column(name = "packing")
    private LocalDate packing;

    @Column(name = "exit_sea_date")
    private LocalDate exitSeaDate;

    @Column(name = "consignment", length = Integer.MAX_VALUE)
    private String consignment;

    @Column(name = "commercial_documents")
    private LocalDate commercialDocuments;

    @Column(name = "telex")
    private LocalDate telex;

    @Column(name = "remark", length = Integer.MAX_VALUE)
    private String remark;

    @Column(name = "dispatch_documents")
    private LocalDate dispatchDocuments;

    @Column(name = "arrival_date")
    private LocalDate arrivalDate;

    @Column(name = "port", length = Integer.MAX_VALUE)
    private String port;

    @Column(name = "delivery_documents")
    private LocalDate deliveryDocuments;

    @Column(name = "filing_declaration")
    private LocalDate filingDeclaration;

    @Column(name = "issue_declaration")
    private LocalDate issueDeclaration;

    @Column(name = "number_declaration", length = Integer.MAX_VALUE)
    private String numberDeclaration;

    @Column(name = "dispatch_date")
    private LocalDate dispatchDate;

    @Column(name = "date_unloading")
    private LocalDate dateUnloading;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    public Invoice() {
    }

    public Invoice(Long identity, Integer id, Boolean btt, LocalDate arrivalDateTrain, String hbl, String customsPost,
                   LocalDate verificationDate, LocalDate createDate, LocalDate receiptDate, String client,
                   String provider, String invoiceNumber, String brocker, String recipient, String forwarding,
                   String storage, String containerNumber, String containerType, String deliveryCondition,
                   String placeDispatch, String countryDispatch, String placeDelivery, String countryDelivery,
                   String line, String agent, String product, String orderNumber, Integer countPlaces,
                   Double weightBrutto, Double volume, Double cost, String loadingConditions,
                   LocalDate readyDate, LocalDate loadingDate, LocalDate packing, LocalDate exitSeaDate,
                   String consignment, LocalDate commercialDocuments, LocalDate telex, String remark,
                   LocalDate dispatchDocuments, LocalDate arrivalDate, String port, LocalDate deliveryDocuments,
                   LocalDate filingDeclaration, LocalDate issueDeclaration, String numberDeclaration,
                   LocalDate dispatchDate, LocalDate dateUnloading, LocalDate releaseDate) {
        this.identity = identity;
        this.id = id;
        this.btt = btt;
        this.arrivalDateTrain = arrivalDateTrain;
        this.hbl = hbl;
        this.customsPost = customsPost;
        this.verificationDate = verificationDate;
        this.createDate = createDate;
        this.receiptDate = receiptDate;
        this.client = client;
        this.provider = provider;
        this.invoiceNumber = invoiceNumber;
        this.brocker = brocker;
        this.recipient = recipient;
        this.forwarding = forwarding;
        this.storage = storage;
        this.containerNumber = containerNumber;
        this.containerType = containerType;
        this.deliveryCondition = deliveryCondition;
        this.placeDispatch = placeDispatch;
        this.countryDispatch = countryDispatch;
        this.placeDelivery = placeDelivery;
        this.countryDelivery = countryDelivery;
        this.line = line;
        this.agent = agent;
        this.product = product;
        this.orderNumber = orderNumber;
        this.countPlaces = countPlaces;
        this.weightBrutto = weightBrutto;
        this.volume = volume;
        this.cost = cost;
        this.loadingConditions = loadingConditions;
        this.readyDate = readyDate;
        this.loadingDate = loadingDate;
        this.packing = packing;
        this.exitSeaDate = exitSeaDate;
        this.consignment = consignment;
        this.commercialDocuments = commercialDocuments;
        this.telex = telex;
        this.remark = remark;
        this.dispatchDocuments = dispatchDocuments;
        this.arrivalDate = arrivalDate;
        this.port = port;
        this.deliveryDocuments = deliveryDocuments;
        this.filingDeclaration = filingDeclaration;
        this.issueDeclaration = issueDeclaration;
        this.numberDeclaration = numberDeclaration;
        this.dispatchDate = dispatchDate;
        this.dateUnloading = dateUnloading;
        this.releaseDate = releaseDate;
    }

    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBtt() {
        return btt;
    }

    public void setBtt(Boolean btt) {
        this.btt = btt;
    }

    public LocalDate getArrivalDateTrain() {
        return arrivalDateTrain;
    }

    public void setArrivalDateTrain(LocalDate arrivalDateTrain) {
        this.arrivalDateTrain = arrivalDateTrain;
    }

    public String getHbl() {
        return hbl;
    }

    public void setHbl(String hbl) {
        this.hbl = hbl;
    }

    public String getCustomsPost() {
        return customsPost;
    }

    public void setCustomsPost(String customsPost) {
        this.customsPost = customsPost;
    }

    public LocalDate getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(LocalDate verificationDate) {
        this.verificationDate = verificationDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getBrocker() {
        return brocker;
    }

    public void setBrocker(String brocker) {
        this.brocker = brocker;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getForwarding() {
        return forwarding;
    }

    public void setForwarding(String forwarding) {
        this.forwarding = forwarding;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public String getDeliveryCondition() {
        return deliveryCondition;
    }

    public void setDeliveryCondition(String deliveryCondition) {
        this.deliveryCondition = deliveryCondition;
    }

    public String getPlaceDispatch() {
        return placeDispatch;
    }

    public void setPlaceDispatch(String placeDispatch) {
        this.placeDispatch = placeDispatch;
    }

    public String getCountryDispatch() {
        return countryDispatch;
    }

    public void setCountryDispatch(String countryDispatch) {
        this.countryDispatch = countryDispatch;
    }

    public String getPlaceDelivery() {
        return placeDelivery;
    }

    public void setPlaceDelivery(String placeDelivery) {
        this.placeDelivery = placeDelivery;
    }

    public String getCountryDelivery() {
        return countryDelivery;
    }

    public void setCountryDelivery(String countryDelivery) {
        this.countryDelivery = countryDelivery;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCountPlaces() {
        return countPlaces;
    }

    public void setCountPlaces(Integer countPlaces) {
        this.countPlaces = countPlaces;
    }

    public Double getWeightBrutto() {
        return weightBrutto;
    }

    public void setWeightBrutto(Double weightBrutto) {
        this.weightBrutto = weightBrutto;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getLoadingConditions() {
        return loadingConditions;
    }

    public void setLoadingConditions(String loadingConditions) {
        this.loadingConditions = loadingConditions;
    }

    public LocalDate getReadyDate() {
        return readyDate;
    }

    public void setReadyDate(LocalDate readyDate) {
        this.readyDate = readyDate;
    }

    public LocalDate getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(LocalDate loadingDate) {
        this.loadingDate = loadingDate;
    }

    public LocalDate getPacking() {
        return packing;
    }

    public void setPacking(LocalDate packing) {
        this.packing = packing;
    }

    public LocalDate getExitSeaDate() {
        return exitSeaDate;
    }

    public void setExitSeaDate(LocalDate exitSeaDate) {
        this.exitSeaDate = exitSeaDate;
    }

    public String getConsignment() {
        return consignment;
    }

    public void setConsignment(String consignment) {
        this.consignment = consignment;
    }

    public LocalDate getCommercialDocuments() {
        return commercialDocuments;
    }

    public void setCommercialDocuments(LocalDate commercialDocuments) {
        this.commercialDocuments = commercialDocuments;
    }

    public LocalDate getTelex() {
        return telex;
    }

    public void setTelex(LocalDate telex) {
        this.telex = telex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDate getDispatchDocuments() {
        return dispatchDocuments;
    }

    public void setDispatchDocuments(LocalDate dispatchDocuments) {
        this.dispatchDocuments = dispatchDocuments;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public LocalDate getDeliveryDocuments() {
        return deliveryDocuments;
    }

    public void setDeliveryDocuments(LocalDate deliveryDocuments) {
        this.deliveryDocuments = deliveryDocuments;
    }

    public LocalDate getFilingDeclaration() {
        return filingDeclaration;
    }

    public void setFilingDeclaration(LocalDate filingDeclaration) {
        this.filingDeclaration = filingDeclaration;
    }

    public LocalDate getIssueDeclaration() {
        return issueDeclaration;
    }

    public void setIssueDeclaration(LocalDate issueDeclaration) {
        this.issueDeclaration = issueDeclaration;
    }

    public String getNumberDeclaration() {
        return numberDeclaration;
    }

    public void setNumberDeclaration(String numberDeclaration) {
        this.numberDeclaration = numberDeclaration;
    }

    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(LocalDate dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public LocalDate getDateUnloading() {
        return dateUnloading;
    }

    public void setDateUnloading(LocalDate dateUnloading) {
        this.dateUnloading = dateUnloading;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

}