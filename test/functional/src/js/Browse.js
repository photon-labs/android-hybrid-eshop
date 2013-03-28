load("libs/HybridSample.js");


HybridSample.Browse.prototype.run = function() {

	this.app.link("Browse").tap({thinktime:"5000", timeout:"2000"});
	this.app.webView().drag("548", "171", "531", "174", "17", "-3");
	this.app.webView().swipe("Left", {thinktime:"5000"});
	this.app.webView().drag("115", "218", "93", "217", "22", "1");
	this.app.webView().swipe("Left", {thinktime:"5000"});
	this.app.webView().drag("341", "325", "322", "336", "19", "-11");
	this.app.webView().swipe("Left");
	this.app.webView().drag("300", "566", "277", "583", "23", "-17");
	this.app.webView().swipe("Left");
	this.app.webView().drag("238", "253", "215", "247", "23", "6");
	this.app.webView().swipe("Left");
};