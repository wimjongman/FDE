/**
 */
package com.remainsoftware.fde.model.impl;

import com.remainsoftware.fde.model.BREE;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.IncludedFeature;
import com.remainsoftware.fde.model.ModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Included Feature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedFeatureImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedFeatureImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedFeatureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedFeatureImpl#getBree <em>Bree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludedFeatureImpl extends MinimalEObjectImpl.Container implements
		IncludedFeature {
	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected Feature included;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBree() <em>Bree</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBree()
	 * @generated
	 * @ordered
	 */
	protected BREE bree;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INCLUDED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getIncluded() {
		if (included != null && included.eIsProxy()) {
			InternalEObject oldIncluded = (InternalEObject)included;
			included = (Feature)eResolveProxy(oldIncluded);
			if (included != oldIncluded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.INCLUDED_FEATURE__INCLUDED, oldIncluded, included));
			}
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetIncluded() {
		return included;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncluded(Feature newIncluded) {
		Feature oldIncluded = included;
		included = newIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_FEATURE__INCLUDED, oldIncluded, included));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_FEATURE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_FEATURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BREE getBree() {
		return bree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBree(BREE newBree, NotificationChain msgs) {
		BREE oldBree = bree;
		bree = newBree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_FEATURE__BREE, oldBree, newBree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBree(BREE newBree) {
		if (newBree != bree) {
			NotificationChain msgs = null;
			if (bree != null)
				msgs = ((InternalEObject)bree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INCLUDED_FEATURE__BREE, null, msgs);
			if (newBree != null)
				msgs = ((InternalEObject)newBree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INCLUDED_FEATURE__BREE, null, msgs);
			msgs = basicSetBree(newBree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_FEATURE__BREE, newBree, newBree));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INCLUDED_FEATURE__BREE:
				return basicSetBree(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.INCLUDED_FEATURE__INCLUDED:
				if (resolve) return getIncluded();
				return basicGetIncluded();
			case ModelPackage.INCLUDED_FEATURE__FEATURE_NAME:
				return getFeatureName();
			case ModelPackage.INCLUDED_FEATURE__VERSION:
				return getVersion();
			case ModelPackage.INCLUDED_FEATURE__BREE:
				return getBree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.INCLUDED_FEATURE__INCLUDED:
				setIncluded((Feature)newValue);
				return;
			case ModelPackage.INCLUDED_FEATURE__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case ModelPackage.INCLUDED_FEATURE__VERSION:
				setVersion((String)newValue);
				return;
			case ModelPackage.INCLUDED_FEATURE__BREE:
				setBree((BREE)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.INCLUDED_FEATURE__INCLUDED:
				setIncluded((Feature)null);
				return;
			case ModelPackage.INCLUDED_FEATURE__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case ModelPackage.INCLUDED_FEATURE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.INCLUDED_FEATURE__BREE:
				setBree((BREE)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.INCLUDED_FEATURE__INCLUDED:
				return included != null;
			case ModelPackage.INCLUDED_FEATURE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case ModelPackage.INCLUDED_FEATURE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.INCLUDED_FEATURE__BREE:
				return bree != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} // IncludedFeatureImpl
