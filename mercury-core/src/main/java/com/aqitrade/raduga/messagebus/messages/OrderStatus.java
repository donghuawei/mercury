/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.aqitrade.raduga.messagebus.messages;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum OrderStatus { 
  order_status_new, order_status_cancel_submitted, order_status_executed, order_status_rejected, order_status_cancelled, order_status_submitted, order_status_part_executed, order_status_no_cancel, order_status_repeat_cancel, order_status_undefined  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"OrderStatus\",\"namespace\":\"com.aqitrade.raduga.messagebus.messages\",\"symbols\":[\"order_status_new\",\"order_status_cancel_submitted\",\"order_status_executed\",\"order_status_rejected\",\"order_status_cancelled\",\"order_status_submitted\",\"order_status_part_executed\",\"order_status_no_cancel\",\"order_status_repeat_cancel\",\"order_status_undefined\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}