load("libs/HybridSample.js");


HybridSample.Logout.prototype.run = function() {

	this.app.link("Logout").tap({thinktime:"3000", timeout:"1000"});
};