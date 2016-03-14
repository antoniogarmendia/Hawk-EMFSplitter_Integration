/**
 */
package WT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WT.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link WT.Vertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see WT.WTPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends DocumentElt {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link WT.Edge}.
	 * It is bidirectional and its opposite is '{@link WT.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see WT.WTPackage#getVertex_Outgoing()
	 * @see WT.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Edge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link WT.Edge}.
	 * It is bidirectional and its opposite is '{@link WT.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see WT.WTPackage#getVertex_Incoming()
	 * @see WT.Edge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Edge> getIncoming();

} // Vertex
