/*
 * generated by Xtext
 */
package org.eclipse.amp.amf.parameters.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AParExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipse.amp.amf.parameters.ui.internal.AParActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipse.amp.amf.parameters.ui.internal.AParActivator.getInstance().getInjector("org.eclipse.amp.amf.parameters.APar");
	}
	
}
