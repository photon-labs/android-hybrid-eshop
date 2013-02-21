load("libs/HybridSample.js");


HybridSample.Login.prototype.run = function() {

	this.app.label("Login").tap({timeout:"1000"});
	this.app.input("logEmail").enterText("photon@photoninfotech.net", {thinktime:"2000", timeout:"1000"});
	this.app.input("#2").enterText("mypass", {thinktime:"2000", timeout:"2000"});
	this.app.label("Submit").tap({thinktime:"2000", timeout:"1000"});
	this.app.link("Back").tap({thinktime:"10000", timeout:"1000"});
};