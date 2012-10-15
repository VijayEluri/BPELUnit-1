package net.bpelunit.model.bpel._2_0;

import javax.xml.namespace.QName;

import net.bpelunit.model.bpel.IInvoke;
import net.bpelunit.model.bpel.IVariable;

import org.apache.xmlbeans.XmlObject;
import org.oasisOpen.docs.wsbpel.x20.process.executable.TInvoke;

public class Invoke extends AbstractBasicActivity<TInvoke> implements IInvoke {
	private TInvoke invoke;
	
	public Invoke(TInvoke wrappedInvoke) {
		super(wrappedInvoke);
		setNativeActivity(wrappedInvoke);
	}

	public String getPartnerLink() {
		return invoke.getPartnerLink();
	}

	public void setPartnerLink(String value) {
		invoke.setPartnerLink(value);
	}

	public QName getPortType() {
		return invoke.getPortType();
	}

	public void setPortType(QName value) {
		invoke.setPortType(value);
	}

	public String getOperation() {
		return invoke.getOperation();
	}

	public void setOperation(String value) {
		invoke.setOperation(value);
	}
	
	public String getInputVariable() {
		return invoke.getInputVariable();
	}

	public void setInputVariable(String value) {
		invoke.setInputVariable(value);
	}
	
	public void setInputVariable(IVariable v) {
		setInputVariable(v.getName());
	}

	public String getOutputVariable() {
		return invoke.getOutputVariable();
	}

	public void setOutputVariable(String value) {
		invoke.setOutputVariable(value);
	}
	
	public void setOutputVariable(IVariable v) {
		setOutputVariable(v.getName());
	}
	
	@Override
	protected void setNativeActivity(XmlObject newNativeActivity) {
		super.setNativeActivity(newNativeActivity);
		
		this.invoke = (TInvoke)newNativeActivity;
	}
}
