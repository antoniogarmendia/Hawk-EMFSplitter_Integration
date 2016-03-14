/**
 */
package WT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WT.Subsystem#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WT.Subsystem#getName <em>Name</em>}</li>
 *   <li>{@link WT.Subsystem#getEnsembles <em>Ensembles</em>}</li>
 *   <li>{@link WT.Subsystem#getBeh <em>Beh</em>}</li>
 * </ul>
 *
 * @see WT.WTPackage#getSubsystem()
 * @model
 * @generated
 */
public interface Subsystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link WT.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see WT.WTPackage#getSubsystem_Subsystems()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Subsystem> getSubsystems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WT.WTPackage#getSubsystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WT.Subsystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ensembles</b></em>' containment reference list.
	 * The list contents are of type {@link WT.Architecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ensembles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensembles</em>' containment reference list.
	 * @see WT.WTPackage#getSubsystem_Ensembles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Architecture> getEnsembles();

	/**
	 * Returns the value of the '<em><b>Beh</b></em>' containment reference list.
	 * The list contents are of type {@link WT.ControlSubsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beh</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beh</em>' containment reference list.
	 * @see WT.WTPackage#getSubsystem_Beh()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ControlSubsystem> getBeh();

} // Subsystem
