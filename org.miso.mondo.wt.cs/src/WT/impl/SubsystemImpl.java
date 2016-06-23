/**
 */
package WT.impl;

import WT.Architecture;
import WT.ControlSubsystem;
import WT.Subsystem;
import WT.WTPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WT.impl.SubsystemImpl#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WT.impl.SubsystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link WT.impl.SubsystemImpl#getEnsembles <em>Ensembles</em>}</li>
 *   <li>{@link WT.impl.SubsystemImpl#getBeh <em>Beh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsystemImpl extends EObjectImpl implements Subsystem {
	/**
	 * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsystem> subsystems;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnsembles() <em>Ensembles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsembles()
	 * @generated
	 * @ordered
	 */
	protected EList<Architecture> ensembles;

	/**
	 * The cached value of the '{@link #getBeh() <em>Beh</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeh()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSubsystem> beh;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTPackage.Literals.SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsystem> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectContainmentEList.Resolving<Subsystem>(Subsystem.class, this, WTPackage.SUBSYSTEM__SUBSYSTEMS);
		}
		return subsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTPackage.SUBSYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Architecture> getEnsembles() {
		if (ensembles == null) {
			ensembles = new EObjectContainmentEList.Resolving<Architecture>(Architecture.class, this, WTPackage.SUBSYSTEM__ENSEMBLES);
		}
		return ensembles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlSubsystem> getBeh() {
		if (beh == null) {
			beh = new EObjectContainmentEList.Resolving<ControlSubsystem>(ControlSubsystem.class, this, WTPackage.SUBSYSTEM__BEH);
		}
		return beh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WTPackage.SUBSYSTEM__SUBSYSTEMS:
				return ((InternalEList<?>)getSubsystems()).basicRemove(otherEnd, msgs);
			case WTPackage.SUBSYSTEM__ENSEMBLES:
				return ((InternalEList<?>)getEnsembles()).basicRemove(otherEnd, msgs);
			case WTPackage.SUBSYSTEM__BEH:
				return ((InternalEList<?>)getBeh()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTPackage.SUBSYSTEM__SUBSYSTEMS:
				return getSubsystems();
			case WTPackage.SUBSYSTEM__NAME:
				return getName();
			case WTPackage.SUBSYSTEM__ENSEMBLES:
				return getEnsembles();
			case WTPackage.SUBSYSTEM__BEH:
				return getBeh();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTPackage.SUBSYSTEM__SUBSYSTEMS:
				getSubsystems().clear();
				getSubsystems().addAll((Collection<? extends Subsystem>)newValue);
				return;
			case WTPackage.SUBSYSTEM__NAME:
				setName((String)newValue);
				return;
			case WTPackage.SUBSYSTEM__ENSEMBLES:
				getEnsembles().clear();
				getEnsembles().addAll((Collection<? extends Architecture>)newValue);
				return;
			case WTPackage.SUBSYSTEM__BEH:
				getBeh().clear();
				getBeh().addAll((Collection<? extends ControlSubsystem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WTPackage.SUBSYSTEM__SUBSYSTEMS:
				getSubsystems().clear();
				return;
			case WTPackage.SUBSYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WTPackage.SUBSYSTEM__ENSEMBLES:
				getEnsembles().clear();
				return;
			case WTPackage.SUBSYSTEM__BEH:
				getBeh().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WTPackage.SUBSYSTEM__SUBSYSTEMS:
				return subsystems != null && !subsystems.isEmpty();
			case WTPackage.SUBSYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WTPackage.SUBSYSTEM__ENSEMBLES:
				return ensembles != null && !ensembles.isEmpty();
			case WTPackage.SUBSYSTEM__BEH:
				return beh != null && !beh.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubsystemImpl
