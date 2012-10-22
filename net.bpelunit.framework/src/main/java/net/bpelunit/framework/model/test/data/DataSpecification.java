/**
 * This file belongs to the BPELUnit utility and Eclipse plugin set. See enclosed
 * license file for more information.
 * 
 */
package net.bpelunit.framework.model.test.data;

import java.io.StringWriter;

import javax.xml.namespace.NamespaceContext;

import net.bpelunit.framework.control.util.XMLPrinterTool;
import net.bpelunit.framework.control.util.XPathTool;
import net.bpelunit.framework.exception.DataSourceException;
import net.bpelunit.framework.exception.SpecificationException;
import net.bpelunit.framework.model.test.activity.Activity;
import net.bpelunit.framework.model.test.activity.VelocityContextProvider;
import net.bpelunit.framework.model.test.report.ArtefactStatus;
import net.bpelunit.framework.model.test.report.ITestArtefact;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.context.Context;

import com.rits.cloning.Cloner;

/**
 * Abstract superclass of the two data specification packages Send and Receive.
 * 
 * @version $Id$
 * @author Philip Mayer
 * 
 */
public abstract class DataSpecification implements ITestArtefact {

	private static final Cloner CLONER = new Cloner();

	/**
	 * Next parent activity this data specification belongs to.
	 */
	private Activity fActivity;

	/**
	 * Namespace Context
	 */
	private NamespaceContext fNamespaceContext;

	/**
	 * Status of this object.
	 */
	private ArtefactStatus fStatus;


	// ********************** Initialization ***************************

	public DataSpecification(Activity parent, NamespaceContext nsContext) throws SpecificationException {
		fActivity= parent;
		fNamespaceContext = nsContext;
		setStatus(ArtefactStatus.createInitialStatus());
	}

	// ************************** ITestArtefact ************************


	public ITestArtefact getParent() {
		return fActivity;
	}

	public ArtefactStatus getStatus() {
		return fStatus;
	}

	public void reportProgress(ITestArtefact artefact) {
		fActivity.reportProgress(artefact);
	}

	// ***************************** Other ******************************

	public boolean hasProblems() {
		return getStatus().hasProblems();
	}

	protected String expandTemplateToString(VelocityContextProvider context, String template) throws DataSourceException {
		Context velocityCtx = CLONER.deepClone(context.createVelocityContext());
		velocityCtx.put("xpath", new XPathTool(getNamespaceContext()));
		velocityCtx.put("printer", new XMLPrinterTool());

		// Expand the template as a regular string
		StringWriter writer = new StringWriter();
		Velocity.evaluate(velocityCtx, writer, "expandTemplate", template);
		return writer.toString();
	}

	public NamespaceContext getNamespaceContext() {
		return fNamespaceContext;
	}

	public final void setStatus(ArtefactStatus fStatus) {
		setStatus(fStatus, HandleMode.EXECUTE);
	}
	
	public final void setStatus(ArtefactStatus fStatus, HandleMode m) {
		if(m == HandleMode.EXECUTE) {
			this.fStatus = fStatus;
		} else {
			if(fStatus.hasProblems()) {
				throw new CannotEvaluateException(null);
			}
		}
	}
}
