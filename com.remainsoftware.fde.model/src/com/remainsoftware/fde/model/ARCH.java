/**
 */
package com.remainsoftware.fde.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ARCH</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.remainsoftware.fde.model.ModelPackage#getARCH()
 * @model
 * @generated
 */
public enum ARCH implements Enumerator {
	/**
	 * The '<em><b>Ia64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IA64_VALUE
	 * @generated
	 * @ordered
	 */
	IA64(0, "ia64", "ia64"),

	/**
	 * The '<em><b>Ia64 32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IA64_32_VALUE
	 * @generated
	 * @ordered
	 */
	IA64_32(1, "ia64_32", "ia64_32"),

	/**
	 * The '<em><b>PA RISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PA_RISC_VALUE
	 * @generated
	 * @ordered
	 */
	PA_RISC(2, "PA_RISC", "PA_RISC"),

	/**
	 * The '<em><b>Ppc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPC_VALUE
	 * @generated
	 * @ordered
	 */
	PPC(3, "ppc", "ppc"),

	/**
	 * The '<em><b>Sparc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARC_VALUE
	 * @generated
	 * @ordered
	 */
	SPARC(4, "sparc", "sparc"),

	/**
	 * The '<em><b>X86</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X86_VALUE
	 * @generated
	 * @ordered
	 */
	X86(5, "x86", "x86"),

	/**
	 * The '<em><b>X86 64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X86_64_VALUE
	 * @generated
	 * @ordered
	 */
	X86_64(6, "x86_64", "x86_64");

	/**
	 * The '<em><b>Ia64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ia64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IA64
	 * @model name="ia64"
	 * @generated
	 * @ordered
	 */
	public static final int IA64_VALUE = 0;

	/**
	 * The '<em><b>Ia64 32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ia64 32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IA64_32
	 * @model name="ia64_32"
	 * @generated
	 * @ordered
	 */
	public static final int IA64_32_VALUE = 1;

	/**
	 * The '<em><b>PA RISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PA RISC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PA_RISC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PA_RISC_VALUE = 2;

	/**
	 * The '<em><b>Ppc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ppc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPC
	 * @model name="ppc"
	 * @generated
	 * @ordered
	 */
	public static final int PPC_VALUE = 3;

	/**
	 * The '<em><b>Sparc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sparc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPARC
	 * @model name="sparc"
	 * @generated
	 * @ordered
	 */
	public static final int SPARC_VALUE = 4;

	/**
	 * The '<em><b>X86</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X86
	 * @model name="x86"
	 * @generated
	 * @ordered
	 */
	public static final int X86_VALUE = 5;

	/**
	 * The '<em><b>X86 64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86 64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X86_64
	 * @model name="x86_64"
	 * @generated
	 * @ordered
	 */
	public static final int X86_64_VALUE = 6;

	/**
	 * An array of all the '<em><b>ARCH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ARCH[] VALUES_ARRAY =
		new ARCH[] {
			IA64,
			IA64_32,
			PA_RISC,
			PPC,
			SPARC,
			X86,
			X86_64,
		};

	/**
	 * A public read-only list of all the '<em><b>ARCH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ARCH> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ARCH</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ARCH get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ARCH result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ARCH</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ARCH getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ARCH result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ARCH</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ARCH get(int value) {
		switch (value) {
			case IA64_VALUE: return IA64;
			case IA64_32_VALUE: return IA64_32;
			case PA_RISC_VALUE: return PA_RISC;
			case PPC_VALUE: return PPC;
			case SPARC_VALUE: return SPARC;
			case X86_VALUE: return X86;
			case X86_64_VALUE: return X86_64;
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
	private ARCH(int value, String name, String literal) {
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
	
} //ARCH
