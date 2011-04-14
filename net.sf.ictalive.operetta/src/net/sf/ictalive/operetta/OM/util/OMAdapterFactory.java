/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.util;

import net.sf.ictalive.operetta.OM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.operetta.OM.OMPackage
 * @generated
 */
public class OMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMSwitch<Adapter> modelSwitch =
		new OMSwitch<Adapter>() {
			@Override
			public Adapter caseOperAModel(OperAModel object) {
				return createOperAModelAdapter();
			}
			@Override
			public Adapter caseOM(OM object) {
				return createOMAdapter();
			}
			@Override
			public Adapter caseSS(SS object) {
				return createSSAdapter();
			}
			@Override
			public Adapter caseIS(IS object) {
				return createISAdapter();
			}
			@Override
			public Adapter caseNS(NS object) {
				return createNSAdapter();
			}
			@Override
			public Adapter caseCS(CS object) {
				return createCSAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseObjective(Objective object) {
				return createObjectiveAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseNorm(Norm object) {
				return createNormAdapter();
			}
			@Override
			public Adapter caseDeonticStatement(DeonticStatement object) {
				return createDeonticStatementAdapter();
			}
			@Override
			public Adapter caseIndividualDeonticStatement(IndividualDeonticStatement object) {
				return createIndividualDeonticStatementAdapter();
			}
			@Override
			public Adapter caseRoleDeonticStatement(RoleDeonticStatement object) {
				return createRoleDeonticStatementAdapter();
			}
			@Override
			public Adapter caseRight(Right object) {
				return createRightAdapter();
			}
			@Override
			public Adapter caseHierarchyDependency(HierarchyDependency object) {
				return createHierarchyDependencyAdapter();
			}
			@Override
			public Adapter caseMarketDependency(MarketDependency object) {
				return createMarketDependencyAdapter();
			}
			@Override
			public Adapter caseNetworkDependency(NetworkDependency object) {
				return createNetworkDependencyAdapter();
			}
			@Override
			public Adapter caseScene(Scene object) {
				return createSceneAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter caseSceneToTransitionArc(SceneToTransitionArc object) {
				return createSceneToTransitionArcAdapter();
			}
			@Override
			public Adapter caseTransitionToSceneArc(TransitionToSceneArc object) {
				return createTransitionToSceneArcAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseLandmarkPattern(LandmarkPattern object) {
				return createLandmarkPatternAdapter();
			}
			@Override
			public Adapter caseLandmark(Landmark object) {
				return createLandmarkAdapter();
			}
			@Override
			public Adapter caseTransitionNorm(TransitionNorm object) {
				return createTransitionNormAdapter();
			}
			@Override
			public Adapter casePartialOrder(PartialOrder object) {
				return createPartialOrderAdapter();
			}
			@Override
			public Adapter casePartialStateDescription(PartialStateDescription object) {
				return createPartialStateDescriptionAdapter();
			}
			@Override
			public Adapter casePathFormula(PathFormula object) {
				return createPathFormulaAdapter();
			}
			@Override
			public Adapter caseStateFormula(StateFormula object) {
				return createStateFormulaAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseNegation(Negation object) {
				return createNegationAdapter();
			}
			@Override
			public Adapter caseConjunction(Conjunction object) {
				return createConjunctionAdapter();
			}
			@Override
			public Adapter caseDisjunction(Disjunction object) {
				return createDisjunctionAdapter();
			}
			@Override
			public Adapter caseImplication(Implication object) {
				return createImplicationAdapter();
			}
			@Override
			public Adapter caseForAllPaths(ForAllPaths object) {
				return createForAllPathsAdapter();
			}
			@Override
			public Adapter caseExistsPath(ExistsPath object) {
				return createExistsPathAdapter();
			}
			@Override
			public Adapter casePathNegation(PathNegation object) {
				return createPathNegationAdapter();
			}
			@Override
			public Adapter casePathConjunction(PathConjunction object) {
				return createPathConjunctionAdapter();
			}
			@Override
			public Adapter casePathDisjunction(PathDisjunction object) {
				return createPathDisjunctionAdapter();
			}
			@Override
			public Adapter casePathImplication(PathImplication object) {
				return createPathImplicationAdapter();
			}
			@Override
			public Adapter caseNext(Next object) {
				return createNextAdapter();
			}
			@Override
			public Adapter caseSometime(Sometime object) {
				return createSometimeAdapter();
			}
			@Override
			public Adapter caseAlways(Always object) {
				return createAlwaysAdapter();
			}
			@Override
			public Adapter caseUntil(Until object) {
				return createUntilAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseCountsAs(CountsAs object) {
				return createCountsAsAdapter();
			}
			@Override
			public Adapter caseCountsAsConcreteFact(CountsAsConcreteFact object) {
				return createCountsAsConcreteFactAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter caseActionDescription(ActionDescription object) {
				return createActionDescriptionAdapter();
			}
			@Override
			public Adapter caseAtomicAction(AtomicAction object) {
				return createAtomicActionAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseConditional(Conditional object) {
				return createConditionalAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.OperAModel <em>Oper AModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.OperAModel
	 * @generated
	 */
	public Adapter createOperAModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.OM <em>OM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.OM
	 * @generated
	 */
	public Adapter createOMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.SS <em>SS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.SS
	 * @generated
	 */
	public Adapter createSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.IS <em>IS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.IS
	 * @generated
	 */
	public Adapter createISAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.NS <em>NS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.NS
	 * @generated
	 */
	public Adapter createNSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.CS <em>CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.CS
	 * @generated
	 */
	public Adapter createCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Norm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Norm
	 * @generated
	 */
	public Adapter createNormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.DeonticStatement <em>Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.DeonticStatement
	 * @generated
	 */
	public Adapter createDeonticStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.IndividualDeonticStatement <em>Individual Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.IndividualDeonticStatement
	 * @generated
	 */
	public Adapter createIndividualDeonticStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.RoleDeonticStatement <em>Role Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.RoleDeonticStatement
	 * @generated
	 */
	public Adapter createRoleDeonticStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Right
	 * @generated
	 */
	public Adapter createRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.HierarchyDependency <em>Hierarchy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.HierarchyDependency
	 * @generated
	 */
	public Adapter createHierarchyDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.MarketDependency <em>Market Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.MarketDependency
	 * @generated
	 */
	public Adapter createMarketDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.NetworkDependency <em>Network Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.NetworkDependency
	 * @generated
	 */
	public Adapter createNetworkDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.SceneToTransitionArc <em>Scene To Transition Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.SceneToTransitionArc
	 * @generated
	 */
	public Adapter createSceneToTransitionArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.TransitionToSceneArc <em>Transition To Scene Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.TransitionToSceneArc
	 * @generated
	 */
	public Adapter createTransitionToSceneArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.LandmarkPattern <em>Landmark Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.LandmarkPattern
	 * @generated
	 */
	public Adapter createLandmarkPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Landmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Landmark
	 * @generated
	 */
	public Adapter createLandmarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.TransitionNorm <em>Transition Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.TransitionNorm
	 * @generated
	 */
	public Adapter createTransitionNormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PartialOrder <em>Partial Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PartialOrder
	 * @generated
	 */
	public Adapter createPartialOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PartialStateDescription <em>Partial State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PartialStateDescription
	 * @generated
	 */
	public Adapter createPartialStateDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PathFormula
	 * @generated
	 */
	public Adapter createPathFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.StateFormula <em>State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.StateFormula
	 * @generated
	 */
	public Adapter createStateFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Conjunction
	 * @generated
	 */
	public Adapter createConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Disjunction
	 * @generated
	 */
	public Adapter createDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.ForAllPaths <em>For All Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.ForAllPaths
	 * @generated
	 */
	public Adapter createForAllPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.ExistsPath <em>Exists Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.ExistsPath
	 * @generated
	 */
	public Adapter createExistsPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PathNegation <em>Path Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PathNegation
	 * @generated
	 */
	public Adapter createPathNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PathConjunction <em>Path Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PathConjunction
	 * @generated
	 */
	public Adapter createPathConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PathDisjunction <em>Path Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PathDisjunction
	 * @generated
	 */
	public Adapter createPathDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.PathImplication <em>Path Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.PathImplication
	 * @generated
	 */
	public Adapter createPathImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Next
	 * @generated
	 */
	public Adapter createNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Sometime <em>Sometime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Sometime
	 * @generated
	 */
	public Adapter createSometimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Always
	 * @generated
	 */
	public Adapter createAlwaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Until
	 * @generated
	 */
	public Adapter createUntilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.CountsAs <em>Counts As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.CountsAs
	 * @generated
	 */
	public Adapter createCountsAsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.CountsAsConcreteFact <em>Counts As Concrete Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.CountsAsConcreteFact
	 * @generated
	 */
	public Adapter createCountsAsConcreteFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.ActionDescription <em>Action Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.ActionDescription
	 * @generated
	 */
	public Adapter createActionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.AtomicAction
	 * @generated
	 */
	public Adapter createAtomicActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Conditional
	 * @generated
	 */
	public Adapter createConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.operetta.OM.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.operetta.OM.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OMAdapterFactory
