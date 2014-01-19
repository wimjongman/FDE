/**
 */
package com.remainsoftware.fde.model.impl;

import com.remainsoftware.fde.model.LicenseAgreement;
import com.remainsoftware.fde.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.LicenseAgreementImpl#isLocalLicense <em>Local License</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.LicenseAgreementImpl#isSharedLicense <em>Shared License</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LicenseAgreementImpl extends DescriptionImpl implements LicenseAgreement {
	/**
	 * The default value of the '{@link #isLocalLicense() <em>Local License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalLicense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_LICENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalLicense() <em>Local License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalLicense()
	 * @generated
	 * @ordered
	 */
	protected boolean localLicense = LOCAL_LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSharedLicense() <em>Shared License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharedLicense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARED_LICENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSharedLicense() <em>Shared License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharedLicense()
	 * @generated
	 * @ordered
	 */
	protected boolean sharedLicense = SHARED_LICENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseAgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LICENSE_AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalLicense() {
		return localLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalLicense(boolean newLocalLicense) {
		boolean oldLocalLicense = localLicense;
		localLicense = newLocalLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LICENSE_AGREEMENT__LOCAL_LICENSE, oldLocalLicense, localLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSharedLicense() {
		return sharedLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedLicense(boolean newSharedLicense) {
		boolean oldSharedLicense = sharedLicense;
		sharedLicense = newSharedLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LICENSE_AGREEMENT__SHARED_LICENSE, oldSharedLicense, sharedLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LICENSE_AGREEMENT__LOCAL_LICENSE:
				return isLocalLicense();
			case ModelPackage.LICENSE_AGREEMENT__SHARED_LICENSE:
				return isSharedLicense();
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
			case ModelPackage.LICENSE_AGREEMENT__LOCAL_LICENSE:
				setLocalLicense((Boolean)newValue);
				return;
			case ModelPackage.LICENSE_AGREEMENT__SHARED_LICENSE:
				setSharedLicense((Boolean)newValue);
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
			case ModelPackage.LICENSE_AGREEMENT__LOCAL_LICENSE:
				setLocalLicense(LOCAL_LICENSE_EDEFAULT);
				return;
			case ModelPackage.LICENSE_AGREEMENT__SHARED_LICENSE:
				setSharedLicense(SHARED_LICENSE_EDEFAULT);
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
			case ModelPackage.LICENSE_AGREEMENT__LOCAL_LICENSE:
				return localLicense != LOCAL_LICENSE_EDEFAULT;
			case ModelPackage.LICENSE_AGREEMENT__SHARED_LICENSE:
				return sharedLicense != SHARED_LICENSE_EDEFAULT;
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
		result.append(" (localLicense: ");
		result.append(localLicense);
		result.append(", sharedLicense: ");
		result.append(sharedLicense);
		result.append(')');
		return result.toString();
	}

} //LicenseAgreementImpl
