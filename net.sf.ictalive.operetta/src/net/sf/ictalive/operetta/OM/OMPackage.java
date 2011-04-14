/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.operetta.OM.OMFactory
 * @model kind="package"
 * @generated
 */
public interface OMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/operetta/OM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.sf.ictalive.operetta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMPackage eINSTANCE = net.sf.ictalive.operetta.OM.impl.OMPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.OperAModelImpl <em>Oper AModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.OperAModelImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getOperAModel()
	 * @generated
	 */
	int OPER_AMODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Om</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL__OM = 1;

	/**
	 * The number of structural features of the '<em>Oper AModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPER_AMODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.OMImpl <em>OM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.OMImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getOM()
	 * @generated
	 */
	int OM = 1;

	/**
	 * The feature id for the '<em><b>Ss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__SS = 0;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__IS = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__NS = 2;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__CS = 3;

	/**
	 * The number of structural features of the '<em>OM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.SSImpl <em>SS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.SSImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSS()
	 * @generated
	 */
	int SS = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SS__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SS__OBJECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SS__DEPENDENCIES = 2;

	/**
	 * The number of structural features of the '<em>SS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ISImpl <em>IS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ISImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getIS()
	 * @generated
	 */
	int IS = 3;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__SCENES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__ARCS = 2;

	/**
	 * The number of structural features of the '<em>IS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.NSImpl <em>NS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.NSImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNS()
	 * @generated
	 */
	int NS = 4;

	/**
	 * The feature id for the '<em><b>Norms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS__NORMS = 0;

	/**
	 * The feature id for the '<em><b>Transition Norms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS__TRANSITION_NORMS = 1;

	/**
	 * The number of structural features of the '<em>NS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.CSImpl <em>CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.CSImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getCS()
	 * @generated
	 */
	int CS = 5;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__FORMULAS = 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__ONTOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__TERMS = 2;

	/**
	 * The feature id for the '<em><b>Counts As Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__COUNTS_AS_RULES = 3;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__CONTEXTS = 4;

	/**
	 * The feature id for the '<em><b>Action Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__ACTION_LIBRARY = 5;

	/**
	 * The number of structural features of the '<em>CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.RoleImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concept Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONCEPT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OBJECTIVES = 2;

	/**
	 * The feature id for the '<em><b>Norms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NORMS = 3;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RIGHTS = 4;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Dependant On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEPENDANT_ON = 6;

	/**
	 * The feature id for the '<em><b>Dependee In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEPENDEE_IN = 7;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ObjectiveImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concept Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__CONCEPT_NAME = 1;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__STATE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Sub Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__SUB_OBJECTIVES = 3;

	/**
	 * The feature id for the '<em><b>Parent Objective</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__PARENT_OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Used By Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__USED_BY_ROLE = 5;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.DependencyImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Object Of Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OBJECT_OF_DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.NormImpl <em>Norm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.NormImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNorm()
	 * @generated
	 */
	int NORM = 9;

	/**
	 * The feature id for the '<em><b>Norm ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__NORM_ID = 0;

	/**
	 * The feature id for the '<em><b>Activation Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__ACTIVATION_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Expiration Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__EXPIRATION_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Maintenance Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__MAINTENANCE_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__DEADLINE = 4;

	/**
	 * The feature id for the '<em><b>Deontics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__DEONTICS = 5;

	/**
	 * The number of structural features of the '<em>Norm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.DeonticStatementImpl <em>Deontic Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.DeonticStatementImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDeonticStatement()
	 * @generated
	 */
	int DEONTIC_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEONTIC_STATEMENT__MODALITY = 0;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEONTIC_STATEMENT__WHAT = 1;

	/**
	 * The number of structural features of the '<em>Deontic Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEONTIC_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.IndividualDeonticStatementImpl <em>Individual Deontic Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.IndividualDeonticStatementImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getIndividualDeonticStatement()
	 * @generated
	 */
	int INDIVIDUAL_DEONTIC_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_DEONTIC_STATEMENT__MODALITY = DEONTIC_STATEMENT__MODALITY;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_DEONTIC_STATEMENT__WHAT = DEONTIC_STATEMENT__WHAT;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_DEONTIC_STATEMENT__ACTOR = DEONTIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual Deontic Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_DEONTIC_STATEMENT_FEATURE_COUNT = DEONTIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.RoleDeonticStatementImpl <em>Role Deontic Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.RoleDeonticStatementImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRoleDeonticStatement()
	 * @generated
	 */
	int ROLE_DEONTIC_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEONTIC_STATEMENT__MODALITY = DEONTIC_STATEMENT__MODALITY;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEONTIC_STATEMENT__WHAT = DEONTIC_STATEMENT__WHAT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEONTIC_STATEMENT__ROLE = DEONTIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Deontic Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEONTIC_STATEMENT_FEATURE_COUNT = DEONTIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.RightImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__EXPR = 1;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.HierarchyDependencyImpl <em>Hierarchy Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.HierarchyDependencyImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getHierarchyDependency()
	 * @generated
	 */
	int HIERARCHY_DEPENDENCY = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Object Of Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__OBJECT_OF_DEPENDENCY = DEPENDENCY__OBJECT_OF_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Dependant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__DEPENDANT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY__DEPENDEE = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hierarchy Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.MarketDependencyImpl <em>Market Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.MarketDependencyImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getMarketDependency()
	 * @generated
	 */
	int MARKET_DEPENDENCY = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DEPENDENCY__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DEPENDENCY__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Object Of Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DEPENDENCY__OBJECT_OF_DEPENDENCY = DEPENDENCY__OBJECT_OF_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Dependant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DEPENDENCY__DEPENDANT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DEPENDENCY__DEPENDEE = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Market Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.NetworkDependencyImpl <em>Network Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.NetworkDependencyImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNetworkDependency()
	 * @generated
	 */
	int NETWORK_DEPENDENCY = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPENDENCY__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPENDENCY__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Object Of Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPENDENCY__OBJECT_OF_DEPENDENCY = DEPENDENCY__OBJECT_OF_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Dependant1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPENDENCY__DEPENDANT1 = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependant2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPENDENCY__DEPENDANT2 = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.SceneImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 17;

	/**
	 * The feature id for the '<em><b>Scene ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__SCENE_ID = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Interaction Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__INTERACTION_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.TransitionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 18;

	/**
	 * The feature id for the '<em><b>Transition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Transition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Norms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NORMS = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ArcImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 19;

	/**
	 * The feature id for the '<em><b>Arc ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ARC_ID = 0;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ACCESSIBLE = 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.SceneToTransitionArcImpl <em>Scene To Transition Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.SceneToTransitionArcImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSceneToTransitionArc()
	 * @generated
	 */
	int SCENE_TO_TRANSITION_ARC = 20;

	/**
	 * The feature id for the '<em><b>Arc ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TO_TRANSITION_ARC__ARC_ID = ARC__ARC_ID;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TO_TRANSITION_ARC__ACCESSIBLE = ARC__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TO_TRANSITION_ARC__FROM = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TO_TRANSITION_ARC__TO = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scene To Transition Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TO_TRANSITION_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.TransitionToSceneArcImpl <em>Transition To Scene Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.TransitionToSceneArcImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransitionToSceneArc()
	 * @generated
	 */
	int TRANSITION_TO_SCENE_ARC = 21;

	/**
	 * The feature id for the '<em><b>Arc ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_SCENE_ARC__ARC_ID = ARC__ARC_ID;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_SCENE_ARC__ACCESSIBLE = ARC__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_SCENE_ARC__FROM = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_SCENE_ARC__TO = ARC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_SCENE_ARC__TYPE = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition To Scene Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_SCENE_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PlayerImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 22;

	/**
	 * The feature id for the '<em><b>Player ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_ID = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.LandmarkPatternImpl <em>Landmark Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.LandmarkPatternImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getLandmarkPattern()
	 * @generated
	 */
	int LANDMARK_PATTERN = 23;

	/**
	 * The feature id for the '<em><b>Landmarks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_PATTERN__LANDMARKS = 0;

	/**
	 * The feature id for the '<em><b>Landmark Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_PATTERN__LANDMARK_ORDER = 1;

	/**
	 * The number of structural features of the '<em>Landmark Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.LandmarkImpl <em>Landmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.LandmarkImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getLandmark()
	 * @generated
	 */
	int LANDMARK = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK__NAME = 0;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK__STATE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Entails</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK__ENTAILS = 2;

	/**
	 * The feature id for the '<em><b>Is Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK__IS_RESULT = 3;

	/**
	 * The number of structural features of the '<em>Landmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl <em>Transition Norm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.TransitionNormImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransitionNorm()
	 * @generated
	 */
	int TRANSITION_NORM = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__ID = 0;

	/**
	 * The feature id for the '<em><b>From Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__FROM_SCENE = 1;

	/**
	 * The feature id for the '<em><b>From Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__FROM_PLAYERS = 2;

	/**
	 * The feature id for the '<em><b>From Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__FROM_RESULTS = 3;

	/**
	 * The feature id for the '<em><b>To Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__TO_SCENE = 4;

	/**
	 * The feature id for the '<em><b>To Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__TO_PLAYER = 5;

	/**
	 * The feature id for the '<em><b>Attached To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM__ATTACHED_TO = 6;

	/**
	 * The number of structural features of the '<em>Transition Norm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NORM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PartialOrderImpl <em>Partial Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PartialOrderImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPartialOrder()
	 * @generated
	 */
	int PARTIAL_ORDER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ORDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ORDER__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ORDER__TO = 2;

	/**
	 * The number of structural features of the '<em>Partial Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_ORDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PartialStateDescriptionImpl <em>Partial State Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PartialStateDescriptionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPartialStateDescription()
	 * @generated
	 */
	int PARTIAL_STATE_DESCRIPTION = 27;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STATE_DESCRIPTION__ID = 0;

	/**
	 * The number of structural features of the '<em>Partial State Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STATE_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PathFormulaImpl <em>Path Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PathFormulaImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathFormula()
	 * @generated
	 */
	int PATH_FORMULA = 28;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FORMULA__ID = PARTIAL_STATE_DESCRIPTION__ID;

	/**
	 * The number of structural features of the '<em>Path Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FORMULA_FEATURE_COUNT = PARTIAL_STATE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.StateFormulaImpl <em>State Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.StateFormulaImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getStateFormula()
	 * @generated
	 */
	int STATE_FORMULA = 29;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FORMULA__ID = PATH_FORMULA__ID;

	/**
	 * The number of structural features of the '<em>State Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FORMULA_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.AtomImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 30;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__PREDICATE = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__CONCEPT = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ARGUMENTS = STATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.TermImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 31;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ConstantImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__CONCEPT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.VariableImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.FunctionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ARGUMENTS = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.NegationImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 35;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ConjunctionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 36;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Left State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LEFT_STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__RIGHT_STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.DisjunctionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 37;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Left State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LEFT_STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__RIGHT_STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ImplicationImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 38;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Antecedent State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ANTECEDENT_STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent State Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__CONSEQUENT_STATE_FORMULA = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ForAllPathsImpl <em>For All Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ForAllPathsImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getForAllPaths()
	 * @generated
	 */
	int FOR_ALL_PATHS = 39;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_PATHS__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_PATHS__PATH_FORMULA = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For All Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_PATHS_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ExistsPathImpl <em>Exists Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ExistsPathImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getExistsPath()
	 * @generated
	 */
	int EXISTS_PATH = 40;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_PATH__ID = STATE_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_PATH__PATH_FORMULA = STATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exists Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_PATH_FEATURE_COUNT = STATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PathNegationImpl <em>Path Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PathNegationImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathNegation()
	 * @generated
	 */
	int PATH_NEGATION = 41;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NEGATION__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NEGATION__PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NEGATION_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PathConjunctionImpl <em>Path Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PathConjunctionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathConjunction()
	 * @generated
	 */
	int PATH_CONJUNCTION = 42;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONJUNCTION__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Left Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONJUNCTION__LEFT_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONJUNCTION__RIGHT_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONJUNCTION_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PathDisjunctionImpl <em>Path Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PathDisjunctionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathDisjunction()
	 * @generated
	 */
	int PATH_DISJUNCTION = 43;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DISJUNCTION__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Left Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DISJUNCTION__LEFT_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DISJUNCTION__RIGHT_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DISJUNCTION_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.PathImplicationImpl <em>Path Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.PathImplicationImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathImplication()
	 * @generated
	 */
	int PATH_IMPLICATION = 44;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_IMPLICATION__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Antecedent Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_IMPLICATION_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.NextImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 45;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.SometimeImpl <em>Sometime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.SometimeImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSometime()
	 * @generated
	 */
	int SOMETIME = 46;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOMETIME__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOMETIME__PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sometime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOMETIME_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.AlwaysImpl <em>Always</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.AlwaysImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getAlways()
	 * @generated
	 */
	int ALWAYS = 47;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS__PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Always</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.UntilImpl <em>Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.UntilImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getUntil()
	 * @generated
	 */
	int UNTIL = 48;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__ID = PATH_FORMULA__ID;

	/**
	 * The feature id for the '<em><b>From Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__FROM_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until Path Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__UNTIL_PATH_FORMULA = PATH_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.OntologyImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 49;

	/**
	 * The feature id for the '<em><b>Ontology ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ONTOLOGY_ID = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ConceptImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 50;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__URI = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.CountsAsImpl <em>Counts As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.CountsAsImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getCountsAs()
	 * @generated
	 */
	int COUNTS_AS = 51;

	/**
	 * The feature id for the '<em><b>Concrete Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTS_AS__CONCRETE_FACT = 0;

	/**
	 * The feature id for the '<em><b>Abstract Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTS_AS__ABSTRACT_FACT = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTS_AS__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Counts As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTS_AS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.CountsAsConcreteFactImpl <em>Counts As Concrete Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.CountsAsConcreteFactImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getCountsAsConcreteFact()
	 * @generated
	 */
	int COUNTS_AS_CONCRETE_FACT = 52;

	/**
	 * The number of structural features of the '<em>Counts As Concrete Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTS_AS_CONCRETE_FACT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ActionsImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 53;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ActionDescriptionImpl <em>Action Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ActionDescriptionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getActionDescription()
	 * @generated
	 */
	int ACTION_DESCRIPTION = 54;

	/**
	 * The number of structural features of the '<em>Action Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION_FEATURE_COUNT = COUNTS_AS_CONCRETE_FACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.AtomicActionImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getAtomicAction()
	 * @generated
	 */
	int ATOMIC_ACTION = 55;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__STATEMENT = ACTION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_FEATURE_COUNT = ACTION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.SequenceImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 56;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIONS = ACTION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ACTION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ConditionalImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 57;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = ACTION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ACTION = ACTION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = ACTION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.impl.ContextImpl
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.DeonticModality <em>Deontic Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.DeonticModality
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDeonticModality()
	 * @generated
	 */
	int DEONTIC_MODALITY = 59;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.RoleType
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 60;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.SceneType <em>Scene Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.SceneType
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSceneType()
	 * @generated
	 */
	int SCENE_TYPE = 61;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.TransitionType
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 62;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.TTSType <em>TTS Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.TTSType
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTTSType()
	 * @generated
	 */
	int TTS_TYPE = 63;


	/**
	 * The meta object id for the '{@link net.sf.ictalive.operetta.OM.ConceptType <em>Concept Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.operetta.OM.ConceptType
	 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConceptType()
	 * @generated
	 */
	int CONCEPT_TYPE = 64;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.OperAModel <em>Oper AModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oper AModel</em>'.
	 * @see net.sf.ictalive.operetta.OM.OperAModel
	 * @generated
	 */
	EClass getOperAModel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.OperAModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.OperAModel#getName()
	 * @see #getOperAModel()
	 * @generated
	 */
	EAttribute getOperAModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.OperAModel#getOm <em>Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Om</em>'.
	 * @see net.sf.ictalive.operetta.OM.OperAModel#getOm()
	 * @see #getOperAModel()
	 * @generated
	 */
	EReference getOperAModel_Om();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.OM <em>OM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OM</em>'.
	 * @see net.sf.ictalive.operetta.OM.OM
	 * @generated
	 */
	EClass getOM();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.OM#getSs <em>Ss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ss</em>'.
	 * @see net.sf.ictalive.operetta.OM.OM#getSs()
	 * @see #getOM()
	 * @generated
	 */
	EReference getOM_Ss();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.OM#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.sf.ictalive.operetta.OM.OM#getIs()
	 * @see #getOM()
	 * @generated
	 */
	EReference getOM_Is();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.OM#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ns</em>'.
	 * @see net.sf.ictalive.operetta.OM.OM#getNs()
	 * @see #getOM()
	 * @generated
	 */
	EReference getOM_Ns();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.OM#getCs <em>Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cs</em>'.
	 * @see net.sf.ictalive.operetta.OM.OM#getCs()
	 * @see #getOM()
	 * @generated
	 */
	EReference getOM_Cs();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.SS <em>SS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SS</em>'.
	 * @see net.sf.ictalive.operetta.OM.SS
	 * @generated
	 */
	EClass getSS();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.SS#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see net.sf.ictalive.operetta.OM.SS#getRoles()
	 * @see #getSS()
	 * @generated
	 */
	EReference getSS_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.SS#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see net.sf.ictalive.operetta.OM.SS#getObjectives()
	 * @see #getSS()
	 * @generated
	 */
	EReference getSS_Objectives();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.SS#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see net.sf.ictalive.operetta.OM.SS#getDependencies()
	 * @see #getSS()
	 * @generated
	 */
	EReference getSS_Dependencies();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.IS <em>IS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS</em>'.
	 * @see net.sf.ictalive.operetta.OM.IS
	 * @generated
	 */
	EClass getIS();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.IS#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see net.sf.ictalive.operetta.OM.IS#getScenes()
	 * @see #getIS()
	 * @generated
	 */
	EReference getIS_Scenes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.IS#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see net.sf.ictalive.operetta.OM.IS#getTransitions()
	 * @see #getIS()
	 * @generated
	 */
	EReference getIS_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.IS#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see net.sf.ictalive.operetta.OM.IS#getArcs()
	 * @see #getIS()
	 * @generated
	 */
	EReference getIS_Arcs();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.NS <em>NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NS</em>'.
	 * @see net.sf.ictalive.operetta.OM.NS
	 * @generated
	 */
	EClass getNS();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.NS#getNorms <em>Norms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Norms</em>'.
	 * @see net.sf.ictalive.operetta.OM.NS#getNorms()
	 * @see #getNS()
	 * @generated
	 */
	EReference getNS_Norms();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.NS#getTransitionNorms <em>Transition Norms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition Norms</em>'.
	 * @see net.sf.ictalive.operetta.OM.NS#getTransitionNorms()
	 * @see #getNS()
	 * @generated
	 */
	EReference getNS_TransitionNorms();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.CS <em>CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS
	 * @generated
	 */
	EClass getCS();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.CS#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulas</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS#getFormulas()
	 * @see #getCS()
	 * @generated
	 */
	EReference getCS_Formulas();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.CS#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontology</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS#getOntology()
	 * @see #getCS()
	 * @generated
	 */
	EReference getCS_Ontology();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.CS#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS#getTerms()
	 * @see #getCS()
	 * @generated
	 */
	EReference getCS_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.CS#getCountsAsRules <em>Counts As Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counts As Rules</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS#getCountsAsRules()
	 * @see #getCS()
	 * @generated
	 */
	EReference getCS_CountsAsRules();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.CS#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS#getContexts()
	 * @see #getCS()
	 * @generated
	 */
	EReference getCS_Contexts();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.CS#getActionLibrary <em>Action Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Library</em>'.
	 * @see net.sf.ictalive.operetta.OM.CS#getActionLibrary()
	 * @see #getCS()
	 * @generated
	 */
	EReference getCS_ActionLibrary();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Role#getConceptName <em>Concept Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getConceptName()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ConceptName();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Role#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objectives</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getObjectives()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Objectives();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Role#getNorms <em>Norms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Norms</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getNorms()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Norms();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.Role#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getRights()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Rights();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Role#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getRoleType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_RoleType();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Role#getDependantOn <em>Dependant On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependant On</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getDependantOn()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DependantOn();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Role#getDependeeIn <em>Dependee In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependee In</em>'.
	 * @see net.sf.ictalive.operetta.OM.Role#getDependeeIn()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DependeeIn();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Objective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective#getName()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Objective#getConceptName <em>Concept Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective#getConceptName()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_ConceptName();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Objective#getStateDescription <em>State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Description</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective#getStateDescription()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_StateDescription();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Objective#getSubObjectives <em>Sub Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Objectives</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective#getSubObjectives()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_SubObjectives();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Objective#getParentObjective <em>Parent Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Objective</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective#getParentObjective()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_ParentObjective();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Objective#getUsedByRole <em>Used By Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By Role</em>'.
	 * @see net.sf.ictalive.operetta.OM.Objective#getUsedByRole()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_UsedByRole();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see net.sf.ictalive.operetta.OM.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Dependency#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Dependency#getID()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Dependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Dependency#getName()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Dependency#getObjectOfDependency <em>Object Of Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Of Dependency</em>'.
	 * @see net.sf.ictalive.operetta.OM.Dependency#getObjectOfDependency()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_ObjectOfDependency();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Norm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm
	 * @generated
	 */
	EClass getNorm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Norm#getNormID <em>Norm ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Norm ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm#getNormID()
	 * @see #getNorm()
	 * @generated
	 */
	EAttribute getNorm_NormID();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Norm#getActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Condition</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm#getActivationCondition()
	 * @see #getNorm()
	 * @generated
	 */
	EReference getNorm_ActivationCondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Norm#getExpirationCondition <em>Expiration Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expiration Condition</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm#getExpirationCondition()
	 * @see #getNorm()
	 * @generated
	 */
	EReference getNorm_ExpirationCondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Norm#getMaintenanceCondition <em>Maintenance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maintenance Condition</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm#getMaintenanceCondition()
	 * @see #getNorm()
	 * @generated
	 */
	EReference getNorm_MaintenanceCondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Norm#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deadline</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm#getDeadline()
	 * @see #getNorm()
	 * @generated
	 */
	EReference getNorm_Deadline();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.Norm#getDeontics <em>Deontics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deontics</em>'.
	 * @see net.sf.ictalive.operetta.OM.Norm#getDeontics()
	 * @see #getNorm()
	 * @generated
	 */
	EReference getNorm_Deontics();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.DeonticStatement <em>Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deontic Statement</em>'.
	 * @see net.sf.ictalive.operetta.OM.DeonticStatement
	 * @generated
	 */
	EClass getDeonticStatement();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.DeonticStatement#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see net.sf.ictalive.operetta.OM.DeonticStatement#getModality()
	 * @see #getDeonticStatement()
	 * @generated
	 */
	EAttribute getDeonticStatement_Modality();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.DeonticStatement#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>What</em>'.
	 * @see net.sf.ictalive.operetta.OM.DeonticStatement#getWhat()
	 * @see #getDeonticStatement()
	 * @generated
	 */
	EReference getDeonticStatement_What();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.IndividualDeonticStatement <em>Individual Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Deontic Statement</em>'.
	 * @see net.sf.ictalive.operetta.OM.IndividualDeonticStatement
	 * @generated
	 */
	EClass getIndividualDeonticStatement();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.IndividualDeonticStatement#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see net.sf.ictalive.operetta.OM.IndividualDeonticStatement#getActor()
	 * @see #getIndividualDeonticStatement()
	 * @generated
	 */
	EReference getIndividualDeonticStatement_Actor();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.RoleDeonticStatement <em>Role Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Deontic Statement</em>'.
	 * @see net.sf.ictalive.operetta.OM.RoleDeonticStatement
	 * @generated
	 */
	EClass getRoleDeonticStatement();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.RoleDeonticStatement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see net.sf.ictalive.operetta.OM.RoleDeonticStatement#getRole()
	 * @see #getRoleDeonticStatement()
	 * @generated
	 */
	EReference getRoleDeonticStatement_Role();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see net.sf.ictalive.operetta.OM.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Right#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Right#getName()
	 * @see #getRight()
	 * @generated
	 */
	EAttribute getRight_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Right#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr</em>'.
	 * @see net.sf.ictalive.operetta.OM.Right#getExpr()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Expr();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.HierarchyDependency <em>Hierarchy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Dependency</em>'.
	 * @see net.sf.ictalive.operetta.OM.HierarchyDependency
	 * @generated
	 */
	EClass getHierarchyDependency();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.HierarchyDependency#getDependant <em>Dependant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant</em>'.
	 * @see net.sf.ictalive.operetta.OM.HierarchyDependency#getDependant()
	 * @see #getHierarchyDependency()
	 * @generated
	 */
	EReference getHierarchyDependency_Dependant();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.HierarchyDependency#getDependee <em>Dependee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependee</em>'.
	 * @see net.sf.ictalive.operetta.OM.HierarchyDependency#getDependee()
	 * @see #getHierarchyDependency()
	 * @generated
	 */
	EReference getHierarchyDependency_Dependee();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.MarketDependency <em>Market Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Dependency</em>'.
	 * @see net.sf.ictalive.operetta.OM.MarketDependency
	 * @generated
	 */
	EClass getMarketDependency();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.MarketDependency#getDependant <em>Dependant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant</em>'.
	 * @see net.sf.ictalive.operetta.OM.MarketDependency#getDependant()
	 * @see #getMarketDependency()
	 * @generated
	 */
	EReference getMarketDependency_Dependant();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.MarketDependency#getDependee <em>Dependee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependee</em>'.
	 * @see net.sf.ictalive.operetta.OM.MarketDependency#getDependee()
	 * @see #getMarketDependency()
	 * @generated
	 */
	EReference getMarketDependency_Dependee();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.NetworkDependency <em>Network Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Dependency</em>'.
	 * @see net.sf.ictalive.operetta.OM.NetworkDependency
	 * @generated
	 */
	EClass getNetworkDependency();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.NetworkDependency#getDependant1 <em>Dependant1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant1</em>'.
	 * @see net.sf.ictalive.operetta.OM.NetworkDependency#getDependant1()
	 * @see #getNetworkDependency()
	 * @generated
	 */
	EReference getNetworkDependency_Dependant1();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.NetworkDependency#getDependant2 <em>Dependant2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant2</em>'.
	 * @see net.sf.ictalive.operetta.OM.NetworkDependency#getDependant2()
	 * @see #getNetworkDependency()
	 * @generated
	 */
	EReference getNetworkDependency_Dependant2();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Scene#getSceneID <em>Scene ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene#getSceneID()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_SceneID();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.Scene#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene#getPlayers()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Players();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Scene#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene#getResults()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Results();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.operetta.OM.Scene#getInteractionPattern <em>Interaction Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Pattern</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene#getInteractionPattern()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_InteractionPattern();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Scene#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene#getDescription()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Scene#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.Scene#getType()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see net.sf.ictalive.operetta.OM.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Transition#getTransitionID <em>Transition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Transition#getTransitionID()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TransitionID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Transition#getTransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.Transition#getTransitionType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TransitionType();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Transition#getNorms <em>Norms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Norms</em>'.
	 * @see net.sf.ictalive.operetta.OM.Transition#getNorms()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Norms();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see net.sf.ictalive.operetta.OM.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Arc#getArcID <em>Arc ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arc ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Arc#getArcID()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_ArcID();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Arc#getAccessible <em>Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible</em>'.
	 * @see net.sf.ictalive.operetta.OM.Arc#getAccessible()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Accessible();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc <em>Scene To Transition Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene To Transition Arc</em>'.
	 * @see net.sf.ictalive.operetta.OM.SceneToTransitionArc
	 * @generated
	 */
	EClass getSceneToTransitionArc();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.sf.ictalive.operetta.OM.SceneToTransitionArc#getFrom()
	 * @see #getSceneToTransitionArc()
	 * @generated
	 */
	EReference getSceneToTransitionArc_From();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see net.sf.ictalive.operetta.OM.SceneToTransitionArc#getTo()
	 * @see #getSceneToTransitionArc()
	 * @generated
	 */
	EReference getSceneToTransitionArc_To();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc <em>Transition To Scene Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition To Scene Arc</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionToSceneArc
	 * @generated
	 */
	EClass getTransitionToSceneArc();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionToSceneArc#getFrom()
	 * @see #getTransitionToSceneArc()
	 * @generated
	 */
	EReference getTransitionToSceneArc_From();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionToSceneArc#getTo()
	 * @see #getTransitionToSceneArc()
	 * @generated
	 */
	EReference getTransitionToSceneArc_To();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionToSceneArc#getType()
	 * @see #getTransitionToSceneArc()
	 * @generated
	 */
	EAttribute getTransitionToSceneArc_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see net.sf.ictalive.operetta.OM.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Player#getPlayerID <em>Player ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Player#getPlayerID()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PlayerID();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Player#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see net.sf.ictalive.operetta.OM.Player#getRole()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Role();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.LandmarkPattern <em>Landmark Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landmark Pattern</em>'.
	 * @see net.sf.ictalive.operetta.OM.LandmarkPattern
	 * @generated
	 */
	EClass getLandmarkPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.LandmarkPattern#getLandmarks <em>Landmarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Landmarks</em>'.
	 * @see net.sf.ictalive.operetta.OM.LandmarkPattern#getLandmarks()
	 * @see #getLandmarkPattern()
	 * @generated
	 */
	EReference getLandmarkPattern_Landmarks();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.LandmarkPattern#getLandmarkOrder <em>Landmark Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Landmark Order</em>'.
	 * @see net.sf.ictalive.operetta.OM.LandmarkPattern#getLandmarkOrder()
	 * @see #getLandmarkPattern()
	 * @generated
	 */
	EReference getLandmarkPattern_LandmarkOrder();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Landmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landmark</em>'.
	 * @see net.sf.ictalive.operetta.OM.Landmark
	 * @generated
	 */
	EClass getLandmark();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Landmark#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Landmark#getName()
	 * @see #getLandmark()
	 * @generated
	 */
	EAttribute getLandmark_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Landmark#getStateDescription <em>State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Description</em>'.
	 * @see net.sf.ictalive.operetta.OM.Landmark#getStateDescription()
	 * @see #getLandmark()
	 * @generated
	 */
	EReference getLandmark_StateDescription();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Landmark#getEntails <em>Entails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entails</em>'.
	 * @see net.sf.ictalive.operetta.OM.Landmark#getEntails()
	 * @see #getLandmark()
	 * @generated
	 */
	EReference getLandmark_Entails();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Landmark#isIsResult <em>Is Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Result</em>'.
	 * @see net.sf.ictalive.operetta.OM.Landmark#isIsResult()
	 * @see #getLandmark()
	 * @generated
	 */
	EAttribute getLandmark_IsResult();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.TransitionNorm <em>Transition Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Norm</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm
	 * @generated
	 */
	EClass getTransitionNorm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getID()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EAttribute getTransitionNorm_ID();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromScene <em>From Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Scene</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getFromScene()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EReference getTransitionNorm_FromScene();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromPlayers <em>From Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Players</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getFromPlayers()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EReference getTransitionNorm_FromPlayers();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getFromResults <em>From Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Results</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getFromResults()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EReference getTransitionNorm_FromResults();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getToScene <em>To Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Scene</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getToScene()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EReference getTransitionNorm_ToScene();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getToPlayer <em>To Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Player</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getToPlayer()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EReference getTransitionNorm_ToPlayer();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.TransitionNorm#getAttachedTo <em>Attached To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached To</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm#getAttachedTo()
	 * @see #getTransitionNorm()
	 * @generated
	 */
	EReference getTransitionNorm_AttachedTo();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PartialOrder <em>Partial Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Order</em>'.
	 * @see net.sf.ictalive.operetta.OM.PartialOrder
	 * @generated
	 */
	EClass getPartialOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.PartialOrder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.PartialOrder#getName()
	 * @see #getPartialOrder()
	 * @generated
	 */
	EAttribute getPartialOrder_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PartialOrder#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.sf.ictalive.operetta.OM.PartialOrder#getFrom()
	 * @see #getPartialOrder()
	 * @generated
	 */
	EReference getPartialOrder_From();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PartialOrder#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see net.sf.ictalive.operetta.OM.PartialOrder#getTo()
	 * @see #getPartialOrder()
	 * @generated
	 */
	EReference getPartialOrder_To();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PartialStateDescription <em>Partial State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial State Description</em>'.
	 * @see net.sf.ictalive.operetta.OM.PartialStateDescription
	 * @generated
	 */
	EClass getPartialStateDescription();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.PartialStateDescription#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.PartialStateDescription#getID()
	 * @see #getPartialStateDescription()
	 * @generated
	 */
	EAttribute getPartialStateDescription_ID();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathFormula
	 * @generated
	 */
	EClass getPathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.StateFormula <em>State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.StateFormula
	 * @generated
	 */
	EClass getStateFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see net.sf.ictalive.operetta.OM.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Atom#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see net.sf.ictalive.operetta.OM.Atom#getPredicate()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_Predicate();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Atom#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see net.sf.ictalive.operetta.OM.Atom#getConcept()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Concept();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Atom#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see net.sf.ictalive.operetta.OM.Atom#getArguments()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Arguments();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see net.sf.ictalive.operetta.OM.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see net.sf.ictalive.operetta.OM.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Constant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Constant#getName()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Constant#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see net.sf.ictalive.operetta.OM.Constant#getConcept()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Concept();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see net.sf.ictalive.operetta.OM.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see net.sf.ictalive.operetta.OM.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Function#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see net.sf.ictalive.operetta.OM.Function#getArguments()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see net.sf.ictalive.operetta.OM.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Negation#getStateFormula <em>State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Negation#getStateFormula()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_StateFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see net.sf.ictalive.operetta.OM.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Conjunction#getLeftStateFormula <em>Left State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Conjunction#getLeftStateFormula()
	 * @see #getConjunction()
	 * @generated
	 */
	EReference getConjunction_LeftStateFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Conjunction#getRightStateFormula <em>Right State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Conjunction#getRightStateFormula()
	 * @see #getConjunction()
	 * @generated
	 */
	EReference getConjunction_RightStateFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see net.sf.ictalive.operetta.OM.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Disjunction#getLeftStateFormula <em>Left State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Disjunction#getLeftStateFormula()
	 * @see #getDisjunction()
	 * @generated
	 */
	EReference getDisjunction_LeftStateFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Disjunction#getRightStateFormula <em>Right State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Disjunction#getRightStateFormula()
	 * @see #getDisjunction()
	 * @generated
	 */
	EReference getDisjunction_RightStateFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see net.sf.ictalive.operetta.OM.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Implication#getAntecedentStateFormula <em>Antecedent State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Implication#getAntecedentStateFormula()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_AntecedentStateFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Implication#getConsequentStateFormula <em>Consequent State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent State Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Implication#getConsequentStateFormula()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_ConsequentStateFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.ForAllPaths <em>For All Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Paths</em>'.
	 * @see net.sf.ictalive.operetta.OM.ForAllPaths
	 * @generated
	 */
	EClass getForAllPaths();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.ForAllPaths#getPathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.ForAllPaths#getPathFormula()
	 * @see #getForAllPaths()
	 * @generated
	 */
	EReference getForAllPaths_PathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.ExistsPath <em>Exists Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists Path</em>'.
	 * @see net.sf.ictalive.operetta.OM.ExistsPath
	 * @generated
	 */
	EClass getExistsPath();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.ExistsPath#getPathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.ExistsPath#getPathFormula()
	 * @see #getExistsPath()
	 * @generated
	 */
	EReference getExistsPath_PathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PathNegation <em>Path Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Negation</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathNegation
	 * @generated
	 */
	EClass getPathNegation();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathNegation#getPathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathNegation#getPathFormula()
	 * @see #getPathNegation()
	 * @generated
	 */
	EReference getPathNegation_PathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PathConjunction <em>Path Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Conjunction</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathConjunction
	 * @generated
	 */
	EClass getPathConjunction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathConjunction#getLeftPathFormula <em>Left Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathConjunction#getLeftPathFormula()
	 * @see #getPathConjunction()
	 * @generated
	 */
	EReference getPathConjunction_LeftPathFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathConjunction#getRightPathFormula <em>Right Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathConjunction#getRightPathFormula()
	 * @see #getPathConjunction()
	 * @generated
	 */
	EReference getPathConjunction_RightPathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PathDisjunction <em>Path Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Disjunction</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathDisjunction
	 * @generated
	 */
	EClass getPathDisjunction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathDisjunction#getLeftPathFormula <em>Left Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathDisjunction#getLeftPathFormula()
	 * @see #getPathDisjunction()
	 * @generated
	 */
	EReference getPathDisjunction_LeftPathFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathDisjunction#getRightPathFormula <em>Right Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathDisjunction#getRightPathFormula()
	 * @see #getPathDisjunction()
	 * @generated
	 */
	EReference getPathDisjunction_RightPathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.PathImplication <em>Path Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Implication</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathImplication
	 * @generated
	 */
	EClass getPathImplication();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathImplication#getAntecedentPathFormula <em>Antecedent Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathImplication#getAntecedentPathFormula()
	 * @see #getPathImplication()
	 * @generated
	 */
	EReference getPathImplication_AntecedentPathFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.PathImplication#getConsequentPathFormula <em>Consequent Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.PathImplication#getConsequentPathFormula()
	 * @see #getPathImplication()
	 * @generated
	 */
	EReference getPathImplication_ConsequentPathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next</em>'.
	 * @see net.sf.ictalive.operetta.OM.Next
	 * @generated
	 */
	EClass getNext();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Next#getPathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Next#getPathFormula()
	 * @see #getNext()
	 * @generated
	 */
	EReference getNext_PathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Sometime <em>Sometime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sometime</em>'.
	 * @see net.sf.ictalive.operetta.OM.Sometime
	 * @generated
	 */
	EClass getSometime();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Sometime#getPathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Sometime#getPathFormula()
	 * @see #getSometime()
	 * @generated
	 */
	EReference getSometime_PathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always</em>'.
	 * @see net.sf.ictalive.operetta.OM.Always
	 * @generated
	 */
	EClass getAlways();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Always#getPathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Always#getPathFormula()
	 * @see #getAlways()
	 * @generated
	 */
	EReference getAlways_PathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until</em>'.
	 * @see net.sf.ictalive.operetta.OM.Until
	 * @generated
	 */
	EClass getUntil();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Until#getFromPathFormula <em>From Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Until#getFromPathFormula()
	 * @see #getUntil()
	 * @generated
	 */
	EReference getUntil_FromPathFormula();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Until#getUntilPathFormula <em>Until Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Path Formula</em>'.
	 * @see net.sf.ictalive.operetta.OM.Until#getUntilPathFormula()
	 * @see #getUntil()
	 * @generated
	 */
	EReference getUntil_UntilPathFormula();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see net.sf.ictalive.operetta.OM.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Ontology#getOntologyID <em>Ontology ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology ID</em>'.
	 * @see net.sf.ictalive.operetta.OM.Ontology#getOntologyID()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_OntologyID();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.Ontology#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see net.sf.ictalive.operetta.OM.Ontology#getClasses()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Classes();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see net.sf.ictalive.operetta.OM.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Concept#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept</em>'.
	 * @see net.sf.ictalive.operetta.OM.Concept#getConcept()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Concept();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Concept#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see net.sf.ictalive.operetta.OM.Concept#getURI()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_URI();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Concept#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.Concept#getType()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.CountsAs <em>Counts As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counts As</em>'.
	 * @see net.sf.ictalive.operetta.OM.CountsAs
	 * @generated
	 */
	EClass getCountsAs();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.CountsAs#getConcreteFact <em>Concrete Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Fact</em>'.
	 * @see net.sf.ictalive.operetta.OM.CountsAs#getConcreteFact()
	 * @see #getCountsAs()
	 * @generated
	 */
	EReference getCountsAs_ConcreteFact();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.CountsAs#getAbstractFact <em>Abstract Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Fact</em>'.
	 * @see net.sf.ictalive.operetta.OM.CountsAs#getAbstractFact()
	 * @see #getCountsAs()
	 * @generated
	 */
	EReference getCountsAs_AbstractFact();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.CountsAs#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see net.sf.ictalive.operetta.OM.CountsAs#getContext()
	 * @see #getCountsAs()
	 * @generated
	 */
	EReference getCountsAs_Context();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.CountsAsConcreteFact <em>Counts As Concrete Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counts As Concrete Fact</em>'.
	 * @see net.sf.ictalive.operetta.OM.CountsAsConcreteFact
	 * @generated
	 */
	EClass getCountsAsConcreteFact();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see net.sf.ictalive.operetta.OM.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.operetta.OM.Actions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see net.sf.ictalive.operetta.OM.Actions#getActions()
	 * @see #getActions()
	 * @generated
	 */
	EReference getActions_Actions();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.ActionDescription <em>Action Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Description</em>'.
	 * @see net.sf.ictalive.operetta.OM.ActionDescription
	 * @generated
	 */
	EClass getActionDescription();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Action</em>'.
	 * @see net.sf.ictalive.operetta.OM.AtomicAction
	 * @generated
	 */
	EClass getAtomicAction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.AtomicAction#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see net.sf.ictalive.operetta.OM.AtomicAction#getStatement()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EAttribute getAtomicAction_Statement();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see net.sf.ictalive.operetta.OM.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.operetta.OM.Sequence#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see net.sf.ictalive.operetta.OM.Sequence#getActions()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Actions();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see net.sf.ictalive.operetta.OM.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see net.sf.ictalive.operetta.OM.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.operetta.OM.Conditional#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see net.sf.ictalive.operetta.OM.Conditional#getAction()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Action();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.operetta.OM.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see net.sf.ictalive.operetta.OM.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.operetta.OM.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.operetta.OM.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.operetta.OM.DeonticModality <em>Deontic Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deontic Modality</em>'.
	 * @see net.sf.ictalive.operetta.OM.DeonticModality
	 * @generated
	 */
	EEnum getDeonticModality();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.operetta.OM.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.operetta.OM.SceneType <em>Scene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scene Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.SceneType
	 * @generated
	 */
	EEnum getSceneType();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.operetta.OM.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.TransitionType
	 * @generated
	 */
	EEnum getTransitionType();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.operetta.OM.TTSType <em>TTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTS Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.TTSType
	 * @generated
	 */
	EEnum getTTSType();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.operetta.OM.ConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concept Type</em>'.
	 * @see net.sf.ictalive.operetta.OM.ConceptType
	 * @generated
	 */
	EEnum getConceptType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OMFactory getOMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.OperAModelImpl <em>Oper AModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.OperAModelImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getOperAModel()
		 * @generated
		 */
		EClass OPER_AMODEL = eINSTANCE.getOperAModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPER_AMODEL__NAME = eINSTANCE.getOperAModel_Name();

		/**
		 * The meta object literal for the '<em><b>Om</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPER_AMODEL__OM = eINSTANCE.getOperAModel_Om();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.OMImpl <em>OM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.OMImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getOM()
		 * @generated
		 */
		EClass OM = eINSTANCE.getOM();

		/**
		 * The meta object literal for the '<em><b>Ss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM__SS = eINSTANCE.getOM_Ss();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM__IS = eINSTANCE.getOM_Is();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM__NS = eINSTANCE.getOM_Ns();

		/**
		 * The meta object literal for the '<em><b>Cs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM__CS = eINSTANCE.getOM_Cs();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.SSImpl <em>SS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.SSImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSS()
		 * @generated
		 */
		EClass SS = eINSTANCE.getSS();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SS__ROLES = eINSTANCE.getSS_Roles();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SS__OBJECTIVES = eINSTANCE.getSS_Objectives();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SS__DEPENDENCIES = eINSTANCE.getSS_Dependencies();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ISImpl <em>IS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ISImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getIS()
		 * @generated
		 */
		EClass IS = eINSTANCE.getIS();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS__SCENES = eINSTANCE.getIS_Scenes();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS__TRANSITIONS = eINSTANCE.getIS_Transitions();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS__ARCS = eINSTANCE.getIS_Arcs();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.NSImpl <em>NS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.NSImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNS()
		 * @generated
		 */
		EClass NS = eINSTANCE.getNS();

		/**
		 * The meta object literal for the '<em><b>Norms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NS__NORMS = eINSTANCE.getNS_Norms();

		/**
		 * The meta object literal for the '<em><b>Transition Norms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NS__TRANSITION_NORMS = eINSTANCE.getNS_TransitionNorms();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.CSImpl <em>CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.CSImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getCS()
		 * @generated
		 */
		EClass CS = eINSTANCE.getCS();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS__FORMULAS = eINSTANCE.getCS_Formulas();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS__ONTOLOGY = eINSTANCE.getCS_Ontology();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS__TERMS = eINSTANCE.getCS_Terms();

		/**
		 * The meta object literal for the '<em><b>Counts As Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS__COUNTS_AS_RULES = eINSTANCE.getCS_CountsAsRules();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS__CONTEXTS = eINSTANCE.getCS_Contexts();

		/**
		 * The meta object literal for the '<em><b>Action Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS__ACTION_LIBRARY = eINSTANCE.getCS_ActionLibrary();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.RoleImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Concept Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONCEPT_NAME = eINSTANCE.getRole_ConceptName();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__OBJECTIVES = eINSTANCE.getRole_Objectives();

		/**
		 * The meta object literal for the '<em><b>Norms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__NORMS = eINSTANCE.getRole_Norms();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RIGHTS = eINSTANCE.getRole_Rights();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE_TYPE = eINSTANCE.getRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Dependant On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DEPENDANT_ON = eINSTANCE.getRole_DependantOn();

		/**
		 * The meta object literal for the '<em><b>Dependee In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DEPENDEE_IN = eINSTANCE.getRole_DependeeIn();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ObjectiveImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__NAME = eINSTANCE.getObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Concept Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__CONCEPT_NAME = eINSTANCE.getObjective_ConceptName();

		/**
		 * The meta object literal for the '<em><b>State Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__STATE_DESCRIPTION = eINSTANCE.getObjective_StateDescription();

		/**
		 * The meta object literal for the '<em><b>Sub Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__SUB_OBJECTIVES = eINSTANCE.getObjective_SubObjectives();

		/**
		 * The meta object literal for the '<em><b>Parent Objective</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__PARENT_OBJECTIVE = eINSTANCE.getObjective_ParentObjective();

		/**
		 * The meta object literal for the '<em><b>Used By Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__USED_BY_ROLE = eINSTANCE.getObjective_UsedByRole();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.DependencyImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__ID = eINSTANCE.getDependency_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

		/**
		 * The meta object literal for the '<em><b>Object Of Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__OBJECT_OF_DEPENDENCY = eINSTANCE.getDependency_ObjectOfDependency();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.NormImpl <em>Norm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.NormImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNorm()
		 * @generated
		 */
		EClass NORM = eINSTANCE.getNorm();

		/**
		 * The meta object literal for the '<em><b>Norm ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORM__NORM_ID = eINSTANCE.getNorm_NormID();

		/**
		 * The meta object literal for the '<em><b>Activation Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM__ACTIVATION_CONDITION = eINSTANCE.getNorm_ActivationCondition();

		/**
		 * The meta object literal for the '<em><b>Expiration Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM__EXPIRATION_CONDITION = eINSTANCE.getNorm_ExpirationCondition();

		/**
		 * The meta object literal for the '<em><b>Maintenance Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM__MAINTENANCE_CONDITION = eINSTANCE.getNorm_MaintenanceCondition();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM__DEADLINE = eINSTANCE.getNorm_Deadline();

		/**
		 * The meta object literal for the '<em><b>Deontics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM__DEONTICS = eINSTANCE.getNorm_Deontics();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.DeonticStatementImpl <em>Deontic Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.DeonticStatementImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDeonticStatement()
		 * @generated
		 */
		EClass DEONTIC_STATEMENT = eINSTANCE.getDeonticStatement();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEONTIC_STATEMENT__MODALITY = eINSTANCE.getDeonticStatement_Modality();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEONTIC_STATEMENT__WHAT = eINSTANCE.getDeonticStatement_What();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.IndividualDeonticStatementImpl <em>Individual Deontic Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.IndividualDeonticStatementImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getIndividualDeonticStatement()
		 * @generated
		 */
		EClass INDIVIDUAL_DEONTIC_STATEMENT = eINSTANCE.getIndividualDeonticStatement();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_DEONTIC_STATEMENT__ACTOR = eINSTANCE.getIndividualDeonticStatement_Actor();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.RoleDeonticStatementImpl <em>Role Deontic Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.RoleDeonticStatementImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRoleDeonticStatement()
		 * @generated
		 */
		EClass ROLE_DEONTIC_STATEMENT = eINSTANCE.getRoleDeonticStatement();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_DEONTIC_STATEMENT__ROLE = eINSTANCE.getRoleDeonticStatement_Role();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.RightImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT__NAME = eINSTANCE.getRight_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__EXPR = eINSTANCE.getRight_Expr();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.HierarchyDependencyImpl <em>Hierarchy Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.HierarchyDependencyImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getHierarchyDependency()
		 * @generated
		 */
		EClass HIERARCHY_DEPENDENCY = eINSTANCE.getHierarchyDependency();

		/**
		 * The meta object literal for the '<em><b>Dependant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_DEPENDENCY__DEPENDANT = eINSTANCE.getHierarchyDependency_Dependant();

		/**
		 * The meta object literal for the '<em><b>Dependee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_DEPENDENCY__DEPENDEE = eINSTANCE.getHierarchyDependency_Dependee();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.MarketDependencyImpl <em>Market Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.MarketDependencyImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getMarketDependency()
		 * @generated
		 */
		EClass MARKET_DEPENDENCY = eINSTANCE.getMarketDependency();

		/**
		 * The meta object literal for the '<em><b>Dependant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_DEPENDENCY__DEPENDANT = eINSTANCE.getMarketDependency_Dependant();

		/**
		 * The meta object literal for the '<em><b>Dependee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_DEPENDENCY__DEPENDEE = eINSTANCE.getMarketDependency_Dependee();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.NetworkDependencyImpl <em>Network Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.NetworkDependencyImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNetworkDependency()
		 * @generated
		 */
		EClass NETWORK_DEPENDENCY = eINSTANCE.getNetworkDependency();

		/**
		 * The meta object literal for the '<em><b>Dependant1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DEPENDENCY__DEPENDANT1 = eINSTANCE.getNetworkDependency_Dependant1();

		/**
		 * The meta object literal for the '<em><b>Dependant2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DEPENDENCY__DEPENDANT2 = eINSTANCE.getNetworkDependency_Dependant2();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.SceneImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Scene ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__SCENE_ID = eINSTANCE.getScene_SceneID();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__PLAYERS = eINSTANCE.getScene_Players();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__RESULTS = eINSTANCE.getScene_Results();

		/**
		 * The meta object literal for the '<em><b>Interaction Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__INTERACTION_PATTERN = eINSTANCE.getScene_InteractionPattern();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__DESCRIPTION = eINSTANCE.getScene_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__TYPE = eINSTANCE.getScene_Type();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.TransitionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Transition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRANSITION_ID = eINSTANCE.getTransition_TransitionID();

		/**
		 * The meta object literal for the '<em><b>Transition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRANSITION_TYPE = eINSTANCE.getTransition_TransitionType();

		/**
		 * The meta object literal for the '<em><b>Norms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NORMS = eINSTANCE.getTransition_Norms();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ArcImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Arc ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__ARC_ID = eINSTANCE.getArc_ArcID();

		/**
		 * The meta object literal for the '<em><b>Accessible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ACCESSIBLE = eINSTANCE.getArc_Accessible();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.SceneToTransitionArcImpl <em>Scene To Transition Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.SceneToTransitionArcImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSceneToTransitionArc()
		 * @generated
		 */
		EClass SCENE_TO_TRANSITION_ARC = eINSTANCE.getSceneToTransitionArc();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_TO_TRANSITION_ARC__FROM = eINSTANCE.getSceneToTransitionArc_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_TO_TRANSITION_ARC__TO = eINSTANCE.getSceneToTransitionArc_To();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.TransitionToSceneArcImpl <em>Transition To Scene Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.TransitionToSceneArcImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransitionToSceneArc()
		 * @generated
		 */
		EClass TRANSITION_TO_SCENE_ARC = eINSTANCE.getTransitionToSceneArc();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TO_SCENE_ARC__FROM = eINSTANCE.getTransitionToSceneArc_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TO_SCENE_ARC__TO = eINSTANCE.getTransitionToSceneArc_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TO_SCENE_ARC__TYPE = eINSTANCE.getTransitionToSceneArc_Type();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PlayerImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Player ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PLAYER_ID = eINSTANCE.getPlayer_PlayerID();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__ROLE = eINSTANCE.getPlayer_Role();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.LandmarkPatternImpl <em>Landmark Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.LandmarkPatternImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getLandmarkPattern()
		 * @generated
		 */
		EClass LANDMARK_PATTERN = eINSTANCE.getLandmarkPattern();

		/**
		 * The meta object literal for the '<em><b>Landmarks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK_PATTERN__LANDMARKS = eINSTANCE.getLandmarkPattern_Landmarks();

		/**
		 * The meta object literal for the '<em><b>Landmark Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK_PATTERN__LANDMARK_ORDER = eINSTANCE.getLandmarkPattern_LandmarkOrder();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.LandmarkImpl <em>Landmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.LandmarkImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getLandmark()
		 * @generated
		 */
		EClass LANDMARK = eINSTANCE.getLandmark();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDMARK__NAME = eINSTANCE.getLandmark_Name();

		/**
		 * The meta object literal for the '<em><b>State Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK__STATE_DESCRIPTION = eINSTANCE.getLandmark_StateDescription();

		/**
		 * The meta object literal for the '<em><b>Entails</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK__ENTAILS = eINSTANCE.getLandmark_Entails();

		/**
		 * The meta object literal for the '<em><b>Is Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDMARK__IS_RESULT = eINSTANCE.getLandmark_IsResult();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.TransitionNormImpl <em>Transition Norm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.TransitionNormImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransitionNorm()
		 * @generated
		 */
		EClass TRANSITION_NORM = eINSTANCE.getTransitionNorm();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_NORM__ID = eINSTANCE.getTransitionNorm_ID();

		/**
		 * The meta object literal for the '<em><b>From Scene</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NORM__FROM_SCENE = eINSTANCE.getTransitionNorm_FromScene();

		/**
		 * The meta object literal for the '<em><b>From Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NORM__FROM_PLAYERS = eINSTANCE.getTransitionNorm_FromPlayers();

		/**
		 * The meta object literal for the '<em><b>From Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NORM__FROM_RESULTS = eINSTANCE.getTransitionNorm_FromResults();

		/**
		 * The meta object literal for the '<em><b>To Scene</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NORM__TO_SCENE = eINSTANCE.getTransitionNorm_ToScene();

		/**
		 * The meta object literal for the '<em><b>To Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NORM__TO_PLAYER = eINSTANCE.getTransitionNorm_ToPlayer();

		/**
		 * The meta object literal for the '<em><b>Attached To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NORM__ATTACHED_TO = eINSTANCE.getTransitionNorm_AttachedTo();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PartialOrderImpl <em>Partial Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PartialOrderImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPartialOrder()
		 * @generated
		 */
		EClass PARTIAL_ORDER = eINSTANCE.getPartialOrder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_ORDER__NAME = eINSTANCE.getPartialOrder_Name();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ORDER__FROM = eINSTANCE.getPartialOrder_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_ORDER__TO = eINSTANCE.getPartialOrder_To();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PartialStateDescriptionImpl <em>Partial State Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PartialStateDescriptionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPartialStateDescription()
		 * @generated
		 */
		EClass PARTIAL_STATE_DESCRIPTION = eINSTANCE.getPartialStateDescription();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_STATE_DESCRIPTION__ID = eINSTANCE.getPartialStateDescription_ID();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PathFormulaImpl <em>Path Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PathFormulaImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathFormula()
		 * @generated
		 */
		EClass PATH_FORMULA = eINSTANCE.getPathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.StateFormulaImpl <em>State Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.StateFormulaImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getStateFormula()
		 * @generated
		 */
		EClass STATE_FORMULA = eINSTANCE.getStateFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.AtomImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__PREDICATE = eINSTANCE.getAtom_Predicate();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__CONCEPT = eINSTANCE.getAtom_Concept();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__ARGUMENTS = eINSTANCE.getAtom_Arguments();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.TermImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ConstantImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__CONCEPT = eINSTANCE.getConstant_Concept();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.VariableImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.FunctionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__ARGUMENTS = eINSTANCE.getFunction_Arguments();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.NegationImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__STATE_FORMULA = eINSTANCE.getNegation_StateFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ConjunctionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '<em><b>Left State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNCTION__LEFT_STATE_FORMULA = eINSTANCE.getConjunction_LeftStateFormula();

		/**
		 * The meta object literal for the '<em><b>Right State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNCTION__RIGHT_STATE_FORMULA = eINSTANCE.getConjunction_RightStateFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.DisjunctionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '<em><b>Left State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION__LEFT_STATE_FORMULA = eINSTANCE.getDisjunction_LeftStateFormula();

		/**
		 * The meta object literal for the '<em><b>Right State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION__RIGHT_STATE_FORMULA = eINSTANCE.getDisjunction_RightStateFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ImplicationImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '<em><b>Antecedent State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__ANTECEDENT_STATE_FORMULA = eINSTANCE.getImplication_AntecedentStateFormula();

		/**
		 * The meta object literal for the '<em><b>Consequent State Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__CONSEQUENT_STATE_FORMULA = eINSTANCE.getImplication_ConsequentStateFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ForAllPathsImpl <em>For All Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ForAllPathsImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getForAllPaths()
		 * @generated
		 */
		EClass FOR_ALL_PATHS = eINSTANCE.getForAllPaths();

		/**
		 * The meta object literal for the '<em><b>Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_PATHS__PATH_FORMULA = eINSTANCE.getForAllPaths_PathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ExistsPathImpl <em>Exists Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ExistsPathImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getExistsPath()
		 * @generated
		 */
		EClass EXISTS_PATH = eINSTANCE.getExistsPath();

		/**
		 * The meta object literal for the '<em><b>Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTS_PATH__PATH_FORMULA = eINSTANCE.getExistsPath_PathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PathNegationImpl <em>Path Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PathNegationImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathNegation()
		 * @generated
		 */
		EClass PATH_NEGATION = eINSTANCE.getPathNegation();

		/**
		 * The meta object literal for the '<em><b>Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_NEGATION__PATH_FORMULA = eINSTANCE.getPathNegation_PathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PathConjunctionImpl <em>Path Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PathConjunctionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathConjunction()
		 * @generated
		 */
		EClass PATH_CONJUNCTION = eINSTANCE.getPathConjunction();

		/**
		 * The meta object literal for the '<em><b>Left Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONJUNCTION__LEFT_PATH_FORMULA = eINSTANCE.getPathConjunction_LeftPathFormula();

		/**
		 * The meta object literal for the '<em><b>Right Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONJUNCTION__RIGHT_PATH_FORMULA = eINSTANCE.getPathConjunction_RightPathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PathDisjunctionImpl <em>Path Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PathDisjunctionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathDisjunction()
		 * @generated
		 */
		EClass PATH_DISJUNCTION = eINSTANCE.getPathDisjunction();

		/**
		 * The meta object literal for the '<em><b>Left Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_DISJUNCTION__LEFT_PATH_FORMULA = eINSTANCE.getPathDisjunction_LeftPathFormula();

		/**
		 * The meta object literal for the '<em><b>Right Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_DISJUNCTION__RIGHT_PATH_FORMULA = eINSTANCE.getPathDisjunction_RightPathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.PathImplicationImpl <em>Path Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.PathImplicationImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getPathImplication()
		 * @generated
		 */
		EClass PATH_IMPLICATION = eINSTANCE.getPathImplication();

		/**
		 * The meta object literal for the '<em><b>Antecedent Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA = eINSTANCE.getPathImplication_AntecedentPathFormula();

		/**
		 * The meta object literal for the '<em><b>Consequent Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA = eINSTANCE.getPathImplication_ConsequentPathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.NextImpl <em>Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.NextImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getNext()
		 * @generated
		 */
		EClass NEXT = eINSTANCE.getNext();

		/**
		 * The meta object literal for the '<em><b>Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT__PATH_FORMULA = eINSTANCE.getNext_PathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.SometimeImpl <em>Sometime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.SometimeImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSometime()
		 * @generated
		 */
		EClass SOMETIME = eINSTANCE.getSometime();

		/**
		 * The meta object literal for the '<em><b>Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOMETIME__PATH_FORMULA = eINSTANCE.getSometime_PathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.AlwaysImpl <em>Always</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.AlwaysImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getAlways()
		 * @generated
		 */
		EClass ALWAYS = eINSTANCE.getAlways();

		/**
		 * The meta object literal for the '<em><b>Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALWAYS__PATH_FORMULA = eINSTANCE.getAlways_PathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.UntilImpl <em>Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.UntilImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getUntil()
		 * @generated
		 */
		EClass UNTIL = eINSTANCE.getUntil();

		/**
		 * The meta object literal for the '<em><b>From Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNTIL__FROM_PATH_FORMULA = eINSTANCE.getUntil_FromPathFormula();

		/**
		 * The meta object literal for the '<em><b>Until Path Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNTIL__UNTIL_PATH_FORMULA = eINSTANCE.getUntil_UntilPathFormula();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.OntologyImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Ontology ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__ONTOLOGY_ID = eINSTANCE.getOntology_OntologyID();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CLASSES = eINSTANCE.getOntology_Classes();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ConceptImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__CONCEPT = eINSTANCE.getConcept_Concept();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__URI = eINSTANCE.getConcept_URI();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__TYPE = eINSTANCE.getConcept_Type();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.CountsAsImpl <em>Counts As</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.CountsAsImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getCountsAs()
		 * @generated
		 */
		EClass COUNTS_AS = eINSTANCE.getCountsAs();

		/**
		 * The meta object literal for the '<em><b>Concrete Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTS_AS__CONCRETE_FACT = eINSTANCE.getCountsAs_ConcreteFact();

		/**
		 * The meta object literal for the '<em><b>Abstract Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTS_AS__ABSTRACT_FACT = eINSTANCE.getCountsAs_AbstractFact();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTS_AS__CONTEXT = eINSTANCE.getCountsAs_Context();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.CountsAsConcreteFactImpl <em>Counts As Concrete Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.CountsAsConcreteFactImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getCountsAsConcreteFact()
		 * @generated
		 */
		EClass COUNTS_AS_CONCRETE_FACT = eINSTANCE.getCountsAsConcreteFact();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ActionsImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS__ACTIONS = eINSTANCE.getActions_Actions();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ActionDescriptionImpl <em>Action Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ActionDescriptionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getActionDescription()
		 * @generated
		 */
		EClass ACTION_DESCRIPTION = eINSTANCE.getActionDescription();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.AtomicActionImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getAtomicAction()
		 * @generated
		 */
		EClass ATOMIC_ACTION = eINSTANCE.getAtomicAction();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_ACTION__STATEMENT = eINSTANCE.getAtomicAction_Statement();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.SequenceImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ACTIONS = eINSTANCE.getSequence_Actions();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ConditionalImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__ACTION = eINSTANCE.getConditional_Action();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.impl.ContextImpl
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.DeonticModality <em>Deontic Modality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.DeonticModality
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getDeonticModality()
		 * @generated
		 */
		EEnum DEONTIC_MODALITY = eINSTANCE.getDeonticModality();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.RoleType
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.SceneType <em>Scene Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.SceneType
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getSceneType()
		 * @generated
		 */
		EEnum SCENE_TYPE = eINSTANCE.getSceneType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.TransitionType <em>Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.TransitionType
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTransitionType()
		 * @generated
		 */
		EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.TTSType <em>TTS Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.TTSType
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getTTSType()
		 * @generated
		 */
		EEnum TTS_TYPE = eINSTANCE.getTTSType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.operetta.OM.ConceptType <em>Concept Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.operetta.OM.ConceptType
		 * @see net.sf.ictalive.operetta.OM.impl.OMPackageImpl#getConceptType()
		 * @generated
		 */
		EEnum CONCEPT_TYPE = eINSTANCE.getConceptType();

	}

} //OMPackage
