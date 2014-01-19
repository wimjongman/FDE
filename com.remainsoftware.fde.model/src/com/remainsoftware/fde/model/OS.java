/**
 */
package com.remainsoftware.fde.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.remainsoftware.fde.model.ModelPackage#getOS()
 * @model
 * @generated
 */
public enum OS implements Enumerator {
	/**
	 * The '<em><b>Aix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIX_VALUE
	 * @generated
	 * @ordered
	 */
	AIX(0, "aix", "aix"),

	/**
	 * The '<em><b>Hpux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPUX_VALUE
	 * @generated
	 * @ordered
	 */
	HPUX(1, "hpux", "hpux"),

	/**
	 * The '<em><b>Linux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(2, "linux", "linux"),

	/**
	 * The '<em><b>Macosx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOSX_VALUE
	 * @generated
	 * @ordered
	 */
	MACOSX(3, "macosx", "macosx"),

	/**
	 * The '<em><b>Qnx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNX_VALUE
	 * @generated
	 * @ordered
	 */
	QNX(4, "qnx", "qnx"),

	/**
	 * The '<em><b>Solaris</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS(5, "solaris", "solaris"),

	/**
	 * The '<em><b>Win32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN32_VALUE
	 * @generated
	 * @ordered
	 */
	WIN32(6, "win32", "win32");

	/**
	 * The '<em><b>Aix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aix</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIX
	 * @model name="aix"
	 * @generated
	 * @ordered
	 */
	public static final int AIX_VALUE = 0;

	/**
	 * The '<em><b>Hpux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hpux</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPUX
	 * @model name="hpux"
	 * @generated
	 * @ordered
	 */
	public static final int HPUX_VALUE = 1;

	/**
	 * The '<em><b>Linux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linux</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model name="linux"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 2;

	/**
	 * The '<em><b>Macosx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Macosx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACOSX
	 * @model name="macosx"
	 * @generated
	 * @ordered
	 */
	public static final int MACOSX_VALUE = 3;

	/**
	 * The '<em><b>Qnx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qnx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QNX
	 * @model name="qnx"
	 * @generated
	 * @ordered
	 */
	public static final int QNX_VALUE = 4;

	/**
	 * The '<em><b>Solaris</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS
	 * @model name="solaris"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS_VALUE = 5;

	/**
	 * The '<em><b>Win32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN32
	 * @model name="win32"
	 * @generated
	 * @ordered
	 */
	public static final int WIN32_VALUE = 6;

	/**
	 * An array of all the '<em><b>OS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OS[] VALUES_ARRAY =
		new OS[] {
			AIX,
			HPUX,
			LINUX,
			MACOSX,
			QNX,
			SOLARIS,
			WIN32,
		};

	/**
	 * A public read-only list of all the '<em><b>OS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OS get(int value) {
		switch (value) {
			case AIX_VALUE: return AIX;
			case HPUX_VALUE: return HPUX;
			case LINUX_VALUE: return LINUX;
			case MACOSX_VALUE: return MACOSX;
			case QNX_VALUE: return QNX;
			case SOLARIS_VALUE: return SOLARIS;
			case WIN32_VALUE: return WIN32;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OS
