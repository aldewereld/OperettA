/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.AtomicAction#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getAtomicAction()
 * @model
 * @generated
 */
public interface AtomicAction extends ActionDescription {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getAtomicAction_Statement()
	 * @model required="true"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.AtomicAction#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

} // AtomicAction
