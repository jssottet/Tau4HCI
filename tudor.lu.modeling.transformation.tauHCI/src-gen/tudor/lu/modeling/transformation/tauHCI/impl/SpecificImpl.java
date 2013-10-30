/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI.impl;

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

import tudor.lu.modeling.transformation.tauHCI.Specific;
import tudor.lu.modeling.transformation.tauHCI.TauHCIPackage;
import tudor.lu.modeling.transformation.tauHCI.UIElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.SpecificImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.SpecificImpl#getUielement <em>Uielement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificImpl extends MinimalEObjectImpl.Container implements Specific
{
  /**
   * The default value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskName()
   * @generated
   * @ordered
   */
  protected static final String TASK_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskName()
   * @generated
   * @ordered
   */
  protected String taskName = TASK_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUielement() <em>Uielement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUielement()
   * @generated
   * @ordered
   */
  protected EList<UIElement> uielement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecificImpl()
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
    return TauHCIPackage.Literals.SPECIFIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTaskName()
  {
    return taskName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskName(String newTaskName)
  {
    String oldTaskName = taskName;
    taskName = newTaskName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.SPECIFIC__TASK_NAME, oldTaskName, taskName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UIElement> getUielement()
  {
    if (uielement == null)
    {
      uielement = new EObjectContainmentEList<UIElement>(UIElement.class, this, TauHCIPackage.SPECIFIC__UIELEMENT);
    }
    return uielement;
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
      case TauHCIPackage.SPECIFIC__UIELEMENT:
        return ((InternalEList<?>)getUielement()).basicRemove(otherEnd, msgs);
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
      case TauHCIPackage.SPECIFIC__TASK_NAME:
        return getTaskName();
      case TauHCIPackage.SPECIFIC__UIELEMENT:
        return getUielement();
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
      case TauHCIPackage.SPECIFIC__TASK_NAME:
        setTaskName((String)newValue);
        return;
      case TauHCIPackage.SPECIFIC__UIELEMENT:
        getUielement().clear();
        getUielement().addAll((Collection<? extends UIElement>)newValue);
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
      case TauHCIPackage.SPECIFIC__TASK_NAME:
        setTaskName(TASK_NAME_EDEFAULT);
        return;
      case TauHCIPackage.SPECIFIC__UIELEMENT:
        getUielement().clear();
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
      case TauHCIPackage.SPECIFIC__TASK_NAME:
        return TASK_NAME_EDEFAULT == null ? taskName != null : !TASK_NAME_EDEFAULT.equals(taskName);
      case TauHCIPackage.SPECIFIC__UIELEMENT:
        return uielement != null && !uielement.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (taskName: ");
    result.append(taskName);
    result.append(')');
    return result.toString();
  }

} //SpecificImpl
