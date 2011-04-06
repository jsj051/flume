/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.flume.conf.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandStatusThrift implements org.apache.thrift.TBase<CommandStatusThrift, CommandStatusThrift._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommandStatusThrift");

  private static final org.apache.thrift.protocol.TField CMD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("cmdId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CMD_FIELD_DESC = new org.apache.thrift.protocol.TField("cmd", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  public long cmdId;
  public String state;
  public String message;
  public FlumeMasterCommandThrift cmd;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CMD_ID((short)1, "cmdId"),
    STATE((short)2, "state"),
    MESSAGE((short)3, "message"),
    CMD((short)4, "cmd");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CMD_ID
          return CMD_ID;
        case 2: // STATE
          return STATE;
        case 3: // MESSAGE
          return MESSAGE;
        case 4: // CMD
          return CMD;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CMDID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CMD_ID, new org.apache.thrift.meta_data.FieldMetaData("cmdId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CMD, new org.apache.thrift.meta_data.FieldMetaData("cmd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FlumeMasterCommandThrift.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommandStatusThrift.class, metaDataMap);
  }

  public CommandStatusThrift() {
  }

  public CommandStatusThrift(
    long cmdId,
    String state,
    String message,
    FlumeMasterCommandThrift cmd)
  {
    this();
    this.cmdId = cmdId;
    setCmdIdIsSet(true);
    this.state = state;
    this.message = message;
    this.cmd = cmd;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommandStatusThrift(CommandStatusThrift other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.cmdId = other.cmdId;
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetCmd()) {
      this.cmd = new FlumeMasterCommandThrift(other.cmd);
    }
  }

  public CommandStatusThrift deepCopy() {
    return new CommandStatusThrift(this);
  }

  @Override
  public void clear() {
    setCmdIdIsSet(false);
    this.cmdId = 0;
    this.state = null;
    this.message = null;
    this.cmd = null;
  }

  public long getCmdId() {
    return this.cmdId;
  }

  public CommandStatusThrift setCmdId(long cmdId) {
    this.cmdId = cmdId;
    setCmdIdIsSet(true);
    return this;
  }

  public void unsetCmdId() {
    __isset_bit_vector.clear(__CMDID_ISSET_ID);
  }

  /** Returns true if field cmdId is set (has been assigned a value) and false otherwise */
  public boolean isSetCmdId() {
    return __isset_bit_vector.get(__CMDID_ISSET_ID);
  }

  public void setCmdIdIsSet(boolean value) {
    __isset_bit_vector.set(__CMDID_ISSET_ID, value);
  }

  public String getState() {
    return this.state;
  }

  public CommandStatusThrift setState(String state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getMessage() {
    return this.message;
  }

  public CommandStatusThrift setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public FlumeMasterCommandThrift getCmd() {
    return this.cmd;
  }

  public CommandStatusThrift setCmd(FlumeMasterCommandThrift cmd) {
    this.cmd = cmd;
    return this;
  }

  public void unsetCmd() {
    this.cmd = null;
  }

  /** Returns true if field cmd is set (has been assigned a value) and false otherwise */
  public boolean isSetCmd() {
    return this.cmd != null;
  }

  public void setCmdIsSet(boolean value) {
    if (!value) {
      this.cmd = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CMD_ID:
      if (value == null) {
        unsetCmdId();
      } else {
        setCmdId((Long)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case CMD:
      if (value == null) {
        unsetCmd();
      } else {
        setCmd((FlumeMasterCommandThrift)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CMD_ID:
      return new Long(getCmdId());

    case STATE:
      return getState();

    case MESSAGE:
      return getMessage();

    case CMD:
      return getCmd();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CMD_ID:
      return isSetCmdId();
    case STATE:
      return isSetState();
    case MESSAGE:
      return isSetMessage();
    case CMD:
      return isSetCmd();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommandStatusThrift)
      return this.equals((CommandStatusThrift)that);
    return false;
  }

  public boolean equals(CommandStatusThrift that) {
    if (that == null)
      return false;

    boolean this_present_cmdId = true;
    boolean that_present_cmdId = true;
    if (this_present_cmdId || that_present_cmdId) {
      if (!(this_present_cmdId && that_present_cmdId))
        return false;
      if (this.cmdId != that.cmdId)
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_cmd = true && this.isSetCmd();
    boolean that_present_cmd = true && that.isSetCmd();
    if (this_present_cmd || that_present_cmd) {
      if (!(this_present_cmd && that_present_cmd))
        return false;
      if (!this.cmd.equals(that.cmd))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CommandStatusThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CommandStatusThrift typedOther = (CommandStatusThrift)other;

    lastComparison = Boolean.valueOf(isSetCmdId()).compareTo(typedOther.isSetCmdId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCmdId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cmdId, typedOther.cmdId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, typedOther.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(typedOther.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, typedOther.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCmd()).compareTo(typedOther.isSetCmd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCmd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cmd, typedOther.cmd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CMD_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.cmdId = iprot.readI64();
            setCmdIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // STATE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.state = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MESSAGE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.message = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // CMD
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.cmd = new FlumeMasterCommandThrift();
            this.cmd.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(CMD_ID_FIELD_DESC);
    oprot.writeI64(this.cmdId);
    oprot.writeFieldEnd();
    if (this.state != null) {
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeString(this.state);
      oprot.writeFieldEnd();
    }
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    if (this.cmd != null) {
      oprot.writeFieldBegin(CMD_FIELD_DESC);
      this.cmd.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CommandStatusThrift(");
    boolean first = true;

    sb.append("cmdId:");
    sb.append(this.cmdId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cmd:");
    if (this.cmd == null) {
      sb.append("null");
    } else {
      sb.append(this.cmd);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
