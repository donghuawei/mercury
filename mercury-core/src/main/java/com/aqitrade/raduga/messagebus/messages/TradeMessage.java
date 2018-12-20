/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.aqitrade.raduga.messagebus.messages;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TradeMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TradeMessage\",\"namespace\":\"com.aqitrade.raduga.messagebus.messages\",\"fields\":[{\"name\":\"tradeID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"qty\",\"type\":\"double\"},{\"name\":\"price\",\"type\":\"double\"},{\"name\":\"orderID\",\"type\":\"long\"},{\"name\":\"createDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public String tradeID;
  @Deprecated public double qty;
  @Deprecated public double price;
  @Deprecated public long orderID;
  @Deprecated public String createDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public TradeMessage() {}

  /**
   * All-args constructor.
   */
  public TradeMessage(String tradeID, Double qty, Double price, Long orderID, String createDate) {
    this.tradeID = tradeID;
    this.qty = qty;
    this.price = price;
    this.orderID = orderID;
    this.createDate = createDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return tradeID;
    case 1: return qty;
    case 2: return price;
    case 3: return orderID;
    case 4: return createDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: tradeID = (String)value$; break;
    case 1: qty = (Double)value$; break;
    case 2: price = (Double)value$; break;
    case 3: orderID = (Long)value$; break;
    case 4: createDate = (String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tradeID' field.
   */
  public String getTradeID() {
    return tradeID;
  }

  /**
   * Sets the value of the 'tradeID' field.
   * @param value the value to set.
   */
  public void setTradeID(String value) {
    this.tradeID = value;
  }

  /**
   * Gets the value of the 'qty' field.
   */
  public Double getQty() {
    return qty;
  }

  /**
   * Sets the value of the 'qty' field.
   * @param value the value to set.
   */
  public void setQty(Double value) {
    this.qty = value;
  }

  /**
   * Gets the value of the 'price' field.
   */
  public Double getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(Double value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'orderID' field.
   */
  public Long getOrderID() {
    return orderID;
  }

  /**
   * Sets the value of the 'orderID' field.
   * @param value the value to set.
   */
  public void setOrderID(Long value) {
    this.orderID = value;
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

  /** Creates a new TradeMessage RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new TradeMessage RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new TradeMessage RecordBuilder by copying an existing TradeMessage instance */
  public static Builder newBuilder(TradeMessage other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for TradeMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TradeMessage>
    implements org.apache.avro.data.RecordBuilder<TradeMessage> {

    private String tradeID;
    private double qty;
    private double price;
    private long orderID;
    private String createDate;

    /** Creates a new Builder */
    private Builder() {
      super(TradeMessage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tradeID)) {
        this.tradeID = data().deepCopy(fields()[0].schema(), other.tradeID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.qty)) {
        this.qty = data().deepCopy(fields()[1].schema(), other.qty);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orderID)) {
        this.orderID = data().deepCopy(fields()[3].schema(), other.orderID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createDate)) {
        this.createDate = data().deepCopy(fields()[4].schema(), other.createDate);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TradeMessage instance */
    private Builder(TradeMessage other) {
            super(TradeMessage.SCHEMA$);
      if (isValidValue(fields()[0], other.tradeID)) {
        this.tradeID = data().deepCopy(fields()[0].schema(), other.tradeID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.qty)) {
        this.qty = data().deepCopy(fields()[1].schema(), other.qty);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orderID)) {
        this.orderID = data().deepCopy(fields()[3].schema(), other.orderID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createDate)) {
        this.createDate = data().deepCopy(fields()[4].schema(), other.createDate);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'tradeID' field */
    public String getTradeID() {
      return tradeID;
    }
    
    /** Sets the value of the 'tradeID' field */
    public Builder setTradeID(String value) {
      validate(fields()[0], value);
      this.tradeID = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'tradeID' field has been set */
    public boolean hasTradeID() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'tradeID' field */
    public Builder clearTradeID() {
      tradeID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'qty' field */
    public Double getQty() {
      return qty;
    }
    
    /** Sets the value of the 'qty' field */
    public Builder setQty(double value) {
      validate(fields()[1], value);
      this.qty = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'qty' field has been set */
    public boolean hasQty() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'qty' field */
    public Builder clearQty() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'price' field */
    public Double getPrice() {
      return price;
    }
    
    /** Sets the value of the 'price' field */
    public Builder setPrice(double value) {
      validate(fields()[2], value);
      this.price = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'price' field has been set */
    public boolean hasPrice() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'price' field */
    public Builder clearPrice() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'orderID' field */
    public Long getOrderID() {
      return orderID;
    }
    
    /** Sets the value of the 'orderID' field */
    public Builder setOrderID(long value) {
      validate(fields()[3], value);
      this.orderID = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'orderID' field has been set */
    public boolean hasOrderID() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'orderID' field */
    public Builder clearOrderID() {
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
    public TradeMessage build() {
      try {
        TradeMessage record = new TradeMessage();
        record.tradeID = fieldSetFlags()[0] ? this.tradeID : (String) defaultValue(fields()[0]);
        record.qty = fieldSetFlags()[1] ? this.qty : (Double) defaultValue(fields()[1]);
        record.price = fieldSetFlags()[2] ? this.price : (Double) defaultValue(fields()[2]);
        record.orderID = fieldSetFlags()[3] ? this.orderID : (Long) defaultValue(fields()[3]);
        record.createDate = fieldSetFlags()[4] ? this.createDate : (String) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
