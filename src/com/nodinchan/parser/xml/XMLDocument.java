/*
 *     Copyright (C) 2013  Nodin Chan
 *     
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *     
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *     
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */

package com.nodinchan.parser.xml;

import java.util.LinkedList;
import java.util.List;

public final class XMLDocument extends XMLElement {
	
	private final String encoding;
	private final String version;
	private final String systemId;
	
	private final boolean standalone;
	public XMLDocument(String encoding, String version, String systemId, boolean standalone) {
		super("xml");
		this.encoding = encoding;
		this.version = version;
		this.systemId = systemId;
		this.standalone = standalone;
	}
	
	public XMLDocument(String encoding, String version, String systemId) {
		this(encoding, version, systemId, false);
	}
	
	public XMLDocument(String encoding, String version) {
		this(encoding, version, "", false);
	}
	
	public XMLDocument(String encoding) {
		this(encoding, "1.0", "", false);
	}
	
	public XMLDocument() {
		this("UTF-8", "1.0", "", false);
	}
	
	@Deprecated
	@Override
	public XMLElement appendAttribute(XMLAttribute attribute) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement appendAttribute(String name, String value) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement appendAttributeAfter(XMLAttribute attribute, String relative) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement appendAttributeAfter(String name, String value, String relative) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLAttribute getAttribute(String name) {
		return null;
	}
	
	@Deprecated
	@Override
	public List<XMLAttribute> getAttributes() {
		return new LinkedList<XMLAttribute>();
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public String getSystemId() {
		return systemId;
	}
	
	@Deprecated
	@Override
	public XMLElement getParent() {
		return null;
	}
	
	@Deprecated
	@Override
	public String getValue() {
		return null;
	}
	
	public String getVersion() {
		return version;
	}
	
	@Deprecated
	@Override
	public boolean hasAttribute(String name) {
		return false;
	}
	
	@Deprecated
	@Override
	public XMLElement insertAttribute(XMLAttribute attribute, int position) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement insertAttribute(String name, String value, int position) {
		return this;
	}
	
	public boolean isStandalone() {
		return standalone;
	}
	
	@Deprecated
	@Override
	public XMLElement prependAttribute(XMLAttribute attribute) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement prependAttribute(String name, String value) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement prependAttributeBefore(XMLAttribute attribute, String relative) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement prependAttributeBefore(String name, String value, String relative) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement removeAttribute(String name) {
		return this;
	}
	
	@Deprecated
	@Override
	public XMLElement setValue(String value) {
		return this;
	}
}