/**
 */
package com.remainsoftware.fde.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MATCH RULE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.remainsoftware.fde.model.ModelPackage#getMATCH_RULE()
 * @model
 * @generated
 */
public enum MATCH_RULE implements Enumerator {
	/**
	 * The '<em><b>Equivalent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(0, "Equivalent", "Equivalent"),

	/**
	 * The '<em><b>Compatible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPATIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPATIBLE(1, "Compatible", "Compatible"),

	/**
	 * The '<em><b>Perfect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFECT_VALUE
	 * @generated
	 * @ordered
	 */
	PERFECT(2, "Perfect", "Perfect"),

	/**
	 * The '<em><b>Greateror Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATEROR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATEROR_EQUAL(3, "GreaterorEqual", "Greater or Equal");

	/**
	 * The '<em><b>Equivalent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equivalent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT
	 * @model name="Equivalent"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 0;

	/**
	 * The '<em><b>Compatible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compatible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPATIBLE
	 * @model name="Compatible"
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_VALUE = 1;

	/**
	 * The '<em><b>Perfect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perfect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFECT
	 * @model name="Perfect"
	 * @generated
	 * @ordered
	 */
	public static final int PERFECT_VALUE = 2;

	/**
	 * The '<em><b>Greateror Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greateror Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATEROR_EQUAL
	 * @model name="GreaterorEqual" literal="Greater or Equal"
	 * @generated
	 * @ordered
	 */
	public static final int GREATEROR_EQUAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>MATCH RULE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MATCH_RULE[] VALUES_ARRAY =
		new MATCH_RULE[] {
			EQUIVALENT,
			COMPATIBLE,
			PERFECT,
			GREATEROR_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>MATCH RULE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MATCH_RULE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MATCH RULE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MATCH_RULE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MATCH_RULE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MATCH RULE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MATCH_RULE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MATCH_RULE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MATCH RULE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MATCH_RULE get(int value) {
		switch (value) {
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case COMPATIBLE_VALUE: return COMPATIBLE;
			case PERFECT_VALUE: return PERFECT;
			case GREATEROR_EQUAL_VALUE: return GREATEROR_EQUAL;
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
	private MATCH_RULE(int value, String name, String literal) {
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
	
} //MATCH_RULE
