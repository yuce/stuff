// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.komanov.serialization.domain.protos.events



@SerialVersionUID(0L)
final case class PageMetaTagAddedPb(
    path: String = "",
    name: String = "",
    value: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PageMetaTagAddedPb] with com.trueaccord.lenses.Updatable[PageMetaTagAddedPb] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (path != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, path) }
      if (name != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, name) }
      if (value != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(3, value) }
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
        val __v = path
        if (__v != "") {
          output.writeString(1, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          output.writeString(2, __v)
        }
      };
      {
        val __v = value
        if (__v != "") {
          output.writeString(3, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.komanov.serialization.domain.protos.events.PageMetaTagAddedPb = {
      var __path = this.path
      var __name = this.name
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __path = __input.readString()
          case 18 =>
            __name = __input.readString()
          case 26 =>
            __value = __input.readString()
          case tag => __input.skipField(tag)
        }
      }
      com.komanov.serialization.domain.protos.events.PageMetaTagAddedPb(
          path = __path,
          name = __name,
          value = __value
      )
    }
    def withPath(__v: String): PageMetaTagAddedPb = copy(path = __v)
    def withName(__v: String): PageMetaTagAddedPb = copy(name = __v)
    def withValue(__v: String): PageMetaTagAddedPb = copy(value = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = path
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = value
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.komanov.serialization.domain.protos.events.PageMetaTagAddedPb
}

object PageMetaTagAddedPb extends com.trueaccord.scalapb.GeneratedMessageCompanion[PageMetaTagAddedPb] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[PageMetaTagAddedPb] = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.komanov.serialization.domain.protos.events.PageMetaTagAddedPb = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.komanov.serialization.domain.protos.events.PageMetaTagAddedPb(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = EventsProto.descriptor.getMessageTypes.get(16)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.komanov.serialization.domain.protos.events.PageMetaTagAddedPb(
  )
  implicit class PageMetaTagAddedPbLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, PageMetaTagAddedPb]) extends com.trueaccord.lenses.ObjectLens[UpperPB, PageMetaTagAddedPb](_l) {
    def path: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.path)((c_, f_) => c_.copy(path = f_))
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def value: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val PATH_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
  final val VALUE_FIELD_NUMBER = 3
}
