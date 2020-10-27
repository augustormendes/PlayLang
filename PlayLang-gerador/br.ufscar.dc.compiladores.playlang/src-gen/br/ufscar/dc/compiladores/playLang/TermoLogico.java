/**
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.playLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termo Logico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.TermoLogico#getFatores <em>Fatores</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.TermoLogico#getE <em>E</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.playLang.PlayLangPackage#getTermoLogico()
 * @model
 * @generated
 */
public interface TermoLogico extends EObject
{
  /**
   * Returns the value of the '<em><b>Fatores</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.dc.compiladores.playLang.FatorLogico}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fatores</em>' containment reference list.
   * @see br.ufscar.dc.compiladores.playLang.PlayLangPackage#getTermoLogico_Fatores()
   * @model containment="true"
   * @generated
   */
  EList<FatorLogico> getFatores();

  /**
   * Returns the value of the '<em><b>E</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' attribute list.
   * @see br.ufscar.dc.compiladores.playLang.PlayLangPackage#getTermoLogico_E()
   * @model unique="false"
   * @generated
   */
  EList<String> getE();

} // TermoLogico
