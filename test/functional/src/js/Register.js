load("libs/HybridSample.js");


HybridSample.Register.prototype.run = function() {

	this.app.label("Register").tap();
	this.app.input("regfirstname").enterText("Mobile", {thinktime:"2000", timeout:"1000"});
	this.app.input("reglastname").enterText("Tablet", {thinktime:"2000", timeout:"1000"});
	this.app.input("regemail").enterText("mt@photoninfotech.net", {thinktime:"2000", timeout:"1000"});
	this.app.input("#4").enterText("mobiletablet", {thinktime:"2000", timeout:"1000"});
	this.app.webView().drag("308", "394", "295", "397", "2", "-2");
	this.app.webView().swipe("Left", {thinktime:"5000"});
	this.app.link("Back").tap({thinktime:"3000", timeout:"2000"});
};