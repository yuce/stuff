/**
 * Generated by Scrooge
 *   version: 4.7.0
 *   rev: d9d56174937f524a1981b38ebd6280eef7eeda4a
 *   built at: 20160427-121531
 */
package com.komanov.serialization.domain.thriftscala

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object PrimaryEntryPointSetPb extends ThriftStructCodec3[PrimaryEntryPointSetPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("PrimaryEntryPointSetPb")
  val LookupKeyField = new TField("lookupKey", TType.STRING, 1)
  val LookupKeyFieldManifest = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      LookupKeyField,
      true,
      false,
      LookupKeyFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: PrimaryEntryPointSetPb): Unit = {
  }

  def withoutPassthroughFields(original: PrimaryEntryPointSetPb): PrimaryEntryPointSetPb =
    new Immutable(
      lookupKey =
        {
          val field = original.lookupKey
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: PrimaryEntryPointSetPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): PrimaryEntryPointSetPb = {

    var lookupKeyOffset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                lookupKeyOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'lookupKey' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      lookupKeyOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): PrimaryEntryPointSetPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): PrimaryEntryPointSetPb = {
    var lookupKey: _root_.scala.Option[String] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                lookupKey = _root_.scala.Some(readLookupKeyValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'lookupKey' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      lookupKey,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    lookupKey: _root_.scala.Option[String] = _root_.scala.None
  ): PrimaryEntryPointSetPb =
    new Immutable(
      lookupKey
    )

  def unapply(_item: PrimaryEntryPointSetPb): _root_.scala.Option[_root_.scala.Option[String]] = _root_.scala.Some(_item.lookupKey)


  @inline private def readLookupKeyValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeLookupKeyField(lookupKey_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(LookupKeyField)
    writeLookupKeyValue(lookupKey_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeLookupKeyValue(lookupKey_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(lookupKey_item)
  }


  object Immutable extends ThriftStructCodec3[PrimaryEntryPointSetPb] {
    override def encode(_item: PrimaryEntryPointSetPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): PrimaryEntryPointSetPb = PrimaryEntryPointSetPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[PrimaryEntryPointSetPb] = PrimaryEntryPointSetPb.metaData
  }

  /**
   * The default read-only implementation of PrimaryEntryPointSetPb.  You typically should not need to
   * directly reference this class; instead, use the PrimaryEntryPointSetPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val lookupKey: _root_.scala.Option[String],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PrimaryEntryPointSetPb {
    def this(
      lookupKey: _root_.scala.Option[String] = _root_.scala.None
    ) = this(
      lookupKey,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      lookupKeyOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PrimaryEntryPointSetPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val lookupKey: _root_.scala.Option[String] =
      if (lookupKeyOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, lookupKeyOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the PrimaryEntryPointSetPb trait with additional state or
   * behavior and implement the read-only methods from PrimaryEntryPointSetPb using an underlying
   * instance.
   */
  trait Proxy extends PrimaryEntryPointSetPb {
    protected def _underlying_PrimaryEntryPointSetPb: PrimaryEntryPointSetPb
    override def lookupKey: _root_.scala.Option[String] = _underlying_PrimaryEntryPointSetPb.lookupKey
    override def _passthroughFields = _underlying_PrimaryEntryPointSetPb._passthroughFields
  }
}

trait PrimaryEntryPointSetPb
  extends ThriftStruct
  with scala.Product1[Option[String]]
  with java.io.Serializable
{
  import PrimaryEntryPointSetPb._

  def lookupKey: _root_.scala.Option[String]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = lookupKey


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (lookupKey.isDefined) {
                writeLookupKeyValue(lookupKey.get, _oprot)
                _root_.scala.Some(PrimaryEntryPointSetPb.LookupKeyField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): PrimaryEntryPointSetPb = {
    var lookupKey: _root_.scala.Option[String] = this.lookupKey
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        lookupKey = _root_.scala.Some(readLookupKeyValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      lookupKey,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): PrimaryEntryPointSetPb = {
    var lookupKey: _root_.scala.Option[String] = this.lookupKey

    _fieldId match {
      case 1 =>
        lookupKey = _root_.scala.None
      case _ =>
    }
    new Immutable(
      lookupKey,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetLookupKey: PrimaryEntryPointSetPb = unsetField(1)


  override def write(_oprot: TProtocol): Unit = {
    PrimaryEntryPointSetPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (lookupKey.isDefined) writeLookupKeyField(lookupKey.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    lookupKey: _root_.scala.Option[String] = this.lookupKey,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): PrimaryEntryPointSetPb =
    new Immutable(
      lookupKey,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[PrimaryEntryPointSetPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[PrimaryEntryPointSetPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 1

  override def productElement(n: Int): Any = n match {
    case 0 => this.lookupKey
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "PrimaryEntryPointSetPb"
}