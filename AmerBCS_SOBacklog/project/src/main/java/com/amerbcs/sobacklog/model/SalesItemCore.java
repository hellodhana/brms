package com.amerbcs.sobacklog.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Sales Item Core")
@org.kie.api.definition.type.Description("Sales Item Core")
public class SalesItemCore implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Sales Document")
	private java.lang.String salesDocument;
	@org.kie.api.definition.type.Label("Item No")
	private java.lang.String itemNo;
	@org.kie.api.definition.type.Label("Order Type")
	private java.lang.String orderType;
	@org.kie.api.definition.type.Label("Document Date")
	private java.lang.String documentDate;
	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label("Deleted")
	private boolean deleted;
	@org.kie.api.definition.type.Label("Created On")
	private java.lang.String createdOn;
	@org.kie.api.definition.type.Label("Created At")
	private java.lang.String createdAt;
	@org.kie.api.definition.type.Label("Created By")
	private java.lang.String createdBy;
	@org.kie.api.definition.type.Label("Changed By")
	private java.lang.String changedBy;
	@org.kie.api.definition.type.Label("Sales Org")
	private java.lang.String salesOrg;
	@org.kie.api.definition.type.Label("Distribution Channel")
	private java.lang.String distChannel;
	@org.kie.api.definition.type.Label("Division")
	private java.lang.String division;
	@org.kie.api.definition.type.Label("Sales Office")
	private java.lang.String salesOffice;
	@org.kie.api.definition.type.Label("Sales Office Text")
	private java.lang.String salesOfficeText;
	@org.kie.api.definition.type.Label("Sales Group")
	private java.lang.String salesGrp;
	@org.kie.api.definition.type.Label("Sales Group Text")
	private java.lang.String salesGrpText;
	@org.kie.api.definition.type.Label("PO Type")
	private java.lang.String POType;
	@org.kie.api.definition.type.Label("Web Order No")
	private java.lang.String webOrderNo;
	@org.kie.api.definition.type.Label("Item Business Data")
	private boolean itemBusData;
	@org.kie.api.definition.type.Label("PO Number")
	private java.lang.String PONumber;
	@org.kie.api.definition.type.Label("PO Item")
	private java.lang.String POItem;
	@org.kie.api.definition.type.Label("Material")
	private java.lang.String material;
	@org.kie.api.definition.type.Label("Material Group")
	private java.lang.String materialGrp;
	@org.kie.api.definition.type.Label("Material Group Text")
	private java.lang.String materialGrpText;
	@org.kie.api.definition.type.Label("Item Description")
	private java.lang.String itemDesc;
	@org.kie.api.definition.type.Label("Item Category Text")
	private java.lang.String itemCategoryText;
	@org.kie.api.definition.type.Label("Higher Level Item")
	private java.lang.String higherLevelItem;
	@org.kie.api.definition.type.Label("Reason For Rejection")
	private java.lang.String reasonForRejection;
	@org.kie.api.definition.type.Label("Reason for Rejection Text")
	private java.lang.String reasonForRejectionText;
	@org.kie.api.definition.type.Label("Product Hierarchy")
	private java.lang.String productHierarchy;
	@org.kie.api.definition.type.Label("Document Condition Record No")
	private java.lang.String docCondNo;
	@org.kie.api.definition.type.Label("Order Quantity")
	private double orderQty;
	@org.kie.api.definition.type.Label("Order Quantity Previous Value")
	private double orderQty_pvl;
	@org.kie.api.definition.type.Label("Order Quantity Difference")
	private double orderQty_dif;
	@org.kie.api.definition.type.Label("Confirm Quantity")
	private double confirmQty;
	@org.kie.api.definition.type.Label("Requirement Quantity")
	private double requirementQty;
	@org.kie.api.definition.type.Label("Delivered Quantity")
	private double deliveredQty;
	@org.kie.api.definition.type.Label("Open Quantity")
	private double openQty;
	@org.kie.api.definition.type.Label("Open Delivery Quantity")
	private double openDeliveryQty;
	@org.kie.api.definition.type.Label("Shipped Quantity")
	private double shippedQty;
	@org.kie.api.definition.type.Label("Remaining Quantity")
	private double remainQty;
	@org.kie.api.definition.type.Label("Cumulative Confirm Quantity")
	private double cumulativeConfirmQty;
	@org.kie.api.definition.type.Label("Document Incomplete")
	private boolean docIncomplete;
	@org.kie.api.definition.type.Label("Sales Unit")
	private java.lang.String salesUnit;
	@org.kie.api.definition.type.Label("Customer Part No")
	private java.lang.String CPN;

	@org.kie.api.definition.type.Label("Delivery Group")
	private int deliveryGroup;

	@org.kie.api.definition.type.Label("Document Currency")
	private java.lang.String docCurrency;

	@org.kie.api.definition.type.Label("Originating Document")
	private java.lang.String originatingDoc;

	@org.kie.api.definition.type.Label("Originating Item")
	private java.lang.String originatingItem;

	@org.kie.api.definition.type.Label("Plant")
	private java.lang.String plant;

	@org.kie.api.definition.type.Label("Storage Location")
	private java.lang.String storageLocation;

	@org.kie.api.definition.type.Label("Route")
	private java.lang.String route;

	@org.kie.api.definition.type.Label("Shipping Point")
	private java.lang.String shippingPoint;

	@org.kie.api.definition.type.Label("Serial No")
	private java.lang.String serialNo;

	@org.kie.api.definition.type.Label("Route Text")
	private java.lang.String routeText;

	@org.kie.api.definition.type.Label("Material Pricing Group")
	private java.lang.String matPricingGrp;

	@org.kie.api.definition.type.Label("Profit Center")
	private java.lang.String profitCenter;

	@org.kie.api.definition.type.Label("Design Win")
	private java.lang.String designWin;

	@org.kie.api.definition.type.Label("Design Win Text")
	private java.lang.String designWinText;

	@org.kie.api.definition.type.Label("Special Handling")
	private java.lang.String specialHandling;

	@org.kie.api.definition.type.Label("Special Handling Text")
	private java.lang.String specialHandlingText;

	@org.kie.api.definition.type.Label("Small Order Strategy")
	private java.lang.String smallOrderStrategy;

	@org.kie.api.definition.type.Label("Commodity Code")
	private java.lang.String commodityCode;

	@org.kie.api.definition.type.Label("ESD Dlag")
	private java.lang.String esdFlag;

	@org.kie.api.definition.type.Label("Higher Level Material")
	private java.lang.String higherLevelMat;

	@org.kie.api.definition.type.Label("Manufacturer Name")
	private java.lang.String mfrName;

	@org.kie.api.definition.type.Label("Manufacturer Part No")
	private java.lang.String MPN;

	@org.kie.api.definition.type.Label("SCM Flag")
	private java.lang.String SCMFlag;

	@org.kie.api.definition.type.Label("Government Contract No")
	private java.lang.String govtContractNo;

	@org.kie.api.definition.type.Label("Priority Code")
	private java.lang.String priorityCode;

	@org.kie.api.definition.type.Label("Product Business Group")
	private java.lang.String PBG;

	@org.kie.api.definition.type.Label("Procurement Strategy")
	private java.lang.String procStrat;

	@org.kie.api.definition.type.Label("Technology Code")
	private java.lang.String techCode;

	@org.kie.api.definition.type.Label("Commodity Code")
	private java.lang.String commCode;

	@org.kie.api.definition.type.Label("Group Code")
	private java.lang.String groupCode;

	@org.kie.api.definition.type.Label("Registration Status")
	private java.lang.String registrationStatus;

	@org.kie.api.definition.type.Label("SHC Code")
	private java.lang.String shcCode;

	@org.kie.api.definition.type.Label("Debit Status")
	private java.lang.String debitStatus;

	@org.kie.api.definition.type.Label("Debit Status Text")
	private java.lang.String debitStatusText;

	@org.kie.api.definition.type.Label("Debit Expiry")
	private java.lang.String debitExpiry;

	@org.kie.api.definition.type.Label("S&D Agreement No 2")
	private java.lang.String agreementNo2;

	@org.kie.api.definition.type.Label("S&D Agreement Type 2")
	private java.lang.String agreementType2;

	@org.kie.api.definition.type.Label("S&D Agreement No 3")
	private java.lang.String agreementNo3;

	@org.kie.api.definition.type.Label("S&D Agreement Type 3")
	private java.lang.String agreementType3;

	@org.kie.api.definition.type.Label("Tape and Reel")
	private boolean tapeAndReel;

	@org.kie.api.definition.type.Label("Forecast Indicator")
	private boolean forecastInd;

	@org.kie.api.definition.type.Label("NCNR Flag")
	private boolean NCNR;

	@org.kie.api.definition.type.Label("Liability Flag")
	private boolean liability;

	@org.kie.api.definition.type.Label("Expediate Status")
	private java.lang.String expediateStatus;

	@org.kie.api.definition.type.Label("Expedite ID")
	private java.lang.String expediteID;

	@org.kie.api.definition.type.Label("Expedite Revision No")
	private java.lang.String expediteRevNo;

	@org.kie.api.definition.type.Label("Reason For Expedite")
	private java.lang.String reasonForExpedite;

	@org.kie.api.definition.type.Label("Reason For Closure")
	private java.lang.String reasonForClosure;

	@org.kie.api.definition.type.Label("Line Down")
	private java.lang.String lineDown;

	@org.kie.api.definition.type.Label("Payment Terms")
	private java.lang.String paymentTerms;

	@org.kie.api.definition.type.Label("Item Delivery Status")
	private java.lang.String itemDeliveryStatus;

	@org.kie.api.definition.type.Label("Item Billing Status")
	private java.lang.String itemBillingStatus;

	@org.kie.api.definition.type.Label("Item Shipping Status")
	private java.lang.String itemShippingStatus;

	@org.kie.api.definition.type.Label("Item Overall Status")
	private java.lang.String itemOverallStatus;

	@org.kie.api.definition.type.Label("DR Number")
	private java.lang.String DRNumber;

	@org.kie.api.definition.type.Label("Order Reason")
	private java.lang.String orderReason;

	@org.kie.api.definition.type.Label("Freight Code")
	private java.lang.String freightCode;

	@org.kie.api.definition.type.Label("Purchase Order Date")
	private java.lang.String PODate;

	@org.kie.api.definition.type.Label("Ship Complete")
	private boolean shipComplete;

	@org.kie.api.definition.type.Label("Kit Part")
	private java.lang.String kitPart;

	@org.kie.api.definition.type.Label("Kit Desc")
	private java.lang.String kitDesc;

	@org.kie.api.definition.type.Label("Has Comments")
	private boolean hasComments;

	@org.kie.api.definition.type.Label("User Action")
	private java.lang.String userAction;

	@org.kie.api.definition.type.Label("Block Delivery Header")
	private java.lang.String blockDeliveryHeader;

	@org.kie.api.definition.type.Label("Block Billing")
	private java.lang.String blockBilling;

	@org.kie.api.definition.type.Label("Block Price Approval")
	private java.lang.String blockPriceApproval;

	@org.kie.api.definition.type.Label("Block Delivery Item")
	private boolean blockDeliveryItem;

	@org.kie.api.definition.type.Label("Ship & Debit Block")
	private boolean blockSD;

	@org.kie.api.definition.type.Label("Credit Block")
	private boolean blockCredit;

	@org.kie.api.definition.type.Label("Programming Block")
	private boolean blockProg;

	@org.kie.api.definition.type.Label("Pricing Block")
	private boolean blockPricing;

	@org.kie.api.definition.type.Label("Liability Block")
	private boolean blockLiability;

	@org.kie.api.definition.type.Label("Customer Hierarchy1")
	private com.amerbcs.sobacklog.model.Partners custHier1;

	@org.kie.api.definition.type.Label("Customer Hierarchy 2")
	private com.amerbcs.sobacklog.model.Partners custHier2;

	@org.kie.api.definition.type.Label("Customer Hierarchy 3")
	private com.amerbcs.sobacklog.model.Partners custHier3;

	@org.kie.api.definition.type.Label("Sold To")
	private com.amerbcs.sobacklog.model.Partners soldTo;

	@org.kie.api.definition.type.Label("Contact Person")
	private com.amerbcs.sobacklog.model.Partners contactPerson;

	@org.kie.api.definition.type.Label("Bill To")
	private com.amerbcs.sobacklog.model.Partners billTo;

	@org.kie.api.definition.type.Label("Payer")
	private com.amerbcs.sobacklog.model.Partners payer;

	@org.kie.api.definition.type.Label("Carrier")
	private com.amerbcs.sobacklog.model.Partners carrier;

	@org.kie.api.definition.type.Label("Ship To")
	private com.amerbcs.sobacklog.model.Partners shipTo;

	@org.kie.api.definition.type.Label("Reseller")
	private com.amerbcs.sobacklog.model.Partners reseller;

	@org.kie.api.definition.type.Label("Supplier")
	private com.amerbcs.sobacklog.model.Partners supplier;

	@org.kie.api.definition.type.Label("End Customer")
	private com.amerbcs.sobacklog.model.Partners endCustomer;

	@org.kie.api.definition.type.Label("Ultimate Consignee")
	private com.amerbcs.sobacklog.model.Partners ultimateConsignee;

	@org.kie.api.definition.type.Label("End User")
	private com.amerbcs.sobacklog.model.Partners endUser;

	@org.kie.api.definition.type.Label("Out Sales")
	private com.amerbcs.sobacklog.model.Partners outSales;

	@org.kie.api.definition.type.Label("Operations Manager")
	private com.amerbcs.sobacklog.model.Partners operationsMgr;

	@org.kie.api.definition.type.Label(value = "Customer Service")
	private com.amerbcs.sobacklog.model.Partners customerService;

	@org.kie.api.definition.type.Label(value = "Engineer")
	private com.amerbcs.sobacklog.model.Partners engineer;

	@org.kie.api.definition.type.Label(value = "Inside Sales")
	private com.amerbcs.sobacklog.model.Partners inSales;

	@org.kie.api.definition.type.Label(value = "Corporate Account Manager")
	private com.amerbcs.sobacklog.model.Partners corpAccountMgr;

	@org.kie.api.definition.type.Label(value = "Forecast And Buffer")
	private com.amerbcs.sobacklog.model.ForecastAndBuffer forecastAndBuffer;

	@org.kie.api.definition.type.Label(value = "Pricing")
	private com.amerbcs.sobacklog.model.Pricing pricing;

	@org.kie.api.definition.type.Label(value = "Dates")
	private com.amerbcs.sobacklog.model.Dates dates;

	public SalesItemCore() {
	}

	public java.lang.String getSalesDocument() {
		return this.salesDocument;
	}

	public void setSalesDocument(java.lang.String salesDocument) {
		this.salesDocument = salesDocument;
	}

	public java.lang.String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(java.lang.String itemNo) {
		this.itemNo = itemNo;
	}

	public java.lang.String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(java.lang.String orderType) {
		this.orderType = orderType;
	}

	public java.lang.String getDocumentDate() {
		return this.documentDate;
	}

	public void setDocumentDate(java.lang.String documentDate) {
		this.documentDate = documentDate;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public java.lang.String getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(java.lang.String createdOn) {
		this.createdOn = createdOn;
	}

	public java.lang.String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(java.lang.String createdAt) {
		this.createdAt = createdAt;
	}

	public java.lang.String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.lang.String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(java.lang.String changedBy) {
		this.changedBy = changedBy;
	}

	public java.lang.String getSalesOrg() {
		return this.salesOrg;
	}

	public void setSalesOrg(java.lang.String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public java.lang.String getDistChannel() {
		return this.distChannel;
	}

	public void setDistChannel(java.lang.String distChannel) {
		this.distChannel = distChannel;
	}

	public java.lang.String getDivision() {
		return this.division;
	}

	public void setDivision(java.lang.String division) {
		this.division = division;
	}

	public java.lang.String getSalesOffice() {
		return this.salesOffice;
	}

	public void setSalesOffice(java.lang.String salesOffice) {
		this.salesOffice = salesOffice;
	}

	public java.lang.String getSalesOfficeText() {
		return this.salesOfficeText;
	}

	public void setSalesOfficeText(java.lang.String salesOfficeText) {
		this.salesOfficeText = salesOfficeText;
	}

	public java.lang.String getSalesGrp() {
		return this.salesGrp;
	}

	public void setSalesGrp(java.lang.String salesGrp) {
		this.salesGrp = salesGrp;
	}

	public java.lang.String getSalesGrpText() {
		return this.salesGrpText;
	}

	public void setSalesGrpText(java.lang.String salesGrpText) {
		this.salesGrpText = salesGrpText;
	}

	public java.lang.String getPOType() {
		return this.POType;
	}

	public void setPOType(java.lang.String POType) {
		this.POType = POType;
	}

	public java.lang.String getWebOrderNo() {
		return this.webOrderNo;
	}

	public void setWebOrderNo(java.lang.String webOrderNo) {
		this.webOrderNo = webOrderNo;
	}

	public boolean isItemBusData() {
		return this.itemBusData;
	}

	public void setItemBusData(boolean itemBusData) {
		this.itemBusData = itemBusData;
	}

	public java.lang.String getPONumber() {
		return this.PONumber;
	}

	public void setPONumber(java.lang.String PONumber) {
		this.PONumber = PONumber;
	}

	public java.lang.String getPOItem() {
		return this.POItem;
	}

	public void setPOItem(java.lang.String POItem) {
		this.POItem = POItem;
	}

	public java.lang.String getMaterial() {
		return this.material;
	}

	public void setMaterial(java.lang.String material) {
		this.material = material;
	}

	public java.lang.String getMaterialGrp() {
		return this.materialGrp;
	}

	public void setMaterialGrp(java.lang.String materialGrp) {
		this.materialGrp = materialGrp;
	}

	public java.lang.String getMaterialGrpText() {
		return this.materialGrpText;
	}

	public void setMaterialGrpText(java.lang.String materialGrpText) {
		this.materialGrpText = materialGrpText;
	}

	public java.lang.String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(java.lang.String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public java.lang.String getItemCategoryText() {
		return this.itemCategoryText;
	}

	public void setItemCategoryText(java.lang.String itemCategoryText) {
		this.itemCategoryText = itemCategoryText;
	}

	public java.lang.String getHigherLevelItem() {
		return this.higherLevelItem;
	}

	public void setHigherLevelItem(java.lang.String higherLevelItem) {
		this.higherLevelItem = higherLevelItem;
	}

	public java.lang.String getReasonForRejection() {
		return this.reasonForRejection;
	}

	public void setReasonForRejection(java.lang.String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public java.lang.String getReasonForRejectionText() {
		return this.reasonForRejectionText;
	}

	public void setReasonForRejectionText(
			java.lang.String reasonForRejectionText) {
		this.reasonForRejectionText = reasonForRejectionText;
	}

	public java.lang.String getProductHierarchy() {
		return this.productHierarchy;
	}

	public void setProductHierarchy(java.lang.String productHierarchy) {
		this.productHierarchy = productHierarchy;
	}

	public java.lang.String getDocCondNo() {
		return this.docCondNo;
	}

	public void setDocCondNo(java.lang.String docCondNo) {
		this.docCondNo = docCondNo;
	}

	public double getOrderQty() {
		return this.orderQty;
	}

	public void setOrderQty(double orderQty) {
		this.orderQty = orderQty;
	}

	public double getOrderQty_pvl() {
		return this.orderQty_pvl;
	}

	public void setOrderQty_pvl(double orderQty_pvl) {
		this.orderQty_pvl = orderQty_pvl;
	}

	public double getOrderQty_dif() {
		return this.orderQty_dif;
	}

	public void setOrderQty_dif(double orderQty_dif) {
		this.orderQty_dif = orderQty_dif;
	}

	public double getConfirmQty() {
		return this.confirmQty;
	}

	public void setConfirmQty(double confirmQty) {
		this.confirmQty = confirmQty;
	}

	public double getRequirementQty() {
		return this.requirementQty;
	}

	public void setRequirementQty(double requirementQty) {
		this.requirementQty = requirementQty;
	}

	public double getDeliveredQty() {
		return this.deliveredQty;
	}

	public void setDeliveredQty(double deliveredQty) {
		this.deliveredQty = deliveredQty;
	}

	public double getOpenQty() {
		return this.openQty;
	}

	public void setOpenQty(double openQty) {
		this.openQty = openQty;
	}

	public double getOpenDeliveryQty() {
		return this.openDeliveryQty;
	}

	public void setOpenDeliveryQty(double openDeliveryQty) {
		this.openDeliveryQty = openDeliveryQty;
	}

	public double getShippedQty() {
		return this.shippedQty;
	}

	public void setShippedQty(double shippedQty) {
		this.shippedQty = shippedQty;
	}

	public double getRemainQty() {
		return this.remainQty;
	}

	public void setRemainQty(double remainQty) {
		this.remainQty = remainQty;
	}

	public double getCumulativeConfirmQty() {
		return this.cumulativeConfirmQty;
	}

	public void setCumulativeConfirmQty(double cumulativeConfirmQty) {
		this.cumulativeConfirmQty = cumulativeConfirmQty;
	}

	public boolean isDocIncomplete() {
		return this.docIncomplete;
	}

	public void setDocIncomplete(boolean docIncomplete) {
		this.docIncomplete = docIncomplete;
	}

	public java.lang.String getSalesUnit() {
		return this.salesUnit;
	}

	public void setSalesUnit(java.lang.String salesUnit) {
		this.salesUnit = salesUnit;
	}

	public java.lang.String getCPN() {
		return this.CPN;
	}

	public void setCPN(java.lang.String CPN) {
		this.CPN = CPN;
	}

	public int getDeliveryGroup() {
		return this.deliveryGroup;
	}

	public void setDeliveryGroup(int deliveryGroup) {
		this.deliveryGroup = deliveryGroup;
	}

	public java.lang.String getDocCurrency() {
		return this.docCurrency;
	}

	public void setDocCurrency(java.lang.String docCurrency) {
		this.docCurrency = docCurrency;
	}

	public java.lang.String getOriginatingDoc() {
		return this.originatingDoc;
	}

	public void setOriginatingDoc(java.lang.String originatingDoc) {
		this.originatingDoc = originatingDoc;
	}

	public java.lang.String getOriginatingItem() {
		return this.originatingItem;
	}

	public void setOriginatingItem(java.lang.String originatingItem) {
		this.originatingItem = originatingItem;
	}

	public java.lang.String getPlant() {
		return this.plant;
	}

	public void setPlant(java.lang.String plant) {
		this.plant = plant;
	}

	public java.lang.String getStorageLocation() {
		return this.storageLocation;
	}

	public void setStorageLocation(java.lang.String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public java.lang.String getRoute() {
		return this.route;
	}

	public void setRoute(java.lang.String route) {
		this.route = route;
	}

	public java.lang.String getShippingPoint() {
		return this.shippingPoint;
	}

	public void setShippingPoint(java.lang.String shippingPoint) {
		this.shippingPoint = shippingPoint;
	}

	public java.lang.String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(java.lang.String serialNo) {
		this.serialNo = serialNo;
	}

	public java.lang.String getRouteText() {
		return this.routeText;
	}

	public void setRouteText(java.lang.String routeText) {
		this.routeText = routeText;
	}

	public java.lang.String getMatPricingGrp() {
		return this.matPricingGrp;
	}

	public void setMatPricingGrp(java.lang.String matPricingGrp) {
		this.matPricingGrp = matPricingGrp;
	}

	public java.lang.String getProfitCenter() {
		return this.profitCenter;
	}

	public void setProfitCenter(java.lang.String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public java.lang.String getDesignWin() {
		return this.designWin;
	}

	public void setDesignWin(java.lang.String designWin) {
		this.designWin = designWin;
	}

	public java.lang.String getDesignWinText() {
		return this.designWinText;
	}

	public void setDesignWinText(java.lang.String designWinText) {
		this.designWinText = designWinText;
	}

	public java.lang.String getSpecialHandling() {
		return this.specialHandling;
	}

	public void setSpecialHandling(java.lang.String specialHandling) {
		this.specialHandling = specialHandling;
	}

	public java.lang.String getSpecialHandlingText() {
		return this.specialHandlingText;
	}

	public void setSpecialHandlingText(java.lang.String specialHandlingText) {
		this.specialHandlingText = specialHandlingText;
	}

	public java.lang.String getSmallOrderStrategy() {
		return this.smallOrderStrategy;
	}

	public void setSmallOrderStrategy(java.lang.String smallOrderStrategy) {
		this.smallOrderStrategy = smallOrderStrategy;
	}

	public java.lang.String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(java.lang.String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public java.lang.String getEsdFlag() {
		return this.esdFlag;
	}

	public void setEsdFlag(java.lang.String esdFlag) {
		this.esdFlag = esdFlag;
	}

	public java.lang.String getHigherLevelMat() {
		return this.higherLevelMat;
	}

	public void setHigherLevelMat(java.lang.String higherLevelMat) {
		this.higherLevelMat = higherLevelMat;
	}

	public java.lang.String getMfrName() {
		return this.mfrName;
	}

	public void setMfrName(java.lang.String mfrName) {
		this.mfrName = mfrName;
	}

	public java.lang.String getMPN() {
		return this.MPN;
	}

	public void setMPN(java.lang.String MPN) {
		this.MPN = MPN;
	}

	public java.lang.String getSCMFlag() {
		return this.SCMFlag;
	}

	public void setSCMFlag(java.lang.String SCMFlag) {
		this.SCMFlag = SCMFlag;
	}

	public java.lang.String getGovtContractNo() {
		return this.govtContractNo;
	}

	public void setGovtContractNo(java.lang.String govtContractNo) {
		this.govtContractNo = govtContractNo;
	}

	public java.lang.String getPriorityCode() {
		return this.priorityCode;
	}

	public void setPriorityCode(java.lang.String priorityCode) {
		this.priorityCode = priorityCode;
	}

	public java.lang.String getPBG() {
		return this.PBG;
	}

	public void setPBG(java.lang.String PBG) {
		this.PBG = PBG;
	}

	public java.lang.String getProcStrat() {
		return this.procStrat;
	}

	public void setProcStrat(java.lang.String procStrat) {
		this.procStrat = procStrat;
	}

	public java.lang.String getTechCode() {
		return this.techCode;
	}

	public void setTechCode(java.lang.String techCode) {
		this.techCode = techCode;
	}

	public java.lang.String getCommCode() {
		return this.commCode;
	}

	public void setCommCode(java.lang.String commCode) {
		this.commCode = commCode;
	}

	public java.lang.String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(java.lang.String groupCode) {
		this.groupCode = groupCode;
	}

	public java.lang.String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(java.lang.String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public java.lang.String getShcCode() {
		return this.shcCode;
	}

	public void setShcCode(java.lang.String shcCode) {
		this.shcCode = shcCode;
	}

	public java.lang.String getDebitStatus() {
		return this.debitStatus;
	}

	public void setDebitStatus(java.lang.String debitStatus) {
		this.debitStatus = debitStatus;
	}

	public java.lang.String getDebitStatusText() {
		return this.debitStatusText;
	}

	public void setDebitStatusText(java.lang.String debitStatusText) {
		this.debitStatusText = debitStatusText;
	}

	public java.lang.String getDebitExpiry() {
		return this.debitExpiry;
	}

	public void setDebitExpiry(java.lang.String debitExpiry) {
		this.debitExpiry = debitExpiry;
	}

	public java.lang.String getAgreementNo2() {
		return this.agreementNo2;
	}

	public void setAgreementNo2(java.lang.String agreementNo2) {
		this.agreementNo2 = agreementNo2;
	}

	public java.lang.String getAgreementType2() {
		return this.agreementType2;
	}

	public void setAgreementType2(java.lang.String agreementType2) {
		this.agreementType2 = agreementType2;
	}

	public java.lang.String getAgreementNo3() {
		return this.agreementNo3;
	}

	public void setAgreementNo3(java.lang.String agreementNo3) {
		this.agreementNo3 = agreementNo3;
	}

	public java.lang.String getAgreementType3() {
		return this.agreementType3;
	}

	public void setAgreementType3(java.lang.String agreementType3) {
		this.agreementType3 = agreementType3;
	}

	public boolean isTapeAndReel() {
		return this.tapeAndReel;
	}

	public void setTapeAndReel(boolean tapeAndReel) {
		this.tapeAndReel = tapeAndReel;
	}

	public boolean isForecastInd() {
		return this.forecastInd;
	}

	public void setForecastInd(boolean forecastInd) {
		this.forecastInd = forecastInd;
	}

	public boolean isNCNR() {
		return this.NCNR;
	}

	public void setNCNR(boolean NCNR) {
		this.NCNR = NCNR;
	}

	public boolean isLiability() {
		return this.liability;
	}

	public void setLiability(boolean liability) {
		this.liability = liability;
	}

	public java.lang.String getExpediateStatus() {
		return this.expediateStatus;
	}

	public void setExpediateStatus(java.lang.String expediateStatus) {
		this.expediateStatus = expediateStatus;
	}

	public java.lang.String getExpediteID() {
		return this.expediteID;
	}

	public void setExpediteID(java.lang.String expediteID) {
		this.expediteID = expediteID;
	}

	public java.lang.String getExpediteRevNo() {
		return this.expediteRevNo;
	}

	public void setExpediteRevNo(java.lang.String expediteRevNo) {
		this.expediteRevNo = expediteRevNo;
	}

	public java.lang.String getReasonForExpedite() {
		return this.reasonForExpedite;
	}

	public void setReasonForExpedite(java.lang.String reasonForExpedite) {
		this.reasonForExpedite = reasonForExpedite;
	}

	public java.lang.String getReasonForClosure() {
		return this.reasonForClosure;
	}

	public void setReasonForClosure(java.lang.String reasonForClosure) {
		this.reasonForClosure = reasonForClosure;
	}

	public java.lang.String getLineDown() {
		return this.lineDown;
	}

	public void setLineDown(java.lang.String lineDown) {
		this.lineDown = lineDown;
	}

	public java.lang.String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(java.lang.String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public java.lang.String getItemDeliveryStatus() {
		return this.itemDeliveryStatus;
	}

	public void setItemDeliveryStatus(java.lang.String itemDeliveryStatus) {
		this.itemDeliveryStatus = itemDeliveryStatus;
	}

	public java.lang.String getItemBillingStatus() {
		return this.itemBillingStatus;
	}

	public void setItemBillingStatus(java.lang.String itemBillingStatus) {
		this.itemBillingStatus = itemBillingStatus;
	}

	public java.lang.String getItemShippingStatus() {
		return this.itemShippingStatus;
	}

	public void setItemShippingStatus(java.lang.String itemShippingStatus) {
		this.itemShippingStatus = itemShippingStatus;
	}

	public java.lang.String getItemOverallStatus() {
		return this.itemOverallStatus;
	}

	public void setItemOverallStatus(java.lang.String itemOverallStatus) {
		this.itemOverallStatus = itemOverallStatus;
	}

	public java.lang.String getDRNumber() {
		return this.DRNumber;
	}

	public void setDRNumber(java.lang.String DRNumber) {
		this.DRNumber = DRNumber;
	}

	public java.lang.String getOrderReason() {
		return this.orderReason;
	}

	public void setOrderReason(java.lang.String orderReason) {
		this.orderReason = orderReason;
	}

	public java.lang.String getFreightCode() {
		return this.freightCode;
	}

	public void setFreightCode(java.lang.String freightCode) {
		this.freightCode = freightCode;
	}

	public java.lang.String getPODate() {
		return this.PODate;
	}

	public void setPODate(java.lang.String PODate) {
		this.PODate = PODate;
	}

	public boolean isShipComplete() {
		return this.shipComplete;
	}

	public void setShipComplete(boolean shipComplete) {
		this.shipComplete = shipComplete;
	}

	public java.lang.String getKitPart() {
		return this.kitPart;
	}

	public void setKitPart(java.lang.String kitPart) {
		this.kitPart = kitPart;
	}

	public java.lang.String getKitDesc() {
		return this.kitDesc;
	}

	public void setKitDesc(java.lang.String kitDesc) {
		this.kitDesc = kitDesc;
	}

	public boolean isHasComments() {
		return this.hasComments;
	}

	public void setHasComments(boolean hasComments) {
		this.hasComments = hasComments;
	}

	public java.lang.String getUserAction() {
		return this.userAction;
	}

	public void setUserAction(java.lang.String userAction) {
		this.userAction = userAction;
	}

	public java.lang.String getBlockDeliveryHeader() {
		return this.blockDeliveryHeader;
	}

	public void setBlockDeliveryHeader(java.lang.String blockDeliveryHeader) {
		this.blockDeliveryHeader = blockDeliveryHeader;
	}

	public java.lang.String getBlockBilling() {
		return this.blockBilling;
	}

	public void setBlockBilling(java.lang.String blockBilling) {
		this.blockBilling = blockBilling;
	}

	public java.lang.String getBlockPriceApproval() {
		return this.blockPriceApproval;
	}

	public void setBlockPriceApproval(java.lang.String blockPriceApproval) {
		this.blockPriceApproval = blockPriceApproval;
	}

	public boolean isBlockDeliveryItem() {
		return this.blockDeliveryItem;
	}

	public void setBlockDeliveryItem(boolean blockDeliveryItem) {
		this.blockDeliveryItem = blockDeliveryItem;
	}

	public boolean isBlockSD() {
		return this.blockSD;
	}

	public void setBlockSD(boolean blockSD) {
		this.blockSD = blockSD;
	}

	public boolean isBlockCredit() {
		return this.blockCredit;
	}

	public void setBlockCredit(boolean blockCredit) {
		this.blockCredit = blockCredit;
	}

	public boolean isBlockProg() {
		return this.blockProg;
	}

	public void setBlockProg(boolean blockProg) {
		this.blockProg = blockProg;
	}

	public boolean isBlockPricing() {
		return this.blockPricing;
	}

	public void setBlockPricing(boolean blockPricing) {
		this.blockPricing = blockPricing;
	}

	public boolean isBlockLiability() {
		return this.blockLiability;
	}

	public void setBlockLiability(boolean blockLiability) {
		this.blockLiability = blockLiability;
	}

	public com.amerbcs.sobacklog.model.Partners getCustHier1() {
		return this.custHier1;
	}

	public void setCustHier1(com.amerbcs.sobacklog.model.Partners custHier1) {
		this.custHier1 = custHier1;
	}

	public com.amerbcs.sobacklog.model.Partners getCustHier2() {
		return this.custHier2;
	}

	public void setCustHier2(com.amerbcs.sobacklog.model.Partners custHier2) {
		this.custHier2 = custHier2;
	}

	public com.amerbcs.sobacklog.model.Partners getCustHier3() {
		return this.custHier3;
	}

	public void setCustHier3(com.amerbcs.sobacklog.model.Partners custHier3) {
		this.custHier3 = custHier3;
	}

	public com.amerbcs.sobacklog.model.Partners getSoldTo() {
		return this.soldTo;
	}

	public void setSoldTo(com.amerbcs.sobacklog.model.Partners soldTo) {
		this.soldTo = soldTo;
	}

	public com.amerbcs.sobacklog.model.Partners getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(
			com.amerbcs.sobacklog.model.Partners contactPerson) {
		this.contactPerson = contactPerson;
	}

	public com.amerbcs.sobacklog.model.Partners getBillTo() {
		return this.billTo;
	}

	public void setBillTo(com.amerbcs.sobacklog.model.Partners billTo) {
		this.billTo = billTo;
	}

	public com.amerbcs.sobacklog.model.Partners getPayer() {
		return this.payer;
	}

	public void setPayer(com.amerbcs.sobacklog.model.Partners payer) {
		this.payer = payer;
	}

	public com.amerbcs.sobacklog.model.Partners getCarrier() {
		return this.carrier;
	}

	public void setCarrier(com.amerbcs.sobacklog.model.Partners carrier) {
		this.carrier = carrier;
	}

	public com.amerbcs.sobacklog.model.Partners getShipTo() {
		return this.shipTo;
	}

	public void setShipTo(com.amerbcs.sobacklog.model.Partners shipTo) {
		this.shipTo = shipTo;
	}

	public com.amerbcs.sobacklog.model.Partners getReseller() {
		return this.reseller;
	}

	public void setReseller(com.amerbcs.sobacklog.model.Partners reseller) {
		this.reseller = reseller;
	}

	public com.amerbcs.sobacklog.model.Partners getSupplier() {
		return this.supplier;
	}

	public void setSupplier(com.amerbcs.sobacklog.model.Partners supplier) {
		this.supplier = supplier;
	}

	public com.amerbcs.sobacklog.model.Partners getEndCustomer() {
		return this.endCustomer;
	}

	public void setEndCustomer(com.amerbcs.sobacklog.model.Partners endCustomer) {
		this.endCustomer = endCustomer;
	}

	public com.amerbcs.sobacklog.model.Partners getUltimateConsignee() {
		return this.ultimateConsignee;
	}

	public void setUltimateConsignee(
			com.amerbcs.sobacklog.model.Partners ultimateConsignee) {
		this.ultimateConsignee = ultimateConsignee;
	}

	public com.amerbcs.sobacklog.model.Partners getEndUser() {
		return this.endUser;
	}

	public void setEndUser(com.amerbcs.sobacklog.model.Partners endUser) {
		this.endUser = endUser;
	}

	public com.amerbcs.sobacklog.model.Partners getOutSales() {
		return this.outSales;
	}

	public void setOutSales(com.amerbcs.sobacklog.model.Partners outSales) {
		this.outSales = outSales;
	}

	public com.amerbcs.sobacklog.model.Partners getOperationsMgr() {
		return this.operationsMgr;
	}

	public void setOperationsMgr(
			com.amerbcs.sobacklog.model.Partners operationsMgr) {
		this.operationsMgr = operationsMgr;
	}

	public com.amerbcs.sobacklog.model.Partners getCustomerService() {
		return this.customerService;
	}

	public void setCustomerService(
			com.amerbcs.sobacklog.model.Partners customerService) {
		this.customerService = customerService;
	}

	public com.amerbcs.sobacklog.model.Partners getEngineer() {
		return this.engineer;
	}

	public void setEngineer(com.amerbcs.sobacklog.model.Partners engineer) {
		this.engineer = engineer;
	}

	public com.amerbcs.sobacklog.model.Partners getInSales() {
		return this.inSales;
	}

	public void setInSales(com.amerbcs.sobacklog.model.Partners inSales) {
		this.inSales = inSales;
	}

	public com.amerbcs.sobacklog.model.Partners getCorpAccountMgr() {
		return this.corpAccountMgr;
	}

	public void setCorpAccountMgr(
			com.amerbcs.sobacklog.model.Partners corpAccountMgr) {
		this.corpAccountMgr = corpAccountMgr;
	}

	public com.amerbcs.sobacklog.model.ForecastAndBuffer getForecastAndBuffer() {
		return this.forecastAndBuffer;
	}

	public void setForecastAndBuffer(
			com.amerbcs.sobacklog.model.ForecastAndBuffer forecastAndBuffer) {
		this.forecastAndBuffer = forecastAndBuffer;
	}

	public com.amerbcs.sobacklog.model.Pricing getPricing() {
		return this.pricing;
	}

	public void setPricing(com.amerbcs.sobacklog.model.Pricing pricing) {
		this.pricing = pricing;
	}

	public com.amerbcs.sobacklog.model.Dates getDates() {
		return this.dates;
	}

	public void setDates(com.amerbcs.sobacklog.model.Dates dates) {
		this.dates = dates;
	}

}