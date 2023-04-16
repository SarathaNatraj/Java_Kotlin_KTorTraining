package day10.streams;

import java.math.BigDecimal;

class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;
    
    public Invoice(String invNo, BigDecimal price, BigDecimal qty) {
    	this.invoiceNo =invNo;
    	this.price = price;
    	this.qty = qty;
    }

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

    // getters, stters n constructor
    
	public String toString() {
		return invoiceNo;
		
	}
}

