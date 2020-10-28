package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@ESType(ESTypeName.DOUBLE)
@MustBeDocumented
annotation class ESDouble(val properties: KClass<ESDouble>)