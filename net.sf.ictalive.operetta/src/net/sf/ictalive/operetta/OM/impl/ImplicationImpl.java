/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.Implication;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.StateFormula;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ImplicationImpl#getAntecedentStateFormula <em>Antecedent State Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ImplicationImpl#getConsequentStateFormula <em>Consequent State Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicationImpl extends StateFormulaImpl implements Implication {
	/**
	 * The cached value of the '{@link #getAntecedentStateFormula() <em>Antecedent State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentStateFormula()
	 * @generated
	 * @ordered
	 */
	protected StateFormula antecedentStateFormula;

	/**
	 * The cached value of the '{@link #getConsequentStateFormula() <em>Consequent State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequentStateFormula()
	 * @generated
	 * @ordered
	 */
	protected StateFormula consequentStateFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula getAntecedentStateFormula() {
		if (antecedentStateFormula != null && antecedentStateFormula.eIsProxy()) {
			InternalEObject oldAntecedentStateFormula = (InternalEObject)antecedentStateFormula;
			antecedentStateFormula = (StateFormula)eResolveProxy(oldAntecedentStateFormula);
			if (antecedentStateFormula != oldAntecedentStateFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.IMPLICATION__ANTECEDENT_STATE_FORMULA, oldAntecedentStateFormula, antecedentStateFormula));
			}
		}
		return antecedentStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula basicGetAntecedentStateFormula() {
		return antecedentStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAntecedentStateFormula(StateFormula newAntecedentStateFormula) {
		StateFormula oldAntecedentStateFormula = antecedentStateFormula;
		if (newAntecedentStateFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		antecedentStateFormula = newAntecedentStateFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.IMPLICATION__ANTECEDENT_STATE_FORMULA, oldAntecedentStateFormula, antecedentStateFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula getConsequentStateFormula() {
		if (consequentStateFormula != null && consequentStateFormula.eIsProxy()) {
			InternalEObject oldConsequentStateFormula = (InternalEObject)consequentStateFormula;
			consequentStateFormula = (StateFormula)eResolveProxy(oldConsequentStateFormula);
			if (consequentStateFormula != oldConsequentStateFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.IMPLICATION__CONSEQUENT_STATE_FORMULA, oldConsequentStateFormula, consequentStateFormula));
			}
		}
		return consequentStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula basicGetConsequentStateFormula() {
		return consequentStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setConsequentStateFormula(StateFormula newConsequentStateFormula) {
		StateFormula oldConsequentStateFormula = consequentStateFormula;
		if (newConsequentStateFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		consequentStateFormula = newConsequentStateFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.IMPLICATION__CONSEQUENT_STATE_FORMULA, oldConsequentStateFormula, consequentStateFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.IMPLICATION__ANTECEDENT_STATE_FORMULA:
				if (resolve) return getAntecedentStateFormula();
				return basicGetAntecedentStateFormula();
			case OMPackage.IMPLICATION__CONSEQUENT_STATE_FORMULA:
				if (resolve) return getConsequentStateFormula();
				return basicGetConsequentStateFormula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMPackage.IMPLICATION__ANTECEDENT_STATE_FORMULA:
				setAntecedentStateFormula((StateFormula)newValue);
				return;
			case OMPackage.IMPLICATION__CONSEQUENT_STATE_FORMULA:
				setConsequentStateFormula((StateFormula)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMPackage.IMPLICATION__ANTECEDENT_STATE_FORMULA:
				setAntecedentStateFormula((StateFormula)null);
				return;
			case OMPackage.IMPLICATION__CONSEQUENT_STATE_FORMULA:
				setConsequentStateFormula((StateFormula)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMPackage.IMPLICATION__ANTECEDENT_STATE_FORMULA:
				return antecedentStateFormula != null;
			case OMPackage.IMPLICATION__CONSEQUENT_STATE_FORMULA:
				return consequentStateFormula != null;
		}
		return super.eIsSet(featureID);
	}
	
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (antecedentStateFormula != null) {
			result.add(antecedentStateFormula);
			result.addAll(antecedentStateFormula.getSubFormulas());
		}
		if (consequentStateFormula != null) {
			result.add(consequentStateFormula);
			result.addAll(consequentStateFormula.getSubFormulas());
		}
		
		return result;
	}
	
	/**
	 * Implementation of Pretty interface, for pretty printing
	 */
	public int getPrecedence() {
		return 22;
	}
	
	public String prettyPrint() {
		return PrettyPrint.prettyPrintBinary(this, " \u2192 ", antecedentStateFormula, consequentStateFormula);
	}
	
} //ImplicationImpl
