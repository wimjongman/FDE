/**
 */
package com.remainsoftware.fde.model.impl;

import java.util.Collection;

import com.remainsoftware.fde.model.ARCH;
import com.remainsoftware.fde.model.BREE;
import com.remainsoftware.fde.model.ModelPackage;
import com.remainsoftware.fde.model.OS;
import com.remainsoftware.fde.model.WS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BREE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.impl.BREEImpl#getWindowingSystem <em>Windowing System</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.BREEImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.BREEImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.impl.BREEImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BREEImpl extends MinimalEObjectImpl.Container implements BREE {
	/**
	 * The cached value of the '{@link #getWindowingSystem() <em>Windowing System</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowingSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<WS> windowingSystem;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected EList<ARCH> architecture;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<OS> operatingSystem;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BREEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WS> getWindowingSystem() {
		if (windowingSystem == null) {
			windowingSystem = new EDataTypeUniqueEList<WS>(WS.class, this, ModelPackage.BREE__WINDOWING_SYSTEM);
		}
		return windowingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARCH> getArchitecture() {
		if (architecture == null) {
			architecture = new EDataTypeUniqueEList<ARCH>(ARCH.class, this, ModelPackage.BREE__ARCHITECTURE);
		}
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OS> getOperatingSystem() {
		if (operatingSystem == null) {
			operatingSystem = new EDataTypeUniqueEList<OS>(OS.class, this, ModelPackage.BREE__OPERATING_SYSTEM);
		}
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.BREE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BREE__WINDOWING_SYSTEM:
				return getWindowingSystem();
			case ModelPackage.BREE__ARCHITECTURE:
				return getArchitecture();
			case ModelPackage.BREE__OPERATING_SYSTEM:
				return getOperatingSystem();
			case ModelPackage.BREE__LANGUAGE:
				return getLanguage();
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
			case ModelPackage.BREE__WINDOWING_SYSTEM:
				getWindowingSystem().clear();
				getWindowingSystem().addAll((Collection<? extends WS>)newValue);
				return;
			case ModelPackage.BREE__ARCHITECTURE:
				getArchitecture().clear();
				getArchitecture().addAll((Collection<? extends ARCH>)newValue);
				return;
			case ModelPackage.BREE__OPERATING_SYSTEM:
				getOperatingSystem().clear();
				getOperatingSystem().addAll((Collection<? extends OS>)newValue);
				return;
			case ModelPackage.BREE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
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
			case ModelPackage.BREE__WINDOWING_SYSTEM:
				getWindowingSystem().clear();
				return;
			case ModelPackage.BREE__ARCHITECTURE:
				getArchitecture().clear();
				return;
			case ModelPackage.BREE__OPERATING_SYSTEM:
				getOperatingSystem().clear();
				return;
			case ModelPackage.BREE__LANGUAGE:
				getLanguage().clear();
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
			case ModelPackage.BREE__WINDOWING_SYSTEM:
				return windowingSystem != null && !windowingSystem.isEmpty();
			case ModelPackage.BREE__ARCHITECTURE:
				return architecture != null && !architecture.isEmpty();
			case ModelPackage.BREE__OPERATING_SYSTEM:
				return operatingSystem != null && !operatingSystem.isEmpty();
			case ModelPackage.BREE__LANGUAGE:
				return language != null && !language.isEmpty();
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
		result.append(" (windowingSystem: ");
		result.append(windowingSystem);
		result.append(", architecture: ");
		result.append(architecture);
		result.append(", operatingSystem: ");
		result.append(operatingSystem);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //BREEImpl
