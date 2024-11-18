package com.example.payment;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "kowsik")
public class payment {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// private Integer id;s
	private String id;
	private String subscriptionplan;
	private String paymentmode;
	private String paymentreferenceid;
	private String periodofsubscription;
	private String totalamountpaid;
	private String howdoyouchooseus;
	private String mentionthereferredpersonname;
	private String primaryreport;
	private String dateofsubscription;
	private String validtill;
	private String welcomemail;
		 
	// Default constructor
	public payment() {}
	 
	// Constructor with parameters
	public payment(
	String id,
	String subscriptionplan,
	String paymentmode,
	String paymentreferenceid,
	String periodofsubscription,
	String totalamountpaid,
	String howdoyouchooseus,
	String mentionthereferredpersonname,
	String primaryreport,
	String dateofsubscription,
	String validtill,
	String welcomemail)
	{
	this.id = id;
	this.subscriptionplan = subscriptionplan;
	this.paymentmode = paymentmode;
	this.paymentreferenceid = paymentreferenceid;
	this.periodofsubscription = periodofsubscription;
	this.totalamountpaid = totalamountpaid;
	this.howdoyouchooseus = howdoyouchooseus;
	this.mentionthereferredpersonname = mentionthereferredpersonname;
	this.primaryreport = primaryreport;
	this.dateofsubscription = dateofsubscription;
	this.validtill = validtill;
	this.welcomemail = welcomemail;

	}
	 
	// Getters and Setters
	public String getId() { return id; }
	public void setId(String id) { this.id = id;}
	
	public String getsubscriptionplan() { return subscriptionplan; }
	public void setsubscriptionplan(String subscriptionplan) { this.subscriptionplan = subscriptionplan;}
	
	public String getpaymentmode() { return paymentmode; }
	public void setpaymentmode(String paymentmode) { this.paymentmode = paymentmode;}
	
	public String getpaymentreferenceids() { return paymentreferenceid; }
	public void setpaymentreferenceid(String paymentreferenceid) { this.paymentreferenceid = paymentreferenceid;}
	
	public String getperiodofsubscription() { return periodofsubscription; }
	public void setperiodofsubscription(String periodofsubscription) { this.periodofsubscription = periodofsubscription;}
	
	public String gettotalamountpaid() { return totalamountpaid; }
	public void settotalamountpaid(String totalamountpaid) { this.totalamountpaid = totalamountpaid;}
	
	public String gethowdoyouchooseus() { return howdoyouchooseus; }
	public void sethowdoyouchooseus(String howdoyouchooseus) { this.howdoyouchooseus = howdoyouchooseus;}
	
	public String getmentionthereferredpersonname() { return mentionthereferredpersonname; }
	public void setmentionthereferredpersonname(String mentionthereferredpersonname) { this.mentionthereferredpersonname = mentionthereferredpersonname;}
	
	public String getprimaryreport() { return primaryreport; }
	public void setprimaryreport(String primaryreport) { this.primaryreport = primaryreport;}
	
	public String getdateofsubscription() { return dateofsubscription; }
	public void setdateofsubscription(String dateofsubscription) { this.dateofsubscription  = dateofsubscription;}
	
	public String getvalidtill() { return validtill; }
	
	public String getwelcomemail() { return welcomemail; }
	public void setwelcomemail(String welcomemail) { this.welcomemail =welcomemail;}
	}


