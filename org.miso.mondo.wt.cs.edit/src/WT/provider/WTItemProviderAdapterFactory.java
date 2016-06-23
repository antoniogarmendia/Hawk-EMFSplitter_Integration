/**
 */
package WT.provider;

import WT.util.WTAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WTItemProviderAdapterFactory extends WTAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.WTComponents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WTComponentsItemProvider wtComponentsItemProvider;

	/**
	 * This creates an adapter for a {@link WT.WTComponents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWTComponentsAdapter() {
		if (wtComponentsItemProvider == null) {
			wtComponentsItemProvider = new WTComponentsItemProvider(this);
		}

		return wtComponentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.Subsystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemItemProvider subsystemItemProvider;

	/**
	 * This creates an adapter for a {@link WT.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubsystemAdapter() {
		if (subsystemItemProvider == null) {
			subsystemItemProvider = new SubsystemItemProvider(this);
		}

		return subsystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.Architecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureItemProvider architectureItemProvider;

	/**
	 * This creates an adapter for a {@link WT.Architecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchitectureAdapter() {
		if (architectureItemProvider == null) {
			architectureItemProvider = new ArchitectureItemProvider(this);
		}

		return architectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.ControlSubsystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSubsystemItemProvider controlSubsystemItemProvider;

	/**
	 * This creates an adapter for a {@link WT.ControlSubsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlSubsystemAdapter() {
		if (controlSubsystemItemProvider == null) {
			controlSubsystemItemProvider = new ControlSubsystemItemProvider(this);
		}

		return controlSubsystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.StateMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineItemProvider stateMachineItemProvider;

	/**
	 * This creates an adapter for a {@link WT.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineAdapter() {
		if (stateMachineItemProvider == null) {
			stateMachineItemProvider = new StateMachineItemProvider(this);
		}

		return stateMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.Edge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeItemProvider edgeItemProvider;

	/**
	 * This creates an adapter for a {@link WT.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeAdapter() {
		if (edgeItemProvider == null) {
			edgeItemProvider = new EdgeItemProvider(this);
		}

		return edgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.InitialState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialStateItemProvider initialStateItemProvider;

	/**
	 * This creates an adapter for a {@link WT.InitialState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialStateAdapter() {
		if (initialStateItemProvider == null) {
			initialStateItemProvider = new InitialStateItemProvider(this);
		}

		return initialStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.SimpleState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleStateItemProvider simpleStateItemProvider;

	/**
	 * This creates an adapter for a {@link WT.SimpleState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleStateAdapter() {
		if (simpleStateItemProvider == null) {
			simpleStateItemProvider = new SimpleStateItemProvider(this);
		}

		return simpleStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link WT.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.InPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPortItemProvider inPortItemProvider;

	/**
	 * This creates an adapter for a {@link WT.InPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInPortAdapter() {
		if (inPortItemProvider == null) {
			inPortItemProvider = new InPortItemProvider(this);
		}

		return inPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WT.OutPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPortItemProvider outPortItemProvider;

	/**
	 * This creates an adapter for a {@link WT.OutPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutPortAdapter() {
		if (outPortItemProvider == null) {
			outPortItemProvider = new OutPortItemProvider(this);
		}

		return outPortItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (wtComponentsItemProvider != null) wtComponentsItemProvider.dispose();
		if (subsystemItemProvider != null) subsystemItemProvider.dispose();
		if (architectureItemProvider != null) architectureItemProvider.dispose();
		if (controlSubsystemItemProvider != null) controlSubsystemItemProvider.dispose();
		if (stateMachineItemProvider != null) stateMachineItemProvider.dispose();
		if (edgeItemProvider != null) edgeItemProvider.dispose();
		if (initialStateItemProvider != null) initialStateItemProvider.dispose();
		if (simpleStateItemProvider != null) simpleStateItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (inPortItemProvider != null) inPortItemProvider.dispose();
		if (outPortItemProvider != null) outPortItemProvider.dispose();
	}

}