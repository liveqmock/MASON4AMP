/**
 * <copyright>
 * </copyright>
 *
 * $Id: ABaseItemProviderAdapterFactory.java,v 1.2 2010/08/04 01:52:46 mparker Exp $
 */
package org.eclipse.amp.amf.abase.aBase.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.amp.amf.abase.aBase.util.ABaseAdapterFactory;

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
public class ABaseItemProviderAdapterFactory extends ABaseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public ABaseItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.amp.amf.abase.aBase.Value} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueItemProvider valueItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.amp.amf.abase.aBase.Value}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createValueAdapter() {
        if (valueItemProvider == null) {
            valueItemProvider = new ValueItemProvider(this);
        }

        return valueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.amp.amf.abase.aBase.IntValue} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntValueItemProvider intValueItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.amp.amf.abase.aBase.IntValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIntValueAdapter() {
        if (intValueItemProvider == null) {
            intValueItemProvider = new IntValueItemProvider(this);
        }

        return intValueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.amp.amf.abase.aBase.RealValue} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RealValueItemProvider realValueItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.amp.amf.abase.aBase.RealValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRealValueAdapter() {
        if (realValueItemProvider == null) {
            realValueItemProvider = new RealValueItemProvider(this);
        }

        return realValueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.amp.amf.abase.aBase.StringValue} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringValueItemProvider stringValueItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.amp.amf.abase.aBase.StringValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStringValueAdapter() {
        if (stringValueItemProvider == null) {
            stringValueItemProvider = new StringValueItemProvider(this);
        }

        return stringValueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.amp.amf.abase.aBase.BooleanValue} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BooleanValueItemProvider booleanValueItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.amp.amf.abase.aBase.BooleanValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBooleanValueAdapter() {
        if (booleanValueItemProvider == null) {
            booleanValueItemProvider = new BooleanValueItemProvider(this);
        }

        return booleanValueItemProvider;
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
        if (valueItemProvider != null) valueItemProvider.dispose();
        if (intValueItemProvider != null) intValueItemProvider.dispose();
        if (realValueItemProvider != null) realValueItemProvider.dispose();
        if (stringValueItemProvider != null) stringValueItemProvider.dispose();
        if (booleanValueItemProvider != null) booleanValueItemProvider.dispose();
    }

}
