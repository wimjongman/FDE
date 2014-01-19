/**
 */
package com.remainsoftware.fde.model.impl;

import com.remainsoftware.fde.model.MATCH_RULE;
import com.remainsoftware.fde.model.Manifest;
import com.remainsoftware.fde.model.ModelPackage;
import com.remainsoftware.fde.model.Required;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.RequiredImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.RequiredImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.RequiredImpl#getMatchRule <em>Match Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredImpl extends MinimalEObjectImpl.Container implements Required {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Manifest required;

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
	 * The default value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected static final MATCH_RULE MATCH_RULE_EDEFAULT = MATCH_RULE.EQUIVALENT;

	/**
	 * The cached value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected MATCH_RULE matchRule = MATCH_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REQUIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (Manifest)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.REQUIRED__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Manifest newRequired) {
		Manifest oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIRED__REQUIRED, oldRequired, required));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIRED__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATCH_RULE getMatchRule() {
		return matchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchRule(MATCH_RULE newMatchRule) {
		MATCH_RULE oldMatchRule = matchRule;
		matchRule = newMatchRule == null ? MATCH_RULE_EDEFAULT : newMatchRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQUIRED__MATCH_RULE, oldMatchRule, matchRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REQUIRED__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case ModelPackage.REQUIRED__VERSION:
				return getVersion();
			case ModelPackage.REQUIRED__MATCH_RULE:
				return getMatchRule();
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
			case ModelPackage.REQUIRED__REQUIRED:
				setRequired((Manifest)newValue);
				return;
			case ModelPackage.REQUIRED__VERSION:
				setVersion((String)newValue);
				return;
			case ModelPackage.REQUIRED__MATCH_RULE:
				setMatchRule((MATCH_RULE)newValue);
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
			case ModelPackage.REQUIRED__REQUIRED:
				setRequired((Manifest)null);
				return;
			case ModelPackage.REQUIRED__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.REQUIRED__MATCH_RULE:
				setMatchRule(MATCH_RULE_EDEFAULT);
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
			case ModelPackage.REQUIRED__REQUIRED:
				return required != null;
			case ModelPackage.REQUIRED__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.REQUIRED__MATCH_RULE:
				return matchRule != MATCH_RULE_EDEFAULT;
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
		result.append(", matchRule: ");
		result.append(matchRule);
		result.append(')');
		return result.toString();
	}

} //RequiredImpl
