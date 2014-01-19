/**
 */
package com.remainsoftware.fde.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>WS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.remainsoftware.fde.model.ModelPackage#getWS()
 * @model
 * @generated
 */
public enum WS implements Enumerator {
	/**
	 * The '<em><b>Carbon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBON_VALUE
	 * @generated
	 * @ordered
	 */
	CARBON(0, "carbon", "carbon"),

	/**
	 * The '<em><b>Cocoa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCOA_VALUE
	 * @generated
	 * @ordered
	 */
	COCOA(1, "cocoa", "cocoa"),

	/**
	 * The '<em><b>Gtk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTK_VALUE
	 * @generated
	 * @ordered
	 */
	GTK(2, "gtk", "gtk"),

	/**
	 * The '<em><b>Motif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIF_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIF(3, "motif", "motif"),

	/**
	 * The '<em><b>Photon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTON_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTON(4, "photon", "photon"),

	/**
	 * The '<em><b>Win32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN32_VALUE
	 * @generated
	 * @ordered
	 */
	WIN32(5, "win32", "win32"),

	/**
	 * The '<em><b>Wpf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPF_VALUE
	 * @generated
	 * @ordered
	 */
	WPF(6, "wpf", "wpf");

	/**
	 * The '<em><b>Carbon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carbon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARBON
	 * @model name="carbon"
	 * @generated
	 * @ordered
	 */
	public static final int CARBON_VALUE = 0;

	/**
	 * The '<em><b>Cocoa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cocoa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COCOA
	 * @model name="cocoa"
	 * @generated
	 * @ordered
	 */
	public static final int COCOA_VALUE = 1;

	/**
	 * The '<em><b>Gtk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gtk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GTK
	 * @model name="gtk"
	 * @generated
	 * @ordered
	 */
	public static final int GTK_VALUE = 2;

	/**
	 * The '<em><b>Motif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motif</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTIF
	 * @model name="motif"
	 * @generated
	 * @ordered
	 */
	public static final int MOTIF_VALUE = 3;

	/**
	 * The '<em><b>Photon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Photon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHOTON
	 * @model name="photon"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTON_VALUE = 4;

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
	public static final int WIN32_VALUE = 5;

	/**
	 * The '<em><b>Wpf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wpf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPF
	 * @model name="wpf"
	 * @generated
	 * @ordered
	 */
	public static final int WPF_VALUE = 6;

	/**
	 * An array of all the '<em><b>WS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WS[] VALUES_ARRAY =
		new WS[] {
			CARBON,
			COCOA,
			GTK,
			MOTIF,
			PHOTON,
			WIN32,
			WPF,
		};

	/**
	 * A public read-only list of all the '<em><b>WS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>WS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WS get(int value) {
		switch (value) {
			case CARBON_VALUE: return CARBON;
			case COCOA_VALUE: return COCOA;
			case GTK_VALUE: return GTK;
			case MOTIF_VALUE: return MOTIF;
			case PHOTON_VALUE: return PHOTON;
			case WIN32_VALUE: return WIN32;
			case WPF_VALUE: return WPF;
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
	private WS(int value, String name, String literal) {
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
	
} //WS
