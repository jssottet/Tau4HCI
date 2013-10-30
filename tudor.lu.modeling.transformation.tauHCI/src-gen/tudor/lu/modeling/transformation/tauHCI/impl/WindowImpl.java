/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tudor.lu.modeling.transformation.tauHCI.Concept;
import tudor.lu.modeling.transformation.tauHCI.TauHCIPackage;
import tudor.lu.modeling.transformation.tauHCI.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.WindowImpl#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends UIElementImpl implements Window
{
  /**
   * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainedElements()
   * @generated
   * @ordered
   */
  protected EList<Concept> containedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WindowImpl()
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
    return TauHCIPackage.Literals.WINDOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Concept> getContainedElements()
  {
    if (containedElements == null)
    {
      containedElements = new EObjectContainmentEList<Concept>(Concept.class, this, TauHCIPackage.WINDOW__CONTAINED_ELEMENTS);
    }
    return containedElements;
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
      case TauHCIPackage.WINDOW__CONTAINED_ELEMENTS:
        return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
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
      case TauHCIPackage.WINDOW__CONTAINED_ELEMENTS:
        return getContainedElements();
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
      case TauHCIPackage.WINDOW__CONTAINED_ELEMENTS:
        getContainedElements().clear();
        getContainedElements().addAll((Collection<? extends Concept>)newValue);
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
      case TauHCIPackage.WINDOW__CONTAINED_ELEMENTS:
        getContainedElements().clear();
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
      case TauHCIPackage.WINDOW__CONTAINED_ELEMENTS:
        return containedElements != null && !containedElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WindowImpl
