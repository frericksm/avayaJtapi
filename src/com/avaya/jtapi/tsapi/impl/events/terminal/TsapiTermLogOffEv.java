package com.avaya.jtapi.tsapi.impl.events.terminal;

import javax.telephony.Terminal;
import javax.telephony.callcenter.Agent;
import javax.telephony.callcenter.events.AgentTermLoggedOffEv;

@SuppressWarnings("deprecation")
public final class TsapiTermLogOffEv extends TsapiAgentTermEv implements
		AgentTermLoggedOffEv {
	public int getID() {
		return 309;
	}

	public TsapiTermLogOffEv(Terminal _device, Agent _agent, int _cause,
			int _metaCode, Object _privateData) {
		super(_device, _agent, _cause, _metaCode, _privateData);
	}
}