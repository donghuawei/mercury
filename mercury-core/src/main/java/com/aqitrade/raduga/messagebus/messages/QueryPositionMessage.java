/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.aqitrade.raduga.messagebus.messages;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class QueryPositionMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"QueryPositionMessage\",\"namespace\":\"com.aqitrade.raduga.messagebus.messages\",\"fields\":[{\"name\":\"brokerId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"accountID\",\"type\":\"long\"},{\"name\":\"accountAuthId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"accountPassword\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public String brokerId;
  @Deprecated public long accountID;
  @Deprecated public String accountAuthId;
  @Deprecated public String accountPassword;
  @Deprecated public String createDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public QueryPositionMessage() {}

  /**
   * All-args constructor.
   */
  public QueryPositionMessage(String brokerId, Long accountID, String accountAuthId, String accountPassword, String createDate) {
    this.brokerId = brokerId;
    this.accountID = accountID;
    this.accountAuthId = accountAuthId;
    this.accountPassword = accountPassword;
    this.createDate = createDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return brokerId;
    case 1: return accountID;
    case 2: return accountAuthId;
    case 3: return accountPassword;
    case 4: return createDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: brokerId = (String)value$; break;
    case 1: accountID = (Long)value$; break;
    case 2: accountAuthId = (String)value$; break;
    case 3: accountPassword = (String)value$; break;
    case 4: createDate = (String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'brokerId' field.
   */
  public String getBrokerId() {
    return brokerId;
  }

  /**
   * Sets the value of the 'brokerId' field.
   * @param value the value to set.
   */
  public void setBrokerId(String value) {
    this.brokerId = value;
  }

  /**
   * Gets the value of the 'accountID' field.
   */
  public Long getAccountID() {
    return accountID;
  }

  /**
   * Sets the value of the 'accountID' field.
   * @param value the value to set.
   */
  public void setAccountID(Long value) {
    this.accountID = value;
  }

  /**
   * Gets the value of the 'accountAuthId' field.
   */
  public String getAccountAuthId() {
    return accountAuthId;
  }

  /**
   * Sets the value of the 'accountAuthId' field.
   * @param value the value to set.
   */
  public void setAccountAuthId(String value) {
    this.accountAuthId = value;
  }

  /**
   * Gets the value of the 'accountPassword' field.
   */
  public String getAccountPassword() {
    return accountPassword;
  }

  /**
   * Sets the value of the 'accountPassword' field.
   * @param value the value to set.
   */
  public void setAccountPassword(String value) {
    this.accountPassword = value;
  }

  /**
   * Gets the value of the 'createDate' field.
   */
  public String getCreateDate() {
    return createDate;
  }

  /**
   * Sets the value of the 'createDate' field.
   * @param value the value to set.
   */
  public void setCreateDate(String value) {
    this.createDate = value;
  }

  /** Creates a new QueryPositionMessage RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new QueryPositionMessage RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new QueryPositionMessage RecordBuilder by copying an existing QueryPositionMessage instance */
  public static Builder newBuilder(QueryPositionMessage other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for QueryPositionMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<QueryPositionMessage>
    implements org.apache.avro.data.RecordBuilder<QueryPositionMessage> {

    private String brokerId;
    private long accountID;
    private String accountAuthId;
    private String accountPassword;
    private String createDate;

    /** Creates a new Builder */
    private Builder() {
      super(QueryPositionMessage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.brokerId)) {
        this.brokerId = data().deepCopy(fields()[0].schema(), other.brokerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.accountID)) {
        this.accountID = data().deepCopy(fields()[1].schema(), other.accountID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.accountAuthId)) {
        this.accountAuthId = data().deepCopy(fields()[2].schema(), other.accountAuthId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accountPassword)) {
        this.accountPassword = data().deepCopy(fields()[3].schema(), other.accountPassword);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createDate)) {
        this.createDate = data().deepCopy(fields()[4].schema(), other.createDate);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing QueryPositionMessage instance */
    private Builder(QueryPositionMessage other) {
            super(QueryPositionMessage.SCHEMA$);
      if (isValidValue(fields()[0], other.brokerId)) {
        this.brokerId = data().deepCopy(fields()[0].schema(), other.brokerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.accountID)) {
        this.accountID = data().deepCopy(fields()[1].schema(), other.accountID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.accountAuthId)) {
        this.accountAuthId = data().deepCopy(fields()[2].schema(), other.accountAuthId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accountPassword)) {
        this.accountPassword = data().deepCopy(fields()[3].schema(), other.accountPassword);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createDate)) {
        this.createDate = data().deepCopy(fields()[4].schema(), other.createDate);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'brokerId' field */
    public String getBrokerId() {
      return brokerId;
    }
    
    /** Sets the value of the 'brokerId' field */
    public Builder setBrokerId(String value) {
      validate(fields()[0], value);
      this.brokerId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'brokerId' field has been set */
    public boolean hasBrokerId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'brokerId' field */
    public Builder clearBrokerId() {
      brokerId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'accountID' field */
    public Long getAccountID() {
      return accountID;
    }
    
    /** Sets the value of the 'accountID' field */
    public Builder setAccountID(long value) {
      validate(fields()[1], value);
      this.accountID = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'accountID' field has been set */
    public boolean hasAccountID() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'accountID' field */
    public Builder clearAccountID() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'accountAuthId' field */
    public String getAccountAuthId() {
      return accountAuthId;
    }
    
    /** Sets the value of the 'accountAuthId' field */
    public Builder setAccountAuthId(String value) {
      validate(fields()[2], value);
      this.accountAuthId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'accountAuthId' field has been set */
    public boolean hasAccountAuthId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'accountAuthId' field */
    public Builder clearAccountAuthId() {
      accountAuthId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'accountPassword' field */
    public String getAccountPassword() {
      return accountPassword;
    }
    
    /** Sets the value of the 'accountPassword' field */
    public Builder setAccountPassword(String value) {
      validate(fields()[3], value);
      this.accountPassword = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'accountPassword' field has been set */
    public boolean hasAccountPassword() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'accountPassword' field */
    public Builder clearAccountPassword() {
      accountPassword = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'createDate' field */
    public String getCreateDate() {
      return createDate;
    }
    
    /** Sets the value of the 'createDate' field */
    public Builder setCreateDate(String value) {
      validate(fields()[4], value);
      this.createDate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'createDate' field has been set */
    public boolean hasCreateDate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'createDate' field */
    public Builder clearCreateDate() {
      createDate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public QueryPositionMessage build() {
      try {
        QueryPositionMessage record = new QueryPositionMessage();
        record.brokerId = fieldSetFlags()[0] ? this.brokerId : (String) defaultValue(fields()[0]);
        record.accountID = fieldSetFlags()[1] ? this.accountID : (Long) defaultValue(fields()[1]);
        record.accountAuthId = fieldSetFlags()[2] ? this.accountAuthId : (String) defaultValue(fields()[2]);
        record.accountPassword = fieldSetFlags()[3] ? this.accountPassword : (String) defaultValue(fields()[3]);
        record.createDate = fieldSetFlags()[4] ? this.createDate : (String) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}