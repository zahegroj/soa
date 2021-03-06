/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.sca.vo.xsd;

import commonj.sdo.Type;

import java.io.Serializable;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.transition#getName <em>Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.transition#getTo <em>To</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.transition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class transition extends DataObjectBase implements Serializable
{

	public final static int NAME = 0;

	public final static int CONDITION = 1;

	public final static int TO = 2;

	public final static int ID = 3;

	public final static int SDO_PROPERTY_COUNT = 4;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 0;

	/**
	 * The internal feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONDITION = 1;

	/**
	 * The internal feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TO = 2;

	/**
	 * The internal feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ID = 3;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 4;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_CONDITION: return CONDITION;
			case _INTERNAL_TO: return TO;
			case _INTERNAL_ID: return ID;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_DEFAULT_;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean name_set_ = false;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_DEFAULT_;

	/**
	 * This is true if the Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean condition_set_ = false;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_DEFAULT_;

	/**
	 * This is true if the To attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean to_set_ = false;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_DEFAULT_;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean id_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transition()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getStaticType()
	{
		return ((XsdFactory)XsdFactory.INSTANCE).gettransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStaticPropertyCount()
	{
		return INTERNAL_PROPERTY_COUNT;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		boolean oldName_set_ = name_set_;
		name_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NAME, oldName, name, !oldName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public void unsetName()
	{
		String oldName = name;
		boolean oldName_set_ = name_set_;
		name = NAME_DEFAULT_;
		name_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_NAME, oldName, NAME_DEFAULT_, oldName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.transition#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public boolean isSetName()
	{
		return name_set_;
	}

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	public String getCondition()
	{
		return condition;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @generated
	 */
	public void setCondition(String newCondition)
	{
		String oldCondition = condition;
		condition = newCondition;
		boolean oldCondition_set_ = condition_set_;
		condition_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CONDITION, oldCondition, condition, !oldCondition_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	public void unsetCondition()
	{
		String oldCondition = condition;
		boolean oldCondition_set_ = condition_set_;
		condition = CONDITION_DEFAULT_;
		condition_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_CONDITION, oldCondition, CONDITION_DEFAULT_, oldCondition_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.transition#getCondition <em>Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition</em>' attribute is set.
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	public boolean isSetCondition()
	{
		return condition_set_;
	}

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #isSetTo()
	 * @see #unsetTo()
	 * @see #setTo(String)
	 * @generated
	 */
	public String getTo()
	{
		return to;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.transition#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #isSetTo()
	 * @see #unsetTo()
	 * @see #getTo()
	 * @generated
	 */
	public void setTo(String newTo)
	{
		String oldTo = to;
		to = newTo;
		boolean oldTo_set_ = to_set_;
		to_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TO, oldTo, to, !oldTo_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.transition#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTo()
	 * @see #getTo()
	 * @see #setTo(String)
	 * @generated
	 */
	public void unsetTo()
	{
		String oldTo = to;
		boolean oldTo_set_ = to_set_;
		to = TO_DEFAULT_;
		to_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_TO, oldTo, TO_DEFAULT_, oldTo_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.transition#getTo <em>To</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>To</em>' attribute is set.
	 * @see #unsetTo()
	 * @see #getTo()
	 * @see #setTo(String)
	 * @generated
	 */
	public boolean isSetTo()
	{
		return to_set_;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		boolean oldId_set_ = id_set_;
		id_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ID, oldId, id, !oldId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	public void unsetId()
	{
		int oldId = id;
		boolean oldId_set_ = id_set_;
		id = ID_DEFAULT_;
		id_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ID, oldId, ID_DEFAULT_, oldId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.transition#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	public boolean isSetId()
	{
		return id_set_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object get(int propertyIndex, boolean resolve)
	{
		switch (propertyIndex)
		{
			case NAME:
				return getName();
			case CONDITION:
				return getCondition();
			case TO:
				return getTo();
			case ID:
				return new Integer(getId());
		}
		return super.get(propertyIndex, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(int propertyIndex, Object newValue)
	{
		switch (propertyIndex)
		{
			case NAME:
				setName((String)newValue);
				return;
			case CONDITION:
				setCondition((String)newValue);
				return;
			case TO:
				setTo((String)newValue);
				return;
			case ID:
				setId(((Integer)newValue).intValue());
				return;
		}
		super.set(propertyIndex, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(int propertyIndex)
	{
		switch (propertyIndex)
		{
			case NAME:
				unsetName();
				return;
			case CONDITION:
				unsetCondition();
				return;
			case TO:
				unsetTo();
				return;
			case ID:
				unsetId();
				return;
		}
		super.unset(propertyIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSet(int propertyIndex)
	{
		switch (propertyIndex)
		{
			case NAME:
				return isSetName();
			case CONDITION:
				return isSetCondition();
			case TO:
				return isSetTo();
			case ID:
				return isSetId();
		}
		return super.isSet(propertyIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString()
	{
		if (isProxy(this)) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		if (name_set_) result.append(name); else result.append("<unset>");
		result.append(", condition: ");
		if (condition_set_) result.append(condition); else result.append("<unset>");
		result.append(", to: ");
		if (to_set_) result.append(to); else result.append("<unset>");
		result.append(", id: ");
		if (id_set_) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // transition
