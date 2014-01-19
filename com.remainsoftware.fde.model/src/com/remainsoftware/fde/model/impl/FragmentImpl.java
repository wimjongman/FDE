/**
 */
package com.remainsoftware.fde.model.impl;

import com.remainsoftware.fde.model.Bundle;
import com.remainsoftware.fde.model.Fragment;
import com.remainsoftware.fde.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.FragmentImpl#getParentBundle <em>Parent Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentImpl extends ManifestImpl implements Fragment {
	/**
	 * The cached value of the '{@link #getParentBundle() <em>Parent Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle parentBundle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getParentBundle() {
		return parentBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentBundle(Bundle newParentBundle, NotificationChain msgs) {
		Bundle oldParentBundle = parentBundle;
		parentBundle = newParentBundle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FRAGMENT__PARENT_BUNDLE, oldParentBundle, newParentBundle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentBundle(Bundle newParentBundle) {
		if (newParentBundle != parentBundle) {
			NotificationChain msgs = null;
			if (parentBundle != null)
				msgs = ((InternalEObject)parentBundle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FRAGMENT__PARENT_BUNDLE, null, msgs);
			if (newParentBundle != null)
				msgs = ((InternalEObject)newParentBundle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FRAGMENT__PARENT_BUNDLE, null, msgs);
			msgs = basicSetParentBundle(newParentBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FRAGMENT__PARENT_BUNDLE, newParentBundle, newParentBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FRAGMENT__PARENT_BUNDLE:
				return basicSetParentBundle(null, msgs);
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
			case ModelPackage.FRAGMENT__PARENT_BUNDLE:
				return getParentBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.FRAGMENT__PARENT_BUNDLE:
				setParentBundle((Bundle)newValue);
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
			case ModelPackage.FRAGMENT__PARENT_BUNDLE:
				setParentBundle((Bundle)null);
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
			case ModelPackage.FRAGMENT__PARENT_BUNDLE:
				return parentBundle != null;
		}
		return super.eIsSet(featureID);
	}

} //FragmentImpl
