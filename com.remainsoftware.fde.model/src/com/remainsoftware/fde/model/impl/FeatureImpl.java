/**
 */
package com.remainsoftware.fde.model.impl;

import java.util.Collection;
import com.remainsoftware.fde.model.Description;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.IncludedBundleOrFragment;
import com.remainsoftware.fde.model.IncludedFeature;
import com.remainsoftware.fde.model.LicenseAgreement;
import com.remainsoftware.fde.model.ModelPackage;
import com.remainsoftware.fde.model.Required;
import com.remainsoftware.fde.model.SiteToVisit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getFeatureDescription <em>Feature Description</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getCopyrightNotice <em>Copyright Notice</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getLicenseAgreement <em>License Agreement</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getSitesToVisit <em>Sites To Visit</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getIncludedBundlesAndFragments <em>Included Bundles And Fragments</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getIncludedFeatures <em>Included Features</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.FeatureImpl#getRequiredFeatures <em>Required Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends ManifestImpl implements Feature {
	/**
	 * The cached value of the '{@link #getFeatureDescription() <em>Feature Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDescription()
	 * @generated
	 * @ordered
	 */
	protected Description featureDescription;

	/**
	 * The cached value of the '{@link #getCopyrightNotice() <em>Copyright Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightNotice()
	 * @generated
	 * @ordered
	 */
	protected Description copyrightNotice;

	/**
	 * The cached value of the '{@link #getLicenseAgreement() <em>License Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected LicenseAgreement licenseAgreement;

	/**
	 * The cached value of the '{@link #getSitesToVisit() <em>Sites To Visit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitesToVisit()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteToVisit> sitesToVisit;

	/**
	 * The cached value of the '{@link #getIncludedBundlesAndFragments() <em>Included Bundles And Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedBundlesAndFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludedBundleOrFragment> includedBundlesAndFragments;

	/**
	 * The cached value of the '{@link #getIncludedFeatures() <em>Included Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludedFeature> includedFeatures;

	/**
	 * The cached value of the '{@link #getRequiredFeatures() <em>Required Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Required> requiredFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getFeatureDescription() {
		return featureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureDescription(Description newFeatureDescription, NotificationChain msgs) {
		Description oldFeatureDescription = featureDescription;
		featureDescription = newFeatureDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__FEATURE_DESCRIPTION, oldFeatureDescription, newFeatureDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureDescription(Description newFeatureDescription) {
		if (newFeatureDescription != featureDescription) {
			NotificationChain msgs = null;
			if (featureDescription != null)
				msgs = ((InternalEObject)featureDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FEATURE__FEATURE_DESCRIPTION, null, msgs);
			if (newFeatureDescription != null)
				msgs = ((InternalEObject)newFeatureDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FEATURE__FEATURE_DESCRIPTION, null, msgs);
			msgs = basicSetFeatureDescription(newFeatureDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__FEATURE_DESCRIPTION, newFeatureDescription, newFeatureDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getCopyrightNotice() {
		return copyrightNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightNotice(Description newCopyrightNotice, NotificationChain msgs) {
		Description oldCopyrightNotice = copyrightNotice;
		copyrightNotice = newCopyrightNotice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__COPYRIGHT_NOTICE, oldCopyrightNotice, newCopyrightNotice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightNotice(Description newCopyrightNotice) {
		if (newCopyrightNotice != copyrightNotice) {
			NotificationChain msgs = null;
			if (copyrightNotice != null)
				msgs = ((InternalEObject)copyrightNotice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FEATURE__COPYRIGHT_NOTICE, null, msgs);
			if (newCopyrightNotice != null)
				msgs = ((InternalEObject)newCopyrightNotice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FEATURE__COPYRIGHT_NOTICE, null, msgs);
			msgs = basicSetCopyrightNotice(newCopyrightNotice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__COPYRIGHT_NOTICE, newCopyrightNotice, newCopyrightNotice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseAgreement getLicenseAgreement() {
		return licenseAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseAgreement(LicenseAgreement newLicenseAgreement, NotificationChain msgs) {
		LicenseAgreement oldLicenseAgreement = licenseAgreement;
		licenseAgreement = newLicenseAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__LICENSE_AGREEMENT, oldLicenseAgreement, newLicenseAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseAgreement(LicenseAgreement newLicenseAgreement) {
		if (newLicenseAgreement != licenseAgreement) {
			NotificationChain msgs = null;
			if (licenseAgreement != null)
				msgs = ((InternalEObject)licenseAgreement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FEATURE__LICENSE_AGREEMENT, null, msgs);
			if (newLicenseAgreement != null)
				msgs = ((InternalEObject)newLicenseAgreement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FEATURE__LICENSE_AGREEMENT, null, msgs);
			msgs = basicSetLicenseAgreement(newLicenseAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__LICENSE_AGREEMENT, newLicenseAgreement, newLicenseAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteToVisit> getSitesToVisit() {
		if (sitesToVisit == null) {
			sitesToVisit = new EObjectContainmentEList<SiteToVisit>(SiteToVisit.class, this, ModelPackage.FEATURE__SITES_TO_VISIT);
		}
		return sitesToVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludedBundleOrFragment> getIncludedBundlesAndFragments() {
		if (includedBundlesAndFragments == null) {
			includedBundlesAndFragments = new EObjectResolvingEList<IncludedBundleOrFragment>(IncludedBundleOrFragment.class, this, ModelPackage.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS);
		}
		return includedBundlesAndFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludedFeature> getIncludedFeatures() {
		if (includedFeatures == null) {
			includedFeatures = new EObjectContainmentEList<IncludedFeature>(IncludedFeature.class, this, ModelPackage.FEATURE__INCLUDED_FEATURES);
		}
		return includedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Required> getRequiredFeatures() {
		if (requiredFeatures == null) {
			requiredFeatures = new EObjectResolvingEList<Required>(Required.class, this, ModelPackage.FEATURE__REQUIRED_FEATURES);
		}
		return requiredFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FEATURE__FEATURE_DESCRIPTION:
				return basicSetFeatureDescription(null, msgs);
			case ModelPackage.FEATURE__COPYRIGHT_NOTICE:
				return basicSetCopyrightNotice(null, msgs);
			case ModelPackage.FEATURE__LICENSE_AGREEMENT:
				return basicSetLicenseAgreement(null, msgs);
			case ModelPackage.FEATURE__SITES_TO_VISIT:
				return ((InternalEList<?>)getSitesToVisit()).basicRemove(otherEnd, msgs);
			case ModelPackage.FEATURE__INCLUDED_FEATURES:
				return ((InternalEList<?>)getIncludedFeatures()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.FEATURE__FEATURE_DESCRIPTION:
				return getFeatureDescription();
			case ModelPackage.FEATURE__COPYRIGHT_NOTICE:
				return getCopyrightNotice();
			case ModelPackage.FEATURE__LICENSE_AGREEMENT:
				return getLicenseAgreement();
			case ModelPackage.FEATURE__SITES_TO_VISIT:
				return getSitesToVisit();
			case ModelPackage.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS:
				return getIncludedBundlesAndFragments();
			case ModelPackage.FEATURE__INCLUDED_FEATURES:
				return getIncludedFeatures();
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				return getRequiredFeatures();
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
			case ModelPackage.FEATURE__FEATURE_DESCRIPTION:
				setFeatureDescription((Description)newValue);
				return;
			case ModelPackage.FEATURE__COPYRIGHT_NOTICE:
				setCopyrightNotice((Description)newValue);
				return;
			case ModelPackage.FEATURE__LICENSE_AGREEMENT:
				setLicenseAgreement((LicenseAgreement)newValue);
				return;
			case ModelPackage.FEATURE__SITES_TO_VISIT:
				getSitesToVisit().clear();
				getSitesToVisit().addAll((Collection<? extends SiteToVisit>)newValue);
				return;
			case ModelPackage.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS:
				getIncludedBundlesAndFragments().clear();
				getIncludedBundlesAndFragments().addAll((Collection<? extends IncludedBundleOrFragment>)newValue);
				return;
			case ModelPackage.FEATURE__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				getIncludedFeatures().addAll((Collection<? extends IncludedFeature>)newValue);
				return;
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				getRequiredFeatures().clear();
				getRequiredFeatures().addAll((Collection<? extends Required>)newValue);
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
			case ModelPackage.FEATURE__FEATURE_DESCRIPTION:
				setFeatureDescription((Description)null);
				return;
			case ModelPackage.FEATURE__COPYRIGHT_NOTICE:
				setCopyrightNotice((Description)null);
				return;
			case ModelPackage.FEATURE__LICENSE_AGREEMENT:
				setLicenseAgreement((LicenseAgreement)null);
				return;
			case ModelPackage.FEATURE__SITES_TO_VISIT:
				getSitesToVisit().clear();
				return;
			case ModelPackage.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS:
				getIncludedBundlesAndFragments().clear();
				return;
			case ModelPackage.FEATURE__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				return;
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				getRequiredFeatures().clear();
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
			case ModelPackage.FEATURE__FEATURE_DESCRIPTION:
				return featureDescription != null;
			case ModelPackage.FEATURE__COPYRIGHT_NOTICE:
				return copyrightNotice != null;
			case ModelPackage.FEATURE__LICENSE_AGREEMENT:
				return licenseAgreement != null;
			case ModelPackage.FEATURE__SITES_TO_VISIT:
				return sitesToVisit != null && !sitesToVisit.isEmpty();
			case ModelPackage.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS:
				return includedBundlesAndFragments != null && !includedBundlesAndFragments.isEmpty();
			case ModelPackage.FEATURE__INCLUDED_FEATURES:
				return includedFeatures != null && !includedFeatures.isEmpty();
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				return requiredFeatures != null && !requiredFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
