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


HybridSample.Login.prototype.run = function() {

	this.app.label("Login").tap({timeout:"1000"});
	this.app.input("logEmail").enterText("photon@photoninfotech.net", {thinktime:"2000", timeout:"1000"});
	this.app.input("#2").enterText("mypass", {thinktime:"2000", timeout:"2000"});
	this.app.label("Submit").tap({thinktime:"2000", timeout:"1000"});
	this.app.link("Back").tap({thinktime:"10000", timeout:"1000"});
};