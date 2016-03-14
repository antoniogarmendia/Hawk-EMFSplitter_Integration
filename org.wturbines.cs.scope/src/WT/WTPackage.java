/**
 */
package WT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see WT.WTFactory
 * @model kind="package"
 * @generated
 */
public interface WTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/WT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WTPackage eINSTANCE = WT.impl.WTPackageImpl.init();

	/**
	 * The meta object id for the '{@link WT.impl.WTComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.WTComponentsImpl
	 * @see WT.impl.WTPackageImpl#getWTComponents()
	 * @generated
	 */
	int WT_COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_COMPONENTS__SUBSYSTEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_COMPONENTS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_COMPONENTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WT.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.SubsystemImpl
	 * @see WT.impl.WTPackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__SUBSYSTEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ensembles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ENSEMBLES = 2;

	/**
	 * The feature id for the '<em><b>Beh</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BEH = 3;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WT.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.ArchitectureImpl
	 * @see WT.impl.WTPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WT.impl.ControlSubsystemImpl <em>Control Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.ControlSubsystemImpl
	 * @see WT.impl.WTPackageImpl#getControlSubsystem()
	 * @generated
	 */
	int CONTROL_SUBSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SUBSYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SUBSYSTEM__STATES = 1;

	/**
	 * The number of structural features of the '<em>Control Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SUBSYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WT.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.StateMachineImpl
	 * @see WT.impl.WTPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = 2;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WT.impl.DocumentEltImpl <em>Document Elt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.DocumentEltImpl
	 * @see WT.impl.WTPackageImpl#getDocumentElt()
	 * @generated
	 */
	int DOCUMENT_ELT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ELT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ELT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Document Elt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ELT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WT.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.VertexImpl
	 * @see WT.impl.WTPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = DOCUMENT_ELT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__DESCRIPTION = DOCUMENT_ELT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING = DOCUMENT_ELT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING = DOCUMENT_ELT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = DOCUMENT_ELT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WT.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.EdgeImpl
	 * @see WT.impl.WTPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = DOCUMENT_ELT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESCRIPTION = DOCUMENT_ELT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = DOCUMENT_ELT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = DOCUMENT_ELT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DOCUMENT_ELT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WT.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.InitialStateImpl
	 * @see WT.impl.WTPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DESCRIPTION = VERTEX__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMING = VERTEX__INCOMING;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WT.impl.SimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.SimpleStateImpl
	 * @see WT.impl.WTPackageImpl#getSimpleState()
	 * @generated
	 */
	int SIMPLE_STATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__DESCRIPTION = VERTEX__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__INCOMING = VERTEX__INCOMING;

	/**
	 * The number of structural features of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WT.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.ComponentImpl
	 * @see WT.impl.WTPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATES = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WT.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.PortImpl
	 * @see WT.impl.WTPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WT.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.InPortImpl
	 * @see WT.impl.WTPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__LABEL = PORT__LABEL;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WT.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WT.impl.OutPortImpl
	 * @see WT.impl.WTPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__LABEL = PORT__LABEL;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link WT.WTComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see WT.WTComponents
	 * @generated
	 */
	EClass getWTComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.WTComponents#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see WT.WTComponents#getSubsystems()
	 * @see #getWTComponents()
	 * @generated
	 */
	EReference getWTComponents_Subsystems();

	/**
	 * Returns the meta object for the attribute '{@link WT.WTComponents#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WT.WTComponents#getName()
	 * @see #getWTComponents()
	 * @generated
	 */
	EAttribute getWTComponents_Name();

	/**
	 * Returns the meta object for class '{@link WT.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see WT.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.Subsystem#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see WT.Subsystem#getSubsystems()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_Subsystems();

	/**
	 * Returns the meta object for the attribute '{@link WT.Subsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WT.Subsystem#getName()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.Subsystem#getEnsembles <em>Ensembles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ensembles</em>'.
	 * @see WT.Subsystem#getEnsembles()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_Ensembles();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.Subsystem#getBeh <em>Beh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beh</em>'.
	 * @see WT.Subsystem#getBeh()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_Beh();

	/**
	 * Returns the meta object for class '{@link WT.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see WT.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link WT.Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WT.Architecture#getName()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.Architecture#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see WT.Architecture#getElements()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Elements();

	/**
	 * Returns the meta object for class '{@link WT.ControlSubsystem <em>Control Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Subsystem</em>'.
	 * @see WT.ControlSubsystem
	 * @generated
	 */
	EClass getControlSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link WT.ControlSubsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WT.ControlSubsystem#getName()
	 * @see #getControlSubsystem()
	 * @generated
	 */
	EAttribute getControlSubsystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.ControlSubsystem#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see WT.ControlSubsystem#getStates()
	 * @see #getControlSubsystem()
	 * @generated
	 */
	EReference getControlSubsystem_States();

	/**
	 * Returns the meta object for class '{@link WT.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see WT.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link WT.StateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WT.StateMachine#getName()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see WT.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see WT.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for class '{@link WT.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see WT.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link WT.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see WT.Vertex#getOutgoing()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link WT.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see WT.Vertex#getIncoming()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Incoming();

	/**
	 * Returns the meta object for class '{@link WT.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see WT.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link WT.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see WT.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link WT.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see WT.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link WT.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see WT.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link WT.SimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State</em>'.
	 * @see WT.SimpleState
	 * @generated
	 */
	EClass getSimpleState();

	/**
	 * Returns the meta object for class '{@link WT.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see WT.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link WT.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see WT.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the reference list '{@link WT.Component#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see WT.Component#getStates()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_States();

	/**
	 * Returns the meta object for the attribute '{@link WT.Component#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see WT.Component#getLabel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Label();

	/**
	 * Returns the meta object for class '{@link WT.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see WT.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link WT.Port#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see WT.Port#getLabel()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Label();

	/**
	 * Returns the meta object for class '{@link WT.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see WT.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for class '{@link WT.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see WT.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for class '{@link WT.DocumentElt <em>Document Elt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Elt</em>'.
	 * @see WT.DocumentElt
	 * @generated
	 */
	EClass getDocumentElt();

	/**
	 * Returns the meta object for the attribute '{@link WT.DocumentElt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WT.DocumentElt#getName()
	 * @see #getDocumentElt()
	 * @generated
	 */
	EAttribute getDocumentElt_Name();

	/**
	 * Returns the meta object for the attribute '{@link WT.DocumentElt#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WT.DocumentElt#getDescription()
	 * @see #getDocumentElt()
	 * @generated
	 */
	EAttribute getDocumentElt_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WTFactory getWTFactory();

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
		 * The meta object literal for the '{@link WT.impl.WTComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.WTComponentsImpl
		 * @see WT.impl.WTPackageImpl#getWTComponents()
		 * @generated
		 */
		EClass WT_COMPONENTS = eINSTANCE.getWTComponents();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT_COMPONENTS__SUBSYSTEMS = eINSTANCE.getWTComponents_Subsystems();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WT_COMPONENTS__NAME = eINSTANCE.getWTComponents_Name();

		/**
		 * The meta object literal for the '{@link WT.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.SubsystemImpl
		 * @see WT.impl.WTPackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__SUBSYSTEMS = eINSTANCE.getSubsystem_Subsystems();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSYSTEM__NAME = eINSTANCE.getSubsystem_Name();

		/**
		 * The meta object literal for the '<em><b>Ensembles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__ENSEMBLES = eINSTANCE.getSubsystem_Ensembles();

		/**
		 * The meta object literal for the '<em><b>Beh</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__BEH = eINSTANCE.getSubsystem_Beh();

		/**
		 * The meta object literal for the '{@link WT.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.ArchitectureImpl
		 * @see WT.impl.WTPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__ELEMENTS = eINSTANCE.getArchitecture_Elements();

		/**
		 * The meta object literal for the '{@link WT.impl.ControlSubsystemImpl <em>Control Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.ControlSubsystemImpl
		 * @see WT.impl.WTPackageImpl#getControlSubsystem()
		 * @generated
		 */
		EClass CONTROL_SUBSYSTEM = eINSTANCE.getControlSubsystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_SUBSYSTEM__NAME = eINSTANCE.getControlSubsystem_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_SUBSYSTEM__STATES = eINSTANCE.getControlSubsystem_States();

		/**
		 * The meta object literal for the '{@link WT.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.StateMachineImpl
		 * @see WT.impl.WTPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '{@link WT.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.VertexImpl
		 * @see WT.impl.WTPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING = eINSTANCE.getVertex_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING = eINSTANCE.getVertex_Incoming();

		/**
		 * The meta object literal for the '{@link WT.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.EdgeImpl
		 * @see WT.impl.WTPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link WT.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.InitialStateImpl
		 * @see WT.impl.WTPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link WT.impl.SimpleStateImpl <em>Simple State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.SimpleStateImpl
		 * @see WT.impl.WTPackageImpl#getSimpleState()
		 * @generated
		 */
		EClass SIMPLE_STATE = eINSTANCE.getSimpleState();

		/**
		 * The meta object literal for the '{@link WT.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.ComponentImpl
		 * @see WT.impl.WTPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__STATES = eINSTANCE.getComponent_States();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__LABEL = eINSTANCE.getComponent_Label();

		/**
		 * The meta object literal for the '{@link WT.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.PortImpl
		 * @see WT.impl.WTPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__LABEL = eINSTANCE.getPort_Label();

		/**
		 * The meta object literal for the '{@link WT.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.InPortImpl
		 * @see WT.impl.WTPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '{@link WT.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.OutPortImpl
		 * @see WT.impl.WTPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '{@link WT.impl.DocumentEltImpl <em>Document Elt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WT.impl.DocumentEltImpl
		 * @see WT.impl.WTPackageImpl#getDocumentElt()
		 * @generated
		 */
		EClass DOCUMENT_ELT = eINSTANCE.getDocumentElt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ELT__NAME = eINSTANCE.getDocumentElt_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ELT__DESCRIPTION = eINSTANCE.getDocumentElt_Description();

	}

} //WTPackage
