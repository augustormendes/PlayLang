/*
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.ui;

import br.ufscar.dc.compiladores.playlang.ui.internal.PlaylangActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PlayLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(PlaylangActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		PlaylangActivator activator = PlaylangActivator.getInstance();
		return activator != null ? activator.getInjector(PlaylangActivator.BR_UFSCAR_DC_COMPILADORES_PLAYLANG) : null;
	}

}
