/**
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.playLang.impl;

import br.ufscar.dc.compiladores.playLang.Escolha;
import br.ufscar.dc.compiladores.playLang.Escolhas;
import br.ufscar.dc.compiladores.playLang.Expressao;
import br.ufscar.dc.compiladores.playLang.PlayLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escolhas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.EscolhasImpl#getSingleChoice <em>Single Choice</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.EscolhasImpl#isHasIf <em>Has If</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.EscolhasImpl#getExpressaoIf <em>Expressao If</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.EscolhasImpl#getEscolhasIF <em>Escolhas IF</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.EscolhasImpl#isHasElse <em>Has Else</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.EscolhasImpl#getEscolhasELSE <em>Escolhas ELSE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EscolhasImpl extends MinimalEObjectImpl.Container implements Escolhas
{
  /**
   * The cached value of the '{@link #getSingleChoice() <em>Single Choice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleChoice()
   * @generated
   * @ordered
   */
  protected Escolha singleChoice;

  /**
   * The default value of the '{@link #isHasIf() <em>Has If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasIf()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_IF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasIf() <em>Has If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasIf()
   * @generated
   * @ordered
   */
  protected boolean hasIf = HAS_IF_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressaoIf() <em>Expressao If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressaoIf()
   * @generated
   * @ordered
   */
  protected Expressao expressaoIf;

  /**
   * The cached value of the '{@link #getEscolhasIF() <em>Escolhas IF</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscolhasIF()
   * @generated
   * @ordered
   */
  protected EList<Escolhas> escolhasIF;

  /**
   * The default value of the '{@link #isHasElse() <em>Has Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasElse()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_ELSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasElse() <em>Has Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasElse()
   * @generated
   * @ordered
   */
  protected boolean hasElse = HAS_ELSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEscolhasELSE() <em>Escolhas ELSE</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscolhasELSE()
   * @generated
   * @ordered
   */
  protected EList<Escolhas> escolhasELSE;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EscolhasImpl()
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
    return PlayLangPackage.Literals.ESCOLHAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Escolha getSingleChoice()
  {
    return singleChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleChoice(Escolha newSingleChoice, NotificationChain msgs)
  {
    Escolha oldSingleChoice = singleChoice;
    singleChoice = newSingleChoice;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlayLangPackage.ESCOLHAS__SINGLE_CHOICE, oldSingleChoice, newSingleChoice);
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
  public void setSingleChoice(Escolha newSingleChoice)
  {
    if (newSingleChoice != singleChoice)
    {
      NotificationChain msgs = null;
      if (singleChoice != null)
        msgs = ((InternalEObject)singleChoice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlayLangPackage.ESCOLHAS__SINGLE_CHOICE, null, msgs);
      if (newSingleChoice != null)
        msgs = ((InternalEObject)newSingleChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlayLangPackage.ESCOLHAS__SINGLE_CHOICE, null, msgs);
      msgs = basicSetSingleChoice(newSingleChoice, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.ESCOLHAS__SINGLE_CHOICE, newSingleChoice, newSingleChoice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasIf()
  {
    return hasIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasIf(boolean newHasIf)
  {
    boolean oldHasIf = hasIf;
    hasIf = newHasIf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.ESCOLHAS__HAS_IF, oldHasIf, hasIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expressao getExpressaoIf()
  {
    return expressaoIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressaoIf(Expressao newExpressaoIf, NotificationChain msgs)
  {
    Expressao oldExpressaoIf = expressaoIf;
    expressaoIf = newExpressaoIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlayLangPackage.ESCOLHAS__EXPRESSAO_IF, oldExpressaoIf, newExpressaoIf);
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
  public void setExpressaoIf(Expressao newExpressaoIf)
  {
    if (newExpressaoIf != expressaoIf)
    {
      NotificationChain msgs = null;
      if (expressaoIf != null)
        msgs = ((InternalEObject)expressaoIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlayLangPackage.ESCOLHAS__EXPRESSAO_IF, null, msgs);
      if (newExpressaoIf != null)
        msgs = ((InternalEObject)newExpressaoIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlayLangPackage.ESCOLHAS__EXPRESSAO_IF, null, msgs);
      msgs = basicSetExpressaoIf(newExpressaoIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.ESCOLHAS__EXPRESSAO_IF, newExpressaoIf, newExpressaoIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Escolhas> getEscolhasIF()
  {
    if (escolhasIF == null)
    {
      escolhasIF = new EObjectContainmentEList<Escolhas>(Escolhas.class, this, PlayLangPackage.ESCOLHAS__ESCOLHAS_IF);
    }
    return escolhasIF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasElse()
  {
    return hasElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasElse(boolean newHasElse)
  {
    boolean oldHasElse = hasElse;
    hasElse = newHasElse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.ESCOLHAS__HAS_ELSE, oldHasElse, hasElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Escolhas> getEscolhasELSE()
  {
    if (escolhasELSE == null)
    {
      escolhasELSE = new EObjectContainmentEList<Escolhas>(Escolhas.class, this, PlayLangPackage.ESCOLHAS__ESCOLHAS_ELSE);
    }
    return escolhasELSE;
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
      case PlayLangPackage.ESCOLHAS__SINGLE_CHOICE:
        return basicSetSingleChoice(null, msgs);
      case PlayLangPackage.ESCOLHAS__EXPRESSAO_IF:
        return basicSetExpressaoIf(null, msgs);
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_IF:
        return ((InternalEList<?>)getEscolhasIF()).basicRemove(otherEnd, msgs);
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_ELSE:
        return ((InternalEList<?>)getEscolhasELSE()).basicRemove(otherEnd, msgs);
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
      case PlayLangPackage.ESCOLHAS__SINGLE_CHOICE:
        return getSingleChoice();
      case PlayLangPackage.ESCOLHAS__HAS_IF:
        return isHasIf();
      case PlayLangPackage.ESCOLHAS__EXPRESSAO_IF:
        return getExpressaoIf();
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_IF:
        return getEscolhasIF();
      case PlayLangPackage.ESCOLHAS__HAS_ELSE:
        return isHasElse();
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_ELSE:
        return getEscolhasELSE();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlayLangPackage.ESCOLHAS__SINGLE_CHOICE:
        setSingleChoice((Escolha)newValue);
        return;
      case PlayLangPackage.ESCOLHAS__HAS_IF:
        setHasIf((Boolean)newValue);
        return;
      case PlayLangPackage.ESCOLHAS__EXPRESSAO_IF:
        setExpressaoIf((Expressao)newValue);
        return;
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_IF:
        getEscolhasIF().clear();
        getEscolhasIF().addAll((Collection<? extends Escolhas>)newValue);
        return;
      case PlayLangPackage.ESCOLHAS__HAS_ELSE:
        setHasElse((Boolean)newValue);
        return;
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_ELSE:
        getEscolhasELSE().clear();
        getEscolhasELSE().addAll((Collection<? extends Escolhas>)newValue);
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
      case PlayLangPackage.ESCOLHAS__SINGLE_CHOICE:
        setSingleChoice((Escolha)null);
        return;
      case PlayLangPackage.ESCOLHAS__HAS_IF:
        setHasIf(HAS_IF_EDEFAULT);
        return;
      case PlayLangPackage.ESCOLHAS__EXPRESSAO_IF:
        setExpressaoIf((Expressao)null);
        return;
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_IF:
        getEscolhasIF().clear();
        return;
      case PlayLangPackage.ESCOLHAS__HAS_ELSE:
        setHasElse(HAS_ELSE_EDEFAULT);
        return;
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_ELSE:
        getEscolhasELSE().clear();
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
      case PlayLangPackage.ESCOLHAS__SINGLE_CHOICE:
        return singleChoice != null;
      case PlayLangPackage.ESCOLHAS__HAS_IF:
        return hasIf != HAS_IF_EDEFAULT;
      case PlayLangPackage.ESCOLHAS__EXPRESSAO_IF:
        return expressaoIf != null;
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_IF:
        return escolhasIF != null && !escolhasIF.isEmpty();
      case PlayLangPackage.ESCOLHAS__HAS_ELSE:
        return hasElse != HAS_ELSE_EDEFAULT;
      case PlayLangPackage.ESCOLHAS__ESCOLHAS_ELSE:
        return escolhasELSE != null && !escolhasELSE.isEmpty();
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
    result.append(" (hasIf: ");
    result.append(hasIf);
    result.append(", hasElse: ");
    result.append(hasElse);
    result.append(')');
    return result.toString();
  }

} //EscolhasImpl
