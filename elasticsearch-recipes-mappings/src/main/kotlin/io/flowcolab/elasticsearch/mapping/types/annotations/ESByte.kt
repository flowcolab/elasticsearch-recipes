package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName
import io.flowcolab.elasticsearch.mapping.types.properties.ESByteProperties
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@ESType(ESTypeName.BYTE)
@MustBeDocumented
annotation class ESByte(val properties: KClass<ESByteProperties>)