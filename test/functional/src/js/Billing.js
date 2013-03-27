/*
 * PHR_AndroidHybrid
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
load("libs/HybridSample.js");


HybridSample.Billing.prototype.run = function() {

	this.app.link("Customer Information").tap();
	this.app.input("email").enterText("mt@photoninfotech.com", {thinktime:"2000", timeout:"1000"});
	this.app.link("Customer Information").tap({timeout:"2000"});
	this.app.link("Delivery Information").tap();
	this.app.input("deliveryfirstname").enterText("Photon", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliverylastname").enterText("Phresco", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliverycompany").enterText("Photon", "Infotech", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliveryaddress1").enterText("Arumbakkam", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliveryaddress2").enterText("Chennai", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliverycity").enterText("Chennai", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliverystate").enterText("Tamil", "Nadu", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliverypostcode").enterText("600106", {thinktime:"2000", timeout:"1000"});
	this.app.input("deliveryphonenumber").enterText("9500584769", {thinktime:"1000", timeout:"1000"});
	this.app.link("Delivery Information").tap();
	this.app.link("billing Information").tap();
	this.app.input("billingfirstname").enterText("Photon", {thinktime:"2000", timeout:"1000"});
	this.app.input("billinglastname").enterText("Phresco", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingcompany").enterText("Photon", "Infotech", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingaddress1").enterText("Arumbakkam", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingaddress2").enterText("Chennai", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingcity").enterText("Chennai", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingstate").enterText("Tamil", "Nadu", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingpostcode").enterText("600106", {thinktime:"2000", timeout:"1000"});
	this.app.input("billingphonenumber").enterText("9500584769", {thinktime:"1000", timeout:"1000"});
	this.app.link("billing Information").tap();
	this.app.link("Payment Methods").tap();
	this.app.link("Payment Methods").tap();
	this.app.link("Order Comments").tap();
	this.app.textArea("comments").tap("Welcome", "to", "Photon", {thinktime:"2000", timeout:"1000"});
	this.app.link("Order Comments").tap({thinktime:"5000"});
	this.app.link("Review Order").tap({thinktime:"2000", timeout:"1000"});
	this.app.link("Submit Order").tap({thinktime:"5000", timeout:"1000"});
	this.app.link("Back").tap({thinktime:"8000", timeout:"1000"});
};