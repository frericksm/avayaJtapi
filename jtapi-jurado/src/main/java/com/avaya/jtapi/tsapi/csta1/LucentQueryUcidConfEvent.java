package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

public final class LucentQueryUcidConfEvent extends LucentPrivateData implements
		HasUCID {
	String ucid;
	public static final int PDU = 77;

	public static LucentQueryUcidConfEvent decode(InputStream in) {
		LucentQueryUcidConfEvent _this = new LucentQueryUcidConfEvent();
		_this.doDecode(in);

		return _this;
	}

	public void decodeMembers(InputStream memberStream) {
		this.ucid = UCID.decode(memberStream);
	}

	public void encodeMembers(OutputStream memberStream) {
		UCID.encode(this.ucid, memberStream);
	}

	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("LucentQueryUcidConfEvent ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(UCID.print(this.ucid, "ucid", indent));

		lines.add("}");
		return lines;
	}

	public int getPDU() {
		return 77;
	}

	public String getUcid() {
		return this.ucid;
	}

	public void setUcid(String ucid) {
		this.ucid = ucid;
	}
}