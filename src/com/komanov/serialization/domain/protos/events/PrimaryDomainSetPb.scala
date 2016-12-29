// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.komanov.serialization.domain.protos.events



@SerialVersionUID(0L)
final case class PrimaryDomainSetPb(
    name: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PrimaryDomainSetPb] with com.trueaccord.lenses.Updatable[PrimaryDomainSetPb] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = name
        if (__v != "") {
          output.writeString(1, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.komanov.serialization.domain.protos.events.PrimaryDomainSetPb = {
      var __name = this.name
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = __input.readString()
          case tag => __input.skipField(tag)
        }
      }
      com.komanov.serialization.domain.protos.events.PrimaryDomainSetPb(
          name = __name
      )
    }
    def withName(__v: String): PrimaryDomainSetPb = copy(name = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.komanov.serialization.domain.protos.events.PrimaryDomainSetPb
}

object PrimaryDomainSetPb extends com.trueaccord.scalapb.GeneratedMessageCompanion[PrimaryDomainSetPb] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[PrimaryDomainSetPb] = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.komanov.serialization.domain.protos.events.PrimaryDomainSetPb = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.komanov.serialization.domain.protos.events.PrimaryDomainSetPb(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = EventsProto.descriptor.getMessageTypes.get(10)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.komanov.serialization.domain.protos.events.PrimaryDomainSetPb(
  )
  implicit class PrimaryDomainSetPbLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, PrimaryDomainSetPb]) extends com.trueaccord.lenses.ObjectLens[UpperPB, PrimaryDomainSetPb](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
  }
  final val NAME_FIELD_NUMBER = 1
}
