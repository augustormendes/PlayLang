/*
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class PlayLangStandaloneSetup extends PlayLangStandaloneSetupGenerated {

	public static void doSetup() {
		new PlayLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
