/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Sequence#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends ActionDescription {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.ActionDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getSequence_Actions()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<ActionDescription> getActions();

} // Sequence
