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