/**
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.playLang.impl;

import br.ufscar.dc.compiladores.playLang.PlayLangPackage;
import br.ufscar.dc.compiladores.playLang.PlaySound;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play Sound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.playLang.impl.PlaySoundImpl#getFile_path <em>File path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaySoundImpl extends MinimalEObjectImpl.Container implements PlaySound
{
  /**
   * The default value of the '{@link #getFile_path() <em>File path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_path()
   * @generated
   * @ordered
   */
  protected static final String FILE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFile_path() <em>File path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_path()
   * @generated
   * @ordered
   */
  protected String file_path = FILE_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlaySoundImpl()
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
    return PlayLangPackage.Literals.PLAY_SOUND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFile_path()
  {
    return file_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile_path(String newFile_path)
  {
    String oldFile_path = file_path;
    file_path = newFile_path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayLangPackage.PLAY_SOUND__FILE_PATH, oldFile_path, file_path));
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
      case PlayLangPackage.PLAY_SOUND__FILE_PATH:
        return getFile_path();
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
      case PlayLangPackage.PLAY_SOUND__FILE_PATH:
        setFile_path((String)newValue);
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
      case PlayLangPackage.PLAY_SOUND__FILE_PATH:
        setFile_path(FILE_PATH_EDEFAULT);
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
      case PlayLangPackage.PLAY_SOUND__FILE_PATH:
        return FILE_PATH_EDEFAULT == null ? file_path != null : !FILE_PATH_EDEFAULT.equals(file_path);
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
    result.append(" (file_path: ");
    result.append(file_path);
    result.append(')');
    return result.toString();
  }

} //PlaySoundImpl