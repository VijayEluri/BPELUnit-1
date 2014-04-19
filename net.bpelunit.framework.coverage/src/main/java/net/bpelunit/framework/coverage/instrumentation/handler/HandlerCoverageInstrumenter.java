package net.bpelunit.framework.coverage.instrumentation.handler;

import net.bpelunit.framework.coverage.instrumentation.AbstractInstrumenter;
import net.bpelunit.framework.coverage.marker.MarkerFactory;
import net.bpelunit.framework.coverage.marker.MarkerInstanceList;
import net.bpelunit.framework.coverage.result.IMetricCoverage;
import net.bpelunit.model.bpel.IAssign;
import net.bpelunit.model.bpel.ICatch;
import net.bpelunit.model.bpel.ICatchAll;
import net.bpelunit.model.bpel.ICompensate;
import net.bpelunit.model.bpel.ICompensateScope;
import net.bpelunit.model.bpel.ICompensationHandler;
import net.bpelunit.model.bpel.ICopy;
import net.bpelunit.model.bpel.IElse;
import net.bpelunit.model.bpel.IElseIf;
import net.bpelunit.model.bpel.IEmpty;
import net.bpelunit.model.bpel.IExit;
import net.bpelunit.model.bpel.IFlow;
import net.bpelunit.model.bpel.IForEach;
import net.bpelunit.model.bpel.IIf;
import net.bpelunit.model.bpel.IImport;
import net.bpelunit.model.bpel.IInvoke;
import net.bpelunit.model.bpel.ILink;
import net.bpelunit.model.bpel.IOnAlarm;
import net.bpelunit.model.bpel.IOnAlarmEventHandler;
import net.bpelunit.model.bpel.IOnMessage;
import net.bpelunit.model.bpel.IOnMessageHandler;
import net.bpelunit.model.bpel.IPartnerLink;
import net.bpelunit.model.bpel.IPick;
import net.bpelunit.model.bpel.IProcess;
import net.bpelunit.model.bpel.IReceive;
import net.bpelunit.model.bpel.IRepeatUntil;
import net.bpelunit.model.bpel.IReply;
import net.bpelunit.model.bpel.IRethrow;
import net.bpelunit.model.bpel.IScope;
import net.bpelunit.model.bpel.ISequence;
import net.bpelunit.model.bpel.IThrow;
import net.bpelunit.model.bpel.IValidate;
import net.bpelunit.model.bpel.IVariable;
import net.bpelunit.model.bpel.IWait;
import net.bpelunit.model.bpel.IWhile;

public class HandlerCoverageInstrumenter extends AbstractInstrumenter {

	public HandlerCoverageInstrumenter(MarkerFactory markerFactoryToUse) {
		super(markerFactoryToUse);
	}
	
	public void visit(IAssign a) {
	}

	public void visit(ICompensate a) {
	}

	public void visit(ICompensateScope a) {
	}

	public void visit(ICopy c) {
	}

	public void visit(IEmpty a) {
	}

	public void visit(IExit a) {
	}

	public void visit(IFlow a) {
	}

	public void visit(IForEach a) {
	}

	public void visit(IIf a) {
	}

	public void visit(IImport i) {
	}

	public void visit(IInvoke a) {
	}

	public void visit(IOnAlarm a) {
	}

	public void visit(IOnMessage a) {
	}

	public void visit(IPartnerLink pl) {
	}

	public void visit(IPick a) {
	}

	public void visit(IProcess a) {
	}

	public void visit(IReceive a) {
	}

	public void visit(IRepeatUntil a) {
	}

	public void visit(IReply a) {
	}

	public void visit(IRethrow a) {
	}

	public void visit(IScope a) {
	}

	public void visit(ISequence a) {
	}

	public void visit(IThrow a) {
	}

	public void visit(IValidate a) {
	}

	public void visit(IVariable var) {
	}

	public void visit(IWait a) {
	}

	public void visit(IWhile a) {
	}

	public void visit(IElse else1) {
	}
	
	public void visit(ILink link) {
	}
	
	public void visit(IElseIf elseIf) {
	}
	
	public void visit(ICompensationHandler compensationHandler) {
		addCoverageMarker(compensationHandler.getMainActivity(), compensationHandler);
	}

	public void visit(IOnMessageHandler onMessageHandler) {
		addCoverageMarker(onMessageHandler.getScope().getMainActivity(), onMessageHandler);
	}

	public void visit(ICatch ccatch) {
	}

	public void visit(ICatchAll catchAll) {
	}
	
	public void visit(IOnAlarmEventHandler onAlarmEventHandler) {
	}
	
	@Override
	public IMetricCoverage getCoverageResult(MarkerInstanceList markers) {
		// TODO Auto-generated method stub
		return null;
	}

}
