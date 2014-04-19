package net.bpelunit.framework.coverage.instrumentation.activity;

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

public class ActivityCoverageInstrumenter extends AbstractInstrumenter {

	public ActivityCoverageInstrumenter(MarkerFactory markerFactoryToUse) {
		super(markerFactoryToUse);
	}
	
	@Override
	public IMetricCoverage getCoverageResult(MarkerInstanceList markerInstances) {
		return new ActivityMetricCoverage(markerInstances, getIssuedMarkers());
	}

	/*---- Visitor Functions ----*/

	public void visit(IAssign a) {
		addCoverageMarker(a);
	}

	public void visit(ICompensate a) {
		addCoverageMarker(a);
	}

	public void visit(ICompensateScope a) {
		addCoverageMarker(a);
	}

	public void visit(IEmpty a) {
		addCoverageMarker(a);
	}

	public void visit(IExit a) {
		addCoverageMarker(a);
	}

	public void visit(IFlow a) {
		// Structured Activity
	}

	public void visit(IForEach a) {
		// Structured Activity
	}

	public void visit(IIf a) {
		// Structured Activity
	}

	public void visit(IInvoke a) {
		addCoverageMarker(a);
	}

	public void visit(IPick a) {
		// Structured Activity
	}

	public void visit(IProcess a) {
		// Structured Activity
	}

	public void visit(IReceive a) {
		addCoverageMarker(a);
	}

	public void visit(IRepeatUntil a) {
		// Structured Activity
	}

	public void visit(IReply a) {
		addCoverageMarker(a);
	}

	public void visit(IRethrow a) {
		addCoverageMarker(a);
	}

	public void visit(IScope a) {
		// Structured Activity
	}

	public void visit(ISequence a) {
		// Structured Activity
	}

	public void visit(IThrow a) {
		addCoverageMarker(a);
	}

	public void visit(IValidate a) {
		addCoverageMarker(a);
	}

	public void visit(IWait a) {
		addCoverageMarker(a);
	}

	public void visit(IWhile a) {
		// Structured Activity
	}

	public void visit(IOnAlarm a) {
		// Structured Activity
	}

	public void visit(IOnMessage a) {
		// Structured Activity
	}

	public void visit(ICopy c) {
		// uninteresting
	}

	public void visit(IImport i) {
		// uninteresting
	}

	public void visit(IPartnerLink pl) {
		// uninteresting
	}

	public void visit(IVariable var) {
		// uninteresting
	}

	public void visit(ICompensationHandler compensationHandler) {
		// uninteresting
	}

	public void visit(IOnMessageHandler onMessageHandler) {
		// uninteresting
	}

	public void visit(IElseIf elseIf) {
		// uninteresting
	}

	public void visit(IElse else1) {
		// uninteresting
	}

	public void visit(ILink link) {
		// uninteresting
	}

	public void visit(ICatch ccatch) {
		// uninteresting
	}

	public void visit(ICatchAll catchAll) {
		// uninteresting
	}

	public void visit(IOnAlarmEventHandler onAlarmEventHandler) {
		// uninteresting

	}
}
