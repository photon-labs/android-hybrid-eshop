load("libs/HybridSample.js");


HybridSample.SpecialOffers.prototype.run = function() {

	this.app.label("Special Offers").tap({thinktime:"10000", timeout:"2000"});
	this.app.webView().drag("115", "218", "93", "217", "22", "1");
	this.app.webView().swipe("Left", {thinktime:"5000"});
	this.app.webView().drag("341", "325", "322", "336", "19", "-11");
	this.app.webView().swipe("Left");
	this.app.webView().drag("300", "566", "277", "583", "23", "-17");
	this.app.webView().swipe("Left");
	this.app.webView().drag("238", "253", "215", "247", "23", "6");
	this.app.webView().swipe("Left");
	this.app.billing().run({thinktime:"3000", timeout:"2000"});
};