package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName
import io.flowcolab.elasticsearch.mapping.types.properties.ESScaledFloatProperties
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@ESType(ESTypeName.SCALED_FLOAT)
@MustBeDocumented
annotation class ESScaledFloat(val properties: KClass<ESScaledFloatProperties>)