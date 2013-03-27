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