/**
 */
package com.remainsoftware.fde.model.impl;

import java.util.Collection;
import com.remainsoftware.fde.model.Bundle;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.Fragment;
import com.remainsoftware.fde.model.ModelPackage;
import com.remainsoftware.fde.model.Version;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.VersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.VersionImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.VersionImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.VersionImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, ModelPackage.VERSION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentEList<Bundle>(Bundle.class, this, ModelPackage.VERSION__BUNDLES);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<Fragment>(Fragment.class, this, ModelPackage.VERSION__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.VERSION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case ModelPackage.VERSION__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
			case ModelPackage.VERSION__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.VERSION__VERSION:
				return getVersion();
			case ModelPackage.VERSION__FEATURES:
				return getFeatures();
			case ModelPackage.VERSION__BUNDLES:
				return getBundles();
			case ModelPackage.VERSION__FRAGMENTS:
				return getFragments();
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
			case ModelPackage.VERSION__VERSION:
				setVersion((String)newValue);
				return;
			case ModelPackage.VERSION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ModelPackage.VERSION__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
			case ModelPackage.VERSION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends Fragment>)newValue);
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
			case ModelPackage.VERSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.VERSION__FEATURES:
				getFeatures().clear();
				return;
			case ModelPackage.VERSION__BUNDLES:
				getBundles().clear();
				return;
			case ModelPackage.VERSION__FRAGMENTS:
				getFragments().clear();
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
			case ModelPackage.VERSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.VERSION__FEATURES:
				return features != null && !features.isEmpty();
			case ModelPackage.VERSION__BUNDLES:
				return bundles != null && !bundles.isEmpty();
			case ModelPackage.VERSION__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
