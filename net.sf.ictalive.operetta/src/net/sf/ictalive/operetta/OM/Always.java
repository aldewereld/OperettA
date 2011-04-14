/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Always</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Always#getPathFormula <em>Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getAlways()
 * @model
 * @generated
 */
public interface Always extends PathFormula {
	/**
	 * Returns the value of the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Formula</em>' reference.
	 * @see #setPathFormula(PathFormula)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getAlways_PathFormula()
	 * @model required="true"
	 * @generated
	 */
	PathFormula getPathFormula();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Always#getPathFormula <em>Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Formula</em>' reference.
	 * @see #getPathFormula()
	 * @generated
	 */
	void setPathFormula(PathFormula value);
	
	// @added
	public String write();

} // Always
