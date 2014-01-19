/**
 */
package com.remainsoftware.fde.model.impl;

import com.remainsoftware.fde.model.BREE;
import com.remainsoftware.fde.model.IncludedBundleOrFragment;
import com.remainsoftware.fde.model.Manifest;
import com.remainsoftware.fde.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Bundle Or Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl#getDownloadSize <em>Download Size</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl#getInstallationSize <em>Installation Size</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl#isUnpack <em>Unpack</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl#getBree <em>Bree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludedBundleOrFragmentImpl extends MinimalEObjectImpl.Container implements IncludedBundleOrFragment {
	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected Manifest included;

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
	 * The default value of the '{@link #getDownloadSize() <em>Download Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DOWNLOAD_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDownloadSize() <em>Download Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadSize()
	 * @generated
	 * @ordered
	 */
	protected int downloadSize = DOWNLOAD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstallationSize() <em>Installation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTALLATION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstallationSize() <em>Installation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationSize()
	 * @generated
	 * @ordered
	 */
	protected int installationSize = INSTALLATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnpack() <em>Unpack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnpack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNPACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnpack() <em>Unpack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnpack()
	 * @generated
	 * @ordered
	 */
	protected boolean unpack = UNPACK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBree() <em>Bree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBree()
	 * @generated
	 * @ordered
	 */
	protected BREE bree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedBundleOrFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest getIncluded() {
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncluded(Manifest newIncluded, NotificationChain msgs) {
		Manifest oldIncluded = included;
		included = newIncluded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED, oldIncluded, newIncluded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncluded(Manifest newIncluded) {
		if (newIncluded != included) {
			NotificationChain msgs = null;
			if (included != null)
				msgs = ((InternalEObject)included).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED, null, msgs);
			if (newIncluded != null)
				msgs = ((InternalEObject)newIncluded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED, null, msgs);
			msgs = basicSetIncluded(newIncluded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED, newIncluded, newIncluded));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDownloadSize() {
		return downloadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadSize(int newDownloadSize) {
		int oldDownloadSize = downloadSize;
		downloadSize = newDownloadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE, oldDownloadSize, downloadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstallationSize() {
		return installationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationSize(int newInstallationSize) {
		int oldInstallationSize = installationSize;
		installationSize = newInstallationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE, oldInstallationSize, installationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnpack() {
		return unpack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnpack(boolean newUnpack) {
		boolean oldUnpack = unpack;
		unpack = newUnpack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK, oldUnpack, unpack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BREE getBree() {
		return bree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBree(BREE newBree, NotificationChain msgs) {
		BREE oldBree = bree;
		bree = newBree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE, oldBree, newBree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBree(BREE newBree) {
		if (newBree != bree) {
			NotificationChain msgs = null;
			if (bree != null)
				msgs = ((InternalEObject)bree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE, null, msgs);
			if (newBree != null)
				msgs = ((InternalEObject)newBree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE, null, msgs);
			msgs = basicSetBree(newBree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE, newBree, newBree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED:
				return basicSetIncluded(null, msgs);
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE:
				return basicSetBree(null, msgs);
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
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED:
				return getIncluded();
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION:
				return getVersion();
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE:
				return getDownloadSize();
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE:
				return getInstallationSize();
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK:
				return isUnpack();
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE:
				return getBree();
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
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED:
				setIncluded((Manifest)newValue);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION:
				setVersion((String)newValue);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE:
				setDownloadSize((Integer)newValue);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE:
				setInstallationSize((Integer)newValue);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK:
				setUnpack((Boolean)newValue);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE:
				setBree((BREE)newValue);
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
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED:
				setIncluded((Manifest)null);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE:
				setDownloadSize(DOWNLOAD_SIZE_EDEFAULT);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE:
				setInstallationSize(INSTALLATION_SIZE_EDEFAULT);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK:
				setUnpack(UNPACK_EDEFAULT);
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE:
				setBree((BREE)null);
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
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED:
				return included != null;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE:
				return downloadSize != DOWNLOAD_SIZE_EDEFAULT;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE:
				return installationSize != INSTALLATION_SIZE_EDEFAULT;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK:
				return unpack != UNPACK_EDEFAULT;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE:
				return bree != null;
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
		result.append(", downloadSize: ");
		result.append(downloadSize);
		result.append(", installationSize: ");
		result.append(installationSize);
		result.append(", unpack: ");
		result.append(unpack);
		result.append(')');
		return result.toString();
	}

} //IncludedBundleOrFragmentImpl
