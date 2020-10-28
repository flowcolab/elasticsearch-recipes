package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName
import io.flowcolab.elasticsearch.mapping.types.properties.ESFloatProperties
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@ESType(ESTypeName.FLOAT)
@MustBeDocumented
annotation class ESFloat(val properties: KClass<ESFloatProperties>)