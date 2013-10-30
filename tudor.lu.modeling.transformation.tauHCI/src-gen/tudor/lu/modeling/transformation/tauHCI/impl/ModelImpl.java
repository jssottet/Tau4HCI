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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tudor.lu.modeling.transformation.tauHCI.Domain;
import tudor.lu.modeling.transformation.tauHCI.Model;
import tudor.lu.modeling.transformation.tauHCI.Rule;
import tudor.lu.modeling.transformation.tauHCI.Specific;
import tudor.lu.modeling.transformation.tauHCI.TauHCIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl#getSpecificRules <em>Specific Rules</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl#getDomainRules <em>Domain Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The cached value of the '{@link #getSpecificRules() <em>Specific Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecificRules()
   * @generated
   * @ordered
   */
  protected EList<Specific> specificRules;

  /**
   * The cached value of the '{@link #getDomainRules() <em>Domain Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainRules()
   * @generated
   * @ordered
   */
  protected EList<Domain> domainRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return TauHCIPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, TauHCIPackage.MODEL__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Specific> getSpecificRules()
  {
    if (specificRules == null)
    {
      specificRules = new EObjectContainmentEList<Specific>(Specific.class, this, TauHCIPackage.MODEL__SPECIFIC_RULES);
    }
    return specificRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Domain> getDomainRules()
  {
    if (domainRules == null)
    {
      domainRules = new EObjectContainmentEList<Domain>(Domain.class, this, TauHCIPackage.MODEL__DOMAIN_RULES);
    }
    return domainRules;
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
      case TauHCIPackage.MODEL__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case TauHCIPackage.MODEL__SPECIFIC_RULES:
        return ((InternalEList<?>)getSpecificRules()).basicRemove(otherEnd, msgs);
      case TauHCIPackage.MODEL__DOMAIN_RULES:
        return ((InternalEList<?>)getDomainRules()).basicRemove(otherEnd, msgs);
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
      case TauHCIPackage.MODEL__RULES:
        return getRules();
      case TauHCIPackage.MODEL__SPECIFIC_RULES:
        return getSpecificRules();
      case TauHCIPackage.MODEL__DOMAIN_RULES:
        return getDomainRules();
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
      case TauHCIPackage.MODEL__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case TauHCIPackage.MODEL__SPECIFIC_RULES:
        getSpecificRules().clear();
        getSpecificRules().addAll((Collection<? extends Specific>)newValue);
        return;
      case TauHCIPackage.MODEL__DOMAIN_RULES:
        getDomainRules().clear();
        getDomainRules().addAll((Collection<? extends Domain>)newValue);
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
      case TauHCIPackage.MODEL__RULES:
        getRules().clear();
        return;
      case TauHCIPackage.MODEL__SPECIFIC_RULES:
        getSpecificRules().clear();
        return;
      case TauHCIPackage.MODEL__DOMAIN_RULES:
        getDomainRules().clear();
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
      case TauHCIPackage.MODEL__RULES:
        return rules != null && !rules.isEmpty();
      case TauHCIPackage.MODEL__SPECIFIC_RULES:
        return specificRules != null && !specificRules.isEmpty();
      case TauHCIPackage.MODEL__DOMAIN_RULES:
        return domainRules != null && !domainRules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
