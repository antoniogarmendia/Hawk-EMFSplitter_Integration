/**
 */
package WT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WT.WTComponents#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WT.WTComponents#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see WT.WTPackage#getWTComponents()
 * @model
 * @generated
 */
public interface WTComponents extends EObject {
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
	 * @see WT.WTPackage#getWTComponents_Subsystems()
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
	 * @see WT.WTPackage#getWTComponents_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WT.WTComponents#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WTComponents
