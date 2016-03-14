/**
 */
package WT.util;

import WT.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WT.WTPackage
 * @generated
 */
public class WTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSwitch() {
		if (modelPackage == null) {
			modelPackage = WTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WTPackage.WT_COMPONENTS: {
				WTComponents wtComponents = (WTComponents)theEObject;
				T result = caseWTComponents(wtComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.ARCHITECTURE: {
				Architecture architecture = (Architecture)theEObject;
				T result = caseArchitecture(architecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.CONTROL_SUBSYSTEM: {
				ControlSubsystem controlSubsystem = (ControlSubsystem)theEObject;
				T result = caseControlSubsystem(controlSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseDocumentElt(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseDocumentElt(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseVertex(initialState);
				if (result == null) result = caseDocumentElt(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.SIMPLE_STATE: {
				SimpleState simpleState = (SimpleState)theEObject;
				T result = caseSimpleState(simpleState);
				if (result == null) result = caseVertex(simpleState);
				if (result == null) result = caseDocumentElt(simpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.IN_PORT: {
				InPort inPort = (InPort)theEObject;
				T result = caseInPort(inPort);
				if (result == null) result = casePort(inPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.OUT_PORT: {
				OutPort outPort = (OutPort)theEObject;
				T result = caseOutPort(outPort);
				if (result == null) result = casePort(outPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTPackage.DOCUMENT_ELT: {
				DocumentElt documentElt = (DocumentElt)theEObject;
				T result = caseDocumentElt(documentElt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTComponents(WTComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSubsystem(ControlSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleState(SimpleState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPort(InPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPort(OutPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Elt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Elt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentElt(DocumentElt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WTSwitch
