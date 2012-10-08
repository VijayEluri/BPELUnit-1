package net.bpelunit.model.bpel._2_0;

import net.bpelunit.model.bpel.IIf;
import net.bpelunit.model.bpel.IVisitor;

import org.oasisOpen.docs.wsbpel.x20.process.executable.TIf;

public class If extends AbstractActivity<TIf> implements IIf {

	public If(TIf i, BpelFactory f) {
		super(i, f);
	}

	public boolean isBasicActivity() {
		return false;
	}

	@Override
	public void visit(IVisitor v) {
		v.visit(this);
	}
}
