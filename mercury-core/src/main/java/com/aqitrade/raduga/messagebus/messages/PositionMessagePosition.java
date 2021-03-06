/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.aqitrade.raduga.messagebus.messages;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PositionMessagePosition extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PositionMessagePosition\",\"namespace\":\"com.aqitrade.raduga.messagebus.messages\",\"fields\":[{\"name\":\"designator\",\"type\":{\"type\":\"enum\",\"name\":\"PositionDesignator\",\"symbols\":[\"cash_position\",\"future_position\",\"stock_position\"]}},{\"name\":\"symbol\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"openPrice\",\"type\":\"double\"},{\"name\":\"openDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"tradingDay\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"tradeID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastSettlementPrice\",\"type\":\"double\"},{\"name\":\"avgPrice\",\"type\":\"double\"},{\"name\":\"qty\",\"type\":\"double\"},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"PositionDirection\",\"symbols\":[\"position_direction_long\",\"position_direction_short\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public PositionDesignator designator;
  @Deprecated public String symbol;
  @Deprecated public double openPrice;
  @Deprecated public String openDate;
  @Deprecated public String tradingDay;
  @Deprecated public String tradeID;
  @Deprecated public double lastSettlementPrice;
  @Deprecated public double avgPrice;
  @Deprecated public double qty;
  @Deprecated public PositionDirection direction;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public PositionMessagePosition() {}

  /**
   * All-args constructor.
   */
  public PositionMessagePosition(PositionDesignator designator, String symbol, Double openPrice, String openDate, String tradingDay, String tradeID, Double lastSettlementPrice, Double avgPrice, Double qty, PositionDirection direction) {
    this.designator = designator;
    this.symbol = symbol;
    this.openPrice = openPrice;
    this.openDate = openDate;
    this.tradingDay = tradingDay;
    this.tradeID = tradeID;
    this.lastSettlementPrice = lastSettlementPrice;
    this.avgPrice = avgPrice;
    this.qty = qty;
    this.direction = direction;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return designator;
    case 1: return symbol;
    case 2: return openPrice;
    case 3: return openDate;
    case 4: return tradingDay;
    case 5: return tradeID;
    case 6: return lastSettlementPrice;
    case 7: return avgPrice;
    case 8: return qty;
    case 9: return direction;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: designator = (PositionDesignator)value$; break;
    case 1: symbol = (String)value$; break;
    case 2: openPrice = (Double)value$; break;
    case 3: openDate = (String)value$; break;
    case 4: tradingDay = (String)value$; break;
    case 5: tradeID = (String)value$; break;
    case 6: lastSettlementPrice = (Double)value$; break;
    case 7: avgPrice = (Double)value$; break;
    case 8: qty = (Double)value$; break;
    case 9: direction = (PositionDirection)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'designator' field.
   */
  public PositionDesignator getDesignator() {
    return designator;
  }

  /**
   * Sets the value of the 'designator' field.
   * @param value the value to set.
   */
  public void setDesignator(PositionDesignator value) {
    this.designator = value;
  }

  /**
   * Gets the value of the 'symbol' field.
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * Sets the value of the 'symbol' field.
   * @param value the value to set.
   */
  public void setSymbol(String value) {
    this.symbol = value;
  }

  /**
   * Gets the value of the 'openPrice' field.
   */
  public Double getOpenPrice() {
    return openPrice;
  }

  /**
   * Sets the value of the 'openPrice' field.
   * @param value the value to set.
   */
  public void setOpenPrice(Double value) {
    this.openPrice = value;
  }

  /**
   * Gets the value of the 'openDate' field.
   */
  public String getOpenDate() {
    return openDate;
  }

  /**
   * Sets the value of the 'openDate' field.
   * @param value the value to set.
   */
  public void setOpenDate(String value) {
    this.openDate = value;
  }

  /**
   * Gets the value of the 'tradingDay' field.
   */
  public String getTradingDay() {
    return tradingDay;
  }

  /**
   * Sets the value of the 'tradingDay' field.
   * @param value the value to set.
   */
  public void setTradingDay(String value) {
    this.tradingDay = value;
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
   * Gets the value of the 'lastSettlementPrice' field.
   */
  public Double getLastSettlementPrice() {
    return lastSettlementPrice;
  }

  /**
   * Sets the value of the 'lastSettlementPrice' field.
   * @param value the value to set.
   */
  public void setLastSettlementPrice(Double value) {
    this.lastSettlementPrice = value;
  }

  /**
   * Gets the value of the 'avgPrice' field.
   */
  public Double getAvgPrice() {
    return avgPrice;
  }

  /**
   * Sets the value of the 'avgPrice' field.
   * @param value the value to set.
   */
  public void setAvgPrice(Double value) {
    this.avgPrice = value;
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
   * Gets the value of the 'direction' field.
   */
  public PositionDirection getDirection() {
    return direction;
  }

  /**
   * Sets the value of the 'direction' field.
   * @param value the value to set.
   */
  public void setDirection(PositionDirection value) {
    this.direction = value;
  }

  /** Creates a new PositionMessagePosition RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new PositionMessagePosition RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new PositionMessagePosition RecordBuilder by copying an existing PositionMessagePosition instance */
  public static Builder newBuilder(PositionMessagePosition other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for PositionMessagePosition instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PositionMessagePosition>
    implements org.apache.avro.data.RecordBuilder<PositionMessagePosition> {

    private PositionDesignator designator;
    private String symbol;
    private double openPrice;
    private String openDate;
    private String tradingDay;
    private String tradeID;
    private double lastSettlementPrice;
    private double avgPrice;
    private double qty;
    private PositionDirection direction;

    /** Creates a new Builder */
    private Builder() {
      super(PositionMessagePosition.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.designator)) {
        this.designator = data().deepCopy(fields()[0].schema(), other.designator);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.symbol)) {
        this.symbol = data().deepCopy(fields()[1].schema(), other.symbol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.openPrice)) {
        this.openPrice = data().deepCopy(fields()[2].schema(), other.openPrice);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.openDate)) {
        this.openDate = data().deepCopy(fields()[3].schema(), other.openDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tradingDay)) {
        this.tradingDay = data().deepCopy(fields()[4].schema(), other.tradingDay);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tradeID)) {
        this.tradeID = data().deepCopy(fields()[5].schema(), other.tradeID);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastSettlementPrice)) {
        this.lastSettlementPrice = data().deepCopy(fields()[6].schema(), other.lastSettlementPrice);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.avgPrice)) {
        this.avgPrice = data().deepCopy(fields()[7].schema(), other.avgPrice);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.qty)) {
        this.qty = data().deepCopy(fields()[8].schema(), other.qty);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.direction)) {
        this.direction = data().deepCopy(fields()[9].schema(), other.direction);
        fieldSetFlags()[9] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PositionMessagePosition instance */
    private Builder(PositionMessagePosition other) {
            super(PositionMessagePosition.SCHEMA$);
      if (isValidValue(fields()[0], other.designator)) {
        this.designator = data().deepCopy(fields()[0].schema(), other.designator);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.symbol)) {
        this.symbol = data().deepCopy(fields()[1].schema(), other.symbol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.openPrice)) {
        this.openPrice = data().deepCopy(fields()[2].schema(), other.openPrice);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.openDate)) {
        this.openDate = data().deepCopy(fields()[3].schema(), other.openDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tradingDay)) {
        this.tradingDay = data().deepCopy(fields()[4].schema(), other.tradingDay);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tradeID)) {
        this.tradeID = data().deepCopy(fields()[5].schema(), other.tradeID);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastSettlementPrice)) {
        this.lastSettlementPrice = data().deepCopy(fields()[6].schema(), other.lastSettlementPrice);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.avgPrice)) {
        this.avgPrice = data().deepCopy(fields()[7].schema(), other.avgPrice);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.qty)) {
        this.qty = data().deepCopy(fields()[8].schema(), other.qty);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.direction)) {
        this.direction = data().deepCopy(fields()[9].schema(), other.direction);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'designator' field */
    public PositionDesignator getDesignator() {
      return designator;
    }
    
    /** Sets the value of the 'designator' field */
    public Builder setDesignator(PositionDesignator value) {
      validate(fields()[0], value);
      this.designator = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'designator' field has been set */
    public boolean hasDesignator() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'designator' field */
    public Builder clearDesignator() {
      designator = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'symbol' field */
    public String getSymbol() {
      return symbol;
    }
    
    /** Sets the value of the 'symbol' field */
    public Builder setSymbol(String value) {
      validate(fields()[1], value);
      this.symbol = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'symbol' field has been set */
    public boolean hasSymbol() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'symbol' field */
    public Builder clearSymbol() {
      symbol = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'openPrice' field */
    public Double getOpenPrice() {
      return openPrice;
    }
    
    /** Sets the value of the 'openPrice' field */
    public Builder setOpenPrice(double value) {
      validate(fields()[2], value);
      this.openPrice = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'openPrice' field has been set */
    public boolean hasOpenPrice() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'openPrice' field */
    public Builder clearOpenPrice() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'openDate' field */
    public String getOpenDate() {
      return openDate;
    }
    
    /** Sets the value of the 'openDate' field */
    public Builder setOpenDate(String value) {
      validate(fields()[3], value);
      this.openDate = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'openDate' field has been set */
    public boolean hasOpenDate() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'openDate' field */
    public Builder clearOpenDate() {
      openDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'tradingDay' field */
    public String getTradingDay() {
      return tradingDay;
    }
    
    /** Sets the value of the 'tradingDay' field */
    public Builder setTradingDay(String value) {
      validate(fields()[4], value);
      this.tradingDay = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'tradingDay' field has been set */
    public boolean hasTradingDay() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'tradingDay' field */
    public Builder clearTradingDay() {
      tradingDay = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'tradeID' field */
    public String getTradeID() {
      return tradeID;
    }
    
    /** Sets the value of the 'tradeID' field */
    public Builder setTradeID(String value) {
      validate(fields()[5], value);
      this.tradeID = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'tradeID' field has been set */
    public boolean hasTradeID() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'tradeID' field */
    public Builder clearTradeID() {
      tradeID = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'lastSettlementPrice' field */
    public Double getLastSettlementPrice() {
      return lastSettlementPrice;
    }
    
    /** Sets the value of the 'lastSettlementPrice' field */
    public Builder setLastSettlementPrice(double value) {
      validate(fields()[6], value);
      this.lastSettlementPrice = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'lastSettlementPrice' field has been set */
    public boolean hasLastSettlementPrice() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'lastSettlementPrice' field */
    public Builder clearLastSettlementPrice() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'avgPrice' field */
    public Double getAvgPrice() {
      return avgPrice;
    }
    
    /** Sets the value of the 'avgPrice' field */
    public Builder setAvgPrice(double value) {
      validate(fields()[7], value);
      this.avgPrice = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'avgPrice' field has been set */
    public boolean hasAvgPrice() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'avgPrice' field */
    public Builder clearAvgPrice() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'qty' field */
    public Double getQty() {
      return qty;
    }
    
    /** Sets the value of the 'qty' field */
    public Builder setQty(double value) {
      validate(fields()[8], value);
      this.qty = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'qty' field has been set */
    public boolean hasQty() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'qty' field */
    public Builder clearQty() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'direction' field */
    public PositionDirection getDirection() {
      return direction;
    }
    
    /** Sets the value of the 'direction' field */
    public Builder setDirection(PositionDirection value) {
      validate(fields()[9], value);
      this.direction = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'direction' field has been set */
    public boolean hasDirection() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'direction' field */
    public Builder clearDirection() {
      direction = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public PositionMessagePosition build() {
      try {
        PositionMessagePosition record = new PositionMessagePosition();
        record.designator = fieldSetFlags()[0] ? this.designator : (PositionDesignator) defaultValue(fields()[0]);
        record.symbol = fieldSetFlags()[1] ? this.symbol : (String) defaultValue(fields()[1]);
        record.openPrice = fieldSetFlags()[2] ? this.openPrice : (Double) defaultValue(fields()[2]);
        record.openDate = fieldSetFlags()[3] ? this.openDate : (String) defaultValue(fields()[3]);
        record.tradingDay = fieldSetFlags()[4] ? this.tradingDay : (String) defaultValue(fields()[4]);
        record.tradeID = fieldSetFlags()[5] ? this.tradeID : (String) defaultValue(fields()[5]);
        record.lastSettlementPrice = fieldSetFlags()[6] ? this.lastSettlementPrice : (Double) defaultValue(fields()[6]);
        record.avgPrice = fieldSetFlags()[7] ? this.avgPrice : (Double) defaultValue(fields()[7]);
        record.qty = fieldSetFlags()[8] ? this.qty : (Double) defaultValue(fields()[8]);
        record.direction = fieldSetFlags()[9] ? this.direction : (PositionDirection) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
