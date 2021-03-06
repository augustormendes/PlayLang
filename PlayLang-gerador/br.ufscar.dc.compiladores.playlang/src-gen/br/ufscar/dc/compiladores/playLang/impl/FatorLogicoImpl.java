/**
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.playLang.impl;

import br.ufscar.dc.compiladores.playLang.FatorLogico;
import br.ufscar.dc.compiladores.playLang.Parcela_logica;
import br.ufscar.dc.compiladores.playLang.PlayLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fator Logico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.FatorLogicoImpl#isNao <em>Nao</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.FatorLogicoImpl#getParcela <em>Parcela</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FatorLogicoImpl extends MinimalEObjectImpl.Container implements FatorLogico
{
  /**
   * The default value of the '{@link #isNao() <em>Nao</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNao()
   * @generated
   * @ordered
   */
  protected static final boolean NAO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNao() <em>Nao</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNao()
   * @generated
   * @ordered
   */
  protected boolean nao = NAO_EDEFAULT;

  /**
   * The cached value of the '{@link #getParcela() <em>Parcela</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParcela()
   * @generated
   * @ordered
   */
  protected Parcela_logica parcela;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FatorLogicoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlayLangPackage.Literals.FATOR_LOGICO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNao()
  {
    return nao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNao(boolean newNao)
  {
    boolean oldNao = nao;
    nao = newNao;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.FATOR_LOGICO__NAO, oldNao, nao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parcela_logica getParcela()
  {
    return parcela;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParcela(Parcela_logica newParcela, NotificationChain msgs)
  {
    Parcela_logica oldParcela = parcela;
    parcela = newParcela;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlayLangPackage.FATOR_LOGICO__PARCELA, oldParcela, newParcela);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParcela(Parcela_logica newParcela)
  {
    if (newParcela != parcela)
    {
      NotificationChain msgs = null;
      if (parcela != null)
        msgs = ((InternalEObject)parcela).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlayLangPackage.FATOR_LOGICO__PARCELA, null, msgs);
      if (newParcela != null)
        msgs = ((InternalEObject)newParcela).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlayLangPackage.FATOR_LOGICO__PARCELA, null, msgs);
      msgs = basicSetParcela(newParcela, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.FATOR_LOGICO__PARCELA, newParcela, newParcela));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlayLangPackage.FATOR_LOGICO__PARCELA:
        return basicSetParcela(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlayLangPackage.FATOR_LOGICO__NAO:
        return isNao();
      case PlayLangPackage.FATOR_LOGICO__PARCELA:
        return getParcela();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlayLangPackage.FATOR_LOGICO__NAO:
        setNao((Boolean)newValue);
        return;
      case PlayLangPackage.FATOR_LOGICO__PARCELA:
        setParcela((Parcela_logica)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlayLangPackage.FATOR_LOGICO__NAO:
        setNao(NAO_EDEFAULT);
        return;
      case PlayLangPackage.FATOR_LOGICO__PARCELA:
        setParcela((Parcela_logica)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlayLangPackage.FATOR_LOGICO__NAO:
        return nao != NAO_EDEFAULT;
      case PlayLangPackage.FATOR_LOGICO__PARCELA:
        return parcela != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nao: ");
    result.append(nao);
    result.append(')');
    return result.toString();
  }

} //FatorLogicoImpl
