/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Actions#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getActions()
 * @model
 * @generated
 */
public interface Actions extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.ActionDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getActions_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionDescription> getActions();

} // Actions
